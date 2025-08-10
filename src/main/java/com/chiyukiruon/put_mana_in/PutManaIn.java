package com.chiyukiruon.put_mana_in;

import com.chiyukiruon.put_mana_in.apoli.register.PutManaInPower;
import com.hollingsworth.arsnouveau.api.mana.IManaCap;
import com.hollingsworth.arsnouveau.api.source.ISourceTile;
import io.github.edwinmindcraft.apoli.api.component.IPowerContainer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.hollingsworth.arsnouveau.setup.registry.CapabilityRegistry.MANA_CAPABILITY;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PutManaIn.MODID)
public class PutManaIn {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "put_mana_in";

    public PutManaIn() {
        MinecraftForge.EVENT_BUS.register(this);
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        if (ModList.get().isLoaded("origins")) {
            PutManaInPower.POWERS.register(modBus);
        }
    }

    private static final Map<UUID, Long> cooldowns = new HashMap<>();

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void rightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        if (event.getHand() != InteractionHand.MAIN_HAND) return;
        if (!(event.getEntity() instanceof ServerPlayer player)) return;
        if (Config.needEmptyHand && !player.getMainHandItem().isEmpty()) return;
        if (Config.noCrouching && player.isCrouching()) return;
        if (Config.onlyForOrigins && ModList.get().isLoaded("origins")) {
            if (!IPowerContainer.hasPower(player, PutManaInPower.TRANSFER_MANA.get())) return;
        }

        UUID playerId = player.getUUID();
        long currentTime = event.getLevel().getGameTime();
        if (cooldowns.getOrDefault(playerId, 0L) > currentTime) return;

        BlockEntity block = event.getLevel().getBlockEntity(event.getPos());
        LazyOptional<IManaCap> mana = player.getCapability(MANA_CAPABILITY);

        if (block instanceof ISourceTile sourceTile && mana.isPresent()) {
            IManaCap manaCap = mana.orElse(null);
            int currentSource = sourceTile.getSource();
            int maxSource = sourceTile.getMaxSource();

            DebugLogger.debug(player, "Transfer target: {}", block.getBlockPos());
            DebugLogger.debug(player, "Target max mana: {}", maxSource);
            DebugLogger.debug(player, "Current mana in target: {}", currentSource);

            if (currentSource < maxSource) {
                double availableMana = manaCap.getCurrentMana();
                double transferableMana = availableMana * Config.transferRatio;

                if (Config.maxPerTrans > 0) {
                    transferableMana = Math.min(transferableMana, Config.maxPerTrans);
                }

                int actualTransfer = Math.min(maxSource - currentSource, (int) transferableMana);

                double manaCost = actualTransfer / Config.transferRatio;

                sourceTile.addSource(actualTransfer);
                manaCap.removeMana(manaCost);

                cooldowns.put(playerId, currentTime + Config.coolingTime);

                DebugLogger.debug(player, "Transferred mana: {}", actualTransfer);
                DebugLogger.debug(player, "Mana cost: {}", manaCost);

                event.setCanceled(true);
                event.setCancellationResult(InteractionResult.SUCCESS);
            }
        }
    }
}

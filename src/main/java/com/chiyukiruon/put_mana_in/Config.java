package com.chiyukiruon.put_mana_in;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = PutManaIn.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec.DoubleValue TRANSFER_RATIO = BUILDER.comment("The ratio of mana transferred from the player to the source").defineInRange("ratio", 1.0, 0.0, Double.MAX_VALUE);
    public static final ForgeConfigSpec.IntValue MAX_PER_TRANS = BUILDER.comment("The maximum mana that can be transferred at once. 0 means no maximum").defineInRange("maxPerTrans", 0, 0, Integer.MAX_VALUE);
    public static final ForgeConfigSpec.IntValue COOLING_TIME = BUILDER.comment("The cooling time of transferring mana(By tick)").defineInRange("coolingTime", 0, 0, Integer.MAX_VALUE);
    public static final ForgeConfigSpec.BooleanValue ONLY_FOR_ORIGINS = BUILDER.comment("Whether to allow only origins to use").define("onlyForOrigins", false);
    public static final ForgeConfigSpec.BooleanValue NEED_EMPTY_HAND = BUILDER.comment("Whether to allow only empty hands to use").define("needEmptyHand", true);
    public static final ForgeConfigSpec.BooleanValue NO_CROUCHING = BUILDER.comment("When Crouching not transfer mana").define("noCrouching", true);
    public static final ForgeConfigSpec.BooleanValue CANCEL_RIGHT_CLICK_EVENT = BUILDER.comment("Whether to cancel the right-click event after injecting is successful").define("cancelRightClickEvent", false);
    public static final ForgeConfigSpec.IntValue CHARGE_PARTICLE_COUNT = BUILDER.comment("The number of particles to be displayed when charging").defineInRange("chargeParticleCount", 20, 0, Integer.MAX_VALUE);
    public static final ForgeConfigSpec.DoubleValue CHARGE_PARTICLE_RADIUS = BUILDER.comment("The radius of the particles to be displayed when charging").defineInRange("chargeParticleRadius", 0.5, 0.0, Double.MAX_VALUE);

    static final ForgeConfigSpec SPEC = BUILDER.build();

    public static double transferRatio;
    public static int maxPerTrans;
    public static int coolingTime;
    public static boolean onlyForOrigins;
    public static boolean needEmptyHand;
    public static boolean noCrouching;
    public static boolean cancelRightClickEvent;
    public static int chargeParticleCount;
    public static double chargeParticleRadius;

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        transferRatio = TRANSFER_RATIO.get();
        maxPerTrans = MAX_PER_TRANS.get();
        coolingTime = COOLING_TIME.get();
        onlyForOrigins = ONLY_FOR_ORIGINS.get();
        needEmptyHand = NEED_EMPTY_HAND.get();
        noCrouching = NO_CROUCHING.get();
        cancelRightClickEvent = CANCEL_RIGHT_CLICK_EVENT.get();
        chargeParticleCount = CHARGE_PARTICLE_COUNT.get();
        chargeParticleRadius = CHARGE_PARTICLE_RADIUS.get();
    }
}

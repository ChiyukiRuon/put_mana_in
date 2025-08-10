package com.chiyukiruon.put_mana_in;

import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Command {
    @SubscribeEvent
    public static void onRegisterCommands(RegisterCommandsEvent event) {
        event.getDispatcher().register(
                Commands.literal("pmi")
                        .then(Commands.literal("debug")
                                .then(Commands.literal("enable").executes(ctx -> setDebug(ctx, true)))
                                .then(Commands.literal("disable").executes(ctx -> setDebug(ctx, false)))
                        )
        );
    }

    private static int setDebug(CommandContext<CommandSourceStack> ctx, boolean enable) {
        DebugLogger.setDebug(enable);
        ctx.getSource().sendSuccess(
                () -> Component.literal("Debug logging is now " + (enable ? "ENABLED" : "DISABLED")),
                true
        );
        return 1;
    }
}

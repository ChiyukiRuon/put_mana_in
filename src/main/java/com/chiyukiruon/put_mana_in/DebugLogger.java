package com.chiyukiruon.put_mana_in;

import com.mojang.logging.LogUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import org.slf4j.Logger;

public class DebugLogger {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static boolean debugEnabled = false;

    public static void setDebug(boolean enabled) {
        debugEnabled = enabled;
        LOGGER.info("Debug logging is now {}", enabled ? "ENABLED" : "DISABLED");
    }

    public static boolean isDebugEnabled() {
        return debugEnabled;
    }

    // 仅控制台输出
    public static void debug(String message, Object... args) {
        if (debugEnabled) {
            LOGGER.debug(message, args);
        }
    }

    // 游戏内以及控制台输出
    public static void debug(ServerPlayer player, String message, Object... args) {
        if (debugEnabled) {
            LOGGER.debug(message, args);
            player.sendSystemMessage(Component.literal(formatMessage(message, args)));
        }
    }

    private static String formatMessage(String message, Object... args) {
        String formatted = message;
        for (Object arg : args) {
            formatted = formatted.replaceFirst("\\{}", arg != null ? arg.toString() : "null");
        }
        return formatted;
    }
}

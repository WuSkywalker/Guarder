package com.ytf.game.guarder.core.util;

import java.util.logging.Level;

/**
 * Package: com.ytf.game.guarder.core.util
 * Created with Guarder
 * User: AndyHua
 * Date: 14-12-16
 * Time: 21:42
 * Description:
 */
public class GreenLoggerManager {
    private static final String TAG = "GreenLoggerManager";

    /**
     *
     * @param level
     */
    public static void filterLogByLevel(Level level){
        GreenLogger.getInstance().setLevel(level);
    }
}

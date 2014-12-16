package com.ytf.game.guarder.core.util;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Package: com.ytf.game.guarder.core.util
 * Created with Guarder
 * User: AndyHua
 * Date: 14-12-16
 * Time: 21:43
 * Description:
 */
public class GreenLogger {
    private static final String TAG = "GreenLogger";

    private Logger logger = null;

    /**
     *
     */
    private GreenLogger() {
        logger = Logger.getLogger("");
    }

    /**
     *
     */
    private static GreenLogger gl = null;

    /**
     *
     * @return
     */
    public static GreenLogger getInstance() {
        if (null == gl)
            gl = new GreenLogger();
        return gl;
    }

    /**
     *
     * @param level
     * @param msg
     */
    public void log(Level level, String msg) {
        logger.log(level, msg);
    }

    /**
     *
     * @param level
     * @param msg
     * @param param1
     */
    public void log(Level level, String msg, Object param1) {
        logger.log(level, msg, param1);
    }

    /**
     *
     * @param level
     * @param msg
     * @param params
     */
    public void log(Level level, String msg, Object params[]) {
        logger.log(level, msg, params);
    }

    /**
     *
     * @param level
     * @param msg
     * @param thrown
     */
    public void log(Level level, String msg, Throwable thrown) {
        logger.log(level, msg, thrown);
    }

    /**
     *
     * @param sourceClass
     * @param sourceMethod
     */
    public void entering(String sourceClass, String sourceMethod) {
        logger.entering(sourceClass, sourceMethod);
    }

    /**
     *
     * @param level
     * @param sourceClass
     * @param sourceMethod
     * @param msg
     */
    public void logp(Level level, String sourceClass, String sourceMethod,
                     String msg) {
        logger.logp(level, sourceClass, sourceMethod, msg);
    }

    /**
     *
     * @param level
     * @param sourceClass
     * @param sourceMethod
     * @param msg
     * @param param1
     */
    public void logp(Level level, String sourceClass, String sourceMethod,
                     String msg, Object param1) {
        logger.logp(level, sourceClass, sourceMethod, msg, param1);
    }

    /**
     *
     * @param level
     * @param sourceClass
     * @param sourceMethod
     * @param msg
     * @param params
     */
    public void logp(Level level, String sourceClass, String sourceMethod,
                     String msg, Object params[]) {
        logger.logp(level, sourceClass, sourceMethod, msg, params);
    }

    /**
     *
     * @param level
     * @param sourceClass
     * @param sourceMethod
     * @param msg
     * @param thrown
     */
    public void logp(Level level, String sourceClass, String sourceMethod,
                     String msg, Throwable thrown) {
        logger.logp(level, sourceClass, sourceMethod, msg, thrown);
    }

    /**
     *
     * @param sourceClass
     * @param sourceMethod
     * @param param1
     */
    public void entering(String sourceClass, String sourceMethod, Object param1) {
        logger.entering(sourceClass, sourceMethod, param1);
    }

    /**
     *
     * @param sourceClass
     * @param sourceMethod
     * @param params
     */
    public void entering(String sourceClass, String sourceMethod,
                         Object params[]) {
        logger.entering(sourceClass, sourceMethod, params);
    }

    /**
     *
     * @param sourceClass
     * @param sourceMethod
     */
    public void exiting(String sourceClass, String sourceMethod) {
        logger.exiting(sourceClass, sourceMethod);
    }

    /**
     *
     * @param sourceClass
     * @param sourceMethod
     * @param result
     */
    public void exiting(String sourceClass, String sourceMethod, Object result) {
        logger.exiting(sourceClass, sourceMethod, result);
    }

    /**
     *
     * @param msg
     */
    public void severe(String msg) {
        logger.severe(msg);
    }

    /**
     *
     * @param msg
     */
    public void warning(String msg) {
        logger.warning(msg);
    }

    /**
     *
     * @param msg
     */
    public void info(String msg) {
        logger.info(msg);
    }

    /**
     *
     * @param newLevel
     * @throws SecurityException
     */
    public void setLevel(Level newLevel) throws SecurityException {
        logger.setLevel(newLevel);
    }
}

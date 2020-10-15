package net.gopine.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    /**
     * Logs the content to the console as an `info` type.
     * @param data the data being logged.
     */
    public static void info(Object... data) {
        for (Object out : data) System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] [Gopine info] " + out);
    }

    /**
     * Logs the content to the console as an `error` type.
     * @param data the data being logged.
     */
    public static void error(Object... data) {
        for (Object out : data) System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] [Gopine error] " + out);
    }

    /**
     * Logs the content to the console as a `warn` type.
     * @param data the data being logged.
     */
    public static void warn(Object... data) {
        for (Object out : data) System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] [Gopine warn] " + out);
    }

}
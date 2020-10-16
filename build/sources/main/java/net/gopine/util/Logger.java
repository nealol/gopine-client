package net.gopine.util;

import net.gopine.GopineClient;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Used to log everything regarding {@link GopineClient}
 * @author MatthewTGM | MatthewTGM#4058
 * @since b1.0
 */
public class Logger {

    /**
     * Logs the content to the console as an `info` type.
     * @param data the data being logged.
     * @author MatthewTGM | MatthewTGM#4058
     * @since b1.0
     */
    public static void info(Object... data) {
        for (Object out : data) System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] [Gopine info] " + out);
    }

    /**
     * Logs the content to the console as an `error` type.
     * @param data the data being logged.
     * @author MatthewTGM | MatthewTGM#4058
     * @since b1.0
     */
    public static void error(Object... data) {
        for (Object out : data) System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] [Gopine error] " + out);
    }

    /**
     * Logs the content to the console as a `warn` type.
     * @param data the data being logged.
     * @author MatthewTGM | MatthewTGM#4058
     * @since b1.0
     */
    public static void warn(Object... data) {
        for (Object out : data) System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] [Gopine warn] " + out);
    }

}
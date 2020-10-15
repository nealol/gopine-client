package ga.gopine.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    public static void info(Object... data) {
        for (Object out : data) System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] [Gopine info] " + out);
    }

    public static void error(Object... data) {
        for (Object out : data) System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] [Gopine error] " + out);
    }

    public static void warn(Object... data) {
        for (Object out : data) System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] [Gopine warn] " + out);
    }

}
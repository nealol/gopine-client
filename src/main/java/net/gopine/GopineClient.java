package net.gopine;

import net.gopine.util.Logger;
import org.lwjgl.opengl.Display;

/**
 * The main class of the client. Where all initialization takes place.
 * @author MatthewTGM | MatthewTGM#4058
 * @since 0.1b
 */
public class GopineClient {

    private static final GopineClient INSTANCE = new GopineClient();
    /**
     * @return an instance of GopineClient
     * @author MatthewTGM | MatthewTGM#4058
     * @since 0.1b
     */
    public static GopineClient getInstance() {
        return INSTANCE;
    }

    public final String CLIENT_NAME = "Gopine Client", CLIENT_VER = "0.0.1b", BRANCH_NAME = "EXPERIMENTAL";

    /**
     * The client preInitialization method.
     * @author MatthewTGM | MatthewTGM#4058
     * @since 0.1b
     */
    public void preInit() {
        Logger.info("Started Gopine Client PRE_INIT phase");
        Display.setTitle(GopineClient.getInstance().CLIENT_NAME + " " + GopineClient.getInstance().CLIENT_VER + " [" + GopineClient.getInstance().BRANCH_NAME + "]");
        Logger.info("Finished Gopine Client PRE_INIT phase");
    }

    /**
     * The client initialization method.
     * @author MatthewTGM | MatthewTGM#4058
     * @since 0.1b
     */
    public void init() {
        Logger.info("Started Gopine Client INIT phase");
        Logger.info("Finished Gopine Client INIT phase");
    }

    /**
     * The client shutdown method.
     * @author MatthewTGM | MatthewTGM#4058
     * @since 0.1b
     */
    public void shutdown() {

    }

}

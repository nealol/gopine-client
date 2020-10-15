package ga.gopine;

import ga.gopine.util.Logger;
import org.lwjgl.opengl.Display;

/**
 * The main class of the client. Where all initialization takes place.
 */
public class GopineClient {

    private static final GopineClient INSTANCE = new GopineClient();
    public static GopineClient getInstance() {
        return INSTANCE;
    }

    public final String CLIENT_NAME = "Gopine Client", CLIENT_VER = "0.0.1b", BRANCH_NAME = "EXPERIMENTAL";

    public void preInit() {
        Logger.info("Started Gopine Client PRE_INIT phase");
        Display.setTitle(GopineClient.getInstance().CLIENT_NAME + " " + GopineClient.getInstance().CLIENT_VER + " [" + GopineClient.getInstance().BRANCH_NAME + "]");
        Logger.info("Finished Gopine Client PRE_INIT phase");
    }

    public void init() {
        Logger.info("Started Gopine Client INIT phase");
        Logger.info("Finished Gopine Client INIT phase");
    }

    public void shutdown() {

    }

}

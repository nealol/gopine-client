package net.gopine;

import net.gopine.events.manager.EventManager;
import net.gopine.settings.SettingManager;
import net.gopine.util.Logger;

/**
 * The main class of the client. Where all initialization takes place.
 * @author MatthewTGM | MatthewTGM#4058
 * @since b0.1
 */
public class GopineClient {

    private static final GopineClient INSTANCE = new GopineClient();
    /**
     * @return an instance of GopineClient
     * @author MatthewTGM | MatthewTGM#4058
     * @since b0.1
     */
    public static GopineClient getInstance() {
        return INSTANCE;
    }
    private static SettingManager settingManager = new SettingManager();

    public final String CLIENT_NAME = "Gopine Client", CLIENT_VER = "b0.1", BRANCH_NAME = "BETA";
	
	/**
     * @return an instance of Discord RPC
     * @author Hot Tutorials | Hot Tutorials#8262
     * @since b0.1
     */
    private final GopineRPC GOPINE_RPC = new GopineRPC();
    public final GopineRPC getDiscordRPC() { return GOPINE_RPC; };

    /**
     * The client preInitialization method.
     * @author MatthewTGM | MatthewTGM#4058
     * @since b0.1
     */
    public void preInit() {
        Logger.info("Started Gopine Client PRE_INIT phase");
		this.getDiscordRPC().init();
        settingManager.handleSetting(this);
        Logger.info("Finished Gopine Client PRE_INIT phase");
    }

    /**
     * The client initialization method.
     * @author MatthewTGM | MatthewTGM#4058
     * @since b0.1
     */
    public void init() {
        Logger.info("Started Gopine Client INIT phase");
        EventManager.register(this);
        Logger.info("Finished Gopine Client INIT phase");
    }

    /**
     * The client shutdown method.
     * @author MatthewTGM | MatthewTGM#4058
     * @since b0.1
     */
    public void shutdown() {

    }

}

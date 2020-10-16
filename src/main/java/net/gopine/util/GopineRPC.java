package net.gopine.util;

import com.jagrosh.discordipc.IPCClient;
import com.jagrosh.discordipc.IPCListener;
import com.jagrosh.discordipc.entities.RichPresence;
import com.jagrosh.discordipc.exceptions.NoDiscordClientException;

import java.time.OffsetDateTime;


/**
 * The DiscordRPC Class
 * @author Hot Tutorials | Hot Tutorials#8262
 * @since b0.1
 */
public class GopineRPC {

    RichPresence.Builder builder = new RichPresence.Builder();
    IPCClient client = new IPCClient(766300045918076938L);

    /**
     * @return start GopineRPC
     * @author Hot Tutorials | Hot Tutorials#8262
     * @since b0.1
     */
    public void init() {
        Logger.info("Started DiscordRPC...");
        client.setListener(new IPCListener(){
            @Override
            public void onReady(IPCClient client)
            {
                setPresence("Gopine Client 1.8.9", "Main Menu");
                client.sendRichPresence(builder.build());
                Logger.info("Set DiscordRPC Presence...");
            }
        });
        try {
            client.connect();
            client.sendRichPresence(builder.build());
            Logger.info("Connected to RPC Client!");
        } catch (NoDiscordClientException e) {
            e.printStackTrace();
            Logger.error("Couldn't connect to RPC Client: " + e);
        }
    }

    /**
     * @return set RPC presence | firstLine is the firstLine | secondLine is the secondLine |
     * @author Hot Tutorials | Hot Tutorials#8262
     * @since b0.1
     */
    public void setPresence(String firstLine, String secondLine) {
        builder.setDetails(firstLine)
                .setState(secondLine)
                .setStartTimestamp(OffsetDateTime.now());
        client.sendRichPresence(builder.build());
    }

    /**
     * @return set RPC presence
     * | firstLine is the firstLine
     * | secondLine is the secondLine
     * | largeImage is the large image that shows
     * @author Hot Tutorials | Hot Tutorials#8262
     * @since b0.1
     */

    public void setPresence(String firstLine, String secondLine, String largeImage) {
        builder.setDetails(firstLine)
                .setState(secondLine)
                .setLargeImage(largeImage)
                .setStartTimestamp(OffsetDateTime.now());
        client.sendRichPresence(builder.build());
    }


    /**
     * @return set RPC presence
     * | firstLine is the firstLine
     * | secondLine is the secondLine
     * | largeImage is the large image that shows
     * | smallImage is the image that shows in the bottom right of the largeImage
     * @author Hot Tutorials | Hot Tutorials#8262
     * @since b0.1
     */
    public void setPresence(String firstLine, String secondLine, String largeImage, String smallImage) {
        builder.setDetails(firstLine)
                .setState(secondLine)
                .setLargeImage(largeImage)
                .setSmallImage(smallImage)
                .setStartTimestamp(OffsetDateTime.now());
        client.sendRichPresence(builder.build());
    }

}

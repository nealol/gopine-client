package net.gopine.util;

import com.jagrosh.discordipc.IPCClient;
import com.jagrosh.discordipc.IPCListener;
import com.jagrosh.discordipc.entities.RichPresence;
import com.jagrosh.discordipc.exceptions.NoDiscordClientException;

import java.time.OffsetDateTime;

public class GopineRPC {

    RichPresence.Builder builder = new RichPresence.Builder();
    IPCClient client = new IPCClient(766300045918076938L);

    public void init() {

        client.setListener(new IPCListener(){
            @Override
            public void onReady(IPCClient client)
            {
                setPresence("Gopine Client 1.8.9", "Main Menu");
                client.sendRichPresence(builder.build());
            }
        });
        try {
            client.connect();
            client.sendRichPresence(builder.build());
        } catch (NoDiscordClientException e) {
            e.printStackTrace();
        }
    }

    public void setPresence(String firstLine, String secondLine) {
        builder.setDetails(firstLine)
                .setState(secondLine)
                .setStartTimestamp(OffsetDateTime.now());
        client.sendRichPresence(builder.build());
    }

    public void setPresence(String firstLine, String secondLine, String largeImage) {
        builder.setDetails(firstLine)
                .setState(secondLine)
                .setLargeImage(largeImage)
                .setStartTimestamp(OffsetDateTime.now());
        client.sendRichPresence(builder.build());
    }

    public void setPresence(String firstLine, String secondLine, String largeImage, String smallImage) {
        builder.setDetails(firstLine)
                .setState(secondLine)
                .setLargeImage(largeImage)
                .setSmallImage(smallImage)
                .setStartTimestamp(OffsetDateTime.now());
        client.sendRichPresence(builder.build());
    }

}

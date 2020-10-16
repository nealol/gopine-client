package net.gopine.mixins.networking;

import net.gopine.events.impl.client.EventChatReceived;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.play.server.S02PacketChat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * NetHandlerPlayerClient mixin class used to add events.
 * @author MatthewTGM | MatthewTGM#4058
 * @since b0.1
 */
@Mixin(NetHandlerPlayClient.class)
public class NetHandlerPlayClientMixin {

    /**
     * Calls the following events:
     * {@link EventChatReceived}
     * @param packetIn the packet being gotten
     * @param callbackInfo unused
     * @author MatthewTGM | MatthewTGM#4058
     * @since b1.0
     */
    @Inject(method = "handleChat", at = @At(value = "HEAD"), cancellable = false)
    private void onChatPacket(S02PacketChat packetIn, CallbackInfo callbackInfo) {
        new EventChatReceived(packetIn.getChatComponent()).call();
    }

}

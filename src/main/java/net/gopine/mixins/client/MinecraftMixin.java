package net.gopine.mixins.client;

import net.gopine.GopineClient;
import net.gopine.events.impl.client.EventTick;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Minecraft mixin class to add client initialization features and events.
 * @author MatthewTGM | MatthewTGM#4058
 * @since 0.1b
 */
@Mixin(Minecraft.class)
public class MinecraftMixin {

    /**
     * Calls the {@link GopineClient} preInit method on game start.
     * @param ci unused
     * @author MatthewTGM | MatthewTGM#4058
     * @since 0.1b
     */
    @Inject(method = "startGame", at = @At("HEAD"))
    private void preInit(CallbackInfo ci) {
        GopineClient.getInstance().preInit();
    }

    /**
     * Calls the {@link GopineClient} init method on game start.
     * @param ci unused
     * @author MatthewTGM | MatthewTGM#4058
     * @since 0.1b
     */
    @Inject(method = "startGame", at = @At("RETURN"))
    private void init(CallbackInfo ci) {
        GopineClient.getInstance().init();
    }

    /**
     * Calls the {@link GopineClient} shutdown method on game close.
     * @param ci unused
     * @author MatthewTGM | MatthewTGM#4058
     * @since 0.1b
     */
    @Inject(method = "shutdownMinecraftApplet", at = @At("HEAD"))
    private void shutdown(CallbackInfo ci) {
        GopineClient.getInstance().shutdown();
    }

    /*
     * The events of this file begin here.
     */

    /**
     * Calls the following events:
     * {@link EventTick}
     * @param ci unused
     * @author MatthewTGM | MatthewTGM#4058
     * @since 0.1b
     */
    @Inject(method = "runTick", at = @At("RETURN"))
    public void runTick(CallbackInfo ci) {
        new EventTick().call();
    }

}

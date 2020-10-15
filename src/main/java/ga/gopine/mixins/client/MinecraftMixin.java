package ga.gopine.mixins.client;

import ga.gopine.GopineClient;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MinecraftMixin {

    @Inject(method = "startGame", at = @At("HEAD"))
    private void preInit(CallbackInfo info) {
        GopineClient.getInstance().preInit();
    }

    @Inject(method = "startGame", at = @At("RETURN"))
    private void init(CallbackInfo info) {
        GopineClient.getInstance().init();
    }

    @Inject(method = "shutdownMinecraftApplet", at = @At("HEAD"))
    private void shutdown(CallbackInfo info) {
        GopineClient.getInstance().shutdown();
    }

}

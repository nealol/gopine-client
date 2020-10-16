package net.gopine.mixins.client;

import net.gopine.GopineClient;
import net.gopine.events.impl.client.EventTick;
import net.gopine.events.impl.gui.EventGuiSwitch;
import net.gopine.events.impl.player.input.EventKeyboardKeyPressed;
import net.gopine.events.impl.player.input.EventKeyboardKeyReleased;
import net.gopine.events.impl.player.input.EventMouseLeftClick;
import net.gopine.events.impl.player.input.EventMouseRightClick;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Minecraft mixin class used to add client initialization features and events.
 * @author MatthewTGM | MatthewTGM#4058
 * @since b0.1
 */
@Mixin(Minecraft.class)
public class MinecraftMixin {

    /**
     * Calls the {@link GopineClient} preInit method on game start.
     * @param ci unused
     * @author MatthewTGM | MatthewTGM#4058
     * @since b0.1
     */
    @Inject(method = "startGame", at = @At("HEAD"))
    private void preInit(CallbackInfo ci) {
        GopineClient.getInstance().preInit();
    }

    /**
     * Calls the {@link GopineClient} init method on game start.
     * @param ci unused
     * @author MatthewTGM | MatthewTGM#4058
     * @since b0.1
     */
    @Inject(method = "startGame", at = @At("RETURN"))
    private void init(CallbackInfo ci) {
        GopineClient.getInstance().init();
    }

    /**
     * Calls the {@link GopineClient} shutdown method on game close.
     * @param ci unused
     * @author MatthewTGM | MatthewTGM#4058
     * @since b0.1
     */
    @Inject(method = "shutdownMinecraftApplet", at = @At("HEAD"))
    private void shutdown(CallbackInfo ci) {
        GopineClient.getInstance().shutdown();
    }

    /**
     * Sets all dispay settings.
     * @param ci unused
     * @author MatthewTGM | MatthewTGM#4058
     * @since b0.1
     */
    @Inject(method = "createDisplay", at = @At("RETURN"))
    private void createDisplay(CallbackInfo ci) {
        Display.setTitle(GopineClient.getInstance().CLIENT_NAME + " " + GopineClient.getInstance().CLIENT_VER + " [" + GopineClient.getInstance().BRANCH_NAME + "]");
    }

    /*
     * The events of this file begin here.
     */

    /**
     * Calls the following events:
     * {@link EventTick}
     * @param ci unused
     * @author MatthewTGM | MatthewTGM#4058
     * @since b0.1
     */
    @Inject(method = "runTick", at = @At("RETURN"))
    public void runTick(CallbackInfo ci) {
        new EventTick().call();
    }

    /**
     * Calls the following events:
     * {@link EventKeyboardKeyPressed}
     * {@link EventKeyboardKeyReleased}
     * @param ci unused
     * @author MatthewTGM | MatthewTGM#4058
     * @since b0.1
     */
    @Inject(method = "dispatchKeypresses", at = @At(value = "INVOKE_ASSIGN", target = "Lorg/lwjgl/input/Keyboard;getEventKeyState()Z", remap = false))
    private void runTickKeyboard(CallbackInfo ci) {
        if (Keyboard.getEventKeyState())
            new EventKeyboardKeyPressed(Keyboard.isRepeatEvent(), Keyboard.getEventKey());
        else
            new EventKeyboardKeyReleased(Keyboard.isRepeatEvent(), Keyboard.getEventKey());
    }

    /**
     * Calls the following events:
     * {@link EventMouseLeftClick}
     * @param ci unused
     * @author MatthewTGM | MatthewTGM#4058
     * @since b1.0
     */
    @Inject(method = "clickMouse", at = @At("RETURN"))
    private void leftClickMouseButton(CallbackInfo ci) {
        new EventMouseLeftClick().call();
    }

    /**
     * Calls the following events:
     * {@link EventMouseRightClick}
     * @param ci unused
     * @author MatthewTGM | MatthewTGM#4058
     * @since b0.1
     */
    @Inject(method = "rightClickMouse", at = @At("RETURN"))
    private void rightClickMouseButton(CallbackInfo ci) {
        new EventMouseRightClick().call();
    }

    /**
     * Calls the following events:
     * {@link EventGuiSwitch}
     * @param guiScreenIn the gui being called
     * @param ci unused
     * @author MatthewTGM | MatthewTGM#4058
     * @since b0.1
     */
    @Inject(method = "displayGuiScreen", at = @At("HEAD"))
    private void displayGuiScreen(GuiScreen guiScreenIn, CallbackInfo ci) {
        new EventGuiSwitch(guiScreenIn).call();
    }

}

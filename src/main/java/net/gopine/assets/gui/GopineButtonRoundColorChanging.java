package net.gopine.assets.gui;

import net.gopine.util.RenderUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;

import java.awt.*;

public class GopineButtonRoundColorChanging extends GuiButton {

    public int cornerRadius;
    public Color color;
    public Color hoverColor;

    public GopineButtonRoundColorChanging(int buttonId, int x, int y, String buttonText, int cornerRadius, Color color, Color hoverColor) {
        super(buttonId, x, y, buttonText);
        this.cornerRadius = cornerRadius;
        this.color = color;
        this.hoverColor = hoverColor;
    }

    @Override
    public void drawButton(Minecraft mc, int mouseX, int mouseY) {
        if (this.visible)
        {
            if(this.hovered) {
                this.color = hoverColor;
            }
            FontRenderer fontrenderer = mc.fontRendererObj;
            this.hovered = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
            int i = this.getHoverState(this.hovered);
            RenderUtils.getInstance().drawRoundedRect(this.xPosition, this.yPosition, this.width, this.height, this.cornerRadius, this.color);
            this.mouseDragged(mc, mouseX, mouseY);
            int j = 14737632;

            if (!this.enabled)
            {
                j = 10526880;
            }
            else if (this.hovered)
            {
                j = 16777120;
            }

            this.drawCenteredString(fontrenderer, this.displayString, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, j);
        }
    }

}
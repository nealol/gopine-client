package net.gopine.assets.gui;

import net.gopine.util.RenderUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;

import java.awt.*;

public class GopineButtonRound extends GuiButton {

    public int cornerRadius;
    public Color color;
    public Color hoverColor;
    public Color textColor;
    public Color textColorHover;

    public GopineButtonRound(int buttonId, int x, int y, String buttonText, int cornerRadius, Color color, Color hoverColor, Color textColor, Color textColorHover) {
        super(buttonId, x, y, buttonText);
        this.cornerRadius = cornerRadius;
        this.color = color;
        this.hoverColor = hoverColor;
        this.textColor = textColor;
        this.textColorHover = textColorHover;
    }

    @Override
    public void drawButton(Minecraft mc, int mouseX, int mouseY) {
        if (this.visible)
        {
            FontRenderer fontrenderer = mc.fontRendererObj;
            this.hovered = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
            int i = this.getHoverState(this.hovered);
            int j = this.textColor.getRGB();
            Color c = color;

            if (!this.enabled)
            {
                j = this.textColor.getRGB();
                c = this.color;
            }
            else if (this.hovered)
            {
                j = this.textColorHover.getRGB();
                c = this.hoverColor;
            }
            RenderUtils.getInstance().drawRoundedRect(this.xPosition, this.yPosition, this.width, this.height, this.cornerRadius, c);
            //RenderUtils.getInstance().drawHollowRoundedRect(this.xPosition, this.yPosition, this.width, this.height, this.cornerRadius, 2, c);
            this.mouseDragged(mc, mouseX, mouseY);

            this.drawCenteredString(fontrenderer, this.displayString, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, j);
        }
    }
}
package net.fabricmc.mechanicsplus.screens;

import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class FastHopperScreen extends HandledScreen<FastHopperScreenHandler> {

  private static final Identifier TEXTURE = new Identifier("textures/gui/container/hopper.png");

  public FastHopperScreen(FastHopperScreenHandler handler, PlayerInventory inventory, Text title) {
    super(handler, inventory, title);
    this.passEvents = false;
    this.backgroundHeight = 133;
    this.playerInventoryTitleY = this.backgroundHeight - 94;
  }

  public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
    this.renderBackground(matrices);
    super.render(matrices, mouseX, mouseY, delta);
    this.drawMouseoverTooltip(matrices, mouseX, mouseY);
  }

  protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
    RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
    this.client.getTextureManager().bindTexture(TEXTURE);
    int i = (this.width - this.backgroundWidth) / 2;
    int j = (this.height - this.backgroundHeight) / 2;
    this.drawTexture(matrices, i, j, 0, 0, this.backgroundWidth, this.backgroundHeight);
  }
}

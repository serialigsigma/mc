package com.example.lightclient.ui;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;

public class HudOverlay implements HudRenderCallback {
	private MinecraftClient client = MinecraftClient.getInstance();
	
	@Override
	public void onHudRender(DrawContext drawContext, float tickDelta) {
		if (client.player == null) return;
		
		TextRenderer textRenderer = client.textRenderer;
		int screenWidth = drawContext.getScaledWindowWidth();
		int screenHeight = drawContext.getScaledWindowHeight();
		
		// Draw status info on top-left
		int yOffset = 10;
		
		// FPS
		drawContext.drawTextWithShadow(textRenderer,
			Text.literal("FPS: " + client.getCurrentFps()),
			10, yOffset, 0xFFFFFF);
		yOffset += 12;
		
		// Coordinates
		Vec3d pos = client.player.getPos();
		drawContext.drawTextWithShadow(textRenderer,
			Text.literal(String.format("X: %.1f Y: %.1f Z: %.1f", pos.x, pos.y, pos.z)),
			10, yOffset, 0xFFFFFF);
		yOffset += 12;
		
		// Active modules
		drawContext.drawTextWithShadow(textRenderer,
			Text.literal("Modules:"),
			10, yOffset, 0xFF00FF00);
		yOffset += 12;
		
		if (client.player != null && client.player.getWorld() != null) {
			// Just display info, no cheating indicators
		}
	}
}

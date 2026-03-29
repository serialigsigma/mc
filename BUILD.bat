package com.example.lightclient.features;

import net.minecraft.client.MinecraftClient;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class InventoryModule {
	private boolean enabled = false;
	private boolean autoSortEnabled = false;
	
	public void toggle() {
		this.enabled = !this.enabled;
		if (this.enabled) {
			System.out.println("[Light Client] Inventory module enabled");
		} else {
			System.out.println("[Light Client] Inventory module disabled");
		}
	}
	
	public boolean isEnabled() {
		return this.enabled;
	}
	
	public void toggleAutoSort() {
		this.autoSortEnabled = !this.autoSortEnabled;
		System.out.println("[Light Client] AutoSort: " + (this.autoSortEnabled ? "ON" : "OFF"));
	}
	
	public boolean isAutoSortEnabled() {
		return this.autoSortEnabled;
	}
	
	/**
	 * Envantere bakarak eşya sayılarını gösterir
	 * Bu tamamen client-side ve güvenli
	 */
	public void analyzeInventory(MinecraftClient client) {
		if (client.player == null) return;
		
		Inventory inventory = client.player.getInventory();
		
		System.out.println("=== Inventory Analysis ===");
		for (int i = 0; i < inventory.size(); i++) {
			ItemStack stack = inventory.getStack(i);
			if (!stack.isEmpty()) {
				System.out.println(stack.getName().getString() + " x" + stack.getCount());
			}
		}
		System.out.println("==========================");
	}
	
	/**
	 * Durability'si düşük aletleri uyarır
	 */
	public void checkToolDurability(MinecraftClient client) {
		if (client.player == null) return;
		
		Inventory inventory = client.player.getInventory();
		
		for (int i = 0; i < inventory.size(); i++) {
			ItemStack stack = inventory.getStack(i);
			if (stack.isDamageable()) {
				int maxDamage = stack.getMaxDamage();
				int currentDamage = stack.getDamage();
				float durability = (float)(maxDamage - currentDamage) / maxDamage * 100;
				
				if (durability < 20) {
					System.out.println("[Warning] " + stack.getName().getString() + 
						" durability: " + String.format("%.1f%%", durability));
				}
			}
		}
	}
}

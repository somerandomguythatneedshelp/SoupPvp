package com.khazbak;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.LinkedHashMap;

public class CustomItems {
    public static final LinkedHashMap<String,ItemStack> items=new LinkedHashMap<>();
    public static void init(){
        items.put("Kit",initKitMenuItem());

    }

    private static ItemStack initKitMenuItem() {
    ItemStack kitMenuItem=new ItemStack(Material.NETHER_STAR,1);
        ItemMeta meta=kitMenuItem.getItemMeta();
        meta.addEnchant(Enchantment.LUCK,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&',"&2Kits"));
        kitMenuItem.setItemMeta(meta);
return kitMenuItem;
    }
}

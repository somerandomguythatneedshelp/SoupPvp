package com.khazbak.gui;

import com.khazbak.debugging.Debug;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

import java.util.LinkedHashMap;

public class Gui {
    public static LinkedHashMap<String,Gui> Menus =new LinkedHashMap<>();

   protected Inventory inventory;

    public Gui(String title) {
        this.inventory = Bukkit.createInventory(null , InventoryType.CHEST,title);
        Menus.put(title,this);


    }

    public Inventory getInventory() {
        return inventory;
    }

    public void openInv(Player p){
        p.openInventory(inventory);
    }
}

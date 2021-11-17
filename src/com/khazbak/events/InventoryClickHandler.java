package com.khazbak.events;

import com.khazbak.Kit.Kit;
import com.khazbak.debugging.Debug;
import com.khazbak.gui.Gui;
import com.khazbak.gui.KitsGui;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;

import java.util.Map;

public class InventoryClickHandler implements Listener {
    @EventHandler
    public void inventoryClick(InventoryClickEvent e){
            Debug.log(e.getRawSlot());
        for (Map.Entry<String, Gui> entry: Gui.Menus.entrySet()) {
            if(e.getClickedInventory().equals(entry.getValue().getInventory())){
                if(entry.getKey().equals(KitsGui.name)){
                    Kit.giveKit(e.getRawSlot(),((Player)e.getWhoClicked()));
                }


                e.setCancelled(true);
            }
        }
    }
}

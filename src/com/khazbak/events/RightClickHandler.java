package com.khazbak.events;

import com.khazbak.CustomItems;
import com.khazbak.Soup;
import com.khazbak.debugging.Debug;
import com.khazbak.gui.Gui;
import com.khazbak.gui.KitsGui;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class RightClickHandler implements Listener {
@EventHandler
    public void RightClick(PlayerInteractEvent e){
        Player p=e.getPlayer();
        Action action=e.getAction();
    ItemStack item=e.getItem();
        if(action== Action.RIGHT_CLICK_AIR||action==Action.RIGHT_CLICK_BLOCK){
        if(item!=null){
            if(item.getType()== Material.MUSHROOM_STEW){
            Soup.soupUsed(p);
            }else if(item.getItemMeta().equals(CustomItems.items.get("Kit").getItemMeta())){
                Gui.Menus.get("Kits").openInv(p);
            }
        }
        }
}

}

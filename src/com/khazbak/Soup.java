package com.khazbak;

import com.khazbak.debugging.Debug;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Soup {
    public static ItemStack emptySoup=new ItemStack(Material.BOWL,1);
    public static ItemStack filledSoup=new ItemStack(Material.MUSHROOM_STEW,1);
    public static final double heals=2*3.5;
    public static void soupUsed(Player p){
        double health=p.getHealth();
        double maxHealth=p.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
        int currentSlot=p.getInventory().getHeldItemSlot();
        if(health<maxHealth){
            health= Math.min(health + 2*heals, maxHealth);
            p.setHealth(health);
            Debug.log(health);
            p.getInventory().setItem(currentSlot,emptySoup);
        }
    }
}

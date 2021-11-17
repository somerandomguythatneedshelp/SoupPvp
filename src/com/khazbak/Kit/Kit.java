package com.khazbak.Kit;

import com.khazbak.Soup;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class Kit {
    public static ArrayList<Kit> kits=new ArrayList<>();
     ItemStack display;
    Inventory inventory;
static {
    initKits();
}
    public Kit(ItemStack display,Inventory inventory) {

        this.inventory=inventory;
        this.display=display;
        kits.add(this);
    }

    public static void initKits(){
    // ADD KITS HERE
        new Kit(new ItemStack(Material.DIAMOND_SWORD,1),initPvpKit());
    }

    private static Inventory initPvpKit() {

        Inventory inventory=inventory = Bukkit.createInventory(null,36);;
        ItemStack weapon=new ItemStack(Material.DIAMOND_SWORD,1);
        weapon.addEnchantment(Enchantment.DAMAGE_ALL,1);
        baseKit(inventory);
        inventory.setItem(0,weapon);
        return inventory;
    }

    public static void baseKit(Inventory inventory){
        if(inventory ==null){
            inventory = Bukkit.createInventory(null,36);
        }
        for (int i = 0; i < inventory.getSize(); i++) {
            inventory.setItem(i, Soup.filledSoup);
        }
    }

    public Inventory getInventory() {
        return inventory;
    }

    public ItemStack getDisplay() {
        return display;
    }
    public static void giveKit(int i, Player p){
    if(i<kits.size()){
        p.getInventory().setContents(kits.get(i).getInventory().getContents());
    }
    }
}

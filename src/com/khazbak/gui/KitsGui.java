package com.khazbak.gui;

import com.khazbak.Kit.Kit;
import com.khazbak.Soup;
import org.bukkit.inventory.Inventory;

import java.util.Map;

public class KitsGui extends Gui {
    public static String name="Kits";
    public KitsGui() {

        super(name);
        int i=0;
        for (Kit kit:Kit.kits) {
            inventory.setItem(i,kit.getDisplay());
        i++;
        }
           }
           public String getName(){
        return name;
           }
           public void clicked(){

           }
}

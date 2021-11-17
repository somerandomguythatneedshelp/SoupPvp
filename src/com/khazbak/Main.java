package com.khazbak;

import com.khazbak.commands.SoupPVPCommand;
import com.khazbak.events.InventoryClickHandler;
import com.khazbak.events.RightClickHandler;
import com.khazbak.gui.KitsGui;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public static String name;
    @Override
    public void onEnable() {
        name=getName();
        CustomItems.init();
        new KitsGui();
        getCommand("souppvp").setExecutor(new SoupPVPCommand());
        getServer().getPluginManager().registerEvents(new RightClickHandler(),this);
        getServer().getPluginManager().registerEvents(new InventoryClickHandler(),this);

    }
}

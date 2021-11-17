package com.khazbak;

import com.khazbak.debugging.Debug;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Main extends JavaPlugin {
    public static String name;
    @Override
    public void onEnable() {
        name=getName();


    }
}

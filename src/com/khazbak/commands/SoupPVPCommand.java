package com.khazbak.commands;

import com.khazbak.CustomItems;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SoupPVPCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player){
            Player p=(Player) commandSender;
            p.getInventory().addItem(CustomItems.items.get("Kit"));
        }
        return true;
    }
}

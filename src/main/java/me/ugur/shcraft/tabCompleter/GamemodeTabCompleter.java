package me.ugur.shcraft.tabCompleter;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class GamemodeTabCompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if(args.length == 1) {
            List<String> arguments = new ArrayList<>();
            arguments.add("0");
            arguments.add("1");
            arguments.add("2");
            arguments.add("3");
            arguments.add("survival");
            arguments.add("creative");
            arguments.add("adventure");
            arguments.add("spectator");
            return arguments;
        } else if (args.length == 2) {
            List<String> Players = new ArrayList<>();
            Players.add("@a");
            for (Player pl : Bukkit.getOnlinePlayers()) {
                Players.add(pl.getName());
            }
            return Players;
        }

        return null;
    }
}
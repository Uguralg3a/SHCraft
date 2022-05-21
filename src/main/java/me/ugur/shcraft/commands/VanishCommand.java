package me.ugur.shcraft.commands;

import me.ugur.shcraft.Main;
import me.ugur.shcraft.save.Strings;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VanishCommand implements CommandExecutor {

    private final Main plugin;


    public VanishCommand(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;

        if (plugin.invisible_list.contains(p)) {
            for (Player people : Bukkit.getOnlinePlayers()) {
                people.showPlayer(plugin, p);
            }
            plugin.invisible_list.remove(p);
            p.sendMessage(Strings.prefix + "" + ChatColor.RED + "Du bist nun für alle Spieler sichtbar!");
        } else if (!plugin.invisible_list.contains(p)) {
            for (Player people : Bukkit.getOnlinePlayers()) {
                people.hidePlayer(plugin, p);
            }
            plugin.invisible_list.add(p);
            p.sendMessage(Strings.prefix + "" + ChatColor.GREEN + "Du bist nun für alle Spieler unsichtbar!");
        }

        return false;
    }
}

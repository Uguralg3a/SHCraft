package me.ugur.shcraft.commands;

import me.ugur.shcraft.Main;
import me.ugur.shcraft.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LobbyCommand implements CommandExecutor {

    private final Main plugin;

    public LobbyCommand(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (args.length == 0) {
            Utils.SendToServer(p, "lobby");
        } else if (args.length == 1) {
            if (args[0].equalsIgnoreCase("all")) {
                for (Player pl : Bukkit.getOnlinePlayers()) {
                    Utils.SendToServer(pl, "lobby");
                }
            }
        }
        return true;
    }
}


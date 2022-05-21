package me.ugur.shcraft.commands;

import me.ugur.shcraft.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class NavigatorCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
            Player p = (Player) sender;
                Inventory i = Bukkit.createInventory(null, 6 * 9, "Navigator");
                i.setItem(20, new ItemBuilder(Material.OAK_DOOR).setDisplayname("Citybuild").setLocalizedName("citybuild").build());
                i.setItem(22, new ItemBuilder(Material.DIAMOND_HELMET).setDisplayname("SkyWars").setLocalizedName("skywars").build());
                i.setItem(24, new ItemBuilder(Material.IRON_DOOR).setDisplayname("Lobby").setLocalizedName("lobby").build());


                p.openInventory(i);
        return false;
    }
}

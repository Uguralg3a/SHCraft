package me.ugur.shcraft.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Phantom;
import org.bukkit.entity.Player;

public class AdminPetsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("phantom")) {
                final LivingEntity mob = (LivingEntity) p.getWorld().spawnEntity(p.getLocation(), EntityType.PHANTOM);
                Phantom ph = (Phantom) mob;
                ph.setCustomName(p.getName() + "s Phantom");
                ph.addPassenger(ph);
                
            } 
        } else {
            return false;
        }
        return false;
    }
}

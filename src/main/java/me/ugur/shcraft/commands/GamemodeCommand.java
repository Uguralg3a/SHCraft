package me.ugur.shcraft.commands;

import me.ugur.shcraft.Main;
import me.ugur.shcraft.save.Strings;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            return false;
        }

        Player p = (Player) sender;
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("survival")) {
                p.setGameMode(GameMode.SURVIVAL);
                p.sendMessage(Strings.changeSelfGamemodeToSurvival);
            }
            if (args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("creative")) {
                p.setGameMode(GameMode.CREATIVE);
                p.sendMessage(Strings.changeSelfGamemodeToCreative);
            }
            if (args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("adventure")) {
                p.setGameMode(GameMode.ADVENTURE);
                p.sendMessage(Strings.changeSelfGamemodeToAdventure);
            }
            if (args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spectator")) {
                p.setGameMode(GameMode.SPECTATOR);
                p.sendMessage(Strings.changeSelfGamemodeToSpectator);
            }
        }
        if (args.length == 2) {
            if (args[1].equalsIgnoreCase("@a")) {
                if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("survival")) {
                    for (Player pl : Bukkit.getOnlinePlayers()) {
                        pl.setGameMode(GameMode.SURVIVAL);
                        pl.sendMessage(Strings.changeAllGamemodeToSurvival);
                    }
                } else if (args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("creative")) {
                    for (Player pl : Bukkit.getOnlinePlayers()) {
                        pl.setGameMode(GameMode.CREATIVE);
                        pl.sendMessage(Strings.changeAllGamemodeToCreative);
                    }
                } else if (args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("adventure")) {
                    for (Player pl : Bukkit.getOnlinePlayers()) {
                        pl.setGameMode(GameMode.ADVENTURE);
                        pl.sendMessage(Strings.changeAllGamemodeToAdventure);
                    }
                } else if (args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spectator")) {
                    for (Player pl : Bukkit.getOnlinePlayers()) {
                        pl.setGameMode(GameMode.SPECTATOR);
                        pl.sendMessage(Strings.changeAllGamemodeToSpectator);
                    }
                }

            } else {
                try {
                    Player s = Bukkit.getPlayer(args[1]);
                    if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("survival")) {
                        s.setGameMode(GameMode.SURVIVAL);
                        s.sendMessage(Strings.changeSelfGamemodeToSurvival);
                    } else if (args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("creative")) {
                        s.setGameMode(GameMode.CREATIVE);
                        s.sendMessage(Strings.changeSelfGamemodeToCreative);
                    } else if (args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("adventure")) {
                        s.setGameMode(GameMode.ADVENTURE);
                        s.sendMessage(Strings.changeSelfGamemodeToAdventure);
                    } else if (args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spectator")) {
                        s.setGameMode(GameMode.SPECTATOR);
                        s.sendMessage(Strings.changeSelfGamemodeToCreative);
                    }
                } catch (Exception e) {
                    for (Player pl : Bukkit.getOnlinePlayers()) {
                        pl.sendMessage(Strings.prefix + "Der Spieler §9" + args[0] + " §7 konnte §cnicht gefunden §7werden.");
                    }
                }
            }
        }
        return false;
    }
}



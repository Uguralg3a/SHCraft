package me.ugur.shcraft.save;

import org.bukkit.ChatColor;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;

public class Strings {
    private static Player p;
    public static String prefix = ChatColor.AQUA + "" + ChatColor.BOLD +  "SHCraft" + ChatColor.RESET + " : ";
    public static String changeTimeToDay = prefix + "Die Zeit wurde erfolgreich auf Tag umgestellt!";
    public static String changeTimeToNight = prefix + "Die Zeit wurde erfolgreich auf Tag umgestellt!";
    public static String changeSelfGamemodeToSurvival = prefix + "Dein Gamemode wurde auf SURVIVAL gesetzt!";
    public static String changeSelfGamemodeToCreative = prefix + "Dein Gamemode wurde auf CREATIVE gesetzt!";
    public static String changeSelfGamemodeToAdventure = prefix + "Dein Gamemode wurde auf ADVENTURE gesetzt!";
    public static String changeSelfGamemodeToSpectator = prefix + "Dein Gamemode wurde auf SPECTATOR gesetzt!";
    public static String changeAllGamemodeToSurvival = prefix + "Der Gamemode von allem wurde auf SURVIVAL gesetzt!";
    public static String changeAllGamemodeToCreative = prefix + "Der Gamemode von allem wurde auf CREATIVE gesetzt!";
    public static String changeAllGamemodeToAdventure = prefix + "Der Gamemode von allem wurde auf ADVENTURE gesetzt!";
    public static String changeAllGamemodeToSpectator = prefix + "Der Gamemode von allem wurde auf SPECTATOR gesetzt!";
    public static String healThePlayerAndCountTheOldHealth = prefix + "Deine Leben wurden von " + p.getHealth() + " Herzen auf 20 Herzen gesetzt!";
}

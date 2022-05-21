package me.ugur.shcraft;

import me.ugur.shcraft.commands.*;
import me.ugur.shcraft.listeners.JoinEvent;
import me.ugur.shcraft.listeners.NavigatorListener;
import me.ugur.shcraft.tabCompleter.CitybuildTabCompleter;
import me.ugur.shcraft.tabCompleter.GamemodeTabCompleter;
import me.ugur.shcraft.tabCompleter.LobbyTabCompleter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class Main extends JavaPlugin {

    public static Main plugin;
    public ArrayList<Player> invisible_list = new ArrayList<>();

    @Override
    public void onEnable() {

        this.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
        registerListeners();
        registerCommands();
        TabCompleterRegistration();

    }

    private void registerListeners() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new JoinEvent(this), this);
        pm.registerEvents(new NavigatorListener(), this);
    }

    private void TabCompleterRegistration() {
        this.getCommand("gamemode").setTabCompleter(new GamemodeTabCompleter());
        this.getCommand("gm").setTabCompleter(new GamemodeTabCompleter());
        this.getCommand("lobby").setTabCompleter(new LobbyTabCompleter());
        this.getCommand("l").setTabCompleter(new LobbyTabCompleter());
        this.getCommand("citybuild").setTabCompleter(new CitybuildTabCompleter());
        this.getCommand("cb").setTabCompleter(new CitybuildTabCompleter());
    }

    private void registerCommands() {
        this.getCommand("gamemode").setExecutor(new GamemodeCommand());
        this.getCommand("gm").setExecutor(new GamemodeCommand());
        this.getCommand("lobby").setExecutor(new LobbyCommand(this));
        this.getCommand("l").setExecutor(new LobbyCommand(this));
        this.getCommand("citybuild").setExecutor(new CitybuildCommand(this));
        this.getCommand("cb").setExecutor(new CitybuildCommand(this));
        this.getCommand("vanish").setExecutor(new VanishCommand(this));
        this.getCommand("v").setExecutor(new VanishCommand(this));
        this.getCommand("day").setExecutor(new DayCommand());
        this.getCommand("tag").setExecutor(new DayCommand());
        this.getCommand("navigator").setExecutor(new NavigatorCommand());
        this.getCommand("nav").setExecutor(new NavigatorCommand());
        this.getCommand("heal").setExecutor(new HealCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Main getInstance() {
        return plugin;
    }
}
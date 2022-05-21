package me.ugur.shcraft.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class NavigatorListener implements Listener {
    @EventHandler
    public void onInvClick(InventoryClickEvent e) {
        if (e.getCurrentItem() == null) return;
        if (e.getView().getTitle().equalsIgnoreCase("Navigator")) {
            System.out.println("Der Navigator Listener funktioniert");
            Player p = (Player) e.getWhoClicked();
            e.setCancelled(true);
            if (e.getCurrentItem().getItemMeta().hasLocalizedName()) {
                switch (e.getCurrentItem().getItemMeta().getLocalizedName()) {
                    case "citybuild":
                        p.performCommand("css join Citybuild");
                        p.closeInventory();
                        break;
                    case "skywars":
                        p.performCommand("css join Skywars");
                        p.closeInventory();
                        break;
                    case "lobby":
                        p.performCommand("css join lobby");
                        p.closeInventory();
                        break;
                }
            }
        }
    }
}


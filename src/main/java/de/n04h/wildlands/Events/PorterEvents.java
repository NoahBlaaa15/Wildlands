package de.n04h.wildlands.Events;

import de.n04h.wildlands.Porters.Porter;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import static de.n04h.wildlands.Porters.PorterStorage.porters;

public class PorterEvents implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        porters.put(e.getPlayer(), new Porter(e.getPlayer()));
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        porters.remove(e.getPlayer());
    }

}

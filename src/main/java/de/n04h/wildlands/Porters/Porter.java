package de.n04h.wildlands.Porters;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import javax.sound.sampled.Port;
import java.util.UUID;

public class Porter {

    Player p;

    public Porter(UUID uuid) {
        this(Bukkit.getPlayer(uuid));
    }

    public Porter(Player p) {
        this.p = p;
    }

}

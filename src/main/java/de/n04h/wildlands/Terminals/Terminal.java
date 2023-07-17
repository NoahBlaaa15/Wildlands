package de.n04h.wildlands.Terminals;

import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;

public class Terminal {

    Location location;

    ArmorStand terminalHead;
    ArmorStand metalCover;
    ArmorStand glassScreen;

    boolean spawned;
    boolean activated;

    public Terminal(Location l) {
        this.location = l;
    }

    public double calculateDistance(Location l) {
        return location.distance(l);
    }

}

package de.n04h.wildlands.Terminals;

import org.bukkit.Location;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class TerminalManager {

    List<Terminal> terminals = new LinkedList<>();

    public TerminalManager() {

    }

    public registerNewTerminal(Terminal term) {
        terminals.add(term);
    }

    public Terminal getClosestTerminal(Location l) {
        terminals.sort(new Comparator<Terminal>() {
            @Override
            public int compare(Terminal o1, Terminal o2) {
                return 0;
            }
        });
        if (terminals.isEmpty()) {
            return null;
        }
        Terminal term = terminals.get(0);
        double distance = term.calculateDistance(l);
        for (int i = 1; i < terminals.size(); i++) {
            double distanceNew = terminals.get(i).calculateDistance(l);
            if (distanceNew < distance) {
                term = terminals.get(i);
                distance = distanceNew;
            }
        }
        return term;
    }

}

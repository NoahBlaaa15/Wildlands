package de.n04h.wildlands;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class Wildlands extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Reading Strand Data");
        getLogger().info("-. .-.   .-. .-.   .-. .-.   .\n" +
                            "  \\   \\ /   \\   \\ /   \\   \\ /\n" +
                            " / \\   \\   / \\   \\   / \\   \\\n" +
                            "~   `-~ `-`   `-~ `-`   `-~ `-");
        //TODO: Load Player saves and game checkpoints
        getLogger().info("Strand confirmed");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

package de.n04h.wildlands.Commands;

import de.n04h.wildlands.Utils.Messages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PorterCommands implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (!(commandSender instanceof Player)) {
                commandSender.sendMessage(Messages.info("You are not a Player"));
        }

        //TODO: Allow change class, respawn, abandon quest/cargo

        return false;
    }
}

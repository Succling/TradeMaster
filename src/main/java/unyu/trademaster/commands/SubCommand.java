package unyu.trademaster.commands;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public interface SubCommand {
    public void onCommand(Player player, Command command, String[] args);
}
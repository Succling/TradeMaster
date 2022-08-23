package unyu.trademaster.commands;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandManager implements CommandExecutor {

    private Map<String, SubCommand> commands = new HashMap<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // TODO: Decide what to do here
        if (!(sender instanceof Player)) {
            return true;
        }

        String requestedCommand = args[0].toLowerCase();
        Player player = (Player) sender;

        if (!commands.containsKey(requestedCommand.toLowerCase())) {
            return false;
        }

        
        commands.get(requestedCommand).onCommand(player, command, args);
        return true;

        
    }

    public void registerCommand(String commandName, SubCommand subCommand) {
        commands.put(commandName, subCommand);
    }
}

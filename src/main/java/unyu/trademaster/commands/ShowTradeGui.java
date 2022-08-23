package unyu.trademaster.commands;

import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class ShowTradeGui implements SubCommand, Listener {


    public void onCommand(Player player, Command command, String[] args) {

        final Server server = player.getServer();
        Inventory tradeGui = server.createInventory(null, 18, "Trade Gui");

        player.openInventory(tradeGui);
    }
    
}

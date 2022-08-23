package unyu.trademaster;

import org.bukkit.plugin.java.JavaPlugin;

import unyu.trademaster.commands.CommandManager;
import unyu.trademaster.commands.ShowTradeGui;

public final class TradeMaster extends JavaPlugin {

    @Override
    public void onEnable() {

        CommandManager cm = new CommandManager();
        getCommand("trademaster").setExecutor(cm);
        cm.registerCommand("showgui", new ShowTradeGui());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
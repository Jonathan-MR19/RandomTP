package pe.edu.utp.plugins.randomtp;

import org.bukkit.plugin.java.JavaPlugin;
import pe.edu.utp.plugins.randomtp.commands.*;

public final class RandomTp extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.saveDefaultConfig();

        HelloCommand helloCommand = new HelloCommand();
        this.getCommand("hello").setExecutor(helloCommand);
        this.getCommand("hello").setTabCompleter(helloCommand);
        this.getCommand("luiscmd").setExecutor(new LuisCommand());
        this.getCommand("utp").setExecutor(new UtpCommand());
        this.getCommand("irwin").setExecutor(new IrwinCommand());
        this.getCommand("randomtp").setExecutor(new RandomTpCommand());
        System.out.println("Valor de pvp");
        System.out.println(getConfig().getBoolean("pvp"));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

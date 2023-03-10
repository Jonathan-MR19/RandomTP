package pe.edu.utp.plugins.randomtp;

import org.bukkit.plugin.java.JavaPlugin;
import pe.edu.utp.plugins.randomtp.commands.HelloCommand;

public final class PLUGIN extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.saveDefaultConfig();

        HelloCommand helloCommand = new HelloCommand();
        this.getCommand("hello").setExecutor(helloCommand);
        this.getCommand("hello").setTabCompleter(helloCommand);

        System.out.println("Valor de pvp");
        System.out.println(getConfig().getBoolean("pvp"));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

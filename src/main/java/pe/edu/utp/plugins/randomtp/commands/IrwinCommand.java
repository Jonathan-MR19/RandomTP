package pe.edu.utp.plugins.randomtp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class IrwinCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender Sender, Command Command, String Label, String[] arg) {
        //Logica del comando
        Sender.sendMessage("hi people is my command");
        return true;
    }
}

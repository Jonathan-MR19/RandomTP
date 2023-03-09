package pe.edu.utp.plugins.randomtp.commands;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelloCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player jugador = (Player) sender;
            sender.sendMessage("Eres un jugador");

            // Location
            Location loc = jugador.getLocation(); // Yellow block

            // Cyan block - Floor
            Location floor = loc.add(0, -1, 0);
            Block cyanBlock = floor.getBlock();

            jugador.sendMessage(
                    String.format("El bloque es: %s", cyanBlock.getType())
            );
        } else {
            sender.sendMessage("No eres un jugador");
        }

        return true;
    }
}

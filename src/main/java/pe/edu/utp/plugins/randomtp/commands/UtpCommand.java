package pe.edu.utp.plugins.randomtp.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class UtpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("No eres un jugador prro.");
            return true;
        }

        Player player = (Player) sender;

        Location loc = player.getLocation();


        Location newloc = loc.add(100,20,-30);

        player.teleport(newloc);


        //  loc = new Location(world, x+.5, block.getY() + 1, z+.5






        return true;
    }


}

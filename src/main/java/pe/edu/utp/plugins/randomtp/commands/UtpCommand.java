package pe.edu.utp.plugins.randomtp.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import java.util.List;

public class UtpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("No eres un jugador prro.");
            return true;
            }

        Player player = (Player) sender;
        if (args.length<1)
            return true;
        String arg0= args[0];
        if(arg0.equalsIgnoreCase("end")) {
            Location Dimension = new Location(Bukkit.getWorld("world_the_end"),0,100,0);
            player.teleport(Dimension);
        } else if (arg0.equalsIgnoreCase("nether")) {
            Location Dimension = new Location(Bukkit.getWorld("world_nether"),0,100,0);
            player.teleport(Dimension);

        } else if (arg0.equalsIgnoreCase("over")) {
            Location Dimension = new Location(Bukkit.getWorld("world"),0,100,0);
            player.teleport(Dimension);

        }

//        player.getLocation().getYaw();
//        player.getVelocity().add(new Vector());

//        Location loc = player.getLocation();
//
//
//        Location newloc = loc.add(100,31,-30);

       // player.teleport(newloc);


        //  loc = new Location(world, x+.5, block.getY() + 1, z+.5






        return true;
    }


}

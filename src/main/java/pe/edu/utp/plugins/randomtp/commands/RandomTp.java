package pe.edu.utp.plugins.randomtp.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTp implements CommandExecutor, TabCompleter {
    // /rtp min max
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length < 2) {
            sender.sendMessage("Faltan argumentos, /rtp <min> <max> [player]");
            return true;
        }

        if (!(sender instanceof Player) && args.length != 3) {
            sender.sendMessage("Este comando solo puede ser usado por un jugador");
            return true;
        }

        Player jugador;

        if (args.length >= 3) {
            if (Bukkit.getPlayer(args[2]) == null) {
                sender.sendMessage("El jugador no fue encontrado");
                return true;
            }
            jugador = Bukkit.getPlayer(args[2]);
        } else {
            jugador = (Player) sender;
        }

        Location loc = getRandomBlockToSpawn(1, 2, "world");

        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        if(args.length < 1) return null;
        List<String> completer = new ArrayList<>();

        if(args.length == 3) {
            String arg = args[2].toLowerCase();

            for (Player player : Bukkit.getOnlinePlayers()) {
                if (player.getName().toLowerCase().startsWith(arg))
                    completer.add(player.getName());
            }
        }

        return completer;
    }

    private int getRandomCord(int min, int max) {
        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;
        boolean isPositive = random.nextBoolean();
        return isPositive ? randomNumber : -randomNumber;
    }

    private Location getRandomBlockToSpawn(int min, int max, String world) {
        Location loc = null;
        
        while (loc == null) {

        }
        
        return loc;
    }
}

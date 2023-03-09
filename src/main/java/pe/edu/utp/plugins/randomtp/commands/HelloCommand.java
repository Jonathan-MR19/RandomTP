package pe.edu.utp.plugins.randomtp.commands;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class HelloCommand implements CommandExecutor, TabCompleter {
    /*
        /hello
        /hello world
        /hello block
     */
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player)) {
            sender.sendMessage("No eres un jugador prro.");
            return true;
        }

        Player jugador = (Player) sender;

        if (args.length == 0) {
            // /hello
            sender.sendMessage("Usaste el comando /hello");
        } else if (args.length == 1) {
            if (args[0].equalsIgnoreCase("world")) {
                // /hello world
                sender.sendMessage("Hello world minecraft plugin project");
            } else if (args[0].equalsIgnoreCase("block")) {
                // /hello block
                Location loc = jugador.getLocation();
                Location floor = loc.add(0, -1, 0);
                Block floorBlock = floor.getBlock();

                jugador.sendMessage(
                        String.format("El bloque donde estas parado es: %s", floorBlock.getType())
                );
            }
        }

//        if(sender instanceof Player) {
//            sender.sendMessage("Eres un jugador");
//
//            // Location
//            Location loc = jugador.getLocation(); // Yellow block
//
//            // Cyan block - Floor
//            Location floor = loc.add(0, -1, 0);
//            Block cyanBlock = floor.getBlock();
//
//            jugador.sendMessage(
//                    String.format("El bloque es: %s", cyanBlock.getType())
//            );
//        } else {
//            sender.sendMessage("No eres un jugador prro.");
//        }

        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {

        // /hello
        // /cmd arg0 arg1 arg2 ...

        if(args.length <= 0) return null;
        List<String> completer = new ArrayList<>();

        if(args.length == 1) {
            String arg = args[0];

            String[] args0 = new String[]{"world", "block"};

            for (String search : args0) {
                if (search.startsWith(arg))
                    completer.add(search);
            }
        }

        return completer;
    }
}

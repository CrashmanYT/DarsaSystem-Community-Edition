package darsasystem2.darsasystem2;

import darsasystem2.darsasystem2.commands.CommandManager;
import darsasystem2.darsasystem2.commands.SubCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class TabComplete implements TabCompleter {

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String s, String[] args) {
        if (args.length == 1) {
            List<String> completions = new ArrayList<>();
            for (SubCommand command : CommandManager.getCommands()) {
                completions.add(command.getName());
            }
            return completions;
        }
        return null;
    }
}

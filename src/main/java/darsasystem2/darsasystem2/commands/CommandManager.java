package darsasystem2.darsasystem2.commands;

import darsasystem2.darsasystem2.DarsaSystem2;
import darsasystem2.darsasystem2.commands.items.ItemHelpCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Arrays;
import java.util.List;

public class CommandManager implements CommandExecutor {

    private static SubCommand[] commands = {new ItemHelpCommand()};
    public String mainCommand = "darsasystem";
    public String[] aliases = {"ds"};

    public static SubCommand[] getCommands() { return commands; }
    public String getCommand() {return mainCommand; }
    public List<String> getAliases() { return Arrays.asList(aliases); }


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (args.length < 1) return true;
        String commandName = args[0];
        for (SubCommand command : commands) {
            if (commandName.equalsIgnoreCase(command.getName())) {
                command.onCommand(sender, cmd, s, args);
            }
        }

        return true;
    }


}

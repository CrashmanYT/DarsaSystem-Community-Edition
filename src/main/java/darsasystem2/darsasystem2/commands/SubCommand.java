package darsasystem2.darsasystem2.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public interface SubCommand extends CommandExecutor {

    String getName();
    String getDescription();
    String getUsage();
    String[] getAliases();
    String[] getParameter();

    @Override
    boolean onCommand(CommandSender sender, Command command, String s, String[] args);

}

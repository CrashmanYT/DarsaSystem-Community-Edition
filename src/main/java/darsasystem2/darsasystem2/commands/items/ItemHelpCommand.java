package darsasystem2.darsasystem2.commands.items;

import darsasystem2.darsasystem2.commands.SubCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class ItemHelpCommand implements SubCommand {
    private String name = "help";
    private String description = "Menampilkan perintah bantuan untuk perintah Darsa Item";
    private String usage = "darsasystem item help";
    private String[] aliases = {"i"};
    private String[] parameter = {""};

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public String getDescription() {
        return this.description;
    }
    @Override
    public String getUsage() {
        return this.usage;
    }
    @Override
    public String[] getAliases() {
        return this.aliases;
    }
    @Override
    public String[] getParameter() {
        return this.parameter;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        sender.sendMessage("halo");
        return true;
    }
}

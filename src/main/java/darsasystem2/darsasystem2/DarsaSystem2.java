package darsasystem2.darsasystem2;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class DarsaSystem2 extends JavaPlugin {

    private static DarsaSystem2 instance;
    @Override
    public void onEnable() {
        // Plugin startup logic
        setInstance(this);
        getServer().broadcastMessage("test");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }

    public static DarsaSystem2 getInstance() { return instance; }
    public static void setInstance(DarsaSystem2 instance) { DarsaSystem2.instance = instance; }
}

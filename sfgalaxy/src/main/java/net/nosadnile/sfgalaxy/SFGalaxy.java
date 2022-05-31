package net.nosadnile.sfgalaxy;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import net.nosadnile.sfgalaxy.groups.ItemGroupRegistry;
import net.nosadnile.sfgalaxy.groups.MainItemGroup;
import net.nosadnile.sfgalaxy.items.ItemRegistry;
import org.bukkit.plugin.java.JavaPlugin;

public class SFGalaxy extends JavaPlugin implements SlimefunAddon {

    public static SFGalaxy INSTANCE;
    public static ItemGroupRegistry GROUPS;
    public static ItemRegistry ITEMS;

    @Override
    public void onEnable() {
        INSTANCE = this;
        GROUPS = new ItemGroupRegistry();
        ITEMS = new ItemRegistry();

        GROUPS.register("sfgalaxy", new MainItemGroup());

        ITEMS.init();
        ITEMS.registerAll();
    }

    @Override
    public void onDisable() {}

    @Override
    public String getBugTrackerURL() {
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }
}

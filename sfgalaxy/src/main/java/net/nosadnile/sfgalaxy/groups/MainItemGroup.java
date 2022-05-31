package net.nosadnile.sfgalaxy.groups;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import net.nosadnile.sfgalaxy.SFGalaxy;
import net.nosadnile.sfgalaxy.SFGalaxyHeads;
import net.nosadnile.sfgalaxy.api.group.SFGalaxyItemGroup;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public class MainItemGroup implements SFGalaxyItemGroup {

    private ItemGroup GROUP;

    public MainItemGroup() {
        NamespacedKey itemGroupId = new NamespacedKey(
            SFGalaxy.INSTANCE,
            "sfgalaxy"
        );
        this.GROUP = new ItemGroup(itemGroupId, SFGalaxyHeads.ROCKET);
    }

    @Override
    public ItemGroup get() {
        return this.GROUP;
    }

    @Override
    public ItemStack getIcon() {
        return SFGalaxyHeads.ROCKET;
    }
}

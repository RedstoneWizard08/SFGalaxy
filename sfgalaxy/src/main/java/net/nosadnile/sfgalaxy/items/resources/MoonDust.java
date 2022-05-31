package net.nosadnile.sfgalaxy.items.resources;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import net.nosadnile.sfgalaxy.SFGalaxy;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class MoonDust extends SlimefunItem {

    public MoonDust() {
        super(
            SFGalaxy.GROUPS.get("sfgalaxy").get(),
            new SlimefunItemStack(
                "MOON_DUST",
                Material.GUNPOWDER,
                "&eMoon Dust",
                "&7A crafting ingredient for",
                "&7several of SFGalaxy's recipes."
            ),
            RecipeType.NULL,
            new ItemStack[] {}
        );
    }
}

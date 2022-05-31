package net.nosadnile.sfgalaxy.items;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import net.nosadnile.sfgalaxy.SFGalaxy;
import net.nosadnile.sfgalaxy.api.SFGalaxyRegistry;
import net.nosadnile.sfgalaxy.items.resources.MoonDust;

public class ItemRegistry extends SFGalaxyRegistry<SlimefunItem> {

    public void init() {
        this.register("moondust", new MoonDust());
    }

    public void registerAll() {
        Iterable<SlimefunItem> ITEMS = this.values();
        for (SlimefunItem item : ITEMS) {
            item.register(SFGalaxy.INSTANCE);
        }
    }
}

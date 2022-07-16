package io.github.onebytegh.osebysmisc.events.autocrafter;

import io.github.onebytegh.osebysmisc.OSebysMisc;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class SetupEvent implements Listener {
    private final OSebysMisc plugin;

    public SetupEvent(OSebysMisc plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlaceBlock(BlockPlaceEvent event) {
        if(!plugin.getConfig().getBoolean("features.0")) return;
        Block block = event.getBlock();
        if(!(block.getType() == Material.CHEST || block.getType() == Material.HOPPER)) return;
    }
}

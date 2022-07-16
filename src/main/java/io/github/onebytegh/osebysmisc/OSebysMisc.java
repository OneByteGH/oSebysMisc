package io.github.onebytegh.osebysmisc;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class OSebysMisc extends JavaPlugin {

    private final HashMap<Integer, Boolean> featureList = new HashMap<>();
    String[] ideas = {
        "Auto Crafter",        // 0
        "Totem Of Holding",    // 1
        "Double Door Opening", // 2
        "Sign Editor",         // 3
        "Dispensers++",        // 4
        "Invisible Frames"     // 5
    };

    @Override
    public void onEnable() {
        // Plugin startup logic
        ConfigurationSection features = getConfig().getConfigurationSection("features");
        int i = 0;
        for (String key : features.getKeys(false)) {
            i++;
            featureList.put(i, features.getBoolean(key));
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

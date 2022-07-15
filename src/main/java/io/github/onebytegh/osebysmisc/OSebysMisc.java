package io.github.onebytegh.osebysmisc;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class OSebysMisc extends JavaPlugin {

    private final HashMap<Integer, Boolean> featureList = new HashMap<>();

    @Override
    public void onEnable() {
        // Plugin startup logic
        /*
        1) Monster Scarer
        2) Totem Of Holding
        3) Double Door Opening
        4) Sign Editor
        5) Dispensers++
         */
        ConfigurationSection features = getConfig().getConfigurationSection("features");
        int i = 0;
        for (String key : features.getKeys(false)) {
            i++;
            featureList.put(i, features.getBoolean(key));
        }
        featureList.put(1, false);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

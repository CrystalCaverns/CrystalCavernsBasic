package cc.crystalcavernsbasic;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public final class CrystalCavernsBasic extends JavaPlugin {
    public static List<UUID> toSend = new ArrayList<>();
    @Override
    public void onEnable() {
        plugin = this;
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        Objects.requireNonNull(getCommand("spawn")).setExecutor(new SpawnCommand());
        getLogger().info("Crystal Caverns Basic plugin loaded successfully!");
    }
    public static JavaPlugin plugin;
}
package cc.crystalcavernsbasic;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static cc.crystalcavernsbasic.CrystalCavernsBasic.toSend;

public class PlayerJoin implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        toSend.add(e.getPlayer().getUniqueId());
    }
}
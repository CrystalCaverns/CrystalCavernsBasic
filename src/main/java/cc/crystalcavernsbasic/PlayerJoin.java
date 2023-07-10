package cc.crystalcavernsbasic;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static cc.crystalcavernsbasic.CrystalCavernsBasic.toSend;

public class PlayerJoin implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        toSend.add(p.getUniqueId());
        p.sendTitle("\uDBEA\uDDE8", "", 0, 10, 10);
    }
}
package fr.cmnemoi.esportsclash.player;

import java.util.Map;
import java.util.HashMap;

public class PlayerRepository {
    private Map<String, Player> players = new HashMap<>();

    public Player findById(String id) {
        return players.get(id);
    }

    public void save(Player player) {
        players.put(player.getId(), player);
    }
}

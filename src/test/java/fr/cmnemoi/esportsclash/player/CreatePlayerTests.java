package fr.cmnemoi.esportsclash.player;

import org.junit.Assert;
import org.junit.Test;

public class CreatePlayerTests {
    @Test
    public void shouldCreatePlayer() {
        var playerRepository = new PlayerRepository();
        var createPlayerUseCase = new CreatePlayerUseCase(playerRepository);

        var playerId = createPlayerUseCase.execute("name").id;

        var expectedPlayer = new Player(playerId, "name");
        var actualPlayer = playerRepository.findById(playerId);

        Assert.assertEquals(expectedPlayer.getName(), actualPlayer.getName());
    }
}

package pl.com.clockworkgnome.memento;

import pl.com.clockworkgnome.memento.domain.Player;
import pl.com.clockworkgnome.memento.domain.PlayerMemento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pawel on 2017-03-20.
 */
public class GameCaretaker {

    List<PlayerMemento> saveGames = new ArrayList<>();

    public void saveGame(Player player) {
        PlayerMemento memento = player.createMemento();
        saveGames.add(memento);
    }

    public Player loadGame() {
        PlayerMemento memento =saveGames.get(saveGames.size()-1);
        return Player.createPlayer(memento);
    }
}

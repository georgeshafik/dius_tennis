package au.com.spirit;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by gs on 19/11/19
 */
public class SimulatorTennisMatchTest {

    TennisMatch tennisMatch;
    List<Player> players;
    Player player1;
    Player player2;

    @Before
    public void setUp() {
        tennisMatch = new TennisMatch(MatchType.MENS, MatchType.SINGLES, players);

        players = new ArrayList<Player>();

        player1 = new Player("John", "Smith", 21, 10, PlayerPosition.PLAYER_ONE);
        player2 = new Player("Bill", "Jones", 21, 10, PlayerPosition.PLAYER_TWO);
    }

    @Test
    public void addPlayersToNewMatch() {

        players.add(player1);
        players.add(player2);

        assertEquals( players.size(), 2);
    }


    @Test
    public void game1MatchPlay() {
        tennisMatch.setTieBreaker(false); // not a tie breaker

        // Set 1
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);

        assertTrue(tennisMatch.score().trim().compareToIgnoreCase("0:0  15:0  30:0  30:15  30:30  30:40") == 0);

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);

        assertTrue(tennisMatch.score().trim().compareToIgnoreCase("0:0") == 0);
    }

    @Test
    public void game2MatchPlay() {

        // Set 2
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);

        assertTrue(tennisMatch.score().trim().compareToIgnoreCase("0:0  15:0  30:0  30:15  30:30  40:30  40:40  40:40") == 0);

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);

        assertTrue(tennisMatch.score().trim().compareToIgnoreCase("0:0") == 0);
    }

    @Test
    public void game3MatchPlayTieBreaker() {

        // Set 2
        tennisMatch.setTieBreaker(true); // we have a tie breaker
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);

        assertTrue(tennisMatch.score().trim().compareToIgnoreCase("0:0  1:0  1:1  2:1  2:2  3:2  3:3  4:3  4:4  5:4  5:5  6:5  7:5  7:6  8:6  8:7  9:7  9:8  10:8")==0);


    }
}

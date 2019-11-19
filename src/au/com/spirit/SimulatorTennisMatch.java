package au.com.spirit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gs on 18/11/19
 */
public class SimulatorTennisMatch {

    public static void main(String[] args) {

        List<Player> players = new ArrayList<Player>();

        Player player1 = new Player("John", "Smith", 21, 10, PlayerPosition.PLAYER_ONE);
        Player player2 = new Player("Bill", "Jones", 21, 10, PlayerPosition.PLAYER_TWO);

        players.add(player1);
        players.add(player2);

        // New Match
        TennisMatch tennisMatch = new TennisMatch(MatchType.MENS, MatchType.SINGLES, players);
        tennisMatch.setTieBreaker(false); // not a tie breaker

        // Game 1
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score()); // 0:0

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score()); // 0:0 15:0

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score()); // 0:0 15:0 30:0

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score()); // 0:0 15:0 30:0 30:15

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score()); // 0:0 15:0 30:0 30:15 30:30

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score()); // 0:0 15:0 30:0 30:15 30:30 30:40

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());


        // Game 2
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());;

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());


        // Game 3
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());


        // Game 4
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        // Game 5
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        // Game 6
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());




        // Game 7
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());


        // Game 8
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());;

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());


        // Game 9
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());


        // Game 10
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        // Game 11
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        // Game 12
        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());


        // Game 13
        tennisMatch.setTieBreaker(true); // we have a tie breaker

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_TWO);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());

        tennisMatch.pointWonBy(PlayerPosition.PLAYER_ONE);
        System.out.println("Match: 1 Set:" + tennisMatch.getSetCount() + " " + tennisMatch.score());


        System.out.println("Match: 1 Player-1(Wins): " + tennisMatch.getPlayer1GameWins() + " Player-2(Wins): " + tennisMatch.getPlayer2GameWins() );
    }
}

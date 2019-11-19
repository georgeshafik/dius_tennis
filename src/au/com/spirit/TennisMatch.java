package au.com.spirit;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by gs on 18/11/19
 */
public class TennisMatch implements MatchPlay {

    /**
     * Each tennis match has one set
     */
    TennisSet tennisSet;

    /**
     * A Match is made of list of players
     */
    private List<Player> players;

    private MatchType gender;

    private MatchType typeOfGame;

    private List<TennisGame> games;

    private TennisGame currentGame;

    private int setCount;

    private int player1GameWins;

    private int player2GameWins;

    private boolean tieBreaker;

    public TennisMatch(MatchType gender, MatchType typeOfGame, List<Player> players) {
        this.gender = gender;
        this.typeOfGame = typeOfGame;
        this.players = players;

        games = new ArrayList<TennisGame>();

        setCount = 0;
        player1GameWins = 0;
        player2GameWins = 0;

        newGame();
    }

    public void newGame() {
        currentGame = new TennisGame();
        currentGame.setGameStarted();

        games.add(currentGame);
        setCount += 1;
    }

    @Override
    public void pointWonBy(PlayerPosition playerPosition) {
        if (!tieBreaker) {
            currentGame.addPoint(playerPosition);

            if (currentGame.getStatusOfGame() == GameStatus.ENDED) {
                newGame();
            }
        } else {
            currentGame.addPointTieBreaker(playerPosition);
        }
    }

    @Override
    public String score() {

        String results = "";

        for (Point point: currentGame.getPoints()) {
            results = results + Integer.toString(point.getPointsPlayer1()) + ":" + Integer.toString(point.getPointsPlayer2()) + "  ";
        }

        // Update play game win count
        gameStats();

        return results;
    }

    public void gameStats() {
        player1GameWins = 0;
        player2GameWins = 0;

        for(TennisGame game: games ) {
            //System.out.println("Game details: " + game.toString());
            if ( game.getWinningPlayer() == PlayerPosition.PLAYER_ONE ) {
                player1GameWins += 1;
            } else if ( game.getWinningPlayer() == PlayerPosition.PLAYER_TWO ){
                player2GameWins += 1;
            }
        }
    }


    public TennisSet getTennisSet() {
        return tennisSet;
    }

    public void setTennisSet(TennisSet tennisSet) {
        this.tennisSet = tennisSet;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public MatchType getGender() {
        return gender;
    }

    public void setGender(MatchType gender) {
        this.gender = gender;
    }

    public MatchType getTypeOfGame() {
        return typeOfGame;
    }

    public void setTypeOfGame(MatchType typeOfGame) {
        this.typeOfGame = typeOfGame;
    }

    public List<TennisGame> getGames() {
        return games;
    }

    public void setGames(List<TennisGame> games) {
        this.games = games;
    }

    public TennisGame getCurrentGame() {
        return currentGame;
    }

    public void setCurrentGame(TennisGame currentGame) {
        this.currentGame = currentGame;
    }

    public int getSetCount() {
        return setCount;
    }

    public void setSetCount(int gameCount) {
        this.setCount = gameCount;
    }

    public int getPlayer1GameWins() {
        return player1GameWins;
    }

    public int getPlayer2GameWins() {
        return player2GameWins;
    }

    public void setPlayer1GameWins(int player1GameWins) {
        this.player1GameWins = player1GameWins;
    }

    public void setPlayer2GameWins(int player2GameWins) {
        this.player2GameWins = player2GameWins;
    }

    public boolean isTieBreaker() {
        return tieBreaker;
    }

    public void setTieBreaker(boolean tieBreaker) {
        this.tieBreaker = tieBreaker;
    }
}

package au.com.spirit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gs on 18/11/19
 */
public class TennisSet {

    private List<TennisGame> games;

    /**
     * Each tennis set is made up of a number of games
     */
    public TennisSet() {
        this.games = new ArrayList<TennisGame>();
    }

    public List<TennisGame> getGames() {
        return games;
    }

    public void setGames(List<TennisGame> games) {
        this.games = games;
    }
}

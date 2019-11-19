package au.com.spirit;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by gs on 18/11/19
 */
public class TennisGame {

    private GameStatus statusOfGame;

    private List<Point> points;

    private Point previousPoint;

    private int pointCounts;

    private PlayerPosition winningPlayer;

    public TennisGame() {
        points = new ArrayList<Point>();
        previousPoint = new Point();
        points.add(previousPoint);
        pointCounts = 0;
        statusOfGame = GameStatus.INPLAY;
        winningPlayer = PlayerPosition.PLAYER_UNKNOWN;
    }

    public void addPoint(PlayerPosition playerPosition) {
        Point currentPoint = new Point();

        currentPoint.clonePoint(previousPoint);

        if (currentPoint.isDeuce()) {
            // Deuce
            if (playerPosition == playerPosition.PLAYER_ONE) {
                System.out.println("Advantage player 1");
                currentPoint.setAdvantagePlayer1(true);
            } else {
                System.out.println("Advantage player 2");
                currentPoint.setAdvantagePlayer2(true);
            }
        } else if (currentPoint.isAdvantagePlayer1()) {
            if (playerPosition == playerPosition.PLAYER_ONE) {
                System.out.println("Player one wins\n");
                currentPoint.setPlayer1Wins(true);
                winningPlayer = PlayerPosition.PLAYER_ONE;
                statusOfGame = GameStatus.ENDED;
            } else {
                System.out.println("Deuce - Love All");
                currentPoint.setDeuce(true);
            }
        } else if (currentPoint.isAdvantagePlayer2()) {
            if (playerPosition == playerPosition.PLAYER_TWO) {
                System.out.println("Player two wins\n");
                currentPoint.setPlayer2Wins(true);
                winningPlayer = PlayerPosition.PLAYER_TWO;
                statusOfGame = GameStatus.ENDED;
            } else {
                System.out.println("Deuce - Love All\n");
                currentPoint.setDeuce(true);
            }
        } else if (playerPosition == playerPosition.PLAYER_ONE) {
            if (previousPoint.getPointsPlayer1() == 0) {
                currentPoint.setPointsPlayer1(previousPoint.getPointsPlayer1() + 15);
            } else if (previousPoint.getPointsPlayer1() == 15) {
                currentPoint.setPointsPlayer1(previousPoint.getPointsPlayer1() + 15);
            } else if (previousPoint.getPointsPlayer1() == 30) {
                currentPoint.setPointsPlayer1(previousPoint.getPointsPlayer1() + 10);
            } else if ((previousPoint.getPointsPlayer1() == 40) &&
                    (previousPoint.getPointsPlayer2() < 40)) {
                System.out.println("Player one wins\n");
                currentPoint.setPlayer1Wins(true);
                winningPlayer = PlayerPosition.PLAYER_ONE;
                statusOfGame = GameStatus.ENDED;
            }
        } else {
            if (previousPoint.getPointsPlayer2() == 0) {
                currentPoint.setPointsPlayer2(previousPoint.getPointsPlayer2() + 15);
            } else if (previousPoint.getPointsPlayer2() == 15) {
                currentPoint.setPointsPlayer2(previousPoint.getPointsPlayer2() + 15);
            } else if (previousPoint.getPointsPlayer2() == 30) {
                currentPoint.setPointsPlayer2(previousPoint.getPointsPlayer2() + 10);
            } else if ((previousPoint.getPointsPlayer2() == 40) &&
                    (previousPoint.getPointsPlayer1() < 40)) {
                System.out.println("Player two wins\n");
                currentPoint.setPlayer2Wins(true);
                winningPlayer = PlayerPosition.PLAYER_TWO;
                statusOfGame = GameStatus.ENDED;
            }
        }

        if (statusOfGame != GameStatus.ENDED) {
            if ((currentPoint.getPointsPlayer1() == 40) &&
                    (currentPoint.getPointsPlayer2() == 40) &&
                    (!currentPoint.isAdvantagePlayer1()) &&
                    (!currentPoint.isAdvantagePlayer2())) {
                // Deuce
                System.out.println("Deuce - Love All");
                currentPoint.setDeuce(true);
            }
        }

        points.add(currentPoint);
        pointCounts += 1;
        previousPoint = currentPoint;
    }

    public void addPointTieBreaker(PlayerPosition playerPosition) {
        Point currentPoint = new Point();

        currentPoint.clonePoint(previousPoint);

        if (playerPosition == playerPosition.PLAYER_ONE) {
            currentPoint.setPointsPlayer1(previousPoint.getPointsPlayer1() + 1);
        } else if (playerPosition == playerPosition.PLAYER_TWO){
            currentPoint.setPointsPlayer2(previousPoint.getPointsPlayer2() + 1);
        }

        if ((previousPoint.getPointsPlayer1() >= 7) && ((previousPoint.getPointsPlayer1() + 2) >= previousPoint.getPointsPlayer2())) {
            currentPoint.setPlayer1Wins(true);
            winningPlayer = PlayerPosition.PLAYER_ONE;
            statusOfGame = GameStatus.ENDED;
        } else if ((previousPoint.getPointsPlayer2() >= 7)  && ((previousPoint.getPointsPlayer2() + 2) >= previousPoint.getPointsPlayer1())){
            currentPoint.setPlayer2Wins(true);
            winningPlayer = PlayerPosition.PLAYER_TWO;
            statusOfGame = GameStatus.ENDED;
        }

        points.add(currentPoint);
        pointCounts += 1;
        previousPoint = currentPoint;
    }

    public void setGameStarted() {
        statusOfGame = GameStatus.INPLAY;
    }


    public void setGameEnded() {
        statusOfGame = GameStatus.ENDED;
    }

    public int getPointCounts() {
        return pointCounts;
    }

    public void setPointCounts(int pointCounts) {
        this.pointCounts = pointCounts;
    }

    public GameStatus getStatusOfGame() {
        return statusOfGame;
    }

    public void setStatusOfGame(GameStatus statusOfGame) {
        this.statusOfGame = statusOfGame;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public Point getPreviousPoint() {
        return previousPoint;
    }

    public void setPreviousPoint(Point previousPoint) {
        this.previousPoint = previousPoint;
    }

    public PlayerPosition getWinningPlayer() {
        return winningPlayer;
    }

    public void setWinningPlayer(PlayerPosition winningPlayer) {
        this.winningPlayer = winningPlayer;
    }

    @Override
    public String toString() {
        return "TennisGame{" +
                "statusOfGame=" + statusOfGame +
                ", points=" + points +
                ", previousPoint=" + previousPoint +
                ", pointCounts=" + pointCounts +
                ", winningPlayer=" + winningPlayer +
                '}';
    }
}

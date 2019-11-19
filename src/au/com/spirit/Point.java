package au.com.spirit;

/**
 * Created by gs on 18/11/19
 */
public class Point {

    private int pointsPlayer1;
    private int pointsPlayer2;

    private boolean player1Wins;
    private boolean player2Wins;

    private boolean deuce;
    private boolean advantagePlayer1;
    private boolean advantagePlayer2;

    public Point() {
        pointsPlayer1 = 0;
        pointsPlayer2 = 0;
        player1Wins = false;
        player2Wins = false;
        advantagePlayer1 = false;
        advantagePlayer2 = false;
        deuce = false;
    }

    public int getPointsPlayer1() {
        return pointsPlayer1;
    }

    public void setPointsPlayer1(int pointsPlayer1) {
        this.pointsPlayer1 = pointsPlayer1;
    }

    public int getPointsPlayer2() {
        return pointsPlayer2;
    }

    public void setPointsPlayer2(int pointsPlayer2) {
        this.pointsPlayer2 = pointsPlayer2;
    }


    public boolean isPlayer1Wins() {
        return player1Wins;
    }

    public void setPlayer1Wins(boolean player1Wins) {
        this.player1Wins = player1Wins;
    }

    public boolean isPlayer2Wins() {
        return player2Wins;
    }

    public void setPlayer2Wins(boolean player2Wins) {
        this.player2Wins = player2Wins;
    }

    public boolean isDeuce() {
        return deuce;
    }

    public void setDeuce(boolean deuce) {
        this.deuce = deuce;
        this.advantagePlayer1 = false;
        this.advantagePlayer2 = false;
    }


    public boolean isAdvantagePlayer1() {
        return advantagePlayer1;
    }

    public void setAdvantagePlayer1(boolean advantagePlayer1) {
        this.advantagePlayer1 = advantagePlayer1;
        this.deuce = false;
        this.advantagePlayer2 = false;
    }

    public boolean isAdvantagePlayer2() {
        return advantagePlayer2;
    }

    public void setAdvantagePlayer2(boolean advantagePlayer2) {
        this.advantagePlayer2 = advantagePlayer2;
        this.advantagePlayer1 = false;
        this.deuce = false;
    }

    public void clonePoint(Point prevPoint) {
        this.pointsPlayer1 = prevPoint.getPointsPlayer1();
        this.pointsPlayer2 = prevPoint.getPointsPlayer2();
        this.player1Wins = prevPoint.player1Wins;
        this.player2Wins = prevPoint.player2Wins;
        this.deuce = prevPoint.deuce;
        this.advantagePlayer1 = prevPoint.advantagePlayer1;
        this.advantagePlayer2 = prevPoint.advantagePlayer2;
    }

    @Override
    public String toString() {
        return "Point{" +
                "pointsPlayer1=" + pointsPlayer1 +
                ", pointsPlayer2=" + pointsPlayer2 +
                ", player1Wins=" + player1Wins +
                ", player2Wins=" + player2Wins +
                ", deuce=" + deuce +
                ", advantagePlayer1=" + advantagePlayer1 +
                ", advantagePlayer2=" + advantagePlayer2 +
                '}';
    }
}

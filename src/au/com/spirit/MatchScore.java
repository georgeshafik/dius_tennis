package au.com.spirit;

/**
 * Created by gs on 18/11/19
 */
public class MatchScore {

    public int getMatchScore(MatchScoreType matchScoreType) {

        if (matchScoreType == matchScoreType.ZERO) {
            return 0;
        } else if (matchScoreType == matchScoreType.FIFTEEN) {
            return 15;
        } else if (matchScoreType == matchScoreType.THIRTY) {
            return 30;
        } else if (matchScoreType == matchScoreType.FORTY) {
            return 30;
        } else {
            return -1;
        }

    }
}

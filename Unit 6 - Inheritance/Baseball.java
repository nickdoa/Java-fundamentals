
/**
 * Baseball
 *
 * @author Nick Choi
 * @version 4/5/23
 */

public class Baseball extends SportsTeam {
    private int numHomeRuns;
    private int numRBIs;
    private int numErrors;

    public Baseball(String name) {
        super(name);
        numHomeRuns = 0;
        numRBIs = 0;
        numErrors = 0;
    }
    public Baseball(String name, int gamesPlayed, int gamesWon, int gamesLost, int h, int r, int e) {
        super(name, gamesPlayed, gamesWon, gamesLost);
        numHomeRuns = h;
        numRBIs = r;
        numErrors = e;
    }
    public double getHomeRunsPerGame() {
        if (getGamesPlayed() == 0) {
            return 0.0;
        }
        return (double)numHomeRuns / getGamesPlayed();
    }
    public double getRBIsPerGame() {
        if (getGamesPlayed() == 0) {
            return 0.0;
        }
        return (double)numRBIs / getGamesPlayed();
    }
    public double getErrorsPerGame() {
        if (getGamesPlayed() == 0) {
            return 0.0;
        }
        return (double)numErrors / getGamesPlayed();
    }
    public String toString() {
        String str = super.toString() + "\n" +
                     "Home Runs per Game = " + getHomeRunsPerGame() + "\n" +
                     "RBIs per Game = " + getRBIsPerGame() + "\n" +
                     "Errors per Game = " + getErrorsPerGame();
        return str;
    }
}



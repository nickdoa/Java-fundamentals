
/**
 * SportsTeam
 *
 * @author Nick Choi
 * @version 4/5/23
 */



public class Football extends SportsTeam {
    private int numTouchDowns;
    private int numInterceptions;
    
    public Football(String name) {
        super(name);
        numTouchDowns = 0;
        numInterceptions = 0;
    }
    public Football(String name, int gamesPlayed, int gamesWon, int gamesLost, int t, int f) {
        super(name, gamesPlayed, gamesWon, gamesLost);
        numTouchDowns = t;
        numInterceptions = f;
    }   
    public double getTouchDownsPerGame() {
            return (double)numTouchDowns / getGamesPlayed();
    }
    public double getInterceptionsPerGame() {
        return (double)numInterceptions / getGamesPlayed();
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nTouchdowns per game = " + getTouchDownsPerGame() +
                "\nInterceptions per game = " + getInterceptionsPerGame();
    }
}





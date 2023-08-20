
/**
 * SportsTeam
 *
 * @author Nick Choi
 * @version 4/5/23
 */

public class SportsTeam
{
    private String name;
    private int gamesPlayed;
    private int gamesWon;
    private int gamesLost;

    public SportsTeam(String n)
    {
        name = n;
        gamesPlayed = 0;
        gamesWon = 0;
        gamesLost = 0;
    }
    public SportsTeam(String n, int g, int w, int l)
    {
        name = n;
        gamesPlayed = g;
        gamesWon = w;
        gamesLost = l;
    }
    public int getWinningPercentage()
    {
        return (int)(((double)gamesWon / gamesPlayed) * 100);
    }
    public int getGamesPlayed()
    {
        return gamesPlayed;
    }
    public int getGamesWon()
    {
        return gamesWon;
    }
    public int getGamesLost()
    {
        return gamesLost;
    }
    public void playGame(String results)
    {
        if(results.equalsIgnoreCase("w"))
            gamesWon++;
        if(results.equalsIgnoreCase("l"))
            gamesLost++;
    }
    public String toString()
    {
        String str;
        str = "Team Name = " + name + "\n" +
              "Games played = " + gamesPlayed + "\n" +
              "Games won = " + gamesWon + "\n" +
              "Games lost = " + gamesLost + "\n" +
              "Winning Percentage = " + getWinningPercentage() + "%";

        return str;
    }
}




/**
 * FarmAnimal
 *
 * @author Nick Choi
 * @version 3/27/23
 */

public class FarmAnimal {
    private int numCows;
    private int numHorses;
    private int numPigs;
    private int numChickens;
    private String farmerName;

    public FarmAnimal() {
        farmerName = "";
        numCows = 0;
        numHorses = 0;
        numPigs = 0;
        numChickens = 0;
    }
    public FarmAnimal(String name, int cows, int horses, int pigs, int chickens) {
        farmerName = name;
        numCows = cows;
        numHorses = horses;
        numPigs = pigs;
        numChickens = chickens;
    }
    public int getNumCows() {
        return numCows;
    }
    public int getNumHorses() {
        return numHorses;
    }
    public int getNumPigs() {
        return numPigs;
    }
    public int getNumChickens() {
        return numChickens;
    }
    public String getFarmerName() {
        return farmerName;
    }
}



/**
 * Farm
 *
 * @author Nick Choi
 * @version 3/27/23
 */

public class Farm {
    public static void main(String[] args) {
        FarmAnimal farm1 = new FarmAnimal();
        FarmAnimal farm2 = new FarmAnimal("John Chisum", 50, 12, 5, 10);
        
        System.out.println("****************************");
        System.out.println("  Test Default Constructor  ");
        System.out.println("****************************");
        System.out.println("Farmer Name       : " + farm1.getFarmerName());
        System.out.println("Cows              : " + farm1.getNumCows());
        System.out.println("Horses            : " + farm1.getNumHorses());
        System.out.println("Pigs              : " + farm1.getNumPigs());
        System.out.println("Chickens          : " + farm1.getNumChickens());
        System.out.println();
        
        System.out.println("****************************");
        System.out.println("    Test 2nd Constructor    ");
        System.out.println("****************************");
        System.out.println("Farmer Name       : " + farm2.getFarmerName());
        System.out.println("Cows              : " + farm2.getNumCows());
        System.out.println("Horses            : " + farm2.getNumHorses());
        System.out.println("Pigs              : " + farm2.getNumPigs());
        System.out.println("Chickens          : " + farm2.getNumChickens());
    }
}

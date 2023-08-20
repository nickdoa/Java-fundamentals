
/**
 * CombinationLock
 *
 * @author Nick Choi
 * @version 4/3/23
 */

public class CombinationLock extends Lock {
    private String combination;
    
    public CombinationLock(String combination) {
        this.combination = combination;
    }
    public String getCombination() {
        return combination;
    }
    public void changeCombination(String newCombination) {
        this.combination = newCombination;
        System.out.println("Combination has been changed.");
    }
    public String toString() {
        if (amILocked() == false)
            return "Lock is open\nCombination = " + combination;
        else
            return "Lock is closed\nCombination = " + combination;
    }
}



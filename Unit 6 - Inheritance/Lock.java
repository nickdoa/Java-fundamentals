
/**
 * Lock
 *
 * @author Nick Choi
 * @version 4/3/23
 */

public class Lock {
    private boolean locked;
    
    public Lock(){
        locked = true; 
    }
    public void open() {
        locked = false;
    }
    public void close() {
        locked = true;
    }
    public boolean amILocked() {
        return locked;
    }
    public String toString() {
        if(locked == false)
            return "Lock is open";
        else
            return "Lock is closed";
    }
}


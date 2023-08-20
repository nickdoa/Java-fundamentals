
/**
 * StarterPacket
 *
 * @author Nick Choi
 * @version 4/6/23
 */

public class StarterPacket {
    private int photo8x10;
    
    public StarterPacket() {
        photo8x10 = 1;
    }
    public String getPacketName() {
        return "StarterPacket";
    }
    public String toString() {
        return getPacketName() + "\n" +
                "8 x 10 = " + photo8x10;
    }
}


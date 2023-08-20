
/**
 * MemoryPacket
 *
 * @author Nick Choi
 * @version 4/6/23
 */

public class MemoryPacket extends StarterPacket {
    private int photo5x7;
    private int photoWallets;

    public MemoryPacket() {
        photo5x7 = 1;
        photoWallets = 2;
    }
    @Override
    public String getPacketName() {
        return "Memory Packet";
    }
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "5 x 7 = " + photo5x7 + "\n" +
                "Wallets = " + photoWallets;
    }
}

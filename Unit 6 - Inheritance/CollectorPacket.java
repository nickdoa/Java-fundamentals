
/**
 * CollectorPacket
 *
 * @author Nick Choi
 * @version 4/6/23
 */

public class CollectorPacket extends ChampionPacket {
    private int photoWallets;

    public CollectorPacket() {
        photoWallets = 8;
    }
    @Override
    public String getPacketName() {
        return "Collector Packet";
    }
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Wallets = " + photoWallets;
    }
}

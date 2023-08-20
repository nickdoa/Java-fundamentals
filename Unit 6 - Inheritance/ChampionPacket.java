
/**
 * ChampionPacket
 *
 * @author Nick Choi
 * @version 4/6/23
 */

public class ChampionPacket extends AllStarPacket {
    private int photo5x7;

    public ChampionPacket() {
        photo5x7 = 2;
    }
    @Override
    public String getPacketName() {
        return "Champion Packet";
    }
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "5 x 7 = " + photo5x7;
    }
}


/**
 * AllStarPacket
 *
 * @author Nick Choi
 * @version 4/6/23
 */

public class AllStarPacket extends StarterPacket {
    private int photoMagazineCover;
    private int photoTradingCards;

    public AllStarPacket() {
        photoMagazineCover = 1;
        photoTradingCards = 16;
    }
    @Override
    public String getPacketName() {
        return "AllStar Packet";
    }
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Magazine Cover = " + photoMagazineCover + "\n" +
                "Trading Cards = " + photoTradingCards;
    }
}


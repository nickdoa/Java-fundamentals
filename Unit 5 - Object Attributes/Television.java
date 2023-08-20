
/**
 * Television
 *
 * @author Nick Choi
 * @version 3/30/23
 */


public class Television {
    public final int MAX_CHANNEL = 100;
    public final int MIN_CHANNEL = 1;
    public final int MAX_VOLUME = 10;
    public final int MIN_VOLUME = 1;
    public final int DEFAULT_CHANNEL = 3;
    public final int DEFAULT_VOLUME = 5;
    
    private int channel;
    private int volume;
    
    public Television() {
        this.channel = DEFAULT_CHANNEL;
        this.volume = DEFAULT_VOLUME;
    }
    public Television(int c, int v) {
        if (c >= MIN_CHANNEL && c <= MAX_CHANNEL) {
            this.channel = c;
        } else {
            this.channel = DEFAULT_CHANNEL;
        }
        if (v >= MIN_VOLUME && v <= MAX_VOLUME) {
            this.volume = v;
        } else {
            this.volume = DEFAULT_VOLUME;
        }
    }
    public int getChannel() {
        return this.channel;
    }
    public int getVolume() {
        return this.volume;
    }
    public void increaseChannel() {
        this.channel++;
        if (this.channel > MAX_CHANNEL) {
            this.channel = MIN_CHANNEL;
        }
    }
    public void decreaseChannel() {
        this.channel--;
        if (this.channel < MIN_CHANNEL) {
            this.channel = MAX_CHANNEL;
        }
    }
    public void selectChannel(int c) {
        if (c >= MIN_CHANNEL && c <= MAX_CHANNEL) {
            this.channel = c;
        }
    }
    public void increaseVolume() {
        if (this.volume < MAX_VOLUME) {
            this.volume++;
        }
    }
    public void decreaseVolume() {
        if (this.volume > MIN_VOLUME) {
            this.volume--;
        }
    }
}



/**
 * Appointment
 *
 * @author Nick Choi
 * @version 4/4/23
 */

public class Appointment extends Date {
    private String text;

    public Appointment() {
        super();
        text = "";
    }
    public Appointment(int m, int d, int y, String t) {
        super(m, d, y);
        text = t;
    }
    public String getText() {
        return text;
    }
    @Override
    public String toString() {
        return super.toString() + " " + text;
    }
}



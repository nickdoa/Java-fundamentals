
/**
 * States
 *
 * @author Nick Choi
 * @version 3/29/23
 */

public class States {
    private String name;
    private String bird;
    private String flower;
    private String song;
    private String motto;
    private String tree;

    public States() {
        name = "";
        bird = "";
        flower = "";
        song = "";
        motto = "";
        tree = "";
    }
    public States(String name, String bird, String flower, String song, String motto, String tree) {
        this.name = name;
        this.bird = bird;
        this.flower = flower;
        this.song = song;
        this.motto = motto;
        this.tree = tree;
    }
    public String toString() {
        return "State Name   : " + name + "\n" +
               "State Bird   : " + bird + "\n" +
               "State Flower : " + flower + "\n" +
               "State Song   : " + song + "\n" +
               "State Motto  : " + motto + "\n" +
               "State Tree   : " + tree;
    }
}
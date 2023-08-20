
/**
 * SportsEvent
 *
 * @author Nick Choi
 * @version 5/17/23
 */

import java.util.*;

public class SportsEvent {
    private double[] scores = new double[8];
    private Scanner keyboard = new Scanner(System.in);

    public void readScores() {
        System.out.println("Enter Eight Contestant Scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Judge " + (i + 1) + " --> ");
            scores[i] = keyboard.nextDouble();
        }
    }

    public double lowest() {
        double lowest = Double.MAX_VALUE;
        for (double score : scores) {
            if (score < lowest) {
                lowest = score;
            }
        }
        return lowest;
    }

    public double highest() {
        double highest = Double.MIN_VALUE;
        for (double score : scores) {
            if (score > highest) {
                highest = score;
            }
        }
        return highest;
    }

    public double average() {
        double sum = 0;
        double lowest = lowest();
        double highest = highest();
        int count = 0;
        for (double score : scores) {
            if (score != lowest && score != highest) {
                sum += score;
                count++;
            }
        }
        double average = sum / count;
        return Math.round(average * 10.0) / 10.0; // Rounded average to one decimal place
    }   

    public void printSummary() {
        System.out.println();
        System.out.println("                Summary Report");
        System.out.println("-------------------------------------------------");
        System.out.print("Scores = ");
        for (double score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        System.out.println("Lowest Score = " + lowest());
        System.out.println("Highest Score = " + highest());
        System.out.println("Average Score = " + average());
    }

    public static void main(String[] args) {
        SportsEvent app = new SportsEvent();
        app.readScores();
        app.printSummary();
    }
}

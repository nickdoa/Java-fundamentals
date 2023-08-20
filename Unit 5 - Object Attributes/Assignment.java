
/**
 * Assignment
 *
 * @author Nick Choi
 * @version 3/20/23
 */

public class Assignment {
    private String name;
    private String type;
    private int score;
    
    public Assignment() {
        this.name = "";
        this.type = "";
        this.score = 0;
    }
    public Assignment(String type, String name, int score) {
        this.type = type;
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getScore() {
        return this.score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getLetterGrade() {
        if (score >= 90 && score <= 100) {
            return "A";
        } else if (score >= 80 && score < 90) {
            return "B";
        } else if (score >= 70 && score < 80) {
            return "C";
        } else if (score >= 60 && score < 70) {
            return "D";
        } else {
            return "F";
        }
    }
}


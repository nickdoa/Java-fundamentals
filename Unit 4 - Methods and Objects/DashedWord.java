
/**
 * DashedWordReturnMethod
 *
 * @author Nick Choi
 * @version 3/21/23
 */

public class DashedWord {
    public void printDashedWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
            if (i != word.length() - 1) {
                System.out.print("-");
            }
        }
        System.out.println();
    }
    public String returnDashedWord(String word) {
        String dashed = "";
        for (int i = 0; i < word.length(); i++) {
            dashed += word.charAt(i);
            if (i != word.length() - 1) {
                dashed += "-";
            }
        }
        return dashed;
    }
}

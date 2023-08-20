
/**
 * BooleanMethods
 *
 * @author Nick Choi
 * @version 4/17/23
 */

import java.util.*;

public class BooleanMethods
{
        /** @return compares the first and last letter of parameter str; if
     *   they are the same letter it returns true; otherwise returns false
     *  @param str1 first string to determine length of
     *  MUST CONTAIN AN IF ELSE STATEMENT
     */
    
    public boolean firstLast(String str) {
    	if(str.substring(0,1).equals(str.substring(str.length()-1))) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    /** @return compares the lengths of str1 and str2 and returns
     *   true if they are the same length; otherwise returns false
     *  @param str1 first string to determine length of
     *  @param str2 second string to determine length of
     *  MUST CONTAIN AN IF ELSE STATEMENT
     */
    
    public boolean sameLength(String str1, String str2) {
    	if(str1.length() == str2.length()) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
     /** @return compares the first and last letter of parameter str; if
     *   they are the same letter it returns true; otherwise returns false
     *  @param str1 first string to determine length of
     *  CANNOT CONTAIN AN IF ELSE STATEMENT
     */
    
    public boolean firstLast2(String str) {
    	return str.substring(0,1).equals(str.substring(str.length()-1));
    }
    
    /** @return compares the lengths of str1 and str2 and returns
     *   true if they are the same length; otherwise returns false
     *  @param str1 first string to determine length of
     *  @param str2 second string to determine length of
     *  CANNOT CONTAIN AN IF ELSE STATEMENT
     */
    
    public boolean sameLength2(String str1, String str2) {
    	return str1.length() == str2.length();
    }
}
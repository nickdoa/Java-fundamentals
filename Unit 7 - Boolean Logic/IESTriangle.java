
/**
 * IESTriangle
 *
 * @author Nick Choi
 * @version 4/18/23
 */

import java.util.*;

public class IESTriangle
{
    private int side1;
    private int side2;
    private int side3;
    
    public IESTriangle()
    {
    	setSides(0,0,0);
    }
    public IESTriangle(int s1, int s2, int s3)
    {
    	setSides(s1,s2,s3);
    }
    public void setSides(int s1, int s2, int s3)
    {
    	side1 = s1;
    	side2 = s2;
    	side3 = s3;
    }
    public String getTriangleType()
    {
    	if (side1 != side2 && side1 != side3 && side2 != side3) {
    		return "scalene";
    	} else if (side1 == side2 && side1 == side3) {
    		return "equilateral";
    	} else {
    		return "isosceles";
    	}
    }
}
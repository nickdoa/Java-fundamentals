
/**
 * ArrayPractice
 *
 * @author Nick Choi
 * @version 5/5/23
 */

import java.util.*;

public class ArrayPractice {
    
    public void method1() {
        int[] A = new int[5];
        A[0] = 2;
        A[1] = 4;
        A[2] = 6;
        A[3] = 8;
        A[4] = 10;
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    
    public void method2() {
        int[] B = {10, 20, 30, 40, 50};
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
    }
    
    public void method3() {
        double[] C = new double[4];
        C[0] = 5.6;
        C[1] = 9.9;
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }
    
    public void method4() {
        String[] D = new String[3];
        D[0] = "Dog";
        D[2] = "Cat";
        for (int i = 0; i < D.length; i++) {
            System.out.print(D[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        ArrayPractice app = new ArrayPractice();
        app.method1();
        System.out.println();
        app.method2();
        System.out.println();
        app.method3();
        System.out.println();
        app.method4();
    }
}

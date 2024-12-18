/* bai 2.2.6
 * The system of first-degree equations (linear system) with two variables
 */

import java.util.Scanner;

public class LinearSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a11, a12, b1, a21, a22, b2;
        System.out.println("nhap vao lan luot cac he so a11, a12, b1, a21, a22, b2: ");
        a11 = sc.nextDouble();
        a12 = sc.nextDouble();
        b1 = sc.nextDouble();
        a21 = sc.nextDouble();
        a22 = sc.nextDouble();
        b2 = sc.nextDouble();

        double d = a11*a22 - a21*a12;
        double d1 = b1*a22 - b2*a12;
        double d2 = b2*a11 - b1*a21;
        if(a11/a21 == a12/a22 && a11/a21 != b1/b2) {
            System.out.print("he pt vo nghiem");
        }
        else if(a11/a21 == a12/a22 && a11/a21 == b1/b2) {
            System.out.print("he pt vo so nghiem");
        }
        else {
            System.out.print("he pt co nghiem la:\nx1=" + (d1/d) + "\nx2=" + (d2/d));
        }

        sc.close();
    }
}

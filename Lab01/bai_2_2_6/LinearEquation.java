/* bai 2.2.6
 * The first-degree equation (linear equation) with one variable
 */

import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.print("nhap vao lan luot he so a va b: ");
        a = sc.nextDouble();
        b = sc.nextDouble();

        if(a ==  0 && b != 0) System.out.print("phuong trinh vo nghiem");
        else if(a == 0 && b == 0) System.out .print("phuong trinh vo so nghiem");
        else {
            System.out.print("phuong trinh co nghiem la: x = " + (-b/a));
        }

        sc.close();
    }
}

/* bai 2.2.6
 * The second-degree equation with one variable
 */

 import java.util.Scanner;

 public class SecondDegreeEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao cac he so a, b, c :");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double x1, x2;
        double delta = b*b - 4*a*c;
        if(a == 0 && b == 0 && c==0) 
            System.out.print("pt vo so nghiem");
        else if(a == 0 && b == 0 && c != 0) 
            System.out.print("pt vo nghiem");
        else if(a == 0 && b != 0)
            System.out.print("pt co nghiem duy nhat bang: " + (-c/b));
        else if(delta < 0) 
            System.out.print("pt vo nghiem");
        else if(delta == 0) {
            x1 = -b/(2*a);
            System.out.print("pt co nghiem kep: x1 = x2 = " + x1);
        }
        else if(delta > 0) {
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("pt co 2 nghiem phan biet:");
            System.out.print("x1 = " + x1 + "\nx2 = " + x2);
        }

        sc.close();
    }
 }
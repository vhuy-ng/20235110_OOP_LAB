package bai_6_4;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int month = getMonth(scanner);
            int year = getYear(scanner);
            int days = daysOfMonth(month, year);
            System.out.println("Co " + days + " ngay trong thang, nam vua nhap");
        }
    }

    public static int getMonth(Scanner scanner) {
        String[] months = { "January", "Jan", "Jan.", "February", "Feb", "Feb.", "March", "Mar", "Mar.", "April", "Apr", "Apr.",
            "May", "June", "Jun", "Jun.", "July", "Jul", "Jul.", "August", "Aug", "Aug.", "September", "Sep", "Sep.",
            "October", "Oct", "Oct.", "November", "Nov", "Nov.", "December", "Dec", "Dec." };
        
        while (true) {
            System.out.print("Nhap vao thang hop le: ");
            String input = scanner.next();
            for (int i = 0; i < months.length; i++) {
                if (input.equals(months[i]) || input.equals(String.valueOf(i / 3 + 1))) {
                    return i / 3 + 1;
                }
            }
            System.out.println("Thang vua nhap khong hop le. Thu lai");
        }
    }

    public static int getYear(Scanner scanner) {
        while (true) {
            System.out.print("Nhap vao nam hop le: ");
            if (scanner.hasNextInt()) {
                int year = scanner.nextInt();
                if (year >= 0) {
                    return year;
                } else {
                    System.out.println("Nam vua nhap khong hop le. Thu lai");
                }
            } else {
                System.out.println("Nam vua nhap khong hop le. Thu lai");
                scanner.next();
            }
        }
    }

    public static int daysOfMonth(int month, int year) {
        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
}

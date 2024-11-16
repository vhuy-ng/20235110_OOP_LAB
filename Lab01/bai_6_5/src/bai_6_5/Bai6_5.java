package bai_6_5;

import java.util.Arrays;

public class Bai6_5 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 7, 1};
        
        Arrays.sort(numbers);
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        double average = (double) sum / numbers.length;
        
        System.out.println("Mang sau sap xep: " + Arrays.toString(numbers));
        System.out.println("Tong cac phan tu: " + sum);
        System.out.println("TB: " + average);
    }
}

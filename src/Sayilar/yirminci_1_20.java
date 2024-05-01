package Sayilar;

import java.util.Arrays;
import java.util.Scanner;

public class yirminci_1_20 {

    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number you want to check: ");
        int number = input.nextInt();

        int[] result = kaprekarAlgorithm(number);
        System.out.println("Number of steps to reach 6174: " + result[0]);
        System.out.println("6174 is reached in " + (result[1]-1) + " steps.\n");
    }

    public static int[] kaprekarAlgorithm(int number) {
        int steps = 0;

        while (number != 6174) {
            // Büyükten küçüğe ve küçükten büyüğe sıralanmış rakamları al
            int ascending = sortDigits(number, true);
            int descending = sortDigits(number, false);
            // Farkı hesapla
            number = descending - ascending;
            steps++;
            // Her adımda bilgi yazdır
            System.out.println("Step " + steps + ": " + descending + " - " + ascending + " = " + number);
        }

        // Sonuçları döndür
        return new int[] {steps, steps + 1};
    }

    // Rakamları sırala
    public static int sortDigits(int number, boolean ascending) {
        int[] digits = new int[4];

        for (int i = 0; i < 4; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        if (ascending) {
            Arrays.sort(digits);
        } else {
            Arrays.sort(digits);
            reverseArray(digits);
        }

        int result = 0;
        for (int digit : digits) {
            result = result * 10 + digit;
        }

        return result;
    }

    // Diziyi tersine çevir
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }


}

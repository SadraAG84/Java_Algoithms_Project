package Siralama_Algoritmalar;

import java.util.Scanner;
import java.util.Arrays;

public class CombSort_2_16 {
    public static void main() {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the dimension of array: ");
        int dimension = input.nextInt();
        int[] array = new int[dimension];
        System.out.println("Please enter the array elements: ");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Please enter the " + (i + 1) + ". number: ");
            array[i] = input.nextInt();
        }


        combSort(array);
        System.out.println("Sıralanmış dizi: " + Arrays.toString(array));
    }

    public static void combSort(int[] arr) {
        int gap = arr.length;
        float shrinkFactor = 1.3f;
        boolean swapped = true;

        while (gap != 1 || swapped) {
            gap = getNextGap(gap);
            swapped = false;
            for (int i = 0; i < arr.length - gap; i++) {
                if (arr[i] > arr[i + gap]) {
                    swap(arr, i, i + gap);
                    swapped = true;
                }
            }
        }
    }

    private static int getNextGap(int gap) {
        gap = (int) (gap * 10 / 13);
        return Math.max(gap, 1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


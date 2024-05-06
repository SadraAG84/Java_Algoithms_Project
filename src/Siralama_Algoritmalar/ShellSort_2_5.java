package Siralama_Algoritmalar;

import java.util.Arrays;
import java.util.Scanner;

public class ShellSort_2_5 {
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


        System.out.println("Sıralama Öncesi:");
        System.out.println(Arrays.toString(array));

        array = shellSort(array);

        System.out.println("Sıralama Sonrası:");
        System.out.println(Arrays.toString(array));
    }

    public static int[] shellSort(int[] array) {
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > temp) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = temp;
            }
        }
        return array;
    }
}


package Siralama_Algoritmalar;

import java.util.Scanner;

public class ShakerSort_2_11 {

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
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        shakerSort(array);

        System.out.println("Sıralama Sonrası:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }


    public static void shakerSort(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            boolean swapped = false;
            for (int j = i; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    swapped = true;
                }
            }
            for (int j = array.length - 2 - i; j > i; j--) {
                if (array[j] > array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped)
                break; // Dizi sıralıysa döngüyü sonlandır
        }
    }


}


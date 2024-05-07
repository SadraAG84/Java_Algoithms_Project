package Siralama_Algoritmalar;

import java.util.Arrays;
import java.util.Scanner;

public class GnomeSort_2_17 {

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


        gnomeSort(array, array.length);
        System.out.print("The result: ");
        System.out.println(Arrays.toString(array));
        System.out.println("\n");
    }

    static void gnomeSort(int arr[], int n) {
        int index = 0;
        while (index < n) {
            if (index == 0)
                index++;
            if (arr[index] >= arr[index - 1])
                index++;
            else {
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
    }


}


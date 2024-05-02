package Siralama_Algoritmalar;
import java.util.Scanner;


public class StoogeSort_2_14 {

    static void stoogesort(int[] arr, int l, int h) {
        if (l >= h)
            return;
        if (arr[l] > arr[h]) {
            int t = arr[l];
            arr[l] = arr[h];
            arr[h] = t;
        }
        if (h - l + 1 > 2) {
            int t = (h - l + 1) / 3;
            stoogesort(arr, l, h - t);
            stoogesort(arr, l + t, h);
            stoogesort(arr, l, h - t);
        }
    }

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

        int n = array.length;
        stoogesort(array, 0, n - 1);
        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}

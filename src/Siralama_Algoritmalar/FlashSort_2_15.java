package Siralama_Algoritmalar;

import java.util.Scanner;
import java.util.Arrays;

public class FlashSort_2_15 {


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


        flashSort(array);
        System.out.println("Sıralanmış dizi: " + Arrays.toString(array));
    }

    public static void flashSort(int[] arr) {
        int n = arr.length;
        double c1 = 0.1 * n;
        int m = (int) c1;
        int[] l = new int[m];

        int anmin = arr[0];
        int nmax = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < anmin) anmin = arr[i];
            if (arr[i] > arr[nmax]) nmax = i;
        }

        if (anmin == arr[nmax]) return;

        double c2 = (m - 1.0) / (arr[nmax] - anmin);
        for (int i = 0; i < n; i++) {
            int k = (int) (c2 * (arr[i] - anmin));
            l[k]++;
        }

        for (int k = 1; k < m; k++) {
            l[k] += l[k - 1];
        }

        int hold = arr[nmax];
        arr[nmax] = arr[0];
        arr[0] = hold;

        int flash;
        int j = 0;
        int k = m - 1;
        int nmove = 0;

        while (nmove < n - 1) {
            while (j > l[k]) {
                j++;
                k = (int) (c2 * (arr[j] - anmin));
            }
            flash = arr[j];
            while (j != l[k]) {
                k = (int) (c2 * (flash - anmin));
                hold = arr[l[k]];
                arr[l[k]] = flash;
                flash = hold;
                l[k]--;
                nmove++;
            }
        }

        // Do straight insertion for remaining elements
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i + 1] < arr[i]) {
                hold = arr[i];
                j = i;
                while (arr[j + 1] < hold) {
                    arr[j] = arr[j + 1];
                    j++;
                }
                arr[j] = hold;
            }
        }
    }
}


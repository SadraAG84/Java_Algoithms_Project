package Siralama_Algoritmalar;

import java.util.Scanner;

public class PermutasiyonSort_2_18 {
    void persort(int[] a) {
        while (!isSorted(a))
            shuffle(a);
    }

    void shuffle(int[] a) {
        for (int i = 0; i < a.length; i++)
            swap(a, i, (int) (Math.random() * i));
    }

    void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i - 1])
                return false;
        return true;
    }

    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
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


        PermutasiyonSort_2_18 ob = new PermutasiyonSort_2_18();
        ob.persort(array);
        System.out.print("The result: ");
        ob.printArray(array);
        System.out.println("\n");
    }

}


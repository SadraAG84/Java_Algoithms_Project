package Siralama_Algoritmalar;

import java.util.Scanner;

class QuickSort_2_7 {
    // Pivot elemanını doğru konumuna yerleştiren partition metodu

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
        Divid_ConquerSort_2_4 ob = new Divid_ConquerSort_2_4();
        ob.sort(array, 0, n - 1);
        System.out.println("Sıralanmış dizi:");
        printArray(array);
    }

    static int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    // Quick Sort'u uygulayan ana fonksiyon
    void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    // Diziyi ekrana yazdıran yardımcı fonksiyon
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


}


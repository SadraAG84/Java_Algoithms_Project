package Siralama_Algoritmalar;

import java.util.Scanner;

class QuickSort3_2_8 {

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
        QuickSort3_2_8 ob = new QuickSort3_2_8();
        ob.sort(array, 0, n - 1);
        System.out.println("Sıralanmış dizi:");
        printArray(array);
    }




    // Pivot elemanını doğru konumuna yerleştiren partition metodu
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Quick Sort3'ü uygulayan ana fonksiyon
    void sort(int[] arr, int low, int high) {
        if (low < high) {
            // Pivot seçimini daha iyi yapmak için medyanı kullanıyoruz
            int medianIndex = (low + high) / 2;
            int medianValue = arr[medianIndex];
            int pivot = Math.max(Math.min(arr[low], arr[high]), Math.min(Math.max(arr[low], arr[high]), medianValue));

            // Pivot elemanını bulup diziyi bölelim
            int pi = partition(arr, low, high);

            // Pivot'tan küçük ve büyük olan kısımları sıralayalım
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


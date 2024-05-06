package Siralama_Algoritmalar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import static java.util.Arrays.sort;

public class The2 {
    Scanner input = new Scanner(System.in);

    public void S2_menu() {


        System.out.println("1 - Eklemeli Sıralama (Insertion Sort)");
        System.out.println("2 - Seçmeli Sıralama (Selection Sort)");
        System.out.println("3 - Kabarcık/Baloncuk Sıralama (Bubble Sort)");
        System.out.println("4 - Böl ve Ayıkla Algoritması (Divide and Conquer Sort)");
        System.out.println("5 - Shell Sıralama");
        System.out.println("6 - Birleştirme Sıralama (Merge Sort)");
        System.out.println("7 - Hızlı Sıralama (Quick Sort)");
        System.out.println("8 - Hızlı Sıralama3 (Quick Sort3)");
        System.out.println("9 - Yığınlama Sıralama (Heap Sort)");
        System.out.println("10 - Taban Sıralama (Radix Sort)");
        System.out.println("11 - Sallama Sıralama (Shaker Sort)");
        System.out.println("12 - Rastgele Sıralama (Random Sort)");
        System.out.println("13 - Şanslı Sıralama (Lucky Sort)");
        System.out.println("14 - Serseri Sıralama (Stooge Sort)");
        System.out.println("15 - Şimşek Sıralama (Flash Sort)");
        System.out.println("16 - Tarak Sıralama (Comb Sort)");
        System.out.println("17 - Gnome Sıralama");
        System.out.println("18 - Permütasyon Sıralama");
        System.out.println("19 - Strand Sıralama");
        System.out.println("20 - Kova Sıralama (Bucket Sort)");
        System.out.println("Kullanmak istediğiniz sıralama algoritmasının numarasını girin:");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                // insertionSort();
                System.out.println("Eklemeli Sıralama seçildi.");
                The_1();
                break;
            case 2:
                // selectionSort();
                System.out.println("Seçmeli Sıralama seçildi.");
                The_2();
                break;
            case 3:
                // bubbleSort();
                System.out.println("Kabarcık/Baloncuk Sıralama seçildi.");
                The_3();
                break;
            case 4:
                // divideAndConquerSort();
                System.out.println("Böl ve Ayıkla Algoritması seçildi.");
                break;
            case 5:
                // shellSort();
                System.out.println("Shell Sıralama seçildi.");
                The_5();
                break;
            case 6:
                // mergeSort();
                System.out.println("Birleştirme Sıralama seçildi.");

                The_6();
                break;
            case 7:
                // quickSort();
                System.out.println("Hızlı Sıralama seçildi.");
                The_7();
                break;
            case 8:
                // quickSort3();
                System.out.println("Hızlı Sıralama3 seçildi.");
                The_8();
                break;
            case 9:
                // heapSort();
                System.out.println("Yığınlama Sıralama seçildi.");
                The_9();
                break;
            case 10:
                // radixSort();
                System.out.println("Taban Sıralama seçildi.");
                The_10();
                break;
            case 11:
                // shakerSort();
                System.out.println("Sallama Sıralama seçildi.");
                break;
            case 12:
                // randomSort();
                System.out.println("Rastgele Sıralama seçildi.");
                The_12();
                break;
            case 13:
                // luckySort();
                System.out.println("Şanslı Sıralama seçildi.");
                The_13();
                break;
            case 14:
                // stoogeSort();
                System.out.println("Serseri Sıralama seçildi.");
                The_14();
                break;
            case 15:
                // flashSort();
                System.out.println("Şimşek Sıralama seçildi.");
                The_15();
                break;
            case 16:
                // combSort();
                System.out.println("Tarak Sıralama seçildi.");
                The_16();
                break;
            case 17:
                // gnomeSort();
                System.out.println("Gnome Sıralama seçildi.");
                The_17();
                break;
            case 18:
                // permutationSort();
                System.out.println("Permütasyon Sıralama seçildi.");
                break;
            case 19:
                // strandSort();
                System.out.println("Strand Sıralama seçildi.");
                break;
            case 20:
                // bucketSort();
                System.out.println("Kova Sıralama seçildi.");
                break;
            default:
                System.out.println("Geçersiz seçim. Lütfen 1 ile 20 arasında bir sayı girin.");
                break;
        }
    }

    // Implement the sorting methods here...


    public void The_1() {
        System.out.println("Eklemeli siralama group");
        System.out.println("Please enter the dimension of array: ");
        int dimension = input.nextInt();
        int[] array = new int[dimension];
        System.out.println("Please enter the array elements: ");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Please enter the " + (i + 1) + ". number: ");
            array[i] = input.nextInt();
        }
        System.out.println("Siralamadan once:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
        System.out.println("Siralamadan sonra:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void The_2() {
        System.out.println("her adimda dizideki en kucuk sayinin nerede oldugu bulunur. Bu sayi ile dizinin basindaki sayi yer degistirilerek en kucuk sayilar secilerek basa atilmis olur.");

        System.out.println("Please enter the dimension of array: ");
        int dimension = input.nextInt();
        int[] array = new int[dimension];
        System.out.println("Please enter the array elements: ");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Please enter the " + (i + 1) + ". number: ");
            array[i] = input.nextInt();
        }
        System.out.println("Siralamadan once:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
        System.out.println("Siralama sonrasi");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void The_3() {
        System.out.println("Bubble Sort");
        System.out.println("Please enter the dimension of array: ");
        int dimension = input.nextInt();
        int[] array = new int[dimension];
        System.out.println("Please enter the array elements: ");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Please enter the " + (i + 1) + ". number: ");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < dimension - 1; i++) {
            for (int j = 0; j < dimension - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sıralama sonrası:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();


    }

    public void The_4() {


    }

    public void The_5() {

        ShellSort_2_5.main();

    }

    public void The_6() {

        MergeSort_2_6.main();
    }

    public void The_7() {

        QuickSort_2_7.main();

    }

    public void The_8() {

        QuickSort3_2_8.main();

    }

    public void The_9() {

        MergeSort_2_6.main();

    }

    public void The_10() {

        Taban_2_10.main();

    }

    public void The_11() {


    }

    public void The_12() {

        ArrayList<Integer> numbers = new ArrayList<>();


        System.out.println("How many number you want to add? ");
        int count = input.nextInt();

        for (int i = 1; i <= count; i++){

            System.out.println("Please enter " + i + ". number: ");
            int user_number = input.nextInt();
            numbers.add(user_number);

        }

        System.out.println("Original list: " + numbers);

        // Shuffle the list randomly
        Collections.shuffle(numbers);

        System.out.println("Shuffled list: " + numbers);

    }

    public void The_13(){

        System.out.println("Please enter the dimension of array: ");
        int dimension = input.nextInt();
        int[] array = new int[dimension];
        System.out.println("Please enter the array elements: ");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Please enter the " + (i + 1) + ". number: ");
            array[i] = input.nextInt();
        }

        System.out.println("The result is: " + Arrays.toString(array));

    }

    public void The_14(){

        StoogeSort_2_14.main();
    }

    public void The_15(){

        FlashSort_2_15.main();

    }

    public void The_16(){

        CombSort_2_17.main();

    }

    public void The_17(){



    }

}



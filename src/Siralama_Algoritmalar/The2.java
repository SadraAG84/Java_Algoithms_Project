package Siralama_Algoritmalar;

import java.util.Scanner;

public class The2 {

    public void S2_menu() {
        Scanner input = new Scanner(System.in);

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
                secmeliSiralama();
                break;
            case 3:
                // bubbleSort();
                System.out.println("Kabarcık/Baloncuk Sıralama seçildi.");
                bubbleSort();
                break;
            case 4:
                // divideAndConquerSort();
                System.out.println("Böl ve Ayıkla Algoritması seçildi.");
                break;
            case 5:
                // shellSort();
                System.out.println("Shell Sıralama seçildi.");
                break;
            case 6:
                // mergeSort();
                System.out.println("Birleştirme Sıralama seçildi.");
                break;
            case 7:
                // quickSort();
                System.out.println("Hızlı Sıralama seçildi.");
                break;
            case 8:
                // quickSort3();
                System.out.println("Hızlı Sıralama3 seçildi.");
                break;
            case 9:
                // heapSort();
                System.out.println("Yığınlama Sıralama seçildi.");
                break;
            case 10:
                // radixSort();
                System.out.println("Taban Sıralama seçildi.");
                break;
            case 11:
                // shakerSort();
                System.out.println("Sallama Sıralama seçildi.");
                break;
            case 12:
                // randomSort();
                System.out.println("Rastgele Sıralama seçildi.");
                break;
            case 13:
                // luckySort();
                System.out.println("Şanslı Sıralama seçildi.");
                break;
            case 14:
                // stoogeSort();
                System.out.println("Serseri Sıralama seçildi.");
                break;
            case 15:
                // flashSort();
                System.out.println("Şimşek Sıralama seçildi.");
                break;
            case 16:
                // combSort();
                System.out.println("Tarak Sıralama seçildi.");
                break;
            case 17:
                // gnomeSort();
                System.out.println("Gnome Sıralama seçildi.");
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
        System.out.println("Eklemelisiralama sudurbudur");
        Scanner klavye = new Scanner(System.in);
        System.out.println("Dizi boyutunu girin:");
        int boyut = klavye.nextInt();
        int[] dizi = new int[boyut];
        System.out.println("Dizinin elemanlarini girin:");
        for (int i = 0; i < boyut; i++) {
            dizi[i] = klavye.nextInt();
        }
        System.out.println("Siralamadan once:");
        for (int i : dizi) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        int n = dizi.length;
        for (int j = 1; j < n; j++) {
            int key = dizi[j];
            int i = j - 1;
            while ((i > -1) && (dizi[i] > key)) {
                dizi[i + 1] = dizi[i];
                i--;
            }
            dizi[i + 1] = key;
        }
        System.out.println("Siralamadan sonra:");
        for (int i : dizi) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void secmeliSiralama() {
        System.out.println("her adimda dizideki en kucuk sayinin nerede oldugu bulunur. Bu sayi ile dizinin basindaki sayi yer degistirilerek en kucuk sayilar secilerek basa atilmis olur.");

        Scanner klavye = new Scanner(System.in);
        System.out.println("Dizi boyutunu girin:");
        int boyut = klavye.nextInt();
        int[] dizi = new int[boyut];
        System.out.println("Dizinin elemanlarini girin:");
        for (int i = 0; i < boyut; i++) {
            dizi[i] = klavye.nextInt();
        }
        System.out.println("Siralamadan once:");
        for (int i : dizi) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < dizi.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[j] < dizi[index]) {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = dizi[index];
            dizi[index] = dizi[i];
            dizi[i] = smallerNumber;
        }
        System.out.println("Siralama sonrasi");
        for (int i : dizi) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void bubbleSort() {
        System.out.println("Bubble Sort");
        Scanner klavye = new Scanner(System.in);
        System.out.println("Dizi boyutunu girin:");
        int boyut = klavye.nextInt();
        int[] dizi = new int[boyut];
        System.out.println("Dizinin elemanlarini girin:");
        for (int i = 0; i < boyut; i++) {
            dizi[i] = klavye.nextInt();
        }

        for (int i = 0; i < boyut - 1; i++) {
            for (int j = 0; j < boyut - i - 1; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
        }

        System.out.println("Sıralama sonrası:");
        for (int i : dizi) {
            System.out.print(i + " ");
        }
        System.out.println();


    }

}

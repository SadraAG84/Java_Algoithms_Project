package Arama_Algoritmalar;


import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch_3_2 {

    // Ana fonksiyonumuz
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dizi boyutunu istiyoruz
        System.out.println("Dizi boyutunu girin:");
        int size = scanner.nextInt();

        // Dizi boyutuna göre bir dizi oluşturuyoruz
        int[] array = new int[size];

        // Kullanıcıdan dizi elemanlarını alıyoruz
        System.out.println("Dizi elemanlarını girin (sıralı olmalı):");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Diziyi sıralıyoruz
        Arrays.sort(array);

        // Kullanıcıdan aranacak değeri istiyoruz
        System.out.println("Aranacak değeri girin:");
        int key = scanner.nextInt();

        // Arama fonksiyonumuzu çağırıyoruz
        int result = binarySearch(array, key);

        // Sonucu kontrol edip, kullanıcıya bilgi veriyoruz
        if (result == -1) {
            System.out.println("Değer dizi içinde bulunamadı.");
        } else {
            System.out.println("Değer dizi içinde " + result + ". indexte bulundu.");
        }
    }

    // Binary Search algoritmasını uygulayan fonksiyon
    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        // Dizi üzerinde ikili arama işlemi gerçekleştiriyoruz
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Eğer orta noktadaki değer aranan değerse, index'i döndürüyoruz
            if (array[mid] == key) {
                return mid;
            }

            // Eğer orta noktadaki değer aranan değerden küçükse, aramayı sağ tarafta sürdürüyoruz
            if (array[mid] < key) {
                left = mid + 1;
            }

            // Eğer orta noktadaki değer aranan değerden büyükse, aramayı sol tarafta sürdürüyoruz
            else {
                right = mid - 1;
            }
        }

        // Eğer değer bulunamazsa -1 döndürüyoruz
        return -1;
    }
}




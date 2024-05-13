package Arama_Algoritmalar;

import java.util.Scanner;

public class SimpleSearch_3_4 {

    // Ana fonksiyonumuz
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dizi boyutunu istiyoruz
        System.out.println("Dizi boyutunu girin:");
        int size = scanner.nextInt();

        // Dizi boyutuna göre bir dizi oluşturuyoruz
        int[] array = new int[size];

        // Kullanıcıdan dizi elemanlarını alıyoruz
        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Kullanıcıdan aranacak sayıyı istiyoruz
        System.out.println("Aranacak sayıyı girin:");
        int key = scanner.nextInt();

        // Arama fonksiyonumuzu çağırıyoruz
        int result = linearSearch(array, key);

        // Sonucu kontrol edip, kullanıcıya bilgi veriyoruz
        if (result == -1) {
            System.out.println("Sayı dizi içinde bulunamadı.");
        } else {
            System.out.println("Sayı dizi içinde " + result + ". indexte bulundu.");
        }
    }

    // Doğrusal arama algoritmasını uygulayan fonksiyon
    public static int linearSearch(int[] array, int key) {
        // Dizinin her elemanını sırayla kontrol ediyoruz
        for (int i = 0; i < array.length; i++) {
            // Eğer aranan sayı mevcutsa, index'i döndürüyoruz
            if (array[i] == key) {
                return i;
            }
        }
        // Eğer sayı bulunamazsa -1 döndürüyoruz
        return -1;
    }
}




package Arama_Algoritmalar;

import java.util.Scanner;

public class SimpleSearch_3_4 {

    // Ana fonksiyonumuz
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dizi boyutunu istiyoruz
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the dimension of array: ");
        int dimension = input.nextInt();
        int[] array = new int[dimension];
        System.out.println("Please enter the array elements: ");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Please enter the " + (i + 1) + ". number: ");
            array[i] = input.nextInt();
        }

        // Kullanıcıdan aranacak sayıyı istiyoruz
        System.out.println("Please enter the number you wanna search for: ");
        int key = scanner.nextInt();

        // Arama fonksiyonumuzu çağırıyoruz
        int result = linearSearch(array, key);

        // Sonucu kontrol edip, kullanıcıya bilgi veriyoruz
        if (result == -1) {
            System.out.println("The number you entered was not founded.");
        } else {
            System.out.println("the number you entered is founded on " + result + ". index.");
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




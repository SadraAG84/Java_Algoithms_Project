package Arama_Algoritmalar;

import java.util.ArrayList;
import java.util.Scanner;

public class PruferDizilimi_3_12 {

    // Prufer kodundan ağaç oluşturma fonksiyonu
    static void constructTreeFromPruferCode(int[] prufer, int m) {
        int vertices = m + 2;
        ArrayList<Integer> vertexSet = new ArrayList<>();

        // Her düğüm için dereceyi hesapla
        int[] degree = new int[vertices];
        for (int i = 0; i < vertices - 2; i++) {
            degree[prufer[i] - 1]++;
        }

        System.out.println("Ağacın kenarları:");
        for (int i = 0; i < vertices - 2; i++) {
            for (int j = 0; j < vertices; j++) {
                // Derecesi 0 olan ilk düğümü bul
                if (degree[j] == 0) {
                    // Kenarı yazdır
                    System.out.println((j + 1) + " - " + prufer[i]);
                    degree[j] = -1;
                    degree[prufer[i] - 1]--;
                    break;
                }
            }
        }

        // Son iki düğümü yazdır
        int j = 0;
        for (int i = 0; i < vertices; i++) {
            if (degree[i] == 0 && j == 0) {
                System.out.print((i + 1) + " - ");
                j++;
            } else if (degree[i] == 0 && j == 1) {
                System.out.println(i + 1);
            }
        }
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prufer dizisinin uzunluğunu girin (n-2):");
        int length = scanner.nextInt();
        int[] prufer = new int[length];

        System.out.println("Prufer dizisini girin:");
        for (int i = 0; i < length; i++) {
            prufer[i] = scanner.nextInt();
        }

        constructTreeFromPruferCode(prufer, length);
//        scanner.close();
    }
}


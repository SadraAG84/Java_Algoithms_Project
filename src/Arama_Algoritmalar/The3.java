package Arama_Algoritmalar;

import StartMenu.StartMenu;

import java.util.Scanner;

public class The3 {

    public void S3_menu() {

        System.out.println("1) Doğrusal Arama (Linear Search)");
        System.out.println("2) İkili arama (binary search)");
        System.out.println("3) Interpolasyon Araması (Ara değer araması, Interpolation Search)");
        System.out.println("4) Şekiller (graflar (Graphs) ) üzerinde çalışan algoritmalar");
        System.out.println("5) Sabit Maliyetli Arama (Uniform Cost Search)");
        System.out.println("6) Floyd Warshall algoritması");
        System.out.println("7) Prim’s Algoritması");
        System.out.println("8) Kruskal Algoritması");
        System.out.println("9) Dijkstra Algoritması");
        System.out.println("10) Bellman Ford Algoritması");
        System.out.println("11) İkili arama ağacı (Binary Search Tree)");
        System.out.println("12) Prüfer dizilimi");
        System.out.println("13) Metin arama algoritmaları (bir yazı içerisinde belirli bir dizgiyi (string) arayan algoritmalar)");
        System.out.println("14) Horspool Arama Algoritması");
        System.out.println("15) Kaba Kuvvet Metin Arama Algoritması (Brute Force Text Search, Linear Text Search");



        cases();
    }

    public void cases() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("""
                Please select the number of the section you want to enter: \nEnter `99` to see the previous page""");
        int choice1 = input1.nextInt();

        switch (choice1) {

            case 99:
                StartMenu back = new StartMenu();
                back.startmenu();


            case 1:
                The_1();
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;

            case 6:
                The_6();
                break;

            case 7:
                break;

            case 8:
                break;

            case 9:
                break;

            case 10:
                break;

            case 11:
                break;

            case 12:
                break;

            case 13:
                break;

            case 14:
                break;

            case 15:
                break;

            default:
                System.out.println("Invalid selection. Please enter a number between 1 and 20.");
                break;

        }

    }

    public void The_1(){

        LenearSearch_3_1.main();

    }

    public void The_2(){



    }

    public void The_3(){



    }

    public void The_4(){



    }

    public void The_5(){



    }

    public void The_6(){

        FloydWarshall_3_6.main();

    }


}




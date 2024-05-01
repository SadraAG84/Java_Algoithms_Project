package StartMenu;

import Arama_Algoritmalar.The3;
import Sayilar.The1;
import Siralama_Algoritmalar.The2;

import java.util.Objects;
import java.util.Scanner;

public class StartMenu {
    static boolean is_running = true;

    static void finish_or_not() {
        Scanner input = new Scanner(System.in);

        System.out.println("If you want to quit the program please write 'off'\nif you don't please enter 'continue'.");
        String choicee = input.next().toLowerCase();
        if (Objects.equals(choicee, "off")) {
            is_running = false;
        } else if (Objects.equals(choicee, "continue")) {
            StartMenu s = new StartMenu();
            s.startmenu();
        } else {
            finish_or_not();
        }

    }

    public void startmenu() {


        while (is_running) {
            Scanner input = new Scanner(System.in);

            System.out.println("1) Sayı Gurubu Algorıtmalar");
            System.out.println("2) Sıralama Algorıtmaları");
            System.out.println("3) Arama Algorıtmaları");
            System.out.println("Please select the number of the section you want to enter: ");
            int choice = input.nextInt();


            switch (choice) {
                case 1:
                    The1 sayilar = new The1();
                    sayilar.S1_menu();
                    break;
                case 2:
                    The2 siralama = new The2();
                    siralama.S2_menu();
                    break;
                case 3:
                    The3 arama = new The3();
                    arama.The_3();
                    break;
                default:
                    System.out.println("You enter a wrong number.\nplease try again\n");
                    startmenu();
            }
            finish_or_not();
        }
    }
}

package Sayilar;

import java.util.Scanner;

public class trib_1_4 {

    static int printTribRec(int n) {

        if (n == 0 || n == 1 || n == 2)
            return 0;

        if (n == 3)
            return 1;
        else
            return printTribRec(n - 1) +
                    printTribRec(n - 2) +
                    printTribRec(n - 3);
    }

    static void printTrib(int n) {
        for (int i = 1; i < n; i++)
            System.out.print(printTribRec(i) + " ");
    }

    // Driver code
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many number do you want? ");
        int n = input.nextInt() + 1;

        printTrib(n);
        System.out.println("\n");
    }
}



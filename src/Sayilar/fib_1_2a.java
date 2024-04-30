package Sayilar;

import java.util.Scanner;

public class fib_1_2a {


    static int fibb(int f) {
        // Base Case
        if (f <= 1)
            return f;
        // Recursive call
        return fibb(f - 1) + fibb(f - 2);
    }

    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many number do you want? ");
        int N = input.nextInt();
        // Print the first N Fibonacci numbers
        for (int i = 0; i < N; i++) {
            System.out.print(fibb(i) + " ");

        }
        System.out.println("\n");
    }

}

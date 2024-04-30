package Sayilar;

import java.util.Scanner;

public class bagdasik_1_19 {

    public static void main() {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int the_number1 = input.nextInt();
        System.out.print("Please enter the second number: ");
        int the_number2 = input.nextInt();

        if (the_number1 != the_number2) {
            if (sum_div(the_number1) == the_number2 && sum_div(the_number2) == the_number1) {
                System.out.println(the_number1 + " and " + the_number2 + " are Amicable numbers.\n");
            } else {
                System.out.println(the_number1 + " and " + the_number2 + " are not Amicable numbers.\n");
            }
        } else {
            System.out.println("Same numbers can not be Amicable numbers.\n");
        }
    }

    public static int sum_div(int number) {

        int sum = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                sum += i;

            }

        }
        sum = sum - number;
        return sum;
    }


}

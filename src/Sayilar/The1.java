package Sayilar;

import StartMenu.StartMenu;

import java.util.Arrays;
import java.util.Scanner;

public class The1 {
    Scanner input = new Scanner(System.in);


    public void S1_menu() {

        System.out.println("1) Mükemmel Sayılar listesi");
        System.out.println("2) Fibonacci Sayılar, a)Recursive olarak // b)Standart çalışma");
        System.out.println("3) Armstrong Sayısı");
        System.out.println("4) Tribonacci Sayılar");
        System.out.println("5) Palindrom Sayılar");
        System.out.println("6) Cullen Sayıları");
        System.out.println("7) Lasa Sayısı");
        System.out.println("8) Fermat sayıları");
        System.out.println("9) Dost Sayılar");
        System.out.println("10) Zengin Sayılar");
        System.out.println("11) Lucas Serisi");
        System.out.println("12) Tetranacci Sayılar");
        System.out.println("13) İkiz Sayılar");
        System.out.println("14) Weodal Sayılar");
        System.out.println("15) Mersanne Sayılar");
        System.out.println("16) Harshad Sayılar");
        System.out.println("17) Cyclic (Döngüsel Sayılar)");
        System.out.println("18) Tau Sayılar");
        System.out.println("19) Bağdaşık Sayılar (Amicable)");
        System.out.println("20) 6174 sayısı");


        cases();
    }

    public void cases() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("""
                Please select the number of the section you want to enter:\s
                Enter `99` to see the previous page
                """);
        int choice1 = input1.nextInt();

        switch (choice1) {

            case 99:
                StartMenu back = new StartMenu();
                back.startmenu();


            case 1:
                The_1();
                break;

            case 2:
                The_2();
                break;

            case 3:
                The_3();
                break;

            case 4:
                The_4();
                break;

            case 5:
                The_5();
                break;

            case 6:
                The_6();
                break;

            case 7:
                The_7();
                break;

            case 8:
                The_8();
                break;

            case 9:
                The_9();
                break;

            case 10:
                The_10();
                break;

            case 11:
                The_11();
                break;

            case 12:
                The_12();
                break;

            case 13:
                The_13();
                break;

            case 14:
                The_14();
                break;

            case 15:
                The_15();
                break;

            case 16:
                The_16();
                break;

            case 17:
                The_17();
                break;

            case 18:
                The_18();
                break;

            case 19:
                The_19();
                break;

            case 20:
                The_20();
                break;

            default:
                System.out.println("Invalid selection. Please enter a number between 1 and 20.");
                break;

        }

    }

    public void The_1() {
        long sum = 0;

        System.out.println("For the start, The first 5 Perfect numbers are 6, 28, 496, 8128, and 33550336.");
        System.out.println("Please enter your number: ");
        long the_number = input.nextLong();

        for (int i = 1; i < the_number; i++) {
            if ((the_number % i) == 0) {
                sum = sum + i;

            }

        }
        if (sum == the_number && sum != 0) {

            System.out.println("the " + the_number + " is a perfect number.\n");

        } else if (sum == 0) {
            System.out.println("the 0 is not a perfect number\n");

        } else {
            System.out.println("the " + the_number + " is not a perfect number.\n");
        }

    }


    public void The_2() {

        System.out.println("If you want 'Recursive' mode please enter 'a' " +
                "and if you want 'Classic' mode please enter 'b' ");
        String ab = input.next().toLowerCase();


        if (ab.equals("b")) {

            System.out.println("How many number do you want? ");
            int N = input.nextInt();
            int num1 = 0, num2 = 1;

            for (int i = 0; i < N; i++) {

                System.out.print(num1 + " ");

                int num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
            }
            System.out.println("\n");
        } else if (ab.equals("a")) {

            fib_1_2a.main();
        }
    }

    public void The_3() {
        int sum_3 = 0;
        int remain, new_number;
        System.out.println("For the start, Some example for Armstrong number are 0, 1, 153, 370, 371.");
        System.out.println("Please enter your number: ");
        int number = input.nextInt();
        new_number = number;

        while (new_number != 0) {

            remain = (new_number % 10);
            sum_3 += (int) Math.pow(remain, 3);
            new_number /= 10;

        }
        if (number == sum_3) {
            System.out.println("The " + number + " is an Armstrong number.\n");
        } else {
            System.out.println("The " + number + " is not an Armstrong number.\n");
        }

    }

    public void The_4() {

        trib_1_4.main();

    }

    public void The_5() {

        int last_digit, sum = 0, n;

        System.out.println("Palindrome numbers are the number that remains the same when it's digits are reversed." +
                "Such as 4004, 1661, 235532 and more.\n");
        System.out.println("Please enter the number you want to check: ");
        int the_number = input.nextInt();
        n = the_number;


        for (; n != 0; n /= 10) {
            last_digit = n % 10;
            sum = ((sum * 10) + last_digit);
        }


        if (sum == the_number) {
            System.out.println("The number is Palindrome.\n");
        } else {
            System.out.println("The number is not Palindrome.\n");
        }

    }

    public void The_6() {

        int f_number;

        System.out.println("Please enter the number you want to check: ");
        int the_number = input.nextInt();

        f_number = 2 * the_number * the_number + 1;
        System.out.println("The answer is:" + f_number);


    }

    public void The_7() {

        int f_number = 0, f_number2 = 0, the_number2 = 0, last_digit;
        System.out.println("Please enter the number you want to check: ");
        int the_number = input.nextInt();
        int n = the_number;

        for (; n != 0; n /= 10) {
            last_digit = n % 10;
            the_number2 = ((the_number2 * 10) + last_digit);
        }


        for (int i = 2; i < the_number; i++) {
            if (the_number % i == 0) {
                f_number++;
            }
        }


        for (int i = 2; i < the_number2; i++) {
            if (the_number2 % i == 0) {
                f_number2++;
            }
        }

        if (f_number == 0 && f_number2 == 0) {
            System.out.println("The number you enter is Lasa number.\n");
        } else {
            System.out.println("The number you enter is not Lasa number.\n");
        }
    }

    public void The_8() {

        System.out.println("Please enter the number you want to check");
        double the_number = input.nextDouble(), f_number;

        f_number = Math.pow(2, Math.pow(2, the_number)) + 1;

        System.out.println("The answer is: " + f_number);

    }

    public void The_9() {

        dost_1_9.main();

    }

    public void The_10() {

        System.out.println("Please enter the number you want to check: ");
        int the_number = input.nextInt();

        int sum = 0;

        for (int i = 1; i < the_number; i++) {

            if (the_number % i == 0) {
                sum += i;
            }
        }
        if (sum > the_number) {

            System.out.println("The number" + the_number + "is Rich number.\n");

        } else {

            System.out.println("The number" + the_number + "is not Rich number.\n");
        }

    }

    public void The_11() {

        System.out.println("Please enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number: ");
        int num2 = input.nextInt();
        System.out.println("How many number do you want? ");
        int the_number = input.nextInt();


        for (int i = 0; i < the_number; i++) {

            System.out.print(num1 + " ");

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println("\n");


    }

    public void The_12() {

        System.out.println("How many number do you want? ");
        int the_number = input.nextInt();
        int num1 = 0, num2 = 1, num3 = 1, num4 = 2;

        for (int i = 0; i < the_number; i++) {

            System.out.print(num1 + " ");

            int num5 = num1 + num2 + num3 + num4;
            num1 = num2;
            num2 = num3;
            num3 = num4;
            num4 = num5;

        }
        System.out.println("\n");
    }

    public void The_13() {

        int sum = 0, f_number;
        boolean prime = false;
        System.out.println("Enter the number and get the second number: ");
        int the_number = input.nextInt();

        for (int i = 2; i < the_number; i++) {

            if (the_number % i == 0) {
                sum += i;

            }

        }

        if (sum == 0) {
            prime = true;
        }

        if (prime) {

            f_number = the_number + 2;

            System.out.println("[" + the_number + "," + f_number + "]");
        } else {
            System.out.println("The number you enter is not a prime number.\n");
        }

    }

    public void The_14() {

        System.out.println("Please enter the number you want to check: ");
        double the_number = input.nextDouble();

        double f_number = Math.pow(2, the_number) * the_number - 1;

        System.out.println("The result is " + f_number + "\n");

    }

    public void The_15() {

        System.out.println("Please enter the number you want to check: ");
        double the_number = input.nextDouble();

        double f_number = Math.pow(2, the_number) - 1;

        System.out.println("The result is " + f_number + "\n");

    }

    public void The_16() {

        int sum = 0;
        System.out.println("Please enter the number you want to check: ");
        int the_number = input.nextInt();

        if (the_number > 0) {

            for (int i = the_number; i > 0; i /= 10) {
                sum += i % 10;
            }

            if (the_number % sum == 0) {
                System.out.println("The number" + the_number + "is a Harshad number.\n");
            }

        } else {
            System.out.println("You can not check the number which are lower or equal to '0'\n");
        }
    }

    public void The_17() {


    }

    public void The_18() {

//        System.out.println("404 not found!!\n");
        System.out.println("Please enter the number you wanna check: ");
        int user_input = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= user_input / 2; i++) {
            if (user_input % i == 0) {
                sum += 1;
            }
        }
        sum = sum + 1;

//        double result = (double) sum / (sum - user_input);
        int result = user_input % sum;
        if (result == 0) {

            System.out.println("The number " + user_input + " is a Tau number.\n");

        } else {

            System.out.println("The number " + user_input + " is not a Tau number.\n");

        }


    }

    public void The_19() {

        bagdasik_1_19.main();

    }

    public void The_20() {

        yirminci_1_20.main();

    }
}
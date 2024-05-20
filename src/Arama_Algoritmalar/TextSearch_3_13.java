package Arama_Algoritmalar;

import java.util.Scanner;

class TextSearch_3_13 {
    public static void main()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the text: ");
        String user_data = input.nextLine();
        System.out.println("Please enter the text you wanna search for: ");
        String user_search = input.nextLine();

        // calling the method that is designed for
        // printing the instances of pattern
        // found in the text string
        stringMatch(user_data, user_search);
    }
    public static void stringMatch(String user_data, String user_search)
    {

        int len_t = user_data.length();
        int len_p = user_search.length();

        int k = 0, i = 0, j = 0;

        // loop to find out the position Of searched pattern
        for (i = 0; i <= (len_t - len_p); i++) {

            for (j = 0; j < len_p; j++)
            {
                if (user_data.charAt(i + j) != user_search.charAt(j))
                    break;
            }

            if (j == len_p)
            {
                k++;
                System.out.println("The text you search for Found at Position: " + i);
            }
        }

        if (k == 0)
            System.out.println("No Match Found!");
        else
            System.out.println("Total Instances Found = " + k);
    }
}


package Arama_Algoritmalar;


import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class LenearSearch_3_1 {

    public static int linearsearch(int data[], int searchkey) {

        for (int index = 0; index < data.length; index ++){

            if (data[index] == searchkey) {

                return index;

            }

        }
        return -1;

    }

    public static void main(){

        Scanner input = new Scanner(System.in);
//        SecureRandom generator = new SecureRandom();

        System.out.println("Please enter the dimension of array: ");
        int dimension = input.nextInt();
        int[] data = new int[dimension];
        System.out.println("Please enter the array elements: ");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Please enter the " + (i + 1) + ". number: ");
            data[i] = input.nextInt();
        }

        for (int i = 0; i < data.length; i++){


        }

        System.out.println(Arrays.toString(data));




        boolean finish = false;

        while (finish != true){

            System.out.println("If you want to quit please write 'quit' and if you dont want to quit please write 'no': ");
            String done_or_not = input.next().toLowerCase();

            if (Objects.equals(done_or_not, "quit")){

                finish = true;

            }
            else if (done_or_not.equals("no")) {
                System.out.println("Please enter an integer value : ");
                int user_input = input.nextInt();

                int result = linearsearch(data, user_input);

                if (result == -1){

                    System.out.println("The number that you want to search for does not existed");

                }
                else {

                    System.out.println("The key taht you search for has the " + result + "rd index");

                }
            }
            else{
                System.out.println("Please be careful with your answer.");
            }

        }




    }



}

package Arama_Algoritmalar;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class InterpolationSearch_3_3 {

    public static int interpolationSearch(int[] data, int user_input) {
        int left = 0;
        int right = data.length - 1;

//         && user_input >= data[left] && user_input <= data[right]

        while (left <= right && user_input >= data[left] && user_input <= data[right]) {
            // Hesaplanan orta değeri bulma
            int mid = left + ((user_input - data[left]) * (right - left)) / (data[right] - data[left]);

            if (data[mid] == user_input) {
                return mid; // Aranan değer bulundu
            }

            if (data[mid] < user_input) {
                left = mid + 1; // Aranan değer daha sağda
            } else {
                right = mid - 1; // Aranan değer daha solda
            }
        }

        return -1; // Aranan değer bulunamadı
    }

    public static void main() {

        Scanner input = new Scanner(System.in);


        System.out.println("Please enter the dimension of array: ");
        int dimension = input.nextInt();
        int[] data = new int[dimension];
        System.out.println("Please enter the array elements: ");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Please enter the " + (i + 1) + ". number: ");
            data[i] = input.nextInt();
        }



        System.out.println(Arrays.toString(data));


//        System.out.println("Please enter the number you want to search for: ");
//        int user_input = input.nextInt();

//        int result = interpolationSearch(array, searchValue);

//        if (result != -1) {
//            System.out.println("Aranan değer " + user_input + " dizinin " + result + ". indisinde bulundu.");
//        } else {
//            System.out.println("Aranan değer bulunamadı.");
//        }


        boolean finish = false;

        while (finish != true){

            System.out.println("If you want to quit please write 'quit' and if you don't want to quit please write 'no': ");
            String done_or_not = input.next().toLowerCase();

            if (Objects.equals(done_or_not, "quit")){

                finish = true;

            }
            else if (done_or_not.equals("no")) {
                System.out.println("Please enter an integer value : ");
                int user_input = input.nextInt();

                int result = interpolationSearch(data, user_input);

                if (result == -1){

                    System.out.println("The number that you want to search for does not existed");

                }
                else {

                    System.out.println("The key that you search for has the " + result + "rd index");

                }
            }
            else{
                System.out.println("Please be careful with your answer.");
            }

        }



    }
}


package Siralama_Algoritmalar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StrandSort_2_19 {
    static void strandSort(List<Integer> input, List<Integer> output) {
        if (input.isEmpty())
            return;

        List<Integer> sublist = new LinkedList<>();
        sublist.add(input.get(0));
        input.remove(0);

        for (int i = 0; i < input.size(); ) {
            if (input.get(i) > sublist.get(sublist.size() - 1)) {
                sublist.add(input.get(i));
                input.remove(i);
            } else {
                i++;
            }
        }

        output.addAll(sublist);
        strandSort(input, output);
    }

    public static void main() {



        Scanner input_user = new Scanner(System.in);
        System.out.println("Please enter the dimension of array: ");
        int dimension = input_user.nextInt();
        List<Integer> myList = new ArrayList<>();

        System.out.println("Please enter the array elements: ");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Please enter the " + (i + 1) + ". number: ");
            myList.add(input_user.nextInt());
        }


        List<Integer> input = new LinkedList<>(myList);
        List<Integer> output = new LinkedList<>();
        strandSort(input, output);

        System.out.print("The result: ");
        for (int x : output) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }
}


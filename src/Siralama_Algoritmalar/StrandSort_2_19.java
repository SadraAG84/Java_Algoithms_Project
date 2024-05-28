package Siralama_Algoritmalar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StrandSort_2_19 {
    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        while (!list1.isEmpty() && !list2.isEmpty()) {
            if (list1.get(0) < list2.get(0)) {
                result.add(list1.remove(0));
            } else {
                result.add(list2.remove(0));
            }
        }
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }

    // Recursive function to perform strand sort
    public static List<Integer> strandSort(List<Integer> inputList) {
        // Base case: if the input list has 1 or fewer elements, it's already sorted
        if (inputList.size() <= 1) {
            return inputList;
        }

        // Initialize a sublist with the first element of the input list
        List<Integer> sublist = new ArrayList<>();
        sublist.add(inputList.remove(0));

        int i = 0;
        while (i < inputList.size()) {
            // If the current element in the input list is greater than
            // the last element in the sublist,
            // add it to the sublist; otherwise, continue to the next element in the input list.
            if (inputList.get(i) > sublist.get(sublist.size() - 1)) {
                sublist.add(inputList.remove(i));
            } else {
                i++;
            }
        }

        // The sortedSublist contains the sorted elements from the current sublist
        List<Integer> sortedSublist = new ArrayList<>(sublist);

        // Recursively sort the remaining part of the input list
        List<Integer> remainingList = strandSort(inputList);

        // Merge the sorted sublist and the sorted remainingList
        return mergeLists(sortedSublist, remainingList);
    }

    public static void main() {
        List<Integer> inputList = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the dimension of array: ");
        int dimension = input.nextInt();

        System.out.println("Please enter the array elements: ");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Please enter the " + (i + 1) + ". number: ");
            int number = input.nextInt();
            inputList.add(number);
        }



        List<Integer> outputList = strandSort(inputList);

        for (int x : outputList) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }
}


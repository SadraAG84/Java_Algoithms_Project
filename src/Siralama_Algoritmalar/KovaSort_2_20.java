package Siralama_Algoritmalar;


import java.util.*;

public class KovaSort_2_20 {
    public static int[] bucket_sort(int[] arr, int max_value)
    {
        int[] bucket = new int[max_value + 1];
        int[] sorted_arr = new int[arr.length];

        for (int i= 0; i <arr.length; i++)
            bucket[arr[i]]++;

        int pos = 0;
        for (int i = 0; i < bucket.length; i++)
            for (int j = 0; j < bucket[i]; j++)
                sorted_arr[pos++] = i;

        return sorted_arr;
    }


    static int maxValue(int[] arr)
    {
        int max_value = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max_value)
                max_value = arr[i];
        return max_value;
    }

    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the dimension of array: ");
        int dimension = input.nextInt();
        int[] array = new int[dimension];
        System.out.println("Please enter the array elements: ");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Please enter the " + (i + 1) + ". number: ");
            array[i] = input.nextInt();
        }


        int max_value = maxValue(array);

        System.out.print("\nGiven Array: ");
        System.out.println(Arrays.toString(array));

        System.out.print("\nThe result: ");
        System.out.println(Arrays.toString(bucket_sort(array,max_value)));

    }
}



package Arama_Algoritmalar;

import java.util.Scanner;

class BruteForceSearching_3_15 {
    //called function
    public static int bruteforce(String user_data,String user_search){
        int text_length = user_data.length();//length of the text
        int search_length = user_search.length();//length of the pattern;

        //loop condition
        for(int i=0;i<text_length;i++){
            //initialization of j
            int j=0;
            while((j < search_length) && (user_data.charAt(i+j) == user_search.charAt(j))){
                j++;
            }
            if(j == search_length){
                return i;
            }
        }

        return -1;
    }

    public static void main(){
        BruteForceSearching_3_15 obj = new BruteForceSearching_3_15();
        Scanner input =  new Scanner(System.in);

        System.out.println("Please enter the text: ");
        String user_data = input.nextLine();
        System.out.println("Please enter the text you wanna search for: ");
        String user_search = input.nextLine();

        //calling the function
        int position = obj.bruteforce(user_data,user_search);
        int endindex = position+1;
        //condition to check whether the pattern is matched are not
        if(position == -1){
            System.out.println("The text you search for is not matched in the text");
        }else{
            System.out.println("Found at position:" + (position+1));
            System.out.println("End at the position:" + (endindex + user_search.length()));
        }
    }
}

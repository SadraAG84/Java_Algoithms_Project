package Arama_Algoritmalar;
import java.util.Scanner;
public class HorspoolSearching_3_14 {
    public static void main() {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the text: ");
        String user_input = input.next();
        System.out.println("Please enter the part you want to search for: ");
        String user_search = input.next();

        int result = horspoolSearch(user_input, user_search);
        if (result != -1) {
            System.out.println("Pattern found at position: " + result);
        } else {
            System.out.println("Pattern not found in the text.");
        }
    }

    public static int horspoolSearch(String user_input, String user_search) {
        int n = user_input.length();
        int m = user_search.length();
        int[] shiftTable = new int[256];

        // Initialize shift table
        for (int i = 0; i < 256; i++) {
            shiftTable[i] = m;
        }
        for (int j = 0; j < m - 1; j++) {
            shiftTable[user_search.charAt(j)] = m - 1 - j;
        }

        // Search for pattern
        int i = m - 1;
        while (i < n) {
            int k = 0;
            while (k < m && user_search.charAt(m - 1 - k) == user_input.charAt(i - k)) {
                k++;
            }
            if (k == m) {
                return i - m + 1; // Pattern found
            } else {
                i += shiftTable[user_input.charAt(i)];
            }
        }
        return -1; // Pattern not found
    }
}


import java.util.Scanner;

public class compareSubstrings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input string and integer from user
        String s = scan.next();
        int k = scan.nextInt();

        scan.close();

        // Print the smallest and largest substring of length k
        System.out.println(getSmallestAndLargest(s,k));
    }

    // Finds the smallest and largest substring of length k in the input string s
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Iterate through all possible substrings of length k and update smallest and largest as necessary
        for (int i = 0; i <= s.length() - k; i++) {
            if (s.substring(i, i + k).compareTo(smallest) < 0) {
                smallest = s.substring(i, i + k);
            }
            if (s.substring(i, i + k).compareTo(largest) > 0) {
                largest = s.substring(i, i + k);
            }
        }

        // Return smallest and largest substrings separated by a newline character
        return smallest + "\n" + largest;

    }
}

package bit;

import java.util.Scanner;

public class firstSetbitPos {
    private static int helper(int n) {
        if (n == 0) {
            return 0;
        }
        int p = 1;
        while (n > 0) {
            // Checking if last bit is set
            if ((n & 1) > 0) {
                return p;
            }
            // Increment position and right shift number
            p++;
            n = n >> 1;
        }
        return p;// This return is redundant, the loop always exits when a set bit is found just for completeness
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int position = helper(num);
        System.out.println("Position of first set bit: " + position);
        sc.close();
    }
}
/*Input: 18  (Binary: 10010)
Output: 2
Input: 5 (Binary: 101)
Output: 1

 */
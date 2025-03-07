package bit;

import java.util.*;

class toggleCase {
    // TOGGLE CASE - swaps CAPS to lower case and lower case to CAPS
    static String togglecase(char[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] ^= 32; // Bitwise XOR with 32 to toggle case
        }
        return new String(a);//conversion from arr to string
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        String toggledStr = togglecase(str.toCharArray());
        System.out.println("Toggled String: " + toggledStr);
        
        sc.close();
    }
}
//HelLo
//hELlO
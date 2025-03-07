package feb24;

import java.util.*;

public class bookStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int customers[] = new int[n];
        for (int i = 0; i < n; i++) {
            customers[i] = sc.nextInt();
        }
        int grumpy[] = new int[n];
        for (int i = 0; i < n; i++) {
            grumpy[i] = sc.nextInt();
        }
        int min = sc.nextInt();
        sc.close();
        
        System.out.println(maxSatisfied(customers, grumpy, min));
    }

    public static int maxSatisfied(int customers[], int grumpy[], int min) {
        int n = customers.length;
        int baseSatis = 0;
        int extra = 0, maxextra = 0;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                baseSatis += customers[i];
            }
        }

        for (int i = 0; i < min; i++) {
            if (grumpy[i] == 1) {
                extra += customers[i];
            }
        }
        maxextra = extra;  
        for (int i = min; i < n; i++) {
            if (grumpy[i] == 1) {
                extra += customers[i];
            }
            if (grumpy[i - min] == 1) {
                extra -= customers[i - min];
            }
            maxextra = Math.max(maxextra, extra);
        }

        return baseSatis + maxextra;
    }

}
/*There is a bookstore owner that has a store open for n minutes. Every minute, some number of customers enter the store.
You are given an integer array customers of length n where customers[i] is the number of the customer
that enters the store at the start of the ith minute and all those customers leave after the end of that minute.

On some minutes, the bookstore owner is grumpy. You are given a binary array grumpy where grumpy[i] is 1
if the bookstore owner is grumpy during the ith minute, and is 0 otherwise.

When the bookstore owner is grumpy, the customers of that minute are not satisfied, 
otherwise, they are satisfied.

The bookstore owner knows a secret technique to keep themselves not grumpy for minutes consecutive minutes, 
but can only use it once.

Return the maximum number of customers that can be satisfied throughout the day.
 
Sample Input-1:
---------------
8
1 0 1 2 1 1 7 5
0 1 0 1 0 1 0 1
3

Sample Output-1: 
----------------
16

Explanation:
------------
The bookstore owner keeps themselves not grumpy for the last 3 minutes. 
The maximum number of customers that can be satisfied = 1 + 1 + 1 + 1 + 7 + 5 = 16.

Sample Input-2:
---------------
1
1
0
1

Sample Output-2:
----------------
1
 

Constraints:

n == customers.length == grumpy.length
1 <= minutes <= n <= 2 * 104
0 <= customers[i] <= 1000
grumpy[i] is either 0 or 1. */
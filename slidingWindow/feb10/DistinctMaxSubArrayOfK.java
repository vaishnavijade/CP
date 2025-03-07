import java.util.*;
public class DistinctMaxSubArrayOfK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        DistinctMaxSubArrayOfK d = new DistinctMaxSubArrayOfK();
        System.out.println(d.res(arr, n, k));
    }

    public int res(int[] arr, int n, int k) {
        int dSum = 0, maxSum = 0, left = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int right = 0; right < n; right++) {
            hs.put(arr[right], hs.getOrDefault(arr[right], 0) + 1);
            dSum += arr[right];

            // If the window has duplicates, shrink it from the left
            while (hs.size() < (right - left + 1)) {
                hs.put(arr[left], hs.get(arr[left]) - 1);
                dSum -= arr[left];

                if (hs.get(arr[left]) == 0) {
                    hs.remove(arr[left]);
                }
                left++; // Move left pointer forward
            }

            // Check if valid window of size k
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, dSum);
            }
        }

        return maxSum;
    }
}
/*You are given an array of N heights. 
Your task is to find the maximum sum of any contiguous subarray of length L, 
such that all the elements in the subarray are distinct.

If no such subarray exists, return 0.

Constraints:
------------
-> A subarray is a continuous sequence of elements from the array.
-> The length of the subarray must be exactly L.
-> All elements in the subarray must be unique.

Input Format:
-------------
Line-1: Two space-separated integers N (size of the array) and L (length of the subarray).
Line-2: N space-separated integers, representing the heights array.

Output Format:
--------------
Print a single integer, representing the maximum sum of any valid subarray.
If no valid subarray exists, print 0.

Sample Input-1:
---------------
7 3
7 7 7 1 5 4 2

Sample Output-1:
----------------
13

Explanation:
------------
Valid subarrays of length 3:
[7,7,7] ❌ (invalid, repeated 7)
[7,7,1] ❌ (invalid, repeated 7)
[7,1,5] ✅ (valid, sum = 13)
[1,5,4] ✅ (valid, sum = 10)
[5,4,2] ✅ (valid, sum = 11)
The maximum valid sum is 13.

Sample Input-2:
---------------
3 3
7 7 7

Sample Output-2:
----------------
0

Explanation:
-------------
Only one subarray of length 3 exists: [7,7,7], but it contains repeated elements.
Since no valid subarray exists, return 0.
*/
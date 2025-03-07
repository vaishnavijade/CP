package feb1819;
import java.util.*;
public class removeOneDuplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findDupli(arr));
    }
    public static int findDupli(int[] nums){
        int n=nums.length-1;
        for (int num : nums) {
            if (num < 1 || num > n) {
                return -1;  
            }
        }
        // Step 1: Detect cycle using Floyd's Tortoise and Hare
        int slow = nums[0];
        int fast = nums[0];
        if(slow<1 ||slow>n)return -1;
        // if(fast<1|| fast>n)return -1;
        do {
            if(slow<1 || slow>n || fast<1 ||fast>n ||nums[fast]<1 ||nums[fast]>n){
                return -1;
            }
            slow = nums[slow];         
            fast = nums[nums[fast]];   
        } while (slow != fast);
 // Step 2: Find the entrance to the cycle (duplicate number)
        slow = nums[0];  
        while (slow != fast) {
            slow = nums[slow];  
            fast = nums[fast];
        }
        return slow;  
    }
}
/*You are given an array nums of size n+1, 
where each element is an integer between 1 and n (inclusive).

The array contains exactly one duplicated number, 
which appears at least twice, while all other numbers appear exactly once.

Your task is to find and return the repeated number without modifying the array 
and using only constant extra space.

NOTE: For boundary conditions print -1.

Input Format:
-------------
Line 1: An integer N, representing n (the range of numbers).
Line 2: N+1 space-separated integers representing the array nums.

Output Format:
--------------
Line-1: A single integer representing the duplicate number.

Sample Input-1:
---------------
4
1 3 4 2 2

Sample Output-1:
----------------
2

Sample Input-2:
---------------
4
3 1 3 4 2

Sample Output-2:
----------------
3

Sample Input-3:
---------------
4
5 4 3 2 3

Sample Output-3:
---------------
-1

Constraints:
-------------
-> 1 ≤ n ≤ 10⁵
-> nums.length = n + 1
-> 1 ≤ nums[i] ≤ n
-> All numbers appear exactly once except for one number which appears at least twice.







217. Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }return false;
    }
}
 */
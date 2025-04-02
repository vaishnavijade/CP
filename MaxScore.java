import java.util.*;
public class MaxScore{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxScore(arr));
    }public static int maxScore(int[] arr){
        Set<Integer> s=new HashSet<>();
        int maxSum=0,currentSum=0;
        int l=0;
        for(int r=0;r<arr.length;r++){
            while(s.contains(arr[r])){
                s.remove(arr[l]);
                currentSum-=arr[l];
                l++;
            }s.add(arr[r]);
            currentSum+=arr[r];
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}/*You are given an array of positive integers. 
Your task is to find a contiguous subarray where all elements are unique 
and return the maximum possible sum that can be obtained by erasing exactly one such subarray.

A subarray is defined as a contiguous sequence of elements within the given array.

Input Format:
-------------
Line-1: An integer N, representing the number of elements in the array.
Line-2: Space-separated integers, representing the elements of the array.

Output Format:
--------------
Line-1: A single integer, representing the maximum sum of a contiguous subarray with all unique elements.

Sample Input-1:
---------------
5  
4 2 4 5 6  

Sample Output-1:
----------------
17

Explanation:
-------------
The longest unique subarray is [2, 4, 5, 6] with a sum of 2 + 4 + 5 + 6 = 17.
This is the maximum possible sum that can be obtained.


Sample Input-2:
---------------
6  
1 2 3 1 2 3  

Sample Output-2:
----------------
6


Explanation:
------------
The longest unique subarray is [1, 2, 3] with a sum of 1 + 2 + 3 = 6.
This sum cannot be improved by choosing another unique subarray.
 */
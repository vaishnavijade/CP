import java.util.*;
public class variableSizeE {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
        int k=sc.nextInt();
        System.out.println(maxPplInBus(arr,n,k));

    }
    public static int maxPplInBus(int[] arr,int n,int maxCapacity){
        int max=0;
        int l=0,temp=0;
        for(int r=0;r<n;r++){
            temp+=arr[r];
            while(temp>maxCapacity){
                temp-=arr[l];
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}
/*
You are given an array books, where each element represents the time (in minutes) required to read a book. 
You are also given an integer k, which represents the total available reading time in minutes.

Your task is to determine the maximum number of books that can be read within the given time k 
while ensuring that the sum of reading times does not exceed k.

You must find the longest contiguous subarray where the sum of elements is less than or equal to k, 
and return its length.

Input Format:
-------------
Line-1: An integer 'n' representing the number of books.
Line-2: 'n' space-separated integers representing the time (in minutes) required to read each book.
Line-3: An integer 'k', the available reading time in minutes.

Output Format:
--------------
Line-1: An integer representing the maximum number of books that can be read within 'k' minutes.

Sample Input-1:
---------------
8
1 1 2 1 1 1 4 2
8

Sample Output-1:
----------------
6

Explanation:
------------
We must find the longest subarray where the sum is ≤ 8.
Possible valid subarrays: [1, 1, 2, 1, 1, 1], [1, 2, 1, 1, 1], [2, 1, 1, 1], etc.
The longest valid subarray has a length of 6.

Sample Input-2:
---------------
7
2 3 1 2 4 3 1
5

Sample Output-2:
----------------
3

Explanation:
-------------
Possible valid subarrays: [2, 3], [3, 1, 2], [1, 2, 1], [2, 3], etc.
The longest valid subarray has a length of 3.















input=[1,5,7,2,9]  with maxCapacity=10
 outcomes= [[1],[1,5],[7],[7,2],[9]]
 bit max we can accomadate is 2 (max sub arr)
 
5
1 5 7 2 9
10
2




5
1 5 3 1 9
10
4
*/
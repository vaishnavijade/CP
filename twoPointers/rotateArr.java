import java.util.*;
public class rotateArr{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    res(arr,n,k);
    System.out.println(Arrays.toString(arr));
  }
  public static void res(int[] arr,int n,int k){
      k=k%n;
      reverse(arr,0,n-1);
      reverse(arr,0,k-1);
      reverse(arr,k,n-1);
  }
  private static void reverse(int[] arr,int l,int r){
      while(l<r){
          int temp=arr[r];
          arr[r]=arr[l];
          arr[l]=temp;
          r--;
          l++;
      }
  }
    
}
/*You are given an array of integers nums of size N and a non-negative integer K.
Your task is to rotate the array to the right by K steps.
Each rotation shifts elements to the right, and the last element moves to the first position.

Input Format:
-------------
Line 1: An integer N, representing the size of the array.
Line 2: N space-separated integers, representing the elements of the array.
Line 3: An integer K, representing the number of right rotations.

Output Format:
--------------
Line-1: Print N space-separated integers representing the rotated array.

Sample Input-1:
---------------
7
1 2 3 4 5 6 7
4

Sample Output-1:
----------------
4 5 6 7 1 2 3

Explanation:
-------------
The array [1,2,3,4,5,6,7] is rotated 4 times to the right.
After 4 rotations: [4, 5, 6, 7, 1, 2, 3].

Sample Input-2:
---------------
5
10 20 30 40 50
2

Sample Output-2:
----------------
40 50 10 20 30

Explanation:
-------------
The array [10,20,30,40,50] is rotated 2 times to the right.
After 2 rotations: [40, 50, 10, 20, 30].

Sample Input-3:
---------------
6
5 15 25 35 45 55
0

Sample Output-3:
----------------
5 15 25 35 45 55

Explanation:
-------------
Since K = 0, the array remains unchanged. */
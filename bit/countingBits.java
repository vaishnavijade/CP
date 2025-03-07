package bit;

import java.util.*;
public class countingBits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] result=countBits(n);
        System.out.println(Arrays.toString(result));
        
    }public static int[] countBits(int n){
        int[] res=new int[n+1];
        for(int i=0;i<=n;i++){
            res[i]=setBits(i);
        }return res;
        
    }
    public static int setBits(int n){
        int count=0;
        while(n!=0){
            count+=n&1;
            n>>=1;
        }return count;
    }
    
}
/*You are given an integer N. Your task is to return an array ans of length N + 1 
where each ans[i] represents the number of 1's in the binary representation of i.

Input Format:
--------------
A single integer N, representing the range from 0 to N.

Output Format:
---------------
An array of N+1 integers where each element represents the count of 1s in the binary representation of each number from 0 to N.

Sample Input-1:
---------------
2

Sample Output-1:
----------------
[0,1,1]

Explanation:
------------
0 --> 0
1 --> 1
2 --> 10

Sample Input-2:
---------------
5

Sample Output-2:
--------------- 
[0,1,1,2,1,2]

Explanation:
------------
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101

 */
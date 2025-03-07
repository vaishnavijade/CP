import java.util.*;
public class closestPair{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++)
        arr1[i]=sc.nextInt();
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++)
        arr2[i]=sc.nextInt();
        int target=sc.nextInt();
        List<Integer> res=closest_sum(n1,n2,arr1,arr2,target);
        System.out.println(res.get(0)+","+res.get(1));
    }
    public static List<Integer> closest_sum(int n1,int n2,int[] arr1,int[] arr2,int target){
        List<Integer> res=new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        int l=0,r=n2-1;
        while(l<n1 && r>=0){
            int sum=arr1[l]+arr2[r];
            int diff=Math.abs(target-sum);
            if(diff<minDiff){
                minDiff=diff;
                res.clear();
                res.add(arr1[l]);
                res.add(arr2[r]);
            }
            if(sum<target){
                l++;
            }
            else{
                r--;
            }
        }
        return res;
    }
}/*Two brothers are playing a game based on two sorted lists of numerical elements and a target sum.

The first brother provides:
-> Two sorted lists of integers.
-> A target sum.

The second brother's task is to find and return the closest pair of elements (one from each list) 
whose sum is closest to the given target.

Rules:
------
Each pair must consist of one element from each list.
If multiple pairs have the same closest sum, return any one valid pair.
The input lists are already sorted in ascending order.
The result must be printed as a comma-separated pair.

Input Format:
-------------
Line 1: An integer N1, representing the size of the first list.
Line 2: N1 space-separated integers, representing elements of the first sorted list.
Line 3: An integer N2, representing the size of the second list.
Line 4: N2 space-separated integers, representing elements of the second sorted list.
Line 5: An integer X, representing the target sum.

Output Format:
--------------
Line-1: Print a comma-separated pair (a, b), where a is from list_1 and b is from list_2, such that their sum is closest to the target sum.

Sample Input-1:
---------------
4
1 4 5 7
4
10 20 30 40
32

Sample Output-1:
----------------
1,30

Explanation:
------------
The closest pair to 32 is (1,30) → 1 + 30 = 31, which is the closest sum to 32.

Sample Input-2:
---------------
3
2 4 6
4
5 7 11 13
15

Sample Output-2:
----------------
2,13

Explanation:
------------
The closest pair to 15 is (2,13) → 2 + 13 = 15, which is an exact match. 

import java.util.*;
class ClosestPair
{
    public static List<Integer> closet_sum(int m,int n,int arr1[],int arr2[],int t) 
    {
        List<Integer> res=new ArrayList<>(); 
        int left=0;
        int right=n-1; 
        int sum=0; 
        int min=Integer.MAX_VALUE; 
        if(m==1 || n==1) 
        {
            res.add(arr1[0]);
            res.add(arr2[0]); 
            return res;
        }
        if(n==0 || m==0)
        return res;
        while(left<m && right>=0)
        {
            sum=arr1[left]+arr2[right]; 
            if(sum<=t)
            { 
              int diff=Math.abs(sum-t);
             if(diff<min)
             {
                 min=diff;
                 res.clear();
                 res.add(arr1[left]);
                 res.add(arr2[right]); 
            } 
            }
           if(sum<t) 
            {
               left++; 
            } 
            else{
              right--;
            }
        }
        
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        int m=sc.nextInt();
        int arr1[]=new int[m];  
        for(int i=0;i<m;i++)
        arr1[i]=sc.nextInt();
        int n=sc.nextInt();
        int arr2[]=new int[n]; 
        for(int i=0;i<n;i++)
        arr2[i]=sc.nextInt();
        int target=sc.nextInt(); 
        List<Integer> res=closet_sum(m,n,arr1,arr2,target); 
        System.out.println(res);
    }
} 

*/
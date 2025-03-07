package bit;
import java.util.*;
public class generateSubsets {
    public static List<List<Integer>> subsets(int[] arr){
        List<List<Integer>> res = new ArrayList<>();
        int n=arr.length;
        for(int mask=0;mask<(1<<n);mask++){
            List<Integer> subSet=new ArrayList<>();
            for(int i=0;i<n;i++){
                if((mask &(1<<i))!=0){
                    subSet.add(arr[i]);
                }
            }res.add(subSet);
        }return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(subsets(arr));

    }
}
/*
enerating All Subsets Using Bitmasking
78. Subsets

Given an integer array nums of unique elements, return all possible 
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]] */
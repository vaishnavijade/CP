import java.util.*;
public class Duplicate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(duplicate(arr,n,k));
    }
    public static boolean duplicate(int[] arr,int n,int k){
        HashSet<Integer>window=new HashSet<>();
        for(int i=0;i<n;i++){
            if(i>=k) {window.remove(arr[i-k]);}
            if(window.contains(arr[i])){ return true;}
            window.add(arr[i]);        
        }
        return false;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<i+k && j<n ;j++){
        //         if(arr[i]==arr[j]) return true;
        //     }
        // }return false;
        
    }
}
/*


import java.util.*;
public class Duplicate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(duplicate(arr,n,k));
    }
    public static boolean duplicate(int[] arr,int n,int k){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<i+k && j<n ;j++){
                if(arr[i]==arr[j]) return true;
            }
        }return false;
        
    }
}

Given an integer array of nums and an integer window size X, 
return true if there are duplicate values (nums[i]== nums[j])in that Window(X)
X size is always <= abs(i - j) where i and j are two distinct indices of array.

Input Format:
-------------
Line-1: An integer N, Array Size
Line-2: Space separated integers, array elements
Line-3: An integer X, window size

Output Format:
--------------
Line-1: Booelan value, true/false


Sample Input-1:
---------------
4
1 2 3 1  
3 

Sample Output-1: 
----------------
false

Sample Input-2:
---------------
6
1 2 3 3 2 3
2

Sample Output-2: 
----------------
true */
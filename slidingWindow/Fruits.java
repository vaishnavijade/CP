import java.util.*;
public class Fruits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(res(arr,n));
    }
    public static int res(int[] arr,int n){
        int maxF=0;int l=0;
        HashMap<Integer,Integer> basket=new HashMap<>();
        for(int r=0;r<n;r++){
            basket.put(arr[r],basket.getOrDefault(arr[r],0)+1);
            while(basket.size()>2){
                basket.put(arr[l],basket.get(arr[l])-1);
                if(basket.get(arr[l])==0){
                    basket.remove(arr[l]);
                }
                l++;
            }
            maxF=Math.max(maxF,r-l+1);
        }
        return maxF;
    }
}//boat recolor
/*You are visiting a farm that has a single row of fruit trees arranged from left to right.

The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
You want to collect as much fruit as possible. 

However, the owner has some strict rules that you must follow:
You only have two baskets, and each basket can only hold a single type of fruit. 
There is no limit on the amount of fruit each basket can hold.

Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree)
while moving to the right. The picked fruits must fit in one of your baskets.

Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
Given the integer array fruits, return the maximum number of fruits you can pick.

Sample Input-1:
---------------
3
1 2 1

Sample Output-1: 
----------------
3

Explanation: We can pick from all 3 trees.

Sample Input-2:
--------------- 
4
0 1 2 2 

Sample Output-2: 
----------------
3

Explanation: We can pick from trees [1,2,2].
If we had started at the first tree, we would only pick from trees [0,1].

Sample Input-3: 
---------------- 
5
1 2 3 2 2

Sample Output-4: 
----------------
4

Explanation: We can pick from trees [2,3,2,2].
If we had started at the first tree, we would only pick from trees [1,2].*/
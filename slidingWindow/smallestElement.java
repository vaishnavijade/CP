import java.util.*;
public class smallestElement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
        int k=sc.nextInt();
        int resArr[]=res(arr,n,k);
        for(int i=0;i<n-k+1;i++){
            System.out.print(resArr[i]+" ");
        }
    }
    public static int[] res(int[] arr,int n,int k){
        Deque<Integer> dq=new LinkedList<>();
        int[] resArr=new int[n-k+1];
        for(int i=0;i<n;i++){
            // System.out.println(arr[dq.peekFirst()]+" ");
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && arr[dq.peekLast()]>=arr[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                resArr[i-k+1]=arr[dq.peekFirst()];
            }
        }
        // System.out.println(arr[dq.peekFirst()]+" ");
        return resArr;
    }

}
//monotonic deque//


/*public static void res(int[] arr,int n,int k){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            min=Math.min(arr[i],min);
        }
        System.out.println(min);
        int mmin=Integer.MAX_VALUE;
        for(int i=k;i<n;i++){
            mmin=Math.min(arr[i],mmin);
            System.out.println(mmin);
            // maxSum=Math.sum(maxSum,windowSum);
            }
        // return min[];
    } */
/* 
You are given an array consisting of N integers, and an integer, K. 
Your task is to determine the minimum element in subarrays of size K.

Sample Input1:
--------------
5
10 12 14 11 15
3

Sample Output1:
---------------
10 11 11

Sample Input2:
--------------
5
5 2 1 1 1
4

Sample Output2:
---------------
1 1
*/ 
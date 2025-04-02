import java.util.*;
public class kmostFreq{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(kfreqEle(arr,k));
    }public static List<Integer> kfreqEle(int[] arr,int k){
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        }
        List<Integer> elements = new ArrayList<>(hs.keySet());
        elements.sort((a, b) -> {
            if (!hs.get(a).equals(hs.get(b))) {
                return hs.get(b) - hs.get(a);
            }
            return b - a; 
        });
        return elements.subList(0, k);
    }
}
/*You are given an integer array containing numbers, and an integer k. 
Your task is to return the k most frequent elements in the array.

If multiple elements have the same frequency, the element with the higher value should be prioritized.
The output should be printed in descending order of frequency.

Input Format:
-------------
Line-1: An integer N, representing the number of elements in the array.
Line-2: A line with N space-separated integers representing the elements of the array.
Line-3: An integer k, representing the number of most frequent elements to return.

Output Format:
--------------
Line-1: An array, comma-separated integers in descending order of frequency. 
If two elements have the same frequency, the higher number should appear first.


Sample Input-1:
--------------
6
1 1 1 2 2 3
2

Sample Output-1:
----------------
[1, 2]


Sample Input-2:
--------------
1
1
1

Sample Output-2:
----------------
[1] */
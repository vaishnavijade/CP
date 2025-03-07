package bit;

import java.util.*;
public class palindromePermu{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isPalindrome(s));
    }public static boolean isPalindrome(String s){
        int bm=0;
        for(char ch: s.toCharArray()){
           int bitPos=ch-'a'; 
           bm=bm^(1<<bitPos);
        }return (bm&(bm-1))==0;
    }
}//can solve this using hashmap and hashset too
/*AlphaCipher is a string formed from another string by rearranging its letters

You are given a string S.
Your task is to check, can any one of the AlphaCipher is a palindrome or not.

Input Format:
-------------
A string S

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
carrace

Sample Output-1:
----------------
true


Sample Input-2:
---------------
code

Sample Output-2:
----------------
false

 */
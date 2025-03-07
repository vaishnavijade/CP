import java.util.*;
public class GoodStrings{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(res(s));
    }
    public static int res(String s){
       int n=s.length();
       if(n<3) return 0;
       int count=0;
       int[] freq=new int[26];
       for(int i=0;i<3;i++){
           freq[s.charAt(i)-'a']++;//[] index based on the alplabet like a 0 and z=25
       }if(isunique(freq)){
           count++;
       }
       for(int i=3;i<n;i++){
           freq[s.charAt(i)-'a']++;
           freq[s.charAt(i-3)-'a']--;//sliding window
           if(isunique(freq)){
               count++;
           }
       }return count;
    }
    private static boolean isunique(int[] freq){
        for(int i:freq){
            if(i>1) return false;//char appearing more than once
        }return true;
    }//O(n)
}

/*
import java.util.*;

public class GoodStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countGoodSubstrings(s));
        sc.close();
    }

    public static int countGoodSubstrings(String s) {
        int n = s.length();
        if (n < 3) return 0; // If string length is less than 3, no good substrings are possible.

        int count = 0;

        // Sliding window approach
        for (int i = 0; i <= n - 3; i++) {
            if (isUnique(s.charAt(i), s.charAt(i + 1), s.charAt(i + 2))) {
                count++;
            }
        }

        return count;
    }

    // Helper function to check if all 3 characters are unique
    private static boolean isUnique(char a, char b, char c) {
        return a != b && b != c && a != c;
    }
}









A string is good if there are no repeated characters.
Given a string s, return the number of good substrings of length three in s.
Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
A substring is a contiguous sequence of characters in a string.

Sample Input-1:
---------------
xyzzaz

Sample Output-1:
----------------
1

Explanation: 
------------
There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
The only good substring of length 3 is "xyz".

Sample Input-2:
---------------
aababcabc

Sample Output-2:
----------------
4

Explanation: 
------------
There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
The good substrings are "abc", "bca", "cab", and "abc". */
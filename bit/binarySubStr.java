package bit;

import java.util.*;
public class binarySubStr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        System.out.println(foundAllSubstrgs(s,k));
    }private static boolean foundAllSubstrgs(String s,int k){
        if(s.length()<k) return false;
        Set<String> seen=new HashSet<>();
        int totalCodes=1<<k;//2^k codes are possible
        for(int i=0;i<=s.length()-k;i++){
            seen.add(s.substring(i,i+k));
            if(seen.size()==totalCodes) return true;
        }return false;
        
    }
}/*Given a binary string s and an integer k, return true if every binary code of length k is a substring of s.
Otherwise, return false.

Sample Input-1:
---------------
00110110
2

Sample Output-1: 
----------------
true

Explanation: The binary codes of length 2 are "00", "01", "10" and "11". They can be all found as substrings
at indices 0, 1, 3 and 2 respectively.

Sample Input-2:
---------------
0110
1

Sample Output-2: 
----------------
true

Explanation: The binary codes of length 1 are "0" and "1", it is clear that both exist as a substring. 

Sample Input-3:
---------------
0110
2

Sample Output-3: 
----------------
false

Explanation: The binary code "00" is of length 2 and does not exist in the array.
 

Constraints:
------------
1 <= s.length <= 5 * 10^5
s[i] is either '0' or '1'.
1 <= k <= 20
 */
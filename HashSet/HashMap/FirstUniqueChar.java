package HashSet.HashMap;
import java.util.*;

class FirstUniqueChar {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> charCount=new HashMap<>();
        for(char ch:s.toCharArray()){
            charCount.put(ch,charCount.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(charCount.get(s.charAt(i))==1){
                return i;
            }
        }return -1;
    }
}/*Example 1:

Input: s = "leetcode"

Output: 0

Explanation:

The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:

Input: s = "loveleetcode"

Output: 2

Example 3:

Input: s = "aabb"

Output: -1 */

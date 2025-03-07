package bit;
import java.util.*;
class letterPermu {
    public List<String> letterCasePermutation(String s) {
        char[] arr=s.toCharArray();
        List<String> res=new ArrayList<>();
        int lcount=0;
        for(char c:arr){
            if(Character.isLetter(c))lcount++;
        }
        int totalPermu=1<<lcount; //2^lcount
        for(int mask=0;mask<totalPermu;mask++){
            char[] temp=arr.clone();
            int bit=0;
            for(int i=0;i<temp.length;i++){
                if(Character.isLetter(temp[i])){
                    if(((mask>>bit)&1)==1){
                        temp[i]^=32;
                    }bit++;
                }
            }res.add(new String(temp));
        }return res;
    }
}/* 784. Letter Case Permutation

Given a string s, you can transform every letter individually to be lowercase or uppercase to create another string.

Return a list of all possible strings we could create. Return the output in any order.

Output: ["a1b2","a1B2","A1b2","A1B2"]
Example 2:

Input: s = "3z4"
Output: ["3z4","3Z4"*/
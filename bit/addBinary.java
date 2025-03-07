package bit;
import java.util.*;
public class addBinary {
    public static String add2Binary(String a,String b){
        StringBuilder s=new StringBuilder();
        int i=a.length()-1,j=b.length()-1,carry=0;
        while(i>=0||j>=0||carry>0){
            int bita=(i>=0)?a.charAt(i)-'0':0;
            int bitb=(j>=0)?b.charAt(j)-'0':0;
            int sum=carry^bita^bitb;
            carry=(bita&bitb)|(carry&(bita^bitb));
            s.append(sum);
            i--;j--;
        }
        return s.reverse().toString();
    }
}
/*67. Add Binary

Given two binary strings a and b, return their sum as a
 binary string.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101" */
import java.util.*;
public class reversevowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] vowels={'a','e','i','o','u','A','E','I','O','U'};
        char[] str=s.toCharArray();
        int i=0, j=s.length()-1;
        while(i<j){
            if(!isvowel(str[i],vowels)){
                i++;
            }
            else if(!isvowel(str[j],vowels)){
                j--;
            }
            else{
                char temp=str[j];
                str[j]=str[i];
                str[i]=temp;
                i++;
                j--;
            }
        }
        System.out.println(new String(str));
    }
    private static boolean isvowel(char c,char[] vowels){
        for(char vowel:vowels){
            if(c==vowel){
                return true;
            }
        }return false;
    }
}


/*Given a string s, reverse only all the vowels in the 
string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can 
appear in both lower and upper cases, more than once.

Sample Input-1:
---------------
hello

Sample Output-1:
----------------
holle

Sample Input-2:
----------------
Keshavmemorial

Sample Output-2:
----------------
Kashivmomerael
 */
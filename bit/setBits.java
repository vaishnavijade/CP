package bit;
import java.util.*;
public class setBits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(setbits(n));
    }
    public static int setbits(int n){
        int count=0;
        while(n!=0){
            count+=n&1;
            n>>=1;
        }return count;
    }
    
}/*int countSetBits(int n) {
    int count = 0;
    while (n > 0) {
        n = n & (n - 1); // Remove the last set bit
        count++;
    }
    return count;
}

System.out.println(countSetBits(9)); // 9 = 1001 → Output: 2
 */

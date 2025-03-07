package bit;
import java.util.*;
public class evenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n&1)==0)System.out.println("true");
        else System.out.println("false");
    }
}
//prints true if even
//lsb of odd always 1 so when & with 1 it will give 1 
// so it would be 0 for even hence the conditon x&1==0
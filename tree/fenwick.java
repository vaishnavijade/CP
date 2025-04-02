import java.util.*;
class fenwick{
    int[] arr;
    int[] bit;
    int n;
    fenwick(int[] arr){
        this.n=arr.length;
        this.arr=new int[n];
        this.bit=new int[n+1];
        for(int i=0;i<n;i++){
            this.arr[i]=arr[i];
            init(i,arr[i]);
        }
    }
    public void init(int i,int val){
        i++;
        while(i<=n){`
            bit[i]+=val;
            i+=(i&-i);
        }
    }void update(int i,int val){
        int diff=val-arr[i];
        arr[i]+=diff;
        init(i,diff);
    }public int getSum(int i){
        int sum=0;
        i++;
        while(i>0){
            sum+=bit[i];
            i-=(i&-i);
        }return sum;
    }
    public int sumRange(int i,int j){
        return getSum(j)-getSum(i-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }fenwick ft=new fenwick(arr);
        while(q-->0){
            int opt=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            if(opt==1){
           System.out.println(ft.sumRange(l,r));
            }
            if(opt==2){
             ft.update(l,r);
            }
        }
    }
}
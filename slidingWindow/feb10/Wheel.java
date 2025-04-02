package feb10;

import java.util.*;
public class Wheel{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] cust=new int[n];
        for(int i=0;i<n;i++){
            cust[i]=sc.nextInt();
        }
        int bc=sc.nextInt();
        int rc=sc.nextInt();
        System.out.println(maxProfitWheel(cust,n,bc,rc));
    }public static int maxProfitWheel(int[] cust,int n,int bc,int rc){
        int waiting=0,boarded=0,maxProfit=Integer.MIN_VALUE;
        int rotation=0,bestRotation=-1;
        int profit=0;
        for(int i=0;i<n||waiting>0;i++){
            if(i<n) waiting+=cust[i];
            int toboard=Math.min(4,waiting);
            waiting-=toboard;
            boarded+=toboard;
            profit=(boarded*bc)-((i+1)*rc);
            if(profit>maxProfit){
                maxProfit=profit;
                bestRotation=i+1;
            }rotation++;
        }if (maxProfit<0) return -1;
        else return rotation;
    }
}/*You are the operator of a Centennial Wheel that has four gondolas, and each gondola has room for up to four people.
You have the ability to rotate the gondolas counterclockwise, which costs you runningCost dollars.

You are given an array customers of length n where customers[i] is the number of new customers arriving just before 
the ith rotation (0-indexed). This means you must rotate the wheel i times before the customers[i] customers arrive. 
You cannot make customers wait if there is room in the gondola. Each customer pays boardingCost dollars when they
board on the gondola closest to the ground and will exit once that gondola reaches the ground again.

You can stop the wheel at any time, including before serving all customers. If you decide to stop serving customers,
all subsequent rotations are free in order to get all the customers down safely. Note that if there are currently more
than four customers waiting at the wheel, only four will board the gondola, and the rest will wait for the next 
rotation.

Return the minimum number of rotations you need to perform to maximize your profit. If there is no scenario where
the profit is positive, return -1.

Input Format:
-------------
Line-1: An integer N, number of customers
Line-2: N Space separated integers, customers[]
Line-3: An integer, boardingCost
Line-4: An integer, runningCost

Output Format:
--------------
Line-1: An integer

Sample Input-1:
---------------
2
8 3
5
6

Sample Output-1:
----------------
3

Explanation: The numbers written on the gondolas are the number of people currently there.
1. 8 customers arrive, 4 board and 4 wait for the next gondola, the wheel rotates. Current profit is 4 * $5 - 1 * $6 = $14.
2. 3 customers arrive, the 4 waiting board the wheel and the other 3 wait, the wheel rotates. Current profit is 8 * $5 - 2 * $6 = $28.
3. The final 3 customers board the gondola, the wheel rotates. Current profit is 11 * $5 - 3 * $6 = $37.
The highest profit was $37 after rotating the wheel 3 times.

Sample Input-2:
--------------
3
10 9 6 
6
4

Sample Output-2:
---------------
7

Explanation:
1. 10 customers arrive, 4 board and 6 wait for the next gondola, the wheel rotates. Current profit is 4 * $6 - 1 * $4 = $20.
2. 9 customers arrive, 4 board and 11 wait (2 originally waiting, 9 newly waiting), the wheel rotates. Current profit is 8 * $6 - 2 * $4 = $40.
3. The final 6 customers arrive, 4 board and 13 wait, the wheel rotates. Current profit is 12 * $6 - 3 * $4 = $60.
4. 4 board and 9 wait, the wheel rotates. Current profit is 16 * $6 - 4 * $4 = $80.
5. 4 board and 5 wait, the wheel rotates. Current profit is 20 * $6 - 5 * $4 = $100.
6. 4 board and 1 waits, the wheel rotates. Current profit is 24 * $6 - 6 * $4 = $120.
7. 1 boards, the wheel rotates. Current profit is 25 * $6 - 7 * $4 = $122.
The highest profit was $122 after rotating the wheel 7 times.

Sample Input-3:
---------------
5
3 4 0 5 1
1
92

Sample Output-3: 
---------------
-1

Explanation:
1. 3 customers arrive, 3 board and 0 wait, the wheel rotates. Current profit is 3 * $1 - 1 * $92 = -$89.
2. 4 customers arrive, 4 board and 0 wait, the wheel rotates. Current profit is 7 * $1 - 2 * $92 = -$177.
3. 0 customers arrive, 0 board and 0 wait, the wheel rotates. Current profit is 7 * $1 - 3 * $92 = -$269.
4. 5 customers arrive, 4 board and 1 waits, the wheel rotates. Current profit is 11 * $1 - 4 * $92 = -$357.
5. 1 customer arrives, 2 board and 0 wait, the wheel rotates. Current profit is 13 * $1 - 5 * $92 = -$447.
The profit was never positive, so return -1.

Constraints:
------------
n == customers.length
1 <= n <= 105
0 <= customers[i] <= 50
1 <= boardingCost, runningCost <= 100
 */

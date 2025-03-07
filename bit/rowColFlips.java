package bit;

public class rowColFlips {
    public static boolean checkXorCondition(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;

        // Iterate through each row (except the first row)
        for (int i = 1; i < rows; i++) {
            boolean allZero = true, allOne = true;

            for (int j = 0; j < cols; j++) {
                int xorValue = matrix[0][j] ^ matrix[i][j];

                if (xorValue == 0) {
                    allOne = false; // Not all ones
                } else {
                    allZero = false; // Not all zeros
                }
            }

            // If the XOR row is either all zeros or all ones, return true
            if (!allZero && !allOne) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 0, 1},
            {1, 0, 1},
            {0, 1, 0}
        };
        System.out.println(checkXorCondition(matrix1)); // Output: true

        int[][] matrix2 = {
            {1, 0, 1},
            {0, 1, 0},
            {1, 1, 0}
        };
        System.out.println(checkXorCondition(matrix2)); // Output: false
    }
}

/*You are given a rectangular grid of M x N bulbs arranged on a wall. 
Each bulb can emit either blue light or red light, represented as:
-> 0 → Blue Light
-> 1 → Red Light

Allowed Operation:
-------------------
-> Choose any row or column.
-> Toggle each bulb in that row or column, i.e.:
    Change 0 → 1 (Blue to Red).
    Change 1 → 0 (Red to Blue).
Your task is to determine if it is possible to turn all bulbs into blue light (all 0s) using any number of toggle operations.

Constraints
------------
1 ≤ M, N ≤ 100
The grid contains only 0s and 1s.

Input Format:
-------------
Line 1: Two space-separated integers M and N, representing the size of the grid.
Next M lines: Each line contains N space-separated integers (either 0 or 1).

Output Format:
--------------
Print true if it is possible to turn all bulbs into 0. Otherwise, print false.

Sample Input-1:
---------------
3 3
1 0 1
0 1 0
1 0 1

Sample Output-1:
----------------
true

Explanation: 
------------
1) Toggle column 1 and column 3, the grid becomes:
0 0 0
1 1 1
0 0 0

2) Toggle row 2, the grid becomes:
0 0 0
0 0 0
0 0 0

3) Now, all bulbs emit blue light (0). Hence, output is true.

Sample Input-2:
---------------
3 3
1 0 0
0 1 0
0 0 0

Sample Output-2:
----------------
false

Explanation: 
------------
No sequence of toggle operations can make all bulbs 0.
Hence, output is false.

 */
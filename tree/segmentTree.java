import java.util.*;

public class segmentTree {
    class node {
        int start, end, sum;
        node left, right;

        node(int start, int end) {
            this.start = start;
            this.end = end;
            this.sum = 0;
            this.left = null;
            this.right = null;
        }
    }

    node root = null;

    public segmentTree(int[] arr) {
        root = buildTree(arr, 0, arr.length - 1);
    }

    private node buildTree(int[] arr, int start, int end) {
        if (start > end) return null;
        node n = new node(start, end);
        if (start == end) {
            n.sum = arr[start];
        } else {
            int mid = (start + end) / 2;
            n.left = buildTree(arr, start, mid);
            n.right = buildTree(arr, mid + 1, end);
            n.sum = n.left.sum + n.right.sum;
        }
        return n;
    }

    void update(int i, int val) {
        update(root, i, val);
    }

    void update(node root, int pos, int val) {
        if (root == null) return;
        if (root.start == root.end) {
            root.sum = val;
            return;
        }
        int mid = (root.start + root.end) / 2;
        if (pos <= mid) update(root.left, pos, val);
        else update(root.right, pos, val);
        root.sum = root.left.sum + root.right.sum;
    }

    public int sumRange(int i, int j) {
        return sumRange(root, i, j);
    }

    public int sumRange(node root, int start, int end) {
        if (root == null) return 0;
        if (root.start == start && root.end == end) return root.sum;
        
        int mid = (root.start + root.end) / 2;
        if (end <= mid) return sumRange(root.left, start, end);
        else if (start > mid) return sumRange(root.right, start, end);
        else return sumRange(root.left, start, mid) + sumRange(root.right, mid + 1, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n]; // Fix the array size (not n+1)

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        segmentTree st = new segmentTree(arr);

        while (q-- > 0) {
            int opt = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            if (opt == 1) {
                System.out.println(st.sumRange(l, r));
            } else if (opt == 2) {
                st.update(l, r);
            }
        }

        sc.close();
    }
}
/* 
Sample input :-  
8 5 
4 2 13 4 25 16 17 8 
1 2 6   
1 0 7   
2 2 18  
2 4 17  
1 2 7 
Output :-  
75 
89 
80 */
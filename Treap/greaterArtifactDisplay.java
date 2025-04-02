import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class greaterArtifactDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split(" ");
        int[] arr = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        Node root = build(arr);

        int totalSum = Sum(root, 0);

        System.out.println("Sum of all nodes: " + totalSum);

        System.out.print("Inorder Traversal: ");
        Inorder(root);
        System.out.println();
    }

    // Function to build a BST from an array
    public static Node build(int[] arr) {
        Node root = null;
        for (int val : arr) {
            root = insertIntoBST(root, val);
        }
        return root;
    }

    // Helper function to insert into BST
    public static Node insertIntoBST(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    // Function to compute the sum of all nodes
    public static int Sum(Node root, int sum) {
        if (root == null) {
            return 0;
        }
        int leftSum = Sum(root.left, sum);
        int rightSum = Sum(root.right, sum);
        return root.val + leftSum + rightSum;
    }

    // Function for Inorder Traversal
    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.val + " ");
        Inorder(root.right);
    }
}
/*/* Imagine you're the chief curator at a renowned museum that houses a rare collection 
of ancient artifacts. These artifacts are arranged in a special display that 
follows a strict rule: any artifact positioned to the left of another has a lower 
value, and any artifact on the right has a higher value. 

Your task is to transform this display into what is known as a "Greater Artifact 
Display." In this new arrangement, each artifact’s new value will be its original 
value plus the sum of the values of all artifacts that are more valuable than it.

Sample Input-1:
---------------
4 2 6 1 3 5 7

Sample Output-1:
----------------
22 27 13 28 25 18 7

Explanation:
-------------
Input structure 
       4
      / \
     2   6
    / \ / \
   1  3 5  7

Output structure:
        22
      /   \
     27   13
    / \   / \
   28 25 18  7

Reverse updates:
- Artifact 7: 7
- Artifact 6: 6 + 7 = 13
- Artifact 5: 5 + 13 = 18
- Artifact 4: 4 + 18 = 22
- Artifact 3: 3 + 22 = 25
- Artifact 2: 2 + 25 = 27
- Artifact 1: 1 + 27 = 28
/import java.util.;

class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split(" ");
        int[] arr = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        Node root = build(arr);

        int totalSum = Sum(root, 0);

        System.out.println("Sum of all nodes: " + totalSum);

        System.out.print("Inorder Traversal: ");
        Inorder(root);
        System.out.println();
    }

    // Function to build a BST from an array
    public static Node build(int[] arr) {
        Node root = null;
        for (int val : arr) {
            root = insertIntoBST(root, val);
        }
        return root;
    }

    // Helper function to insert into BST
    public static Node insertIntoBST(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    // Function to compute the sum of all nodes
    public static int Sum(Node root, int sum) {
        if (root == null) {
            return 0;
        }
        int leftSum = Sum(root.left, sum);
        int rightSum = Sum(root.right, sum);
        return root.val + leftSum + rightSum;
    }

    // Function for Inorder Traversal
    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.val + " ");
        Inorder(root.right);
    }
} */
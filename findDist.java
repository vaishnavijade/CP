
import java.util.*;

class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

class TreeBuilder {
    // Function to build tree from level order input
    public TreeNode buildTree(int[] levelOrder) {
        if (levelOrder.length == 0) return null;
        
        TreeNode root = new TreeNode(levelOrder[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int i = 1;
        int n = levelOrder.length;
        
        while (i < n) {
            TreeNode node = q.poll();
            
            if (i < n && levelOrder[i] != -1) {
                node.left = new TreeNode(levelOrder[i]);
                q.offer(node.left);
            }
            i++;
            
            if (i < n && levelOrder[i] != -1) {
                node.right = new TreeNode(levelOrder[i]);
                q.offer(node.right);
            }
            i++;
        }
        return root;
    }
    
    // Function to find the lowest common ancestor (LCA) of two nodes
    public TreeNode findLCA(TreeNode root, int point1, int point2) {
        if (root == null || root.val == point1 || root.val == point2) {
            return root;
        }
        
        TreeNode leftLCA = findLCA(root.left, point1, point2);
        TreeNode rightLCA = findLCA(root.right, point1, point2);
        
        if (leftLCA != null && rightLCA != null) {
            return root;
        }
        
        return (leftLCA != null) ? leftLCA : rightLCA;
    }
    
    // Function to calculate the distance from root to a given node
    public int calculateDistance(TreeNode root, int point, int dist) {
        if (root == null) return -1;
        if (root.val == point) return dist;
        
        int left = calculateDistance(root.left, point, dist + 1);
        if (left != -1) return left;
        
        return calculateDistance(root.right, point, dist + 1);
    }
    
    // Function to calculate the distance between two nodes
    public int distanceBetweenNodes(TreeNode root, int point1, int point2) {
        TreeNode lca = findLCA(root, point1, point2);
        int d1 = calculateDistance(lca, point1, 0);
        int d2 = calculateDistance(lca, point2, 0);
        return d1 + d2;
    }
}

class findDist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] s = sc.nextLine().split(" ");
        int n = s.length;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        int point1 = sc.nextInt();
        int point2 = sc.nextInt();
        
        TreeBuilder tree = new TreeBuilder();
        TreeNode root = tree.buildTree(a);
        System.out.println(tree.distanceBetweenNodes(root, point1, point2));
        
        sc.close();
    }
}
/*Bubloo is working with computer networks, where servers are connected 
in a hierarchical structure, represented as a Binary Tree. Each server (node) 
is uniquely identified by an integer value.

Bubloo has been assigned an important task: find the shortest communication 
path (in terms of network hops) between two specific servers in the network.

Network Structure:
------------------
The network of servers follows a binary tree topology.
Each server (node) has a unique identifier (integer).
If a server does not exist at a certain position, it is represented as '-1' (NULL).

Given the root of the network tree, and two specific server IDs (E1 & E2), 
determine the minimum number of network hops (edges) required to 
communicate between these two servers.

Input Format:
-------------
Line-1: Space separated integers, elements of the tree.
Line-2: Two Space separated integers, represents node ids.

Output Format:
--------------
Print an integer value.


Sample Input-1:
---------------
1 2 4 3 5 6 7 8 9 10 11 12
4 8

Sample Output-1:
----------------
4

Explanation:
------------
The edegs between 4 and 8 are: [4,1], [1,2], [2,3], [3,8]


Sample Input-2:
---------------
1 2 4 3 5 6 7 8 9 10 11 12
6 6

Sample Output-2:
----------------
0

Explanation:
------------
No edges between 6 and 6.
 */
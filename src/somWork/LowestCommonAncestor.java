package somWork;

import javax.swing.tree.TreeNode;

public class LowestCommonAncestor {

    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static int LCA(Node root, int n1, int n2) {

        if (root == null) {
            return -1;
        }
        Node curr = root;
        int lca = -1;
        while (curr != null) {
            if (curr.data < n1 && curr.data < n2) {
                // LCA is present in the right sub tree
                curr = curr.right;
            } else if (curr.data > n1 && curr.data > n2) {
                // LCA is present in left sub tree
                curr = curr.left;
            } else {
                lca = curr.data;
                break;
            }
        }
        return lca;
    }

}

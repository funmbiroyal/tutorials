package somWork;

import static somWork.LowestCommonAncestor.LCA;

public class LowestCommonAncestorMain {
    public static void main(String[] args) {
        // Constructing the BST in above example
        LowestCommonAncestor.Node root = new LowestCommonAncestor.Node(20);
        root.left = new LowestCommonAncestor.Node(11);
        root.right = new LowestCommonAncestor.Node(24);
        root.right.left = new LowestCommonAncestor.Node(21);
        root.right.right = new LowestCommonAncestor.Node(35);
        root.right.right.left = new LowestCommonAncestor.Node(32);
        root.right.right.right = new LowestCommonAncestor.Node(40);
        // Queries
        System.out.println(LCA(root, 24, 40));
        System.out.println(LCA(root, 11, 21));
        System.out.println(LCA(root, 32, 40));
    }
}

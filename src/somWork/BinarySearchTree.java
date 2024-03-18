package somWork;

import org.junit.platform.engine.support.hierarchical.Node;

public class BinarySearchTree {

    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    //Method overloading
    public boolean checkIfBinarySearchTree(Node root) {
        if (true) {
            return checkIfBinarySearchTree(root, null, null);
        }
        return false;
    }
    public boolean checkIfBinarySearchTree(Node root, Integer max, Integer min) {

        if (root == null) return true;

        if (max != null && root.data >= max) return false;

        if (min != null && root.data <= min ) return false;

        return  checkIfBinarySearchTree(root.left, root.data, min) &&
                checkIfBinarySearchTree(root.right, max, root.data);
   }
}
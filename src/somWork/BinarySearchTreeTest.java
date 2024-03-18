package somWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinarySearchTreeTest {
    BinarySearchTree.Node root;
    @Test
    void checkIfBinarySearchTree_returnsTrue_(){
        BinarySearchTree bst = new BinarySearchTree();
        root = new BinarySearchTree.Node(10);
        root.left = new BinarySearchTree.Node(5);
        root.right = new BinarySearchTree.Node(15);
        root.left.left = new BinarySearchTree.Node(2);
        root.left.right = new BinarySearchTree.Node(7);
        root.right.left = new BinarySearchTree.Node(13);
        root.right.right = new BinarySearchTree.Node(26);
        assertTrue(bst.checkIfBinarySearchTree(root));


    }
    @Test
    void checkIfBinarySearchTree__elseReturnFalse(){
        BinarySearchTree bst = new BinarySearchTree();
        root = new BinarySearchTree.Node(10);
        root.left = new BinarySearchTree.Node(5);
        root.right = new BinarySearchTree.Node(15);
        root.left.left = new BinarySearchTree.Node(2);
        root.left.right = new BinarySearchTree.Node(7);
        root.right.left = new BinarySearchTree.Node(13);
        root.right.right = new BinarySearchTree.Node(11);
        assertFalse(bst.checkIfBinarySearchTree(root));


    }
}

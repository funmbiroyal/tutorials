package somWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryNodeTreeTest {
public  BinaryNodeTree.Node root;
    @Test
    void canFindNodeFromABinaryTree_ifPresentReturnTrue_elseReturnFalse(){
        int key = 4;
        int key2 = 14;
        root = new BinaryNodeTree.Node(0);
        root.left = new BinaryNodeTree.Node(1);
        root.right = new BinaryNodeTree.Node(2);
        root.left.left = new BinaryNodeTree.Node(3);
        root.left.right = new BinaryNodeTree.Node(4);
        root.right.left = new BinaryNodeTree.Node(5);
        root.right.right = new BinaryNodeTree.Node(6);

        assertTrue(BinaryNodeTree.nodeExists(root,key));
        assertFalse(BinaryNodeTree.nodeExists(root,key2));
    }
}

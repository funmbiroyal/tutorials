package articles;

import org.junit.jupiter.api.Test;

public class BinaryNodeTreeTest {

    @Test
    void canFindNodeFromABinaryTree_ifPresentReturnTrue_elseReturnFalse(){
        int key = 4;
        BinaryNodeTree.Node root = new BinaryNodeTree.Node(0);
        root.left = new BinaryNodeTree.Node(1);
        root.right = new BinaryNodeTree.Node(2);
        root.left.left = new BinaryNodeTree.Node(3);
        root.right.right = new BinaryNodeTree.Node(4);
        

        BinaryNodeTree.nodeExists();
    }
}

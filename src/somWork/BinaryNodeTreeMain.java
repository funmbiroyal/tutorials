package articles;

import static articles.BinaryNodeTree.nodeExists;

public class BinaryNodeTreeMain {
    public static void main(String []args)
    {
        BinaryNodeTree.Node root = new BinaryNodeTree.Node(0);
        root.left = new BinaryNodeTree.Node(1);
        root.left.left = new BinaryNodeTree.Node(3);
        root.left.left.left = new BinaryNodeTree.Node(7);
        root.left.right = new BinaryNodeTree.Node(4);
        root.left.right.left = new BinaryNodeTree.Node(8);
        root.left.right.right = new BinaryNodeTree.Node(9);
        root.right = new BinaryNodeTree.Node(2);
        root.right.left = new BinaryNodeTree.Node(5);
        root.right.right = new BinaryNodeTree.Node(6);

        int key = 6;
        if (nodeExists(root, key))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

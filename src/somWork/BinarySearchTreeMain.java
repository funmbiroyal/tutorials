package somWork;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        BinarySearchTree  binarySearchTree = new BinarySearchTree();
        BinarySearchTree.Node root;
        root = new BinarySearchTree.Node(10);
        root.left = new BinarySearchTree.Node(5);
        root.right = new BinarySearchTree.Node(15);
        root.left.left = new BinarySearchTree.Node(2);
        root.left.right = new BinarySearchTree.Node(7);
        root.right.left = new BinarySearchTree.Node(13);
        root.right.right = new BinarySearchTree.Node(26);
        System.out.println("The first check : " + binarySearchTree.checkIfBinarySearchTree(root));


        root = new BinarySearchTree.Node(10);
        root.left = new BinarySearchTree.Node(5);
        root.right = new BinarySearchTree.Node(15);
        root.left.left = new BinarySearchTree.Node(2);
        root.left.right = new BinarySearchTree.Node(7);
        root.right.left = new BinarySearchTree.Node(13);
        root.right.right = new BinarySearchTree.Node(11);
        System.out.println("The second check : " + binarySearchTree.checkIfBinarySearchTree(root));
    }

}

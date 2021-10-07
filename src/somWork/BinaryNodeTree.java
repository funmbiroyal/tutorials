package articles;

public class BinaryNodeTree {
    // Binary tree node
    static class Node
    {
        int data;
        Node left;
        Node right;
        public  Node(int data){
            this.data = data;
            left = right = null;
        }
    };
// Function to traverse the tree in preorder
// and check if the given node exists in it
    static boolean nodeExists( Node node, int key)
    {
        if (node == null)
            return false;
        if (node.data == key)
            return true;
        // then check left subtree /
        boolean node1 = nodeExists(node.left, key);
        // node found, no need to look further
        if(node1) return true;
        //if  node is not found in left,
        // then check right the sub-tree /
        boolean node2 = nodeExists(node.right, key);
        if(node2) {
            return true;
        }
        return false;
    }
    // Driver Code


}

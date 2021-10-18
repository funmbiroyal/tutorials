package somWork;

import javax.swing.tree.TreeNode;
import java.util.Stack;

public class KthSmallest {
    public class Node {
        int key;
        Node left;
        Node right;
        int val;
    }
    public int findKthSmallest(Node root, int k) {
        Stack<Node> stack = new Stack<>();

        Node p = root;
        int result = 0;

        while(!stack.isEmpty() || p!=null){
            if(p!=null){
                stack.push(p);
                p = p.left;
            }else{
                Node t = stack.pop();
                k--;
                if(k==0)
                    result = t.val;
                p = t.right;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        KthSmallest k = new KthSmallest();
        Node node = new Node(6); //fixme
        k.findKthSmallest(6, 4);//fixme

    }
}

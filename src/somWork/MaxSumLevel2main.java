package somWork;

public class MaxSumLevel2main {

    public static void main(String[] args) {
        // root level 0
        Node A = Node.createNode(55);
        // Level 1
        Node B = Node.createNode(50);
        Node C = Node.createNode(40);
        // Level 2
        Node D = Node.createNode(25);
        Node E = Node.createNode(80);
        Node F = Node.createNode(45);
        Node G = Node.createNode(90);
        // Level 3
        Node H = Node.createNode(10);
        Node I = Node.createNode(35);
        Node J = Node.createNode(65);
        Node K = Node.createNode(75);

        // connect Level 0 and 1
        A.left = B;
        A.right = C;
        // connect level 1 and level 2
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        // connect level 2 and level 3
        F.left = H;
        F.right = I;
        G.left = J;
        G.right = K;
        MaxSumLevel2.maxSumLevel(A);
    }
}

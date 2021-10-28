package somWork;

public class PriorityQueue {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    void get_union(Node hd1, Node hd2)
    {
        Node t1 = hd1, t2 = hd2;
        while (t1 != null)
        {
            insert(t1.data);
            t1 = t1.next;
        }
        while (t2 != null)
        {
            if (!is_Present(head, t2.data))
                insert(t2.data);
            t2 = t2.next;
        }
    }
    void get_intrSection(Node hd1, Node hd2)
    {
        Node rst = null;
        Node t1 = hd1;
        while (t1 != null)
        {
            if (is_Present(hd2, t1.data))
                insert(t1.data);
            t1 = t1.next;
        }
    }
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insert(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    boolean is_Present(Node head, int data)
    {
        Node t = head;
        while (t != null)
        {
            if (t.data == data)
                return true;
            t = t.next;
        }
        return false;
    }

}

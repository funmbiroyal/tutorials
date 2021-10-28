package somWork;

public class PriorityQueueMain {
    public static void main(String[] args)
    {
        PriorityQueue list1 = new  PriorityQueue ();
        PriorityQueue  list2 = new  PriorityQueue ();
        PriorityQueue  union = new  PriorityQueue ();
        PriorityQueue  intersection = new  PriorityQueue ();
        list1.insert(20);
        list1.insert(4);
        list1.insert(15);
        list1.insert(10);
        list2.insert(10);
        list2.insert(2);
        list2.insert(4);
        list2.insert(8);
        intersection.get_intrSection(list1.head, list2.head);
        union.get_union(list1.head, list2.head);
        System.out.println("First List is");
        list1.printList();
        System.out.println("Second List is");
        list2.printList();
        System.out.println("Intersection List is");
        intersection.printList();
        System.out.println("Union List is");
        union.printList();
    }
}

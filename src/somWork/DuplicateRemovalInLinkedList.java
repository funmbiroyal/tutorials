package somWork;

public class DuplicateRemovalInLinkedList {
    static class Node{
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        static Node head = null;
       static Node tail = null;

        public static void addNode(int data) {
            Node newNode = new Node(data);

            if(head == null) {
                head = newNode;
            }
            else {
                tail.next = newNode;
            }
            tail = newNode;
        }

        public static void removeDuplicate() {
            Node current = head, index = null, temp = null;

            if(head == null) {
                return;
            }
            else {
                while(current != null){

                    temp = current;

                    index = current.next;

                    while(index != null) {

                        if(current.data == index.data) {

                            temp.next = index.next;
                        }
                        else {
                            temp = index;
                        }
                        index = index.next;
                    }
                    current = current.next;
                }
            }
        }

        public static void display() {
            Node current = head;
            if(head == null) {
                System.out.println("List is empty");
                return;
            }
            while(current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {

            addNode(11);
            addNode(12);
            addNode(31);
            addNode(12);
            addNode(31);
            addNode(4);
            addNode(11);

            System.out.println("Originals list: ");
            display();

            removeDuplicate();

            System.out.println("List after removing duplicates: ");
            display();
        }
    }




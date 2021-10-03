package Chapter21;

public class List <T> {
    private Node <T> firstNode;
    private Node <T> lastNode;
    private String name;

    public List(){
        this("list");
    }
    public List(String listName){
        name = listName;
        firstNode = lastNode = null;
    }
    public void insertAtFront(T insertItem){
        if (isEmpty()){
            firstNode = lastNode = new Node<T>(insertItem);
        }else{
            firstNode = new Node<T>(insertItem,firstNode);
        }
    }
    public void insertAtBack(T insertItem){
        if (isEmpty()){
            firstNode = lastNode = new Node<T>(insertItem);
        }else {
            lastNode = lastNode.nextNode = new Node<T>(insertItem,lastNode);
        }
    }
    public T removeFromFront() throws EmptyListException{
        if (isEmpty()){
            throw new EmptyListException("List is empty");
        }
        T removedItem = firstNode.data;
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
          }else {
            firstNode = firstNode.nextNode;
//            Node<T> current = firstNode;
//            while (current.nextNode != lastNode){
//                current = current.nextNode;
//                lastNode = current;
//                current.nextNode = null;
            }
        return removedItem;
        }

       public T removeFromBack() throws EmptyListException{
        if (isEmpty()){
            throw new EmptyListException("List is empty");
        }
        T removedItem = lastNode.data;
        if (firstNode == lastNode){
            firstNode = lastNode = null;
        }else{
            Node<T> current = firstNode;
            while (current.nextNode!=lastNode){
                current = current.nextNode;
                lastNode = current;
                current.nextNode = null;
            }
        }
        return removedItem;
       }
       public boolean isEmpty(){
        return firstNode == null;
       }
       public void print(){
        if (isEmpty()){
            System.out.printf("Empty %s%n",name);
        }
           System.out.printf("This %s is: ", name);
         Node<T> current = firstNode;
         while (current!= null){
             System.out.printf("%s ",current.data);
             current = current.nextNode;
         }
           System.out.println();
       }
}



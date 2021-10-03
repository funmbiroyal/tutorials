package Chapter21;

public class Node <T>{
    T data;
    Node<T> nextNode;

    public Node(T Object){
        this(Object,null);
    }
    public Node(T Object,Node<T>nextNode){
        data = Object;
        this.nextNode = nextNode;
    }

    public T getData(){
        return data;
    }
    public Node <T> getNextNode(){
        return nextNode;
    }
}

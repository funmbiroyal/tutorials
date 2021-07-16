package Chapter16;

import java.util.EmptyStackException;
import java.util.Stack;

public class Stacks {
    public static void printStack(Stack<Number>stack){
        if (stack.isEmpty()){
            System.out.print("The stack is empty");
        }else{
            System.out.printf("stack contains: %s (top)%n", stack);
        }
    }

    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();

        stack.push(3457);
        printStack(stack);
        stack.push(34.50);
        printStack(stack);
        stack.push(45L);
        printStack(stack);
        stack.push(3.5F);

        try {
            Number removedItem;
            while(true) {
                removedItem = stack.pop();
                System.out.printf("Popped %s%n", removedItem);
                printStack(stack);
            }
        }catch(EmptyStackException e){
            e.printStackTrace();
        }

    }
}

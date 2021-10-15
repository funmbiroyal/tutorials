package somWork;

import java.util.Arrays;
import java.util.Stack;

public class StackReversion {
    public static int[] reverseStack(Integer[]itemsToStack){
        Stack<Integer>stacks = new Stack<>();
        for (int i = 0; i < itemsToStack.length; i++) {
            stacks.push(itemsToStack[i]);
        }
        int[] reversedItem = new int[itemsToStack.length];
        for(int i=0; i<itemsToStack.length; i++) {
            reversedItem[i] = stacks.pop();
        }
       return reversedItem;
    }


    public static void main(String[] args) {
        Integer []  integers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Items in the stack before reversing: " + Arrays.toString(integers));
        System.out.println("Items in the stack before reversing: " +Arrays.toString(reverseStack(integers)));
    }
}

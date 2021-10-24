package somWork;

import static somWork.StackReverse.reverse;
import static somWork.StackReverse.stack;

public class StackReverseMain {
    public static void main(String[] args)
    {

        stack.push('1');
        stack.push('2');
        stack.push('3');
        stack.push('4');

        System.out.println("Original Stack");

        System.out.println(stack);

        reverse();

        System.out.println("Reversed Stack");

        System.out.println(stack);
    }
}

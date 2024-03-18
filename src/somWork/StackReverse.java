package somWork;

import java.util.Stack;

public class StackReverse {

        static Stack<Character> stack = new Stack<>();

        static void insert_at_bottom(char x)
        {

            if(stack.isEmpty())
                stack.push(x);

            else
            {
                char a = stack.peek();
                stack.pop();
                insert_at_bottom(x);

                stack.push(a);
            }
        }


        static void reverse()
        {
            if(stack.size() > 0)
            {

                char x = stack.peek();
                stack.pop();
                reverse();

                insert_at_bottom(x);
            }
        }


    }


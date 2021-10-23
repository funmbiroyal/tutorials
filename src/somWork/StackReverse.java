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

                // All items are held in Function
                // Call Stack until we reach end
                // of the stack. When the stack becomes
                // empty, the st.size() becomes 0, the
                // above if part is executed and
                // the item is inserted at the bottom
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


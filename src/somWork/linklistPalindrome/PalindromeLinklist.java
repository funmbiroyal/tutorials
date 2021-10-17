package somWork.linklistPalindrome;

import java.util.Stack;

public class PalindromeLinklist {
        static boolean isPalindrome(Node head) {
            // This pointer will allow the first traversal
            // of the linked list
            Node next = head;

            boolean ispalin = true;
            Stack<Integer> stack = new Stack<Integer>();

            // Traverse the linked list and add its elements
            // to the stack
            while (next != null) {
                stack.push(next.data);
                next = next.ptr;
            }
            // Iterate the linked list again and
            // check by each element with the stack
            while (head != null) {
                int i = stack.pop();
                if (head.data == i) {
                    ispalin = true;
                } else {
                    ispalin = false;
                    break;
                }
                // Move to the next element in stack and the list
                head = head.ptr;
            }
            return ispalin;
        }

}

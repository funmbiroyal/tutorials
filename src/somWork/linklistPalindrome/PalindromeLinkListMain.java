package somWork.linklistPalindrome;


import java.util.Stack;

import static somWork.linklistPalindrome.PalindromeLinklist.isPalindrome;

public class PalindromeLinkListMain {
    public static void main(String args[])
    {
        Node one = new Node(1);
        Node two = new Node(3);
        Node three = new Node(5);
        Node four = new Node(3);
        Node five = new Node(1);
        one.ptr = two;
        two.ptr = three;
        three.ptr = four;
        four.ptr = five;



        boolean condition = isPalindrome(one);
        if(condition == true){
            System.out.println("Linked list is a palindrome.");
        }
        else{
            System.out.println("Linked list is NOT a palindrome.");

        }
    }
}


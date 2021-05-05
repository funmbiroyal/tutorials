package Chapter14;

import java.util.Scanner;

public class PortionsOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first String");
        String string1 = scanner.next();
        System.out.println("Enter your second String");
        String string2 = scanner.next();
        System.out.println("Enter length of characters to be compared");
        int length= scanner.nextInt();
        System.out.println("Enter the begin index of the comparison");
        int beginIndex= scanner.nextInt();

        System.out.println(string1.regionMatches(beginIndex,string2,beginIndex,length));
        System.out.println(string1.equalsIgnoreCase(string2));

    }
}

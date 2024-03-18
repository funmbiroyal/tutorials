package Chapter14;

public class StringReversal {
    public static void main(String[] args) {
        String str = "Semicolon";
        StringBuilder reversedStr = new StringBuilder(" ");
        for (int i = str.length()-1; i >=0 ; i--) {
            reversedStr.append(str.charAt(i));
        }
        System.out.println(reversedStr);
    }
}

package Extras;

public class ReorderString {
    public static String reOrder(String input){
        String [] tokens = input.split("\\s+");
        String [] newArray = new String[tokens.length];

        for (String token : tokens){
            for (int i = 0; i < token.length() ; i++) {
                if (Character.isDigit(token.charAt(i))){
                    int digit = Integer.parseInt(String.valueOf(token.charAt(i)));
                    newArray[digit-1] = token;
                    break;
                }

            }
        }
        StringBuilder sb = new StringBuilder();
        for (String word: newArray){
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reOrder("is2 This1 goo3d"));
    }
}

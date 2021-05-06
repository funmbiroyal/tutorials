package Chapter14;

public class CharOccurrence {
    public static void main(String[] args) {
        String str = "Anniversary";
        char ch = 'n';

        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i)== ch){
                count++;
            }
        }
        System.out.println(count);

        }

    }


package somWork;


public class StringsEquality {

    public boolean checkEquality(String[] string1, String[] string2) {
        if (string1 == string2) {

            return true;
        }
        if(string1 == null || string2 == null) {

            return false;
        }
        if (string1.length == string2.length) {
            for (int i = 0; i < string1.length; i++) {
                if (!string1[i].equals(string2[i])){

                    return false;
                }
            }
            return true;
        }

        return false;
        }
    }


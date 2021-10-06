package articles;

public class StringEqualityMain {
    public static void main(String[] args) {
        StringsEquality equality = new StringsEquality();
        String [] array1 = {"A","B","C" };
        String [] array2 = {"A","B","C" };
        boolean isEqual = equality.checkEquality(array1,array2);
        System.out.println(isEqual);
    }
}

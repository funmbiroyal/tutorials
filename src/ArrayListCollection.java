import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Green");
        colors.add("White");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Cream");
        colors.add("black");
        for (int i = 0; i < colors.size() ; i++) {
            colors.remove("Green");
            System.out.println( colors.get(i));
            //colors.remove("White");
        }
            //colors.remove(3);



    }
}

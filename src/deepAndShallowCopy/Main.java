package deepAndShallowCopy;

public class Main {
    public static void main(String[] args) {
        //Shallow Copy
        ShallowCopy copy1 = new ShallowCopy();
        ShallowCopy copy2 = copy1;
        copy2.number = 10;
        System.out.println("The value of number is " + copy1.number);
        System.out.println("The value of number is " + copy2.number);

        //Deep Copy
        DeepCopy deepCopy1 = new DeepCopy();
        DeepCopy deepCopy2 = new DeepCopy();

        System.out.println("The value of number is " + deepCopy1.number);
        System.out.println("The value of number is " + deepCopy2.number);
    }
}





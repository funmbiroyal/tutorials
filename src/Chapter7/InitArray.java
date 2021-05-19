package Chapter7;

public class InitArray {
    public static void main(String[] args) {
        System.out.printf("%s%10s%n","index", "value");
        int array []= {23,34,56,78,99,90,87,65,43,22};
        for (int i = 0; i < array.length ; i++) {
            System.out.printf("%3d%9d%n",i, array[i]);

        }
    }
}

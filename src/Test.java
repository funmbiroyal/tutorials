import java.util.Arrays;

//import java.util.Arrays;
//
public class Test {
//    public static void main(String[] args) {
//       /** int temp = 180;
//
//        while (temp != 80) {
//            if (temp > 90) {
//                System.out.print("This porridge is too hot! ");
//                temp =  (temp > 150 ? 100 : 20);
//            }
//            else {
//                if (temp < 70) {
//                    System.out.print("This porridge is too cold! ");
//                    temp = temp + (temp < 50 ? 30 : 20);
//                }
//            }
//        }
//
//        if (temp == 80) {
//            System.out.println("This porridge is just right!");
//        }**/

//        String[] os = new String[] { "Mac", "Linux", "Windows" };
//
//        Arrays.sort(os);
//        System.out.println(Arrays.binarySearch(os, "RedHat"));
//
//    }
//}

//    public static void main(String[] args) {
//        String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
//        for (int i = 0; i < days.length; i++)
//            System.out.println(days[i]);
////        }
//    /public static void main(String target[]) { System.out.println(target.length);
//        String[] os = new String[] { "Linux", "Mac", "Windows" }; System.out.println(Arrays.binarySearch(os, "Linux"));
//public static void main(String... names) { System.out.println(names[0]


    public static void main(String[] args) {
//        int[] a;
//        a = new int[10];
//
//        for (int i = 0; i < a.length; i++) {
//            a[i] = i + 2;
//        }
//
//        int result = 0;
//        for (int i = 0; i < a.length; i++) {
//            result += a[i];
//        }
//
//        System.out.printf("Result is: %d%n", result);
//        System.out.println();
//        for (int i = 10; i >=1; i--) {
//            System.out.println(i);

//        }
//        System.out.print("Hello ");
//        System.out.println("World");
//    }
        int[] a = {99, 22, 11, 3, 11, 55, 44, 88, 2, -3};

        int result = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 30) {
                result += a[i];
            }
        }

        System.out.printf("Result is: %d%n", result);


    }

}










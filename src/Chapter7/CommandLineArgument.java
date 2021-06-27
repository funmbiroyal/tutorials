package Chapter7;

public class CommandLineArgument {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Error: Please re-enter the entire command, " +
                    "including an array size, initial value and increment");
        } else {
            int lengthOfArray = Integer.parseInt(args[0]);
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);
            int[] array = new int[lengthOfArray];



            for (int counter = initialValue; counter < array.length; counter++)
                array[counter] = initialValue = initialValue + increment;

                System.out.printf("%s%8s%n", "Index", "Value");



            for (int counter = 0; counter < array.length; counter++) {
                System.out.printf("%5d%8d%n", counter, array[counter]);

            }

        }

    }
}
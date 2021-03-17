public class Test {
    public static void main(String[] args) {
       /** int temp = 180;

        while (temp != 80) {
            if (temp > 90) {
                System.out.print("This porridge is too hot! ");
                temp =  (temp > 150 ? 100 : 20);
            }
            else {
                if (temp < 70) {
                    System.out.print("This porridge is too cold! ");
                    temp = temp + (temp < 50 ? 30 : 20);
                }
            }
        }

        if (temp == 80) {
            System.out.println("This porridge is just right!");
        }**/
        int temp = 200;

        if (temp > 90) {
            System.out.println("This porridge is too hot.");
        }

        if (temp < 70) {
            System.out.println("This porridge is too cold.");
        }

        if (temp == 80) {
            System.out.println("This porridge is just right!");
        }




    }
}

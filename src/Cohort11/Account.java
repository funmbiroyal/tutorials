package Cohort11;

public class Account {
    private static int accNum;
    private static String name;


    public static int getAccNum() {

        return accNum;
    }

    public void setAccNum(int accNum) {
       int acNum = getAccNum();
        Account.accNum = accNum;
    }

    public String getName() {
        return name;
    }

    public static void setName(String name) {
        Account.name = name;
    }



}

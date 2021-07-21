package Chapter8;
import static Chapter8.Time2.displayTime;


public class Time2MainMethod {

    public static void main(String[] args) {
        Time2 time2 = new Time2();
        Time2 t1 = new Time2(); // 00:00:00
        Time2 t2 = new Time2(2); // 02:00:00
        Time2 t3 = new Time2(21, 34); // 21:34:00
        Time2 t4 = new Time2(12, 25, 42); // 12:25:42
        Time2 t5 = new Time2(t4); // 12:25:42

        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; default minute and second", t2);
        displayTime("t3: hour and minute specified; default second", t3);
        displayTime("t4: hour, minute and second specified", t4);
        displayTime("t5: Time2 object t4 specified", t5);
        try
        {
            Time2 t6 = new Time2(27,74,99);
        }catch (IllegalArgumentException exception){
            System.out.printf("%nTrying to initialize t6 with values that are out of range: %s%n",exception.getMessage());
        }
       time2.modifyTimeAsSeconds();
    }
}

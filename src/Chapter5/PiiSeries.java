package Chapter5;

public class PiiSeries {
    public static void main(String[] args) {
        double pii = 0;
        System.out.printf("%s%10s%n", "Term", "Value");
        for (int i = 1; i < 200_000; i++) {
            if (i == 1) {
                pii = 4;
            }
            else if (i % 2 == 0) {
                pii = pii - (double) 4 / (i + (i - 1));
            }
            else {
                pii = pii + (double) 4 / (i + (i - 1));
            }
            System.out.printf("%d%20f%n", i, pii);
        }
    }
}
package Chapter19;

public class MergeSortExample {
    public static void sortArray(int []data, int low, int high){
        if ((high-low) > 1){
            int firstHalf = low + high/2;
            int secondHalf = firstHalf + 1;

            System.out.println("Splitting step");
            System.out.printf("split: %s%n",subArrayString(data, low, high));
            System.out.printf("      %s%n",subArrayString(data,firstHalf,high));
            System.out.printf("      %s%n",subArrayString(data,low,secondHalf));

            sortArray(data,low,firstHalf);
            sortArray(data,secondHalf,high);

        }
    }
    private static void merge(int data [], int  left, int firstHalf, int secondHalf,int right ){

    }
    private static String subArrayString(int data [], int low, int high){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < low ; i++)
            sb.append(" ");

        for (int i = low; i < high; i++)
            sb.append(" ").append(data[i]);

        return sb.toString();

    }
}

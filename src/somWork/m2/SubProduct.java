package somWork.m2;

public class SubProduct {

    static int maxSubarrayProduct(int[] numbers) {
        // Initializing result that will be returned later
        int finalResult = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            int currentResult = numbers[i];
            // traversing in current subarray
            for (int j = i + 1; j < numbers.length; j++) {
                // updating current result every time
                // to keep an eye over the maximum product which is the final result
                finalResult = Math.max(finalResult, currentResult);
                currentResult *= numbers[j];
            }
            // updating the result for (n-1)th index.
            finalResult = Math.max(finalResult, currentResult);
        }
        return finalResult;
    }
    public static void main(String[] args)
    {
        int[] arr = {1 ,-2 ,-3, 4};
//        int[] arr = {6, -3, -10, 0, 2};
        System.out.println("Maximum Sub array product is "
                + maxSubarrayProduct(arr));
    }
}




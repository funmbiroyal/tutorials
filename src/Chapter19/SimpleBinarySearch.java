package Chapter19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleBinarySearch {

    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(array, target));

    }

    @Test
    void testBinarySearch() {
        int[] array = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        assertEquals(4,search(array,target));
    }


}
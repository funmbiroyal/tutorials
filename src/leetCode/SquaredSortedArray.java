package leetCode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class SquaredSortedArray {
    public static int[] squaredArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            nums[i] = nums[i] * nums[i];

        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int [] nums = {2,6,3,7,10};
        System.out.println(Arrays.toString(squaredArray(nums)));
    }
    @Test
    void squareArrayAndSort(){
        int [] nums = {2,6,3};
        int [] newNums = {4,9,36};
        assertNotSame(newNums,squaredArray(nums));
    }
}

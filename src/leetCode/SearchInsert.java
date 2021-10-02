package leetCode;

public class SearchInsert {
    public static int search(int[]nums, int target){
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]>=target){
                return i;
            }

        }
        return nums.length;
    }

    public static void main(String[] args) {
        int a[] = {1 , 3 , 5 , 7 , 9} , target = 8;
        System.out.println(search(a,target));
    }
}

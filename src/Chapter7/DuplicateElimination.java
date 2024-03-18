package Chapter7;

import java.util.ArrayList;

public class DuplicateElimination {
    public static int removeDuplicates(int [] numbers){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(numbers[0]);
        for(int i = 0 ; i < numbers.length; i++){
            boolean isDuplicate = false;
            for (int j = 0; j < nums.size() ; j++) {
                if (nums.get(j) == numbers[i]) {
                    isDuplicate = true;

                    break;
                }
                //if (!(nums.get(j) == numbers[i]))
                else{
                    nums.add(numbers[i]);
                }

            }
        }
        return nums.size();
    }

    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,5,4,3,2,1,0,0};
        System.out.println(removeDuplicates(numbers));
    }
}

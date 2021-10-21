package somWork;

import java.util.ArrayList;
import java.util.Arrays;

import static somWork.KthSmallest.kthSmallest;

public class KthSmallestMain {
    public static void main(String[] args) {
            ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();
            mat.add(new ArrayList<Integer>(Arrays.asList(11, 21, 31, 41)));
            mat.add(new ArrayList<Integer>(Arrays.asList(16, 26, 36, 46)));
            mat.add(new ArrayList<Integer>(Arrays.asList(25, 30, 38, 49)));
            mat.add(new ArrayList<Integer>(Arrays.asList(33, 34, 40, 50)));

            int k = 3;
            int kthsmall = kthSmallest(mat,k);

            if(kthsmall == -1)
                System.out.println("3rd smallest element doesn't exist.");
            else
                System.out.println("3rd smallest element = "+kthsmall);

        }
    }
}

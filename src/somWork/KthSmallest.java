package somWork;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class KthSmallest {
    // function to find k-th largest element
    static int kthSmallest(ArrayList<ArrayList<Integer>> mat, int k)
    {
        int n = mat.size();

        if(k > n*n)
            return -1;

        // smallest element is the first element of the matrix
        if(k == 1)
            return mat.get(0).get(0);

        // define array and push contents of the matrix into it
        ArrayList <Integer> arr = new ArrayList <Integer>();
        for (ArrayList<Integer> integers : mat)
            for (int j = 0; j < n; j++)
                arr.add(integers.get(j));

        // sort the array and obtain k-th smallest element
        Collections.sort(arr);

        return arr.get(k-1);
    }

}


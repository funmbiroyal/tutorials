package somWork;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class KthSmallest {

    static int kthSmallest(ArrayList<ArrayList<Integer>> mat, int k)
    {
        int n = mat.size();

        if(k > n*n)
            return -1;

        if(k == 1)
            return mat.get(0).get(0);
        ArrayList <Integer> arr = new ArrayList <Integer>();
        for (ArrayList<Integer> integers : mat)
            for (int j = 0; j < n; j++)
                arr.add(integers.get(j));

        Collections.sort(arr);

        return arr.get(k-1);
    }

}


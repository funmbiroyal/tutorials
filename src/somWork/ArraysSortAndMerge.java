//package somWork;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class ArraysSortAndMerge {
//    public static Integer [] mergeArrayInAscendingOrder(int[] classA,int []classB) {
//        //merge two Arrays
//        List<Integer> myList = new ArrayList<>();
//        for (int i : classA) {
//            myList.add(i);
//        }
//        for (int j : classB) {
//            myList.add(j);
//
//        }
//        Integer [] newArray = new Integer[myList.size()];
//        myList.toArray(newArray);
//
//        //sort them in ascending order
//        for (int i = 0; i < newArray.length; i++) {
//
//            for (int j = i; j < newArray.length; j++) {
//                Integer temp = newArray[i];
//                if (newArray[i] > newArray[j]){
//                    newArray[i] = newArray[j];
//                    newArray[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(newArray));
//        return newArray;
//    }
//    public static int sortArray(int []array1, int[] array2){
//        int [] sortedArray = new int[array1.length+ array2.length];
//
//    }
//}

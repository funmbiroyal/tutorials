//package Chapter7;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.IntStream;
//
//
//class Try {
//     public static String findNumber(List<Integer> arr, int k) {
//         for (Integer integer : arr) {
//             if (integer == k) {
//                 return "YES";
//             }
//         }
//         return "NO";
//     }
//     public static int[] findOdd(int l, int r){
//       return IntStream.rangeClosed(l,r).filter(e -> e % 2 != 0).toArray();
//
//l = (l%2) != 0 ? l : l+1;
//
//          //int size = ((r - l) / 2) ;
//
////         int[] theArray = new int[size];
////
////         for (int i=0; i < size; ++i) {
////             theArray[i] = l + (i*2);
////         }
//
//         System.out.println(Arrays.toString(theArray));
//
//
//     }
//
// }
// class Solution{
//
//
//
//        public static void main(String[] args) {
//            List<Integer> numbers = new ArrayList<>();
//
//            numbers.add(1);
//            numbers.add(2);
//            numbers.add(3);
//            numbers.add(4);
//            numbers.add(5);
//
//            int k = 4;
//            System.out.println(Try.findNumber(numbers, k));
//            System.out.println(Arrays.toString(Try.findOdd(1, 9)));
//        }
//
//    }
//
//

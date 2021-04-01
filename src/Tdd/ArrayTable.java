package Tdd;

public class ArrayTable {


    public static void main(String[] args) {
        int [][] arrays ={{6,7,6},{5,8,0},{3,6,8}};
        outputArray(arrays);
    }

    static void outputArray(int[][] arrays) {
        for (int row = 0; row < arrays.length ; row++) {
            for (int column = 0; column < arrays[row].length; column++) {
                System.out.printf("%d ",arrays[row][column] );
            }
            System.out.println();
        }
        
    }

   
}
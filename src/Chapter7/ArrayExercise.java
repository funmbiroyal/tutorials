package Chapter7;

public class ArrayExercise {
    public static void main(String[] args) {
        char[][] array = {{'X', 'O', 'X'}, {'O', 'O', 'X'}, {'O', 'X', 'O'}};
        for (char[] row : array) {
            for (char column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        int[][] myArray = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}};

    }
}

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
        int number =349875465, reversedNumber = 0;
         for(; number!= 0;number/=10){
             int remainder = number % 10;

         reversedNumber = reversedNumber * 10 + remainder;
         }
        System.out.println("The reversed number is " + reversedNumber);
    }
}

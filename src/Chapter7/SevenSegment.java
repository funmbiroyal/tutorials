package Chapter7;

public class SevenSegmentDisplay {
   int [][] myArray = new int[5][4];

   public void writeOnA(){
       for (int i  = 0; i  < 4; i ++) {
           myArray [0][i] = 1;
       }
   }

   public void writeOnB(){
       for (int i = 0; i < 3 ; i++) {
           myArray [i][3] = 1;

       }
   }

   public void writeOnC(){
       for (int i = 2; i < 5; i++) {
           myArray[i][3] = 1;

       }
   }

   public void writeOnD(){
       for(int i = 0; i < 4; i++){
           myArray[4][i] = 1;
       }
   }
    public void writeOnE(){
        for (int i = 2; i < 5 ; i++) {
            myArray[i][0] = 1;

        }
    }
    public void writeOnF(){
        for (int i = 0; i < 3 ; i++) {
            myArray[i][0] = 1;

        }
    }
    public void writeOnG(){
        for (int i = 0; i < 4; i++) {
            myArray[2][i] = 1;

        }
    }
    public void display(){
        for (int[] row : myArray) {
            for (int column : row) {
                if (column == 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }
}

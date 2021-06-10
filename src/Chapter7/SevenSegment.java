package Chapter7;

public class SevenSegment {
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
    public void collectValue(String value){
        validateValue(value);
        powerBit(value);
        for (int i = 0; i < value.length() ; i++) {
            if (value.charAt(i) == '1'){
                switch (i){
                    case 0: writeOnA();
                    break;

                    case 1 : writeOnB();
                    break;

                    case 2 : writeOnC();
                    break;

                    case 3 : writeOnD();
                    break;

                    case  4 : writeOnE();
                    break;

                    case  5 : writeOnF();
                    break;

                    case 6 : writeOnG();
                    break;

                    default:
                        break;
                }
            }
        }

    }
    private void validateValue(String value) throws IllegalArgumentException,StringIndexOutOfBoundsException{
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) != '1' && value.charAt(i) != '0'){
                throw new IllegalArgumentException("Illegal value");
            }
        }

       if (value.length() > 8){
           throw new StringIndexOutOfBoundsException("invalid value");
       }
    }
    public void addToIncompleteBit(String value){

       for (int i = 0; i < value.length() ; i++) {
               if (value.length() < 8){
                   value = '0' + value;
           }
       }

    }
    public void powerBit(String value){
        validateValue(value);
       if (value.charAt(7) == '0') value = "0";

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

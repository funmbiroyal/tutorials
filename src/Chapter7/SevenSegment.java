package Chapter7;

public class SevenSegment {
    int[][] myArray = new int[5][4];

    public void writeOnA() {
        for (int i = 0; i < 4; i++) {
            myArray[0][i] = 1;
        }
    }

    public void writeOnB() {
        for (int i = 0; i < 3; i++) {
            myArray[i][3] = 1;

        }
    }

    public void writeOnC() {
        for (int i = 2; i < 5; i++) {
            myArray[i][3] = 1;

        }
    }

    public void writeOnD() {
        for (int i = 0; i < 4; i++) {
            myArray[4][i] = 1;
        }
    }

    public void writeOnE() {
        for (int i = 2; i < 5; i++) {
            myArray[i][0] = 1;

        }
    }

    public void writeOnF() {
        for (int i = 0; i < 3; i++) {
            myArray[i][0] = 1;

        }
    }

    public void writeOnG() {
        for (int i = 0; i < 4; i++) {
            myArray[2][i] = 1;

        }
    }

    public void collectValue(String value){
        String newValue = validateValue(value);
        String newString = addToIncompleteBit(newValue);
        powerBit(newString);
        System.out.println(newString);
        for (int i = 0; i < newString.length() ; i++) {
            if (newString.charAt(i) == '1'){
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
    private String validateValue(String value){
        String newInt =" ";
        for (int i = 0; i < value.length(); i++) {
           if ((value.charAt(i) != '0') || (value.charAt(i) != '1')){
              newInt  = convertDecimalToBinary(value);
            }
        }

       if (value.length() > 8){
           throw new StringIndexOutOfBoundsException("invalid value");
       }
        return newInt;
    }
    public String addToIncompleteBit(String value){

       for (int i = 0; i < value.length() ; i++) {
               if (value.length() < 8){
                   value = '0' + value;
           }
       }
    return value;
    }
    public void powerBit(String value){
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(7) == '0'){
               value = "0";

            }
        }

    }
   public String convertDecimalToBinary(String userInput){
       int remainder;
       int decimal = Integer.parseInt(userInput);
       String reverseResult = " ";
       do {
          remainder = decimal % 2;
          decimal = decimal / 2;

          reverseResult = remainder + reverseResult;


       }while (decimal!= 0);
       //System.out.println(reverseResult);
       return reverseResult;
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

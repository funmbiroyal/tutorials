package Chapter14;

import java.util.Arrays;

public class PigLatin {
        public static  void main (String [] args){
            String tokens = "health is wealth";
      String [] splitTokens = tokens.split("\\s+");
      String first= splitTokens[0];
      splitTokens[splitTokens.length-1]= first;
            System.out.println(Arrays.toString(splitTokens));

    }

}



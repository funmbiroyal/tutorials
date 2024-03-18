package Chapter5;

public class PythagoreanTriple {
    public static void main(String[] args) {
        System.out.printf("%s%10s%13s%n","opposite","adjacent","hypotenuse");
        for(int opposite =1; opposite<500;opposite++){
            for(int adjacent= 1; adjacent <500; adjacent++){
                for(int hypotenuse = 1;hypotenuse<500;hypotenuse++){
                    boolean pythagorean = Math.sqrt(Math.pow(opposite,2) + Math.pow(adjacent,2))== hypotenuse;
                    if(pythagorean){
                        System.out.printf("%5d%10d%9d%n",opposite,adjacent,hypotenuse);
                    }
                }
            }
        }
    }
}

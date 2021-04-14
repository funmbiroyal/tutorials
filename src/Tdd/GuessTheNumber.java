package Tdd;

public class GuessTheNumber {
    private int input;
    private int guess;

    public void enterInput(int input) {
        if(input >0&& input <=1000)
            this.input = input;
    }

    public int getInput() {
        return input;
    }
}

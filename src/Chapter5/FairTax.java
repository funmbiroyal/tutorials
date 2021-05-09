package Chapter5;

public class FairTax {
    private int input;

    public String displayMessages() {
        return """
                welcome dear user
                enter your expenses as follows
                press
                1. Housing
                2. Food
                3. Clothing
                4. Transportation
                5. Education
                6. Health Care
                7. Vacation
                """;
    }

    public void enterInput(int input) {
        if(input > 0)
        this.input = input;
    }

    public int getInput() {
        return input;
    }

    public int calculateFairTax(int expenses) {
        return  expenses * 23/100;
    }
}

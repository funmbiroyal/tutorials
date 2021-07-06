package Chapter7;

public class Airline {
    private boolean[] firstClass;
    private boolean[] economy;
    private boolean[] economyClassArrangement;
    private boolean[] firstClassArrangement;

    public Airline() {
        economy = new boolean[]{false, false, false, false, false};
        firstClass = new boolean[]{false, false, false, false, false};
    }

    public boolean getFirstClassSeat() {

        return false;
    }

    public boolean getEconomyClassSeat() {

        return false;
    }



    public void setEconomyClassArrangement(boolean[] arrangement) {

        economyClassArrangement = arrangement;
    }

    public boolean[] getEconomyClassArrangement() {

        return economyClassArrangement;
    }

    public void setFirstClassArrangement(boolean[] arrangement) {

        firstClassArrangement = arrangement;
    }

    public boolean[] getFirstClassArrangement() {

        return firstClassArrangement;
    }


}











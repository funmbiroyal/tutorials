package Chapter7.tortoise;

public abstract class Player {
    private static int position;

    public static int getPosition() {
        return position;
    }

    public static void setPosition(int position) {
        Player.position = position;
    }



}

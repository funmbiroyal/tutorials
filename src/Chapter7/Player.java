package Chapter7;

import java.util.ArrayList;

public class Player {
    private String playerName;
    private ArrayList<Card>cardGames = new ArrayList<>();
    public Player(String player) {
        playerName = player;
    }

    public String getPlayer() {
        return playerName;
    }

    public void addCards(Card cardGame) {
        cardGames.add(cardGame);
    }

    public int getNumberOfCards() {
        return cardGames.size();
    }
}

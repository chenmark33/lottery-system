package Lottery;

import java.util.*;

public class Raffle {

    private Random RNG;
    private ArrayList<User> LotteryPlayers;
    private ArrayList<NewYorkShows> ShowList;
    private HashMap<User, NewYorkShows> WinnerList;

    public Raffle() {

        RNG = new Random();
        LotteryPlayers = new ArrayList<>();
        ShowList = new ArrayList<>();
        WinnerList = new HashMap<>();

    }

    public User pickWinner() {

        int index = RNG.nextInt(LotteryPlayers.size());
        User winner = LotteryPlayers.get(index);
        System.out.println("The winner is " + winner + "!");
        return winner;

    }

    public NewYorkShows pickShow() {

        int index = RNG.nextInt(ShowList.size());
        NewYorkShows newShow = ShowList.get(index);
        System.out.println("The show for this lottery is " + newShow + ".");
        return newShow;

    }

    public void organizeWinners(User winner, NewYorkShows show) {

        if (!WinnerList.containsKey(winner)) {
            WinnerList.put(winner, show);
        }
        // Notify the users and set a timer for them to collect their tickets.
    }

}

package Final.J4V4.Football42;

import java.util.ArrayList;

public class FootballStatistics {
    private static class Game {
        int goals, cards, fouls;

        Game(int goals, int cards, int fouls) {
            this.goals = goals;
            this.cards = cards;
            this.fouls = fouls;
        }
    }

    private ArrayList<Game> games;

    public FootballStatistics() {
        this.games = new ArrayList<>();
    }

    public void addGame(int goals, int cards, int fouls) {
        this.games.add(new Game(goals, cards, fouls));
    }

    public void calculateStatistics() {
        int totalGoals = 0, totalCards = 0, totalFouls = 0;
        int maxGoals = Integer.MIN_VALUE, maxCards = Integer.MIN_VALUE, maxFouls = Integer.MIN_VALUE;
        int minGoals = Integer.MAX_VALUE, minCards = Integer.MAX_VALUE, minFouls = Integer.MAX_VALUE;

        for (Game game : games) {
            totalGoals += game.goals;
            totalCards += game.cards;
            totalFouls += game.fouls;
            maxGoals = Math.max(maxGoals, game.goals);
            maxCards = Math.max(maxCards, game.cards);
            maxFouls = Math.max(maxFouls, game.fouls);
            minGoals = Math.min(minGoals, game.goals);
            minCards = Math.min(minCards, game.cards);
            minFouls = Math.min(minFouls, game.fouls);
        }

        System.out.println("Statistics:");
        System.out.println("Average goals: " + (double) totalGoals / games.size());
        System.out.println("Average cards: " + (double) totalCards / games.size());
        System.out.println("Average fouls: " + (double) totalFouls / games.size());
        System.out.println("Max goals: " + maxGoals);
        System.out.println("Max cards: " + maxCards);
        System.out.println("Max fouls: " + maxFouls);
        System.out.println("Min goals: " + minGoals);
        System.out.println("Min cards: " + minCards);
        System.out.println("Min fouls: " + minFouls);
    }

    public static void main(String[] args) {
        FootballStatistics stats = new FootballStatistics();
        stats.addGame(2, 4, 10);
        stats.addGame(3, 5, 8);
        stats.addGame(1, 2, 12);
        stats.addGame(0, 3, 7);
        stats.addGame(4, 2, 9);
        stats.addGame(3, 4, 5);
        stats.addGame(2, 1, 11);
        stats.addGame(5, 3, 6);
        stats.addGame(2, 4, 7);
        stats.addGame(1, 5, 8);
        stats.calculateStatistics();
    }
}

package com.Assignment3;
import java.util.Scanner;

class Game {

    private String name;
    private int maxNumPlayers;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxNumPlayers() {
        return maxNumPlayers;
    }

    public void setMaxNumPlayers(int maxNumPlayers) {
        this.maxNumPlayers = maxNumPlayers;
    }


    @Override
    public String toString() {
        return "Maximum number of players for " + name + " is " + maxNumPlayers;
    }
}

class GameWithTimeLimit extends Game {

    private int timeLimit;

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    @Override
    public String toString() {

        return super.toString() + "\nTime Limit for " + getName() + " is " + timeLimit + " minutes";
    }
}


public class GameInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a game: ");
        String gameName = scanner.nextLine();
        System.out.print("Enter the maximum number of players: ");
        int maxPlayers = scanner.nextInt();

        Game game = new Game();
        game.setName(gameName);
        game.setMaxNumPlayers(maxPlayers);

        System.out.println(game.toString());

        scanner.nextLine();

        System.out.print("Enter a game that has time limit: ");
        String timedGameName = scanner.nextLine();
        System.out.print("Enter the maximum number of players: ");
        int timedGameMaxPlayers = scanner.nextInt();
        System.out.print("Enter the time limit in minutes: ");
        int timeLimit = scanner.nextInt();

        GameWithTimeLimit timedGame = new GameWithTimeLimit();
        timedGame.setName(timedGameName);
        timedGame.setMaxNumPlayers(timedGameMaxPlayers);
        timedGame.setTimeLimit(timeLimit);


        System.out.println(timedGame.toString());

        scanner.close();
    }

}

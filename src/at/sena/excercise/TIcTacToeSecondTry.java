package at.sena.excercise;

import java.util.Random;

public class TIcTacToeSecondTry {
    public static void main(String[] args) {
        char[][] gameBoard = {{' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};

        String[] players = {"player1", "player2"};
        Random random = new Random();
        int index = random.nextInt(players.length);

        String randomPlayer = players[index];

        System.out.println(randomPlayer + " fang an!");
    }
}

package at.sena.excercise;

import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        menu();
        char[][] gameBoard = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};

        printGameBoard(gameBoard);
        System.out.print("Wo möchten sie Ihr Zeichen hinplazieren? (1-9): ");
        Scanner scanner = new Scanner(System.in);

        int position = scanner.nextInt();
        System.out.println(position);

    }

    public static void menu() {
        System.out.println("**********************");
        System.out.println("WELCOME TO TICTACTOE!");
        System.out.println("**********************");
        System.out.println("Visualisierung des Spielbrettes: ");
        System.out.println("|1|2|3|");
        System.out.println("|4|5|6|");
        System.out.println("|7|8|9|");
    }

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(" | " + c + " | ");
            }
            System.out.println();
        }

    }
}

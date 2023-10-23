package at.sena.excercise;

import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        menu();
        char[][] gameBoard = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};


        System.out.print("Wo möchten sie Ihr Zeichen hinplazieren? (1-9): ");
        Scanner scanner = new Scanner(System.in);

        int position = scanner.nextInt();

        switch (position) {
            case 1:
                gameBoard [0][0] = 'X';
                break;

            case 2:
                gameBoard [0][1] = 'X';
                break;

            case 3:
                gameBoard [0][2] = 'X';
                break;

            case 4:
                gameBoard [1][0] = 'X';
                break;

            case 5:
                gameBoard [1][1] = 'X';
                break;

            case 6:
                gameBoard [1][2] = 'X';
                break;

            case 7:
                gameBoard [2][0] = 'X';
                break;

            case 8:
                gameBoard [2][1] = 'X';
                break;

            case 9:
                gameBoard [2][2] = 'X';
                break;
        }
        printGameBoard(gameBoard);
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

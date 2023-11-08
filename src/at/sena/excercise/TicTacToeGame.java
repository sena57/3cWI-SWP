package at.sena.excercise;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        printMenu();

            char[][] gameBoard = {{' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '}};

            String[] players = {"player1", "player2"};
            Random random = new Random();
            int index = random.nextInt(players.length);

            String randomPlayer = players[index];

            System.out.println(randomPlayer + " fang an!");

            Scanner scanner = new Scanner(System.in);
            int position = scanner.nextInt();

            char symbol = ' ';

            if (randomPlayer == "player1") {
                symbol = 'X';

            } else if (randomPlayer == "player2") {
                symbol = 'O';
            }


            switch (position) {
                case 1:
                    gameBoard[0][0] = symbol;
                    break;

                case 2:
                    gameBoard[0][1] = symbol;
                    break;

                case 3:
                    gameBoard[0][2] = symbol;
                    break;

                case 4:
                    gameBoard[1][0] = symbol;
                    break;

                case 5:
                    gameBoard[1][1] = symbol;
                    break;

                case 6:
                    gameBoard[1][2] = symbol;
                    break;

                case 7:
                    gameBoard[2][0] = symbol;
                    break;

                case 8:
                    gameBoard[2][1] = symbol;
                    break;

                case 9:
                    gameBoard[2][2] = symbol;
                    break;
                default:
                    break;


            }
            printGameBoard(gameBoard);


    }


    public static void printMenu() {
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

    public boolean gameIsWon () {
        int[][][] winningCombinations = {
                {{0, 0}, {0, 1}, {0,2}}, //horizontale Reihen
                {{1, 0}, {1, 1}, {1, 2}},
                {{2, 0}, {2, 1}, {2, 2}},
                {{0, 0}, {2, 1}, {2, 0}}, // vertikale Reihen
                {{0, 1}, {1, 1}, {2, 1}},
                {{0, 2}, {1, 2}, {2, 2}},
                {{0, 0}, {1, 1}, {2, 2}}, //diagonale Reihen
                {{0, 2}, {1, 1}, {2, 0}}
        };

        for (int i = 0; i < winningCombinations.length; i++) {
            int combination = winningCombinations[i][i][i];
            int [a, b, c] = combination;
        }


    }
    public static void play () {

    }



}
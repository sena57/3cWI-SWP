package at.sena.excercise;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        menu();
        boolean isGameRunning = true;

        while (isGameRunning) {
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            int sumOfPlayer = sumOfNumbers(1);
            int sumOfComputer = sumOfNumbers(1);

            if (input == 1) {
                System.out.println("Deine gewürfelten Zahlen zusammengezählt: " + sumOfPlayer);
                System.out.println("Die gewürfelten Zahlen des Computers zusammengezählt: " + sumOfComputer);

                if (sumOfPlayer > sumOfComputer) {
                    System.out.println("Du gewinnst!");
                } else if (sumOfPlayer < sumOfComputer) {
                    System.out.println("Der Computer gewinnt");
                } else {
                    System.out.println("Unentschieden");
                }

                System.out.println("Wollen Sie weiter spielen? Tippen sie 1 für 'ja' oder 2 für 'nein'");

            } else if (input == 2) {
                isGameRunning = false;
            }



        }
    }

    private static void menu() {
        System.out.println("Herzlich Willkommen zu unserem Würfelspiel!");
        System.out.println("Wollen sie das Spiel starten? Tippen Sie 1 für 'ja' und 2 für 'nein'");
    }

    private static int sumOfNumbers(int rolls) {
        Random random = new Random();

        int result = 0;

        for (int i = 1; i <= rolls; i++) {
            int dice = random.nextInt(1, 7);
            result += dice;
        }

        return result;
    }

}
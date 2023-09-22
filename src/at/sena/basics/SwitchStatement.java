package at.sena.basics;

import java.util.Random;
public class SwitchStatement {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 5 und 10
        int min = 5;
        int max = 10;

        Random random = new Random();

        int randomNumber = random.nextInt(max - min + 1) + min;
        System.out.println(randomNumber);;

        // Wenn der Wert 10 ist gib aus Ten
        // Wenn der Wert 9 ist gib aus Nine
        // Wenn der Wert 8 ist gib aus Eight
        // etc.
        switch (randomNumber) {
            case 5:
                System.out.println("five");
                break;

            case 6:
                System.out.println("six");
                break;

            case 7:
                System.out.println("seven");
                break;

            case 8:
                System.out.println("eight");
                break;

            case 9:
                System.out.println("nine");
                break;

            case 10:
                System.out.println("ten");
                break;
        }
    }

}

package at.sena.excercise;

import java.util.Random;
import java.util.Scanner;

public class WordGuessing {
    public static void main(String[] arg) {
        String words[] = {"Metallblume", "Informatik", "Kinder", "Laptop"};
        Random random = new Random();
        String randomWord = words[random.nextInt(words.length)];
        char[] finalWord = new char[randomWord.length()];

        int i = 0;
        while (i < finalWord.length) {
            finalWord[i] = '*';
            i++;
        }
        guessingLetters(finalWord);
    }

    public static void guessingLetters(char[] finalWord) {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();

        String guess= "";
        while (!guess.equals(finalWord)) {
            System.out.println();
        }
    }
}

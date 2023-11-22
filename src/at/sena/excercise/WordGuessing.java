package at.sena.excercise;

import java.util.Random;
import java.util.Scanner;

public class WordGuessing {
    public static void main(String[] arg) {
        String words[] = {"Metallblume", "Informatik", "Kinder", "Laptop"};
        Random random = new Random();
        String randomWord = words[random.nextInt(words.length)];
        char[] chars = randomWord.toCharArray();


        int i = 0;
        while (i < chars.length) {
            chars[i] = '*';
            i++;
        }
        System.out.println(chars);
        //guessingLetters(chars);
    }

//    public static void guessingLetters(char[] finalWord) {
//        Scanner guess = new Scanner(System.in);
//
//        boolean finished = false;
//        while (finished == false) {
//            System.out.println("Gib einen Buchstaben ein: ");
//            String letter = guess.next();
//
//            while (letter.length()) {
//
//            }
//
//            booelean found = false;
//            for (int i = 0; i < finalWord.length; i++) {
//                if(letter.charAt(0) == finalWord[i]) {
//                    found = true;
//                }
//            }
//        }

}
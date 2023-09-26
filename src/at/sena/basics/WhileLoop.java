package at.sena.basics;

import java.util.Random;

public class WhileLoop {
    //Erstelle ein Programm, dass Zufallszahlen zwischen 10 und 30 generiert.
    //Das Programm soll die Zufallszahlen zusammenzählen.
    //Sobald die Zahl 15 oder die Zahl 25 kommt, wird das Programm beendet und die Summe der vorherigen Zufallszahlen ausgegeben!

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10,31); //gibt mir die zahlen zwischen 10 und 30 aus inklusive den 2 zahlen

        for (int i = 0; i < 100; i++) {
            System.out.println(randomNumber);

        }

    }
}


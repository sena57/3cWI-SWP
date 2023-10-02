package at.sena.excercise;

import java.util.Scanner;

public class BankomatAufgabe {
    public static void main(String[] args) {

        boolean isProgrammRunning = true;

        while (isProgrammRunning) {
            System.out.println("Wählen Sie die Gewünschte Funktionen aus: ");
            selection();

            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1:
                    System.out.println("Geben Sie einen Betrag ein den Sie Einzahlen wollen: ");
                    String betrag1 = scanner.nextLine();
                    System.out.println(betrag1);
                    break;


            }


            isProgrammRunning = false;
        }
    }

    private static void selection() {
        System.out.println(1 + ". Einzahlen");
        System.out.println(2 + ". Abheben");
        System.out.println(3 + ". Kontostand");
    }

}

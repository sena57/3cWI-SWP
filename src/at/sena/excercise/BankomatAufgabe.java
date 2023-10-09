package at.sena.excercise;

import java.util.Scanner;

public class BankomatAufgabe {
    public static void main(String[] args) {

        boolean isProgrammRunning = true;
        int balance = 0;

        while (isProgrammRunning) {
            System.out.println("Wählen Sie die Gewünschte Funktionen aus: ");
            selection();

            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1:
                    System.out.print("Geben Sie einen Betrag ein den Sie Einzahlen wollen: ");
                    int betrag1 = scanner.nextInt();
                    balance += betrag1;
                    break;

                case 2:
                    System.out.print("Geben Sie einen Betrag ein den Sie Abheben wollen: ");
                    int betrag2 = scanner.nextInt();
                    balance -= betrag2;
                    break;

                case 3:
                    System.out.println("Kontostand: " + balance + "€");
                    break;

                case 4:
                    isProgrammRunning = false;
            }
        }
    }

    private static void selection() {
        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Ende");
    }

}

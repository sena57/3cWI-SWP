package at.sena.basics;

public class LoopsTask2 {
    //Zähle die geraden Ziffern zwischen 1 und 1000 zusammen -
    //Tipp: Starte den Loop bei 2 und erhöhe den Zählindex jeweils um 2.
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
            System.out.println(i);
        }
    }

}

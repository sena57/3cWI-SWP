package at.sena.basics;

public class LoopsTask1 {
    public static void main(String[] args) {
        //Zähle in einem For-Loop die Zahlen von 1 bis 100 (inklusive) zusammen
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
            System.out.println(i);
        }

        System.out.println(result);
    }
}

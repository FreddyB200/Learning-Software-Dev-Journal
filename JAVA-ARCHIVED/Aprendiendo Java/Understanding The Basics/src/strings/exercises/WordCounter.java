package strings.exercises;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        //Escribe un programa que cuente cuántas palabras hay en una frase.
        //La frase se ingresará por teclado.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una oracion para \"saber\" cuantas palabras tiene: ");
        String prayer = scanner.nextLine().trim();
        System.out.println(prayer);

        char space = ' ';
        int spaceCounter = 0;
        for (int i = 0; i < prayer.length(); i++) {
            if (prayer.charAt(i) == space) {
                spaceCounter++;
            }
        }
        int wordsNumber = spaceCounter + 1;
        System.out.println("La frase contiene " + wordsNumber + " palabras.");

    }
}

package strings.exercises;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        /*Escribe un programa que determine si una palabra es un palíndromo.
        Una palabra es un palíndromo si se lee igual de izquierda a derecha
        y de derecha a izquierda (ignorando mayúsculas y minúsculas).*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a word to checker if its a palindrome or not: ");
        String word = scanner.nextLine().toLowerCase();
        if (isPalindrome(word)) {
            System.out.println("La palabra " + word + " es un palíndromo.");
        } else {
            System.out.println("La palabra " + word + " no es un palíndromo.");
        }
        scanner.close();
        }

    public static boolean isPalindrome(String word) {
        StringBuilder invertedWord = new StringBuilder(word).reverse();
//        for (int i = word.length() -1; i >= 0; i--){
//            invertedWord += word.charAt(i);
//        }

        return word.equals(invertedWord.toString());
    }
}

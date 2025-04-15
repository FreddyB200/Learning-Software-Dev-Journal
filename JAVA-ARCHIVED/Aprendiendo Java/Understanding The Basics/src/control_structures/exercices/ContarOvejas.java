package control_structures.exercices;

import java.util.Random;

public class ContarOvejas {
    public static void main(String[] args) {
        int ovejasCant = 0;
        boolean asleep = false;
        int nivelSueno = 3;

        if((nivelSueno <1) || nivelSueno > 10 ) {
            System.out.println("nivel de sueno debe estar entre 1 y 10");
            return;
        }

        Random random = new Random();
        int umbralBase = 20; // Umbral base
        int limiteSueno = random.nextInt((umbralBase + 1) - (nivelSueno * 2)) + (nivelSueno * 2);

        while (!asleep) {
            System.out.println("me dormi? no, sigo contando ovejas...");
            ovejasCant++;
            System.out.println("Ovejas contadas: " + ovejasCant);

            if(ovejasCant >= limiteSueno) {
                asleep = true;
            }
        }
            System.out.println("Ya desperte, me dormí después de contar " + ovejasCant + " ovejas!");
    }
}
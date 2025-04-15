package control_structures.exercices;

import java.util.Arrays;

public class Inversiones {
    public static void main(String[] args) {
        // Lista de montos invertidos en diferentes cuentas
        double[] montosInvertidos = {5000.0, 20000.0, 60000.0, 15000.0, 120000.0};

        // Iteramos sobre cada monto para calcular los intereses
        for (double monto : montosInvertidos) {
            double interes = 0.0;
            double rendimiento = 0.0;

            // Determinamos el tipo de interés dependiendo del monto invertido
            if (monto < 10000) {
                interes = monto * 0.05;  // 5% de interés
            } else if (monto >= 10000 && monto <= 50000) {
                interes = monto * 0.07;  // 7% de interés
            } else if (monto > 50000) {
                interes = monto * 0.10;  // 10% de interés
            }

            // Calculamos el rendimiento total
            rendimiento = monto + interes;

            // Mostramos el resultado
            System.out.printf("Monto invertido: %.2f, Interés: %.2f, Rendimiento total: %.2f\n", monto, interes, rendimiento);
        }
    }
}

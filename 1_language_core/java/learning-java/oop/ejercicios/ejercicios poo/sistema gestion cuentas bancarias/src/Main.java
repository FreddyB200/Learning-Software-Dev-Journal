import account.*;
import transaction.*;
import java.util.Scanner;
import static transaction.TransactionType.*;
import static account.CurrencyOptions.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final AccountManager accountManager = new AccountManager();
    private static final TransactionManager transactionManager = new TransactionManager();

    public static void main(String[] args) {
        mostrarMenuPrincipal();
    }

    private static void mostrarMenuPrincipal() {
        while (true) {
            System.out.println("\n===== SISTEMA BANCARIO =====");
            System.out.println("1. Crear nueva cuenta");
            System.out.println("2. Realizar transacción");
            System.out.println("3. Consultar cuentas");
            System.out.println("4. Ver historial de transacciones");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = leerEntero();

            switch (opcion) {
                case 1 -> crearCuenta();
                case 2 -> realizarTransaccion();
                case 3 -> consultarCuentas();
                case 4 -> verHistorialTransacciones();
                case 5 -> salir();
                default -> System.out.println("Opción inválida.");
            }
        }
    }

    private static void crearCuenta() {
        System.out.println("\n=== CREAR NUEVA CUENTA ===");
        System.out.println("1. Cuenta Corriente");
        System.out.println("2. Cuenta de Ahorros");
        System.out.print("Seleccione tipo: ");
        int tipo = leerEntero();

        System.out.print("Nombre del titular: ");
        String titular = scanner.nextLine();

        CurrencyOptions moneda = seleccionarMoneda();

        try {
            Account nuevaCuenta;
            if (tipo == 1) {
                System.out.print("Límite de sobregiro: ");
                double sobregiro = leerDouble();
                nuevaCuenta = new CheckingAccount(titular, moneda, sobregiro);
            } else {
                System.out.print("Tasa de interés (%): ");
                double interes = leerDouble();
                nuevaCuenta = new SavingsAccount(titular, moneda, interes);
            }
            accountManager.addAccount(nuevaCuenta);
            System.out.println("✅ Cuenta creada exitosamente!");
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }

    private static void realizarTransaccion() {
        System.out.println("\n=== REALIZAR TRANSACCIÓN ===");
        System.out.println("1. Depósito");
        System.out.println("2. Retiro");
        System.out.println("3. Transferencia");
        System.out.print("Seleccione tipo: ");
        int tipo = leerEntero();

        TransactionType tipoTransaccion = switch (tipo) {
            case 1 -> DEPOSIT;
            case 2 -> WITHDRAWAL;
            case 3 -> TRANSFER;
            default -> throw new IllegalArgumentException("Tipo inválido");
        };

        try {
            Transaction transaccion = crearTransaccion(tipoTransaccion);
            transaccion.execute();
            transactionManager.addTransaction(transaccion);
            System.out.println("✅ Transacción exitosa!");
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }

    private static Transaction crearTransaccion(TransactionType tipo) {
        System.out.print("Monto: ");
        double monto = leerDouble();

        Account origen = null;
        Account destino = null;

        if (tipo != DEPOSIT) {
            origen = seleccionarCuenta("origen");
        }
        if (tipo != WITHDRAWAL) {
            destino = seleccionarCuenta("destino");
        }

        return new Transaction(tipo, monto, origen, destino);
    }

    private static Account seleccionarCuenta(String tipo) {
        System.out.print("Ingrese número de cuenta (" + tipo + "): ");
        String numero = scanner.nextLine();
        Account cuenta = accountManager.findAccountByNumber(numero);

        if (cuenta == null) {
            throw new IllegalArgumentException("Cuenta no encontrada");
        }
        return cuenta;
    }

    private static void consultarCuentas() {
        System.out.println("\n=== CUENTAS REGISTRADAS ===");
        accountManager.getAccountStorage().forEach(cuenta -> {
            System.out.println("\nNúmero: " + cuenta.getAccountNumber());
            System.out.println("Titular: " + cuenta.getAccountHolder());
            System.out.println("Moneda: " + cuenta.getCurrency());
            System.out.println("Saldo: " + cuenta.getBalance());
            System.out.println("Tipo: " + (cuenta instanceof CheckingAccount ? "Corriente" : "Ahorros"));
        });
    }

    private static void verHistorialTransacciones() {
        System.out.println("\n=== HISTORIAL DE TRANSACCIONES ===");
        transactionManager.displayTransactions();
    }

    private static CurrencyOptions seleccionarMoneda() {
        System.out.println("\nMonedas disponibles:");
        for (CurrencyOptions moneda : CurrencyOptions.values()) {
            System.out.println(moneda.ordinal() + 1 + ". " + moneda);
        }
        System.out.print("Seleccione moneda: ");
        int indice = leerEntero() - 1;
        return CurrencyOptions.values()[indice];
    }

    private static void salir() {
        System.out.println("¡Hasta luego!");
        scanner.close();
        System.exit(0);
    }

    // Helpers para validación de entradas
    private static int leerEntero() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingrese un número: ");
            }
        }
    }

    private static double leerDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingrese un número: ");
            }
        }
    }
}


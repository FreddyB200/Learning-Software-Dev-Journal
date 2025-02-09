//import account.*;
//import  account.SavingsAccount;
//import transaction.Transaction;
//import transaction.TransactionManager;
//
//import java.util.Scanner;
//
//import static transaction.TransactionType.*;
//import static account.CurrencyOptions.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        CheckingAccount cuentaFreddy1 = new CheckingAccount("freddy", USD, 60000);
//        CheckingAccount cuentaLaura1 = new CheckingAccount("Luara", USD, 40000);
//        SavingsAccount cuentaFreddy2 = new SavingsAccount("Freddy", USD, 0.9);
//        SavingsAccount cuentaLaura2 = new SavingsAccount("Laura", USD, 0.8);
//        SavingsAccount cuentaLeydi = new SavingsAccount("leydi", USD, 1);
//
//
//
//        AccountManager accountManager = new AccountManager();
//        accountManager.addAccount(cuentaFreddy1);
//        accountManager.addAccount(cuentaFreddy2);
//        accountManager.addAccount(cuentaLaura1);
//        accountManager.addAccount(cuentaLaura2);
//        accountManager.addAccount(cuentaLeydi);
//        accountManager.displayAccounts();
//
//        TransactionManager transactionManager = new TransactionManager();
//
//
//        while (true) {
//            System.out.println("\n===== MENÚ DE TRANSACCIONES =====");
//            System.out.println("1. Depositar en cuenta de ahorros");
//            System.out.println("2. Retirar de cuenta de cheques");
//            System.out.println("3. Transferir entre cuentas");
//            System.out.println("4. Salir");
//            System.out.print("Seleccione una opción: ");
//
//            int opcion = scanner.nextInt();
//
//            System.out.println("balance de la cuenta de "+ cuentaFreddy2.getAccountHolder() + ": "+ cuentaFreddy2.getBalance());
//            System.out.println("balance de la cuenta de "+ cuentaLeydi.getAccountHolder() + ": "+ cuentaLeydi.getBalance());
//            switch (opcion) {
//                case 1:
//                    System.out.print("Ingrese el monto a depositar: ");
//                    double deposito = scanner.nextDouble();
//                    Transaction depositTransaction = new Transaction(DEPOSIT, deposito, cuentaFreddy2);
//                    try {
//                        depositTransaction.deposit(cuentaFreddy2);
//                        System.out.println("Depósito realizado con éxito.");
//                        transactionManager.addTransaction(depositTransaction);
//                    } catch (Exception e) {
//                        System.out.println("Error: " + e.getMessage());
//                    }
//                    break;
//
//                case 2:
//                    System.out.print("Ingrese el monto a retirar: ");
//                    double retiro = scanner.nextDouble();
//                    Transaction withdrawTransaction = new Transaction(WITHDRAWAL, 20000, cuentaLaura2);
//                    try {
//                        withdrawTransaction.withdraw(cuentaLaura2, retiro);
//                        System.out.println("Retiro realizado con éxito.");
//                        transactionManager.addTransaction(withdrawTransaction);
//                    } catch (Exception e) {
//                        System.out.println("Error: " + e.getMessage());
//                    }
//                    break;
//
//                case 3:
//                    System.out.print("Ingrese el monto a transferir: ");
//                    double transferencia = scanner.nextDouble();
//                    Transaction transferTransaction = new Transaction(transferencia, cuentaFreddy2, cuentaLeydi, TRANSFER, USD);
//                    try {
//                        transferTransaction.transfer(cuentaFreddy2, cuentaLeydi);
//                        System.out.println("Transferencia realizada con éxito.");
//                        transactionManager.addTransaction(transferTransaction);
//                    } catch (Exception e) {
//                        System.out.println("Error: " + e.getMessage());
//                    }
//                    break;
//
//                case 4: // Salir
//                    System.out.println("Saliendo del programa...");
//                    scanner.close();
//                    return;
//
//                default:
//                    System.out.println("Opción inválida. Intente de nuevo.");
//            }
//
//            transactionManager.displayTransactions();
//            System.out.println("balance de la cuenta de "+ cuentaFreddy2.getAccountHolder() + ": "+ cuentaFreddy2.getBalance());
//            System.out.println("balance de la cuenta de "+ cuentaLeydi.getAccountHolder() + ": "+ cuentaLeydi.getBalance());
//
//        }
//    }
//}
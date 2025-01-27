package exercice.invoice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BIENVENIDO AL SISTEMA DE CREACION DE FACTURAS");

        List<VATInvoice> invoices = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Create new invoice");
            System.out.println("2. Show all the invoices");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the invoice number: ");
                    int invoiceNumber = scanner.nextInt();
                    System.out.println("Enter total invoice amount: ");
                    double totalInvoiceAmount = scanner.nextDouble();

                    invoices.add(new VATInvoice(invoiceNumber, totalInvoiceAmount));
                    System.out.println("Invoice created successfully.");
                    break;
                case 2:
                    System.out.println("\nRegistered invoices:");
                    for (VATInvoice invoice : invoices) {
                        System.out.println(invoice);
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
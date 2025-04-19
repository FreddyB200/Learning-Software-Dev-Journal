package exercice.invoice;

class Invoice {
    private int invoiceNumber;
    private double totalInvoiceAmount;



    public Invoice(int invoiceNumber, double totalInvoiceAmount) {
        this.invoiceNumber = invoiceNumber;
        this.totalInvoiceAmount = totalInvoiceAmount;
    }

    public double getTotalInvoiceAmount() {
        return totalInvoiceAmount;
    }

    public String toString(){
        return "Invoice number: " + invoiceNumber + "\nInitial amount: $" + totalInvoiceAmount;
    }

}

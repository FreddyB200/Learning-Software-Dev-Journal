package exercice.invoice;

class VATInvoice extends Invoice {
    private static final double ivaValue = 0.19;
    private double vatAmount; //value added tax
    private double postTaxAmount;

    public VATInvoice(int invoiceNumber, double totalInvoiceAmount) {
        super(invoiceNumber, totalInvoiceAmount);
        this.vatAmount = calculateVAT();
        this.postTaxAmount = getTotalInvoiceAmount() + vatAmount;
    }


    private double calculateVAT(){
        return getTotalInvoiceAmount() * VATInvoice.ivaValue;
    }

    @Override
    public String toString(){
        return super.toString() + "\nValue added tax (VAT): $" + vatAmount + "\nTotal Amount post taxes: $" + postTaxAmount;
    }
}


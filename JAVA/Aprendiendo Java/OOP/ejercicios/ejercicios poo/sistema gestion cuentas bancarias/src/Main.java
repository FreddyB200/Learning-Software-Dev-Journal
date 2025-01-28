import account.CurrencyOptions;
import account.Account;
import account.SavingsAccount;
import transaction.Transaction;
import transaction.TransactionManager;

import static transaction.TransactionType.*;
import static account.CurrencyOptions.*;

public class Main {
    public static void main(String[] args) {
        SavingsAccount cuenta1 = new SavingsAccount("freddy", 32432, USD, 0.05);
        SavingsAccount cuenta2 = new SavingsAccount("Luara", 200000, USD, 0.03);

        System.out.println(cuenta1.getCurrency());
        System.out.println(cuenta1.getAccountHolder());
        System.out.println(cuenta1.getAccountNumber());
        System.out.println(cuenta1.checkBalance());
        cuenta1.applyInterest(15);
        System.out.println(cuenta1.checkBalance());
        System.out.println(cuenta1.checkBalance());

        System.out.println(cuenta2.getCurrency());
        System.out.println(cuenta2.getAccountHolder());
        System.out.println(cuenta2.getAccountNumber());
        System.out.println(cuenta2.checkBalance());
        cuenta2.applyInterest(3);
        System.out.println(cuenta2.checkBalance());
        System.out.println(cuenta2.checkBalance());


        Transaction tran = new Transaction(100000,cuenta2,cuenta1,TRANSFER, USD);
        TransactionManager tranma = new TransactionManager();
        tran.displayTransactionDetails();





    }
}
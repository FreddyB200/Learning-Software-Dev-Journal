import account.CurrencyOptions;
import account.Account;
import account.SavingsAccount;
import transaction.Transaction;

import static transaction.TransactionType.*;
import static account.CurrencyOptions.*;

public class Main {
    public static void main(String[] args) {
        SavingsAccount cuenta = new SavingsAccount("1234", "Freddy", 14575.9, USD, 0.05);
        Transaction transaction =  new Transaction();


    }
}
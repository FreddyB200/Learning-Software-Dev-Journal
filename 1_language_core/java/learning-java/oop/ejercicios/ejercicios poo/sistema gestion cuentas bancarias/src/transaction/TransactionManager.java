package transaction;

import account.Account;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<Transaction> transactionHistory;

    public TransactionManager(){
        this.transactionHistory = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction){
        transactionHistory.add(transaction);
        System.out.println("Transaction added: " + transaction.getTimestamp() + " (ID: " + transaction.getUuid() + ")");
    }

    public void displayTransactions(){
        if (transactionHistory.isEmpty()){
            System.out.println("No transactions registered in history");
            return;
        }
        for (Transaction transaction : transactionHistory){

            System.out.println("-------------------");
            transaction.displayTransactionDetails();

        }
    }

    public Transaction findTransactionByUUID(String uuid) {
        for (Transaction transaction : transactionHistory) {
            if (transaction.getUuid().equals(transactionHistory)) {
                return transaction;
            }
        }
        return null;
    }


    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }
}

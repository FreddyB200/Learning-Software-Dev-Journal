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
        System.out.println("-----Transactions history!-----");
        for (Transaction transaction : transactionHistory){
            transaction.displayTransactionDetails();
            System.out.println("-------------------");
        }
    }

    public Transaction findTransactionByUUID(String uuid) {
        for (Transaction transaction : transactionHistory) {
            if (transaction.getUuid() == uuid) {
                return transaction;
            }
        }
        return null;
    }

}

package account;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    private List<Account> accountStorage;

    public AccountManager(){
        this.accountStorage = new ArrayList<>();
    }

    public void addAccount(Account account){
        accountStorage.add(account);
        System.out.println("Account added: " + "(ID: " + account.getAccountNumber() + ")");
    }

    public void displayAccounts(){
        if (accountStorage.isEmpty()){
            System.out.println("No accounts storaged yet.");
            return;
        }
        for (Account account : accountStorage){

            System.out.println("-------------------");
            System.out.println("Account: " + account.getAccountNumber() + ", Account holder: " + account.getAccountHolder());

        }
    }

    public Account findAccountByNumber(String accountNumber) {
        for (Account account : accountStorage) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public List<Account> getAccountStorage() {
        return accountStorage;
    }
}


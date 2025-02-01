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
        System.out.println("-----Accounts Storaged!-----");
        for (Account account : accountStorage){
            System.out.println("Account holder: " + account.getAccountHolder());
            System.out.println("-------------------");
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


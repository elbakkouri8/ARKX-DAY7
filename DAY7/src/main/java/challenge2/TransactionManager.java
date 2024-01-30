package challenge2;

import java.util.ArrayList;

public class TransactionManager {
    private ArrayList<BankAccount> accounts;

    public TransactionManager() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void performTransactions() {
        for (BankAccount account : accounts) {
            account.deposit(1000);  // Example deposit
            account.withdraw(500);  // Example withdrawal

            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).activeInteret();
            }

            account.displayTransactions();
            System.out.println();
        }
    }
}

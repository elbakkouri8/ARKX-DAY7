package challenge2;

public class Main {
    public static void main(String[] args) {
            SavingsAccount savingsAccount = new SavingsAccount(2000, "mohamed elbakkouri", 0.02);
            CheckingAccount checkingAccount = new CheckingAccount(4000, "oussama merfak", 500);

            TransactionManager transactionManager = new TransactionManager();
            transactionManager.addAccount(savingsAccount);
            transactionManager.addAccount(checkingAccount);

            transactionManager.performTransactions();

    }
}

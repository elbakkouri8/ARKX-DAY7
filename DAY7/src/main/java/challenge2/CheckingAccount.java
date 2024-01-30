package challenge2;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    public CheckingAccount(double solde, String accountId, double overdraftLimit) {
        super(solde, accountId);
        this.overdraftLimit=overdraftLimit;
    }

    public void withdraw(double amount) {
        if (amount <= (this.getSolde() + overdraftLimit)) {
            super.withdraw(amount);
        } else {
            System.out.println("Transaction declined");
        }
    }
}

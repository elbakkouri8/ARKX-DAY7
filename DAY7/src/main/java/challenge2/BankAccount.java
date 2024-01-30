package challenge2;

public abstract class BankAccount implements Transactable{
    private double solde;
    private String accountId;
    private String Historique;


    public BankAccount(double solde, String accountId) {
        this.solde = solde;
        this.accountId = accountId;
    }
    public void deposit(double amount) {
        solde += amount;
        Historique =Historique + '\n' + " deposit : "+ amount;
        System.out.println("Deposited " + amount + ". New solde: $" + solde);
    }

    public void withdraw(double amount) {
        if (amount <= solde) {
            solde -= amount;
            Historique =Historique + '\n' + " withdrow : "+ amount;
            System.out.println("Withdrew " + amount + ". New solde: $" + solde);
        } else {
            System.out.println("Insufficient solde!");
        }
    }

    public void displayTransactions() {
        System.out.println("Transaction history for Account " + '\n' + Historique);
    }


    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountId() {
        return accountId;
    }
}

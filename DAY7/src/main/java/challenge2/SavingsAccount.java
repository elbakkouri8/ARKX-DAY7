package challenge2;

public class SavingsAccount extends BankAccount{

    private double interestRate;


    public SavingsAccount(double solde, String accountId,double interestRate) {
        super(solde, accountId);
        this.interestRate=interestRate;
    }

    public void activeInteret() {
        double interet = getSolde() * interestRate;
        deposit(interet);
        System.out.println("Interet applique : " + interet  );

    }

}

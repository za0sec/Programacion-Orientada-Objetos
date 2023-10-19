package Tps.Tp6.Ej4;

public class CheckingAccount extends BankAccount {


    @Override
    protected boolean canExtract(double num) {
        return true;
    }

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    public CheckingAccount(int id) {
        super(id);
    }

}

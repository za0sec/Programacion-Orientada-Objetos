package Tps.Tp3.Ej7;

public class CheckingAccount extends BankAccount{


    @Override
    protected boolean canExtract(double num) {


    }

    public CheckingAccount(Integer id, Integer balance) {
        super(id, balance);
    }
}

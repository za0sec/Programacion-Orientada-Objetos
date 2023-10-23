package Tps.Tp7.Ej8;

import java.util.HashMap;
import java.util.Map;

public class CheckingAccount extends BankAccount {

    @Override
    protected boolean canExtract(double num) {
        return true;
    }

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }


}

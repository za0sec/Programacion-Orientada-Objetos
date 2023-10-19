package Tps.Tp6.Ej4;

import java.util.ArrayList;
import java.util.List;

public class Bank{

    private List<BankAccount> accounts = new ArrayList<>();


    public void addAccount(BankAccount c){
        accounts.add(c);
    }
    public void removeAccount(BankAccount c){
        accounts.remove(c);
    }

    public int accountSize(){
        return accounts.size();
    }

    public Double totalAmount(){
        double count = 0;
        for (BankAccount c:accounts) {
            count += c.getBalance();
        }
        return count;
    }



}

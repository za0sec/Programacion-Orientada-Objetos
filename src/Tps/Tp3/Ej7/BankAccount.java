package Tps.Tp3.Ej7;

public abstract class BankAccount {

    private int id;
    private double balance;
    public void extract(double num){
        if (canExtract(num)){
            balance -= num;
        }else{
            System.out.println("No hay fondos");
        }
    }

    protected abstract boolean canExtract(double num);

    public BankAccount(Integer id, Integer balance) {
        this.id = id;
        this.balance = balance;
    }

    public Integer getBalance() {
        return balance;
    }

    public Integer getId() {
        return id;
    }



}

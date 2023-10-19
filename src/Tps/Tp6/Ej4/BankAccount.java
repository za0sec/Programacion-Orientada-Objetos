package Tps.Tp6.Ej4;

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
    public void deposit(double num){
        balance += num;
    }

    protected abstract boolean canExtract(double num);

    public BankAccount(Integer id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public BankAccount(int id) {
        this.id = id;
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cuenta %d con saldo %f".formatted(this.id, this.balance);
    }
}

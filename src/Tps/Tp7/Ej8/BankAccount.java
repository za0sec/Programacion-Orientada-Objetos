package Tps.Tp7.Ej8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BankAccount {

    private final List<Movements> movements = new ArrayList<>();
    private int id;
    private double balance;
    public void extract(double num){
        if (canExtract(num)){
            balance -= num;
            movements.add(new Movements(num, "Extraction"));
        }else{
            System.out.println("No hay fondos");
        }
    }
    protected double extract(Movements movement) {
        if(!canExtract(movement.getBalance())) {
            throw new IllegalArgumentException("No cuenta con los fondos necesarios");
        }
        movements.add(movement);
        return balance -= movement.getBalance();
    }

    public void deposit(double num){
        balance += num;
        movements.add(new Movements(num, "Deposit"));

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

    public void showMovements(){
        System.out.println(String.format("Movements for Account %d", id));
        for(Movements move: movements){
            System.out.println(move);
        }
    }

    @Override
    public String toString() {
        return "Cuenta %d con saldo %f".formatted(this.id, this.balance);
    }
}

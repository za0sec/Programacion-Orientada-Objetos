package Tps.Tp6.Ej4;

public class BankAccountTester {

    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount c1 = new CheckingAccount(1234, 0);
        BankAccount c2 = new CheckingAccount(3462, 0);
        bank.addAccount(c1);
        bank.addAccount(c2);
        System.out.println(bank.accountSize());
        System.out.println(bank.totalAmount());
        c1.deposit(100);
        c2.deposit(200);
        bank.removeAccount(c2);
        System.out.println(bank.accountSize());
        System.out.println(bank.totalAmount());


    }

}



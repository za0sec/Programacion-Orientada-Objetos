package Parciales.P1.P_2022_02.Ej3;

import java.time.LocalDate;

public class Loan {
    private Reciever rec;
    private double amount;
    private LocalDate dateIssue;
    private int statements;

    private int currentStatements;

    public Loan(Reciever rec, double amount, int statements, LocalDate dateIssue){
        this.rec = rec;
        if (rec.getAmount() < amount || rec.getMaxStatement() < statements){
            throw new LoanException("Invalid Loan.");
        }
        this.amount = amount;
        this.dateIssue = dateIssue;
        this.statements = statements;
        this.currentStatements = statements;
    }

    public void pay(int statementPaid, LocalDate date){
        if (dateIssue.isAfter(date) || statementPaid <= 0){
            throw new LoanException("Cannot pay.");
        }
        currentStatements--;
        System.out.println("Paying quota " + statementPaid + " on date " + date);
    }

    @Override
    public String toString(){
        return String.format("%s Loan of %.2f. Remaining quota: %d.", rec.getName(), amount, currentStatements);
    }

}

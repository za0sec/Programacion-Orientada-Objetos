package Parciales.P1.P_2022_02.Ej3;

import java.time.LocalDate;

public class LoanLastStatement extends Loan{

    private int lastStatement = 0;

    public LoanLastStatement(Reciever rec, double amount, int statements, LocalDate dateIssue){
        super(rec, amount, statements, dateIssue);
    }

    @Override
    public void pay(int statementPaid, LocalDate date){
        if (lastStatement+1 != statementPaid){
            throw new LoanException("Cannot pay.");
        }
        super.pay(statementPaid, date);
        lastStatement++;
    }

    @Override
    public String toString(){
        return super.toString() + String.format(" Last quota: %d.", lastStatement);
    }

}

package Parciales.P1.P_2022_02.Ej3;

import Talleres.T1.Ej1.Date;

import java.time.LocalDate;

public class DateStatement extends LoanLastStatement{

    private LocalDate actualPaymentDate;

    public DateStatement(Reciever rec, double amount, int statements, LocalDate dateIssue){
        super(rec, amount, statements, dateIssue);
        this.actualPaymentDate = dateIssue;
    }

    @Override
    public void pay(int statementPaid, LocalDate date){
        if (date.isBefore(actualPaymentDate)){
            throw new LoanException("Cannot pay.");
        }
        super.pay(statementPaid, date);
        actualPaymentDate = date;
    }

    @Override
    public String toString(){
        return super.toString() + String.format(" Next PayDate: After %s.", actualPaymentDate);
    }

}

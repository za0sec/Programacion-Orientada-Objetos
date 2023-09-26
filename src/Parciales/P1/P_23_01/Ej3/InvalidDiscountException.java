package Parciales.P1.P_23_01.Ej3;

public class InvalidDiscountException extends RuntimeException{


    private static final String MESSAGE = "Invalid Discount for Brand %s";

    public InvalidDiscountException(String name){
        super(String.format(MESSAGE, name));
    }

}

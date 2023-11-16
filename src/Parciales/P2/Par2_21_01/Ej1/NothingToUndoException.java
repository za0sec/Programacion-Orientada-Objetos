package Parciales.P2.Par2_21_01.Ej1;

public class NothingToUndoException extends RuntimeException{

    public static final String msg = "Nothing to undo";

    public NothingToUndoException(){
        super(msg);
    }

}

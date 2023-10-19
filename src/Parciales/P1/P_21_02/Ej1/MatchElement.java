package Parciales.P1.P_21_02.Ej1;

import java.util.function.Predicate;

public class MatchElement<T>{

    private Predicate<T> pred;
    private T[] v;
    private int idx;
    public MatchElement(T[] v, Predicate<T> pred, int idx){
        this.pred = pred;
        this.v = v;
        this.idx = idx;
    }

    @Override
    public String toString(){
        return String.format("### %s : %s ###", v[idx], matches() ? "MATCH" : "NO MATCH");
    }

    public boolean matches(){
        return (pred.test(v[idx]));
    }



}

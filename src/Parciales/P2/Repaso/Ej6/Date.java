package Parciales.P2.Repaso.Ej6;

import java.util.Objects;

public class Date {

    private String date;
    private int read;
    private int write;

    public Date(String date){
        this.date = date;
        this.read = 1;
        this.write = 1;
    }

    //preguntar si esta implementacion de un get tiene sentido ya que hago un getter y un setter todo en el mismo
    public void sumRead() {
        read++;
    }
    public void sumWrite(){
        write++;
    }

    public int getRead(){
        return read;
    }

    public int getWrite() {
        return write;
    }

    @Override
    public boolean equals(Object o) {
        return this == o || (o instanceof Date that) && that.date.equals(date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date);
    }
}

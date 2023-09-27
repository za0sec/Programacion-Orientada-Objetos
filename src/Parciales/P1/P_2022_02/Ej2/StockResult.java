package Parciales.P1.P_2022_02.Ej2;

import java.util.Objects;

public class StockResult {

    private String name;
    private int amount;

    public StockResult(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public Integer getAmount(){
        return amount;
    }

    private boolean status = false;

    public void changeStatus(boolean status){
        this.status = status;
    }
    @Override
    public String toString(){
        return String.format("Product %s has %d units <> %s", name, amount,status ? "LOW STOCK" : "STOCK OK");
    }

    @Override
    public boolean equals(Object o) {
        return this == o || (o instanceof StockResult that) && that.status==status && that.name==name && that.amount==amount;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void reduce(){
        if (amount != 0)
            amount--;
    }


    public String getName(){
        return name;
    }
}

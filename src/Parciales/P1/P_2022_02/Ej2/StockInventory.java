package Parciales.P1.P_2022_02.Ej2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class StockInventory implements Iterable<StockResult>{

    private StockResult[] myStock = new StockResult[MAX_INDEX];
    private int index;
    private Predicate<Integer> pred;
    private static final int MAX_INDEX = 5;

    public StockInventory(){
        this.pred = new Predicate<Integer>() {
            @Override
            public boolean test(Integer stock) {
                return stock <= 1;
            }
        };
    }


    public void add(String name, int amount){
        if (amount < 0){
            throw new IllegalArgumentException("Stock cannot be negative");
        }
        if (myStock.length == index){
            resize();
        }

        myStock[index++] = new StockResult(name, amount);
    }


    private void resize(){
        myStock = Arrays.copyOf(myStock, myStock.length + MAX_INDEX);
    }


    public void setMinimumStock(Predicate<Integer> pred){
        this.pred = pred;
    }

    public void reduceStock(String name){
        for (int i=0; i<index; i++){
            if (myStock[i].getName().equals(name)){
                if (myStock[i].getAmount() == 0){
                    throw new IllegalArgumentException("No stock to reduce");
                }
                myStock[i].reduce();
                return;
            }
        }
        throw new IllegalArgumentException("No product found with name " + name);
    }

    @Override
    public Iterator<StockResult> iterator() {
        return new Iterator<>() {
            private int idx = 0;
            private Predicate<Integer> myPred = pred;
            @Override
            public boolean hasNext() {
                return idx < index;
            }

            @Override
            public StockResult next() {
                if (!hasNext()){
                    throw new NoSuchElementException();
                }
                myStock[idx].changeStatus(myPred.test(myStock[idx].getAmount()));
                return myStock[idx++];
            }
        };
    }




}

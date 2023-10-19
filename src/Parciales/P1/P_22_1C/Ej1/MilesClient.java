package Parciales.P1.P_22_1C.Ej1;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class MilesClient implements Iterable<String>{

    private String name;
    private int months;
    private MilePlans plan;

    public MilesClient(String name, int months, MilePlans plan){
        this.name = name;
        this.months = months;
        this.plan = plan;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>(){
            int month = 0;
            @Override
            public boolean hasNext(){
                return month < months;
            }
            @Override
            public String next(){
                if (!hasNext()){
                    throw new NoSuchElementException();
                }
                return String.format("Client %s Month %d earned %d miles for %.2f", name, ++month, plan.getMiles(month), plan.getCost());
            }
        };
    }
}

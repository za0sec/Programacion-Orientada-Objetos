package Parciales.P1.P_22_1C.Ej1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MilesClient implements Iterable<String>{
    private final String name;
    private final int months;
    private final PlanMiles plan;
    public MilesClient(String name, int months, PlanMiles plan) {
        this.name = name;
        this.months = months;
        this.plan = plan;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            private int currentMonth = 1;
            @Override
            public boolean hasNext() {
                return currentMonth <= months;
            }

            @Override
            public String next() {
                if (!hasNext()){
                    throw new NoSuchElementException();
                }
                String ret = String.format("Client %s: Month %d earned %d miles for $%.2f", name, months, plan.getMiles(currentMonth), plan.getCost());
                currentMonth++;
                return ret;
            }
        };
    }
}

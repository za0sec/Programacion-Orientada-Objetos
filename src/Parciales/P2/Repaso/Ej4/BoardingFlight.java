package Parciales.P2.Repaso.Ej4;

import java.util.*;

public abstract class BoardingFlight {

    private final Set<Passenger> passengerSet; //TODO BIEN PERO PORQUE ES UN SET??????????? YO HABIA USADO UN TREEMAP(INNECESARIO TAL VEZ)

    public BoardingFlight(Comparator<Passenger> passengerComparator) {
        passengerSet = new TreeSet<>(passengerComparator);
    }

    public void addForBoarding(String name, int seatRow, PassengerCategory category) {
        passengerSet.add(new Passenger(name, seatRow, category));
    }

    public Iterator<String> boardingCallIterator() {
        return new Iterator<>() {
            private final Iterator<Passenger> it = passengerSet.iterator();

            @Override
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override
            public String next() {
                if(!hasNext()) {
                    throw new NoSuchElementException();
                }
                return it.next().getName();
            }
        };
    }

}


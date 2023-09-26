package Parciales.P1.P_22_1C.Ej3;

import java.time.LocalDate;

public class UnlimitedPass implements CityPass{

    private final LocalDate date;
    private final Attraction[] attractions;
    private final String name;
    private int visits;
    public UnlimitedPass(Attraction[] attractions, String name, LocalDate date){
        this.name = name;
        this.attractions = attractions;
        this.date = date;
    }

    @Override
    public void visit(Attraction attraction, LocalDate date) {
        if (allowedVisit(attraction, date)){
            System.out.printf("%s visited %s%n", name, attraction);
            visits++;
        }else{
            throw new CannotVisitAttractionException(attraction);
        }
    }

    @Override
    public String toString() {
        return String.format("CityPass for %s used for %d attractions", name, visits);
    }

    @Override
    public Attraction[] getAttractions() {
        return attractions;
    }

    protected boolean allowedVisit(Attraction attraction, LocalDate date){
        return belongsIn(attraction) && !date.isBefore(this.date);
    }


}

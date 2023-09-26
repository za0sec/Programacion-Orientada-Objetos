package Parciales.P1.P_22_1C.Ej3;

import java.time.LocalDate;

public class LimitedPass extends UnlimitedPass{
    private final int limitAttractions;
    private int actualLimit;
    public LimitedPass(Attraction[] attractions, String name, LocalDate date, int limitAttractions) {
        super(attractions, name, date);
        this.limitAttractions = limitAttractions;
        this.actualLimit = 0;
    }

    @Override
    public void visit(Attraction attraction, LocalDate date) {
        if (actualLimit < limitAttractions){
            super.visit(attraction, date);
            actualLimit++;
        }else{
            throw new CannotVisitAttractionException(attraction);
        }
    }



}

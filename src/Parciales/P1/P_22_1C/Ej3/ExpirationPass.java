package Parciales.P1.P_22_1C.Ej3;

import java.time.LocalDate;

public class ExpirationPass extends UnlimitedPass{
    private final LocalDate expireDate;
    public ExpirationPass(Attraction[] attractions, String name, LocalDate date, LocalDate expireDate) {
        super(attractions, name, date);
        this.expireDate = expireDate;
    }

    @Override
    public void visit(Attraction attraction, LocalDate date) {
        if (expireDate.isBefore(date)) {
            throw new CannotVisitAttractionException(attraction);
        }else {
            super.visit(attraction, date);
        }
    }

}

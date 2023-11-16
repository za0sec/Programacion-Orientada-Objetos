package Parciales.P2.Par2_22_01.Ej1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public interface MysteryCollection<String> extends List<String> {

    Map<String, Integer> toBag(Predicate<String> pred);

    default Map<String, Integer> toBag(){
        return toBag(e -> true);
    }


}
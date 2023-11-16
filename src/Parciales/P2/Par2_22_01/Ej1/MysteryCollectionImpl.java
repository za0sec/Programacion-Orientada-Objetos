package Parciales.P2.Par2_22_01.Ej1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class MysteryCollectionImpl<String> extends ArrayList<String> implements MysteryCollection<String>{
    @Override
    public Map<String, Integer> toBag(Predicate<String> pred) {
        Map<String, Integer> ret = new HashMap<>();
        int len = this.toArray().length;
        for (int i = 0; i < this.toArray().length; i++) {
            if (pred.test(this.get(i))) {
                ret.put(this.get(i), i);
            }
        }
        return ret;
    }
}

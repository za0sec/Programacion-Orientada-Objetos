package Tps.Tp6.Ej5;

import java.util.ArrayList;
import java.util.List;

public class CompositeFunction implements Function {

    private List<Function> fArray = new ArrayList<>();

    public void addFunction(Function f){
        fArray.add(f);
    }
    @Override
    public double evaluate(double x){
        if (fArray.isEmpty()){
            throw new IllegalStateException();
        }
        for (Function f : fArray) {
            x = f.evaluate(x);
        }
        return x;
    }

}



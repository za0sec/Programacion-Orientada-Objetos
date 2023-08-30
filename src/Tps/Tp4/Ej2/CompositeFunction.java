package Tps.Tp4.Ej2;

public class CompositeFunction implements Function {

    private Function fun1, fun2;

    public CompositeFunction(Function fun1, Function fun2) {
        this.fun1 = fun1;
        this.fun2 = fun2;
    }

    @Override
    public double evaluate(double x){
        return fun2.evaluate(fun1.evaluate(x));
    }

}



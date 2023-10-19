package Tps.Tp6.Ej5;


public class FunctionTester {

    public static void main(String[] args) {
        // armamos la funcion (2x)^2 como la composicion de 2x con x^2
        CompositeFunction f1 = new CompositeFunction();
        f1.addFunction(new LinearFunction(2, 0));            // y = 2x
        f1.addFunction(new QuadraticFunction(1, 0, 0));      // y = x^2
        System.out.println(f1.evaluate(1));                  // 4
        System.out.println(f1.evaluate(2));                  // 16
        // armamos la funcion 3 * sin(2x) componiendo 2*x con sin(x) y con 3*x
        CompositeFunction f2 = new CompositeFunction();
        f2.addFunction(new LinearFunction(2, 0));            // y = 2*x
        f2.addFunction(new SineFunction());                  // y = sin(x)
        f2.addFunction(new LinearFunction(3, 0));            // y = 3*x
        System.out.println(f2.evaluate(0));                  // 0
        System.out.println(f2.evaluate(Math.PI / 4));        // 3
        // si no especificamos ninguna funcion, se lanza una excepcion.
        CompositeFunction f3 = new CompositeFunction();
        System.out.println(f3.evaluate(1));                  // IllegalStateException
    }


}


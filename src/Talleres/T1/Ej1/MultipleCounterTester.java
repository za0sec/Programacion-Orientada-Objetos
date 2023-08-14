package Talleres.T1.Ej1;

public class MultipleCounterTester {

    public static void main(String[] args) {
        Counter c = new Counter();
        System.out.println(c.getCount()); // Imprime 0
        c.increment(); // Aumenta en 1
        c.increment(); // Aumenta en 1
        c.increment();
        c.increment();
        System.out.println(c.getCount()); // Imprime 2
        c.decrement(); // Disminuye en 1
        System.out.println(c.getCount()); // Imprime 1

        Counter mc = new MultipleCounter(2);
        System.out.println(mc.getCount());// Imprime 0
        mc.increment(); // Aumenta en 2
        System.out.println(mc.getCount()); // Imprime 2
        mc.decrement(); // Disminuye en 2
        System.out.println(mc.getCount()); // Imprime 0
    }

}
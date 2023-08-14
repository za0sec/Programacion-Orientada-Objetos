package Talleres.T1.Ej1;

public class MultipleCounter extends Counter {

    private int times;

    public MultipleCounter(int times){
        this.times = times;

    }


    public void increment() {
        int aux = times;
        while(aux-- > 0){
            super.increment();
        }
    }

    public void decrement() {
        int aux = times;
        while(aux-- > 0){
            super.decrement();
        }
    }
}

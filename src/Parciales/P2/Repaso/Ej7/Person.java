package Parciales.P2.Repaso.Ej7;

public class Person {

    private String name;
    private Condition cond; // Podria hacerlo public para no tener un getter y setter? porque lo he visto en soluciones.

    public Person(String name, Condition cond){
        this.name = name;
        this.cond = cond;
    }

    public Condition getCond() {
        return cond;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
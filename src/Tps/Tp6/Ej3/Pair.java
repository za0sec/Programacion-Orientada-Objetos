package Tps.Tp6.Ej3;
public class Pair<E> {
    private final E left, right;
    Pair(E left, E right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public String toString() {
        return String.format("# %s + %s #", left, right);
    }
}



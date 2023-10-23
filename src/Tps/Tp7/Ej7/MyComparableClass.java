package Tps.Tp7.Ej7;

public class MyComparableClass implements Comparable<MyComparableClass> {

    private String letter;
    public String sortableIdentifier;

    public MyComparableClass(String letter){
        this.letter = letter;
    }



   public String getLetter(){
        return letter;
   }

    @Override
    public int compareTo(MyComparableClass o) {
        int cmp = sortableIdentifier.compareTo(o.sortableIdentifier);

        if (cmp != 0) {
            return cmp;
        }
        return cmp = letter.compareTo(o.letter);
    }

    @Override
    public String toString() {
        return String.format("%s - (%s)", letter, sortableIdentifier);
    }
}

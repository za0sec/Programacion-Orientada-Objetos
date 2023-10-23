package Tps.Tp7.Ej4;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ranker {

    private final Set<RankedOrder> rank = new TreeSet<>();

    public Ranker add(Genre genre, Book book){
        rank.add(new RankedOrder(book, genre));
        return this;
    }

    public void rateUp(Book book){
        boolean found = false;
        Iterator<RankedOrder> it = rank.iterator();
        while(it.hasNext() && !found){
            RankedOrder rankedOrder = it.next();
            if (rankedOrder.getBook().equals(book)){
                found = true;
                it.remove();
                rank.add(new RankedOrder(rankedOrder));
            }
        }
        if (!found){
            rank.add(new RankedOrder(book));
        }
    }



    public void printRanking(Genre genre) {
        System.out.println("Ranking of " + genre);
        for(RankedOrder rankedBook : rank) {
            if(genre.equals(rankedBook.getGenre())) {
                System.out.println(rankedBook);
            }
        }
    }



    public void printRanking() {
        System.out.println("General Ranking");
        for(RankedOrder rankedOrder : rank) {
            System.out.println(rankedOrder);
        }

    }



}
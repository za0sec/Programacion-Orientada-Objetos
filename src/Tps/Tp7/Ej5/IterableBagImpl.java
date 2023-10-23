package Tps.Tp7.Ej5;

import java.util.*;//PREGUNTAR

public class IterableBagImpl<E> implements IterableBag<E>{


    private Map<E, Integer> myBag = new HashMap<>();
    private int count = 0;

    @Override
    public Iterable<E> elements() {
        List<E> elements = new ArrayList<>();
        for(Map.Entry<E, Integer> entry:myBag.entrySet()){
            for (int i=1; i<=entry.getValue(); i++){
                elements.add(entry.getKey());
            }
        }

        Collections.sort(elements, Collections.reverseOrder());

        return elements;
    }

    @Override
    public Iterable<E> elementsDistinct() {
        List<E> elements = new ArrayList<>();
        for(Map.Entry<E, Integer> entry:myBag.entrySet()){
                elements.add(entry.getKey());
        }
        Collections.sort(elements, Collections.reverseOrder());

        return elements;

    }

    @Override
    public void add(E elem) {
        myBag.putIfAbsent(elem, 0);
        myBag.put(elem, myBag.get(elem)+1);
        count++;
    }

    @Override
    public void remove(E elem) {
        if (!myBag.containsKey(elem)){
            throw new NoSuchElementException();
        }
        if (myBag.get(elem) > 1){
            myBag.remove(elem, myBag.get(elem)-1);
        }else{
            myBag.remove(elem);
        }

    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public int sizeDistinct() {
        return myBag.size();
    }

    @Override
    public boolean contains(E s) {
        return myBag.containsKey(s);
    }

    @Override
    public int count(E s) {
        return myBag.get(s);
    }
}

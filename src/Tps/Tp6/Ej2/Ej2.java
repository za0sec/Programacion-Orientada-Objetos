package Tps.Tp6.Ej2;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Ej2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(11);


        list.removeIf(i -> i % 2 == 0);

        System.out.println(list);
    }
}

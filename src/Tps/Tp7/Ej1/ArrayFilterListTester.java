package Tps.Tp7.Ej1;

import java.util.Arrays;
import java.util.List;

public class ArrayFilterListTester {

    public static void main(String[] args) {

        ArrayFilterList<Integer> myList = new ArrayFilterList<>();
        myList.add(1);
        myList.add(3);
        myList.add(5);
        myList.add(2);
        myList.add(6);
        myList.add(8);
        myList.add(12);
        myList.add(95);
        Criteria<Integer> myCriteria = (o) -> o % 2 == 0;
        System.out.println(myList.filter(myCriteria));
    }

}

package Parciales.P1.P_21_02.Ej2;

public class AscendingAgeDirectory extends Directory {

    public AscendingAgeDirectory(int limit) {
        super(limit);
    }

    @Override
    public Person[] persons() {
        return persons((o1, o2) -> {
            int ageCmp = Integer.compare(o1.getAge(), o2.getAge());
            if(ageCmp == 0) {
                return o1.getName().compareTo(o2.getName());
            }
            return ageCmp;
        });
    }

}


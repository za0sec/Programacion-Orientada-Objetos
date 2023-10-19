package Tps.Tp6.Ej10;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "%s # %d".formatted(name, age);
    }

    @Override
    public boolean equals(Object o) {
        return this == o || (o instanceof Person person &&
                name.equals(person.name) && age == person.age);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


}


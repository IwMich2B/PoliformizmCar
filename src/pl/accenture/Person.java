package pl.accenture;

import java.util.Objects;

public class Person {
    String name;
    String pesel;
    double age;
    String hair;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pesel='" + pesel + '\'' +
                ", age=" + age +
                ", hair='" + hair + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Double.compare(person.age, age) == 0 &&
                name.equals(person.name) &&
                pesel.equals(person.pesel) &&
                hair.equals(person.hair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pesel, age, hair);
    }
}

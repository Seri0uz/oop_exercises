package ch.hslu.sw07;

import java.util.Comparator;

public class ComparePerson implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        int compare = person1.getSurname().compareTo(person2.getSurname());
        if (compare == 0) {
           compare = person1.getName().compareTo(person2.getName());
        }
        return compare;

    }
}

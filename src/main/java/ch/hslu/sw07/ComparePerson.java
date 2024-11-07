package ch.hslu.sw07;

import java.util.Comparator;

public class ComparePerson implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        int surnameComp = person1.getSurname().compareTo(person2.getSurname());
        if (surnameComp != 0) {
            return surnameComp;
        }
        return person1.getName().compareTo(person2.getName());
    }
}

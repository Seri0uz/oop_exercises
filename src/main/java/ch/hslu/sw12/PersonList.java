package ch.hslu.sw12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonList {
    private final List<Person> persons = new ArrayList<>();
    private final Comparator<Person> nameComp = (p1, p2) -> p1.getName().compareTo(p2.getName());
    private final Comparator<Person> surnameComp = (p1, p2) -> p1.getSurname().compareTo(p2.getSurname());

    public void addPerson(Person person) {
        persons.add(person);
        sortPersons();
    }

    public void sortPersons() {
        persons.sort(nameComp.thenComparing(surnameComp));
    }

    public Person getPerson(int index) {
        return persons.get(index);
    }

    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Person person = new Person(1, "Samuel", "Duss", 27, "male");
        Person person2 = new Person(2, "Michael", "Duss", 27, "male");
        personList.addPerson(person);
        personList.addPerson(person2);
    }
}

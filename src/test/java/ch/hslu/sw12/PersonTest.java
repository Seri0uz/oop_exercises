package ch.hslu.sw12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void addSortedPerson() {
        PersonList personList = new PersonList();
        Person person1 = new Person(1,"Müller","Hans",41,"male");
        Person person2 = new Person(2,"Müller","Peter",44,"male");
        Person person3 = new Person(3,"Müller","Anna",45,"female");
        personList.addPerson(person1);
        personList.addPerson(person2);
        personList.addPerson(person3);
        assertEquals(personList.getPerson(0),person3);
        assertEquals(personList.getPerson(1),person1);
    }

}
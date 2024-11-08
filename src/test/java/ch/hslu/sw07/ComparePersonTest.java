package ch.hslu.sw07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparePersonTest {

    @Test
    void compareSameName() {
        ComparePerson comparePerson = new ComparePerson();
        Person person1 = new Person(1, "Hans", "Meier", 20, "Male");
        Person person2 = new Person(4, "Hans", "Meier", 20, "Male");
        assertEquals(0, comparePerson.compare(person1, person2));
    }

    @Test
    void compareDifferentSurnameFalseSorted() {
        ComparePerson comparePerson = new ComparePerson();
        Person person1 = new Person(1, "Hans", "Zimmer", 20, "Male");
        Person person2 = new Person(4, "Peter", "Meier", 20, "Male");
        assertTrue(comparePerson.compare(person1, person2) >= 1);
    }

    @Test
    void compareDifferentSurnameSorted() {
        ComparePerson comparePerson = new ComparePerson();
        Person person1 = new Person(1, "Hans", "Meier", 20, "Male");
        Person person2 = new Person(4, "Peter", "Zimmer", 20, "Male");
        assertTrue(comparePerson.compare(person1, person2) <= -1);
    }

    @Test
    void compareDifferentNameFalseSorted(){
        ComparePerson comparePerson = new ComparePerson();
        Person person1 = new Person(1, "Peter", "Meier", 20, "Male");
        Person person2 = new Person(4, "Hans", "Meier", 20, "Male");
        assertTrue(comparePerson.compare(person1, person2) >= 1);

    }

    @Test
    void compareDifferentNameSorted(){
        ComparePerson comparePerson = new ComparePerson();
        Person person1 = new Person(1, "Hans", "Meier", 20, "Male");
        Person person2 = new Person(4, "Peter", "Meier", 20, "Male");
        assertTrue(comparePerson.compare(person1, person2) <= -1);
    }
}
package ch.hslu.sw07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import nl.jqno.equalsverifier.*;


class PersonTest {
    @Test
    void testConstructor() {
        long id = 1;
        String name = "Samuel";
        String surname = "Duss";
        int age = 20;
        String gender = "Male";
        Person person = new Person(id, name, surname, age, gender);
        assertEquals(id, person.getId());
        assertEquals(name, person.getName());
        assertEquals(surname, person.getSurname());
        assertEquals(age, person.getAge());
        assertEquals(gender, person.getGender());
    }

    @Test
    void equalsContract() {
        EqualsVerifier.forClass(Person.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    void equalPersonTrue(){
        Person person1 = new Person(1, "Hans", "Meier", 20, "Male");
        assertEquals(person1, person1);
    }

    @Test
    void equalPersonFalse(){
        Person person1 = new Person(1, "Hans", "Meier", 20, "Male");
        Person person2 = new Person(2, "Peter", "Meier", 20, "Male");
        assertNotEquals(person1, person2);
    }

    @Test
    void hashEqualPersonTrue(){
        Person person1 = new Person(1, "Hans", "Meier", 20, "Male");
        Person person2 = new Person(1, "Hans", "Meier", 20, "Male");
        assertEquals(person1.hashCode(), person2.hashCode());
    }

    @Test
    void hashEqualPersonFalse(){
        Person person1 = new Person(1, "Hans", "Meier", 20, "Male");
        Person person2 = new Person(2, "Peter", "Meier", 20, "Male");
        assertNotEquals(person1.hashCode(), person2.hashCode());
    }

    @Test
    void compareSameID() {
        Person person1 = new Person(1, "Hans", "Meier", 20, "Male");
        Person person2 = new Person(1, "Hans", "Meier", 20, "Male");
        assertEquals(0, person1.compareTo(person2));
    }

    @Test
    void compareDifferentIDFirstLarger() {
        Person person1 = new Person(4, "Hans", "Meier", 20, "Male");
        Person person2 = new Person(2, "Peter", "Meier", 20, "Male");
        assertTrue(person1.compareTo(person2) >=1);
    }

    @Test
    void compareDifferentIDSecondLarger() {
        Person person1 = new Person(1, "Hans", "Meier", 20, "Male");
        Person person2 = new Person(4, "Peter", "Meier", 20, "Male");
        assertTrue(person1.compareTo(person2) <=-1);
    }

}
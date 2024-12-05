package ch.hslu.sw12;

import java.util.*;

public class Person implements Comparable<Person> {
    private final long id;
    private String name;
    private String surname;
    private int age;
    private String gender;

    public Person(long id, String name, String surname, int age, String gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gibt Attribute von der Person (ID, Vorname, Nachname, Alter, Geschlecht) zurück.
     * @return eine String Rückgabe der Attribute einer Person
     */
    @Override
    public String toString() {
        return id + " " + name + " " + surname + " " + age + " " + gender;
    }

    /**
     * Equals, wenn ID, Name, Nachname, Alter und Geschlecht gleich ist.
     * @param object
     * @return
     */
    @Override
    public final boolean equals(Object object) {
        if (this == object) return true;
        return (object instanceof Person person)
                && (person.id == this.id)
                && (Objects.equals(person.name, this.name))
                && (Objects.equals(person.surname, this.surname))
                && (age == person.age)
                && (Objects.equals(person.gender, this.gender));
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.id, this.name, this.surname, this.age, this.gender);
    }

    @Override
    public int compareTo(Person person) {
        return Long.compare(this.id, person.id);
    }
}

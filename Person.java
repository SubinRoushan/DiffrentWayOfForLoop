package org.example;

public class Person {
    private String firstname;
    private String lastname;
    private int number;

    public Person(String firstname, String lastname, int number) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.number = number;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getNumber() {
        return number;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", number=" + number +
                '}';
    }
}

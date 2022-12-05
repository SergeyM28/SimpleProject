package ru.gb.oseminar.data;

public abstract class User {
    private String firstName;
    private String lastName;
    private String patronomyc;

    public User(String firstName, String lastName, String patronomyc) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronomyc = patronomyc;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronomyc() {
        return patronomyc;
    }

    public void setPatronomyc(String patronomyc) {
        this.patronomyc = patronomyc;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronomyc='" + patronomyc + '\'' +
                '}';
    }
}

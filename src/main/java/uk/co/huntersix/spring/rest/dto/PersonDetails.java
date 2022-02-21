package uk.co.huntersix.spring.rest.dto;


public class PersonDetails {
    private String firstName;
    private String lastName;

    private PersonDetails() {
        // empty
    }

    public PersonDetails(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
}

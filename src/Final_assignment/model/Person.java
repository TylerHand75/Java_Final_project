package src.Final_assignment.model;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;

    public Person() {
        firstName = "Undefined";
        lastName = "Undefined";
    }

    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        validateFirstName(firstName);
        this.firstName = firstName;
    }

    private void validateFirstName(String firstName) {
        if(firstName == null || firstName.equals("")) {
            throw new IllegalArgumentException("First name is required");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        validateLastName(lastName);
        this.lastName = lastName;
    }

    private void validateLastName(String lastName) {
        if(lastName == null || lastName.equals("")) {
            throw new IllegalArgumentException("Last name is required");
        }
    }

    @Override
    public String toString() {
        String result = String.format("%s %s", firstName, lastName);
        return result;
    }

    @Override
    public int compareTo(Person other) {
        int result = this.lastName.compareTo(other.lastName);
        if(result == 0) {
            result = this.firstName.compareTo(other.firstName);
        }
        return result;
    }

}
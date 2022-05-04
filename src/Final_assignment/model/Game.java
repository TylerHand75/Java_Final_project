package src.Final_assignment.model;

import src.Final_assignment.model.Person;

public class Game implements Comparable<Game> {
    private String title;
    private Person publisher;
    private int numOfHoursToComplete;

    public Game() {
        title = "Undefined";
        publisher = new Person();
        numOfHoursToComplete = 0;
    }

    public Game(String title, Person publisher, int numOfHoursToComplete) {
        setTitle(title);
        setPublisher(publisher);
        setNumOfHoursToComplete(numOfHoursToComplete);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        validateTitle(title);
        this.title = title;
    }

    private void validateTitle(String title) {
        if(title == null || title.equals("")) {
            throw new IllegalArgumentException("The Game title is required.");
        }
    }

    public Person getPublisher() {
        return publisher;
    }

    public void setPublisher(Person publisher) {
        validatePublisher(publisher);
        this.publisher = publisher;
    }

    private void validatePublisher(Person publisher) {
        if(publisher == null) {
            throw new IllegalArgumentException("Publisher is required");
        }
    }

    public int getNumOfHoursToComplete() {
        return numOfHoursToComplete;
    }

    public void setNumOfHoursToComplete(int numOfHoursToCompete) {
        validateNumOFHoursToComplete(numOfHoursToComplete);
        this.numOfHoursToComplete = numOfHoursToComplete;
    }

    private void validateNumOFHoursToComplete(int numOfHoursToCompete) {
        if(numOfHoursToCompete < 0) {
            throw new IllegalArgumentException("Number of Hours must be 0 or greater");
        }
    }

    @Override
    public String toString() {
        return String.format("Title: %s%nPublisher: %s%n", title, publisher);
    }

    @Override
    public int compareTo(Game other) {
        int result = this.title.compareTo(other.title);
        if(result == 0) {
            result = this.publisher.compareTo(other.publisher);
        }
        return 0;
    }
}
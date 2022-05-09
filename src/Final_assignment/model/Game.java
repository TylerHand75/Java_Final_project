package src.Final_assignment.model;

import src.Final_assignment.model.Person;

public class Game implements Comparable<Game> {
    private String title;
    private Person person;
    private int numOfGamesInSeries;

    public Game() {
        title = "Undefined";
        
        person = new Person();
        numOfGamesInSeries = 0;
    }

    public Game(String title, Person person, int numOfGamesInSeries) {
        setTitle(title);
        setPerson(person);
        setNumOfGamesInSeries(numOfGamesInSeries);
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
    public Person getPerson(){
        return person;
    }
    public void setPerson(Person person){
        validatePerson(person);
        this.person = person;
    }
    private void validatePerson(Person person){
        if(person == null || person.equals("")) {
            throw new IllegalArgumentException("The Game type and publisher is required.");
        }
    }

    

    public int getNumOfGamesInSeries() {
        return numOfGamesInSeries;
    }

    public void setNumOfGamesInSeries(int numOfGamesInSeries) {
        validateNumOfGamesInSeries(numOfGamesInSeries);
        this.numOfGamesInSeries = numOfGamesInSeries;
    }

    private void validateNumOfGamesInSeries(int numOfGamesInSeries) {
        if(numOfGamesInSeries < 0) {
            throw new IllegalArgumentException("Number of Games in a series must be 0 or greater");
        }
    }

    @Override
    public String toString() {
        return String.format("Title: %s%nRating: %s%nGameType and Publisher %s%n", title,person);
    }

    @Override
    public int compareTo(Game other) {
        int result = this.title.compareTo(other.title);
        if(result == 0) {
            result = this.numOfGamesInSeries.compareTo(other.numOfGamesInSeries);
        }
        return 0;
    }
}
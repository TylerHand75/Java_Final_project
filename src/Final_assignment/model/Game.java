package src.Final_assignment.model;

import src.Final_assignment.model.Person;

public class Game implements Comparable<Game> {
    private String title;
    private Person fps;
    private int numOfGames;

    public Game() {
        title = "Undefined";
        fps = new Person();
        numOfGames = 0;
    }

    public Game(String title, Person Fps, int numOfGames) {
        setTitle(title);
        setFps(Fps);
        setnumOfGames(numOfGames);
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

    public Person getFps() {
        return fps;
    }

    public void setFps(Person Fps) {
        validateFps(fps);
        this.fps = fps;
    }

    private void validateFps(Person Fps) {
        if(Fps == null) {
            throw new IllegalArgumentException("Fps is required");
        }
    }

    public int getNumOfGames() {
        return numOfGames;
    }

    public void setnumOfGames(int numOfHoursToCompete) {
        validatenumOfGames(numOfGames);
        this.numOfGames = numOfGames;
    }

    private void validatenumOfGames(int numOfHoursToCompete) {
        if(numOfHoursToCompete < 0) {
            throw new IllegalArgumentException("Number of Hours must be 0 or greater");
        }
    }

    @Override
    public String toString() {
        return String.format("Title: %s%nFps: %s%n", title, fps);
    }

    @Override
    public int compareTo(Game other) {
        int result = this.title.compareTo(other.title);
        if(result == 0) {
            result = this.fps.compareTo(other.fps);
        }
        return 0;
    }
}
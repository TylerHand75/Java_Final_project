package src.Final_assignment.model;

import src.Final_assignment.model.Person;

public class Game implements Comparable<Game> {
    private String title;
    private Person fps;
    private int numOfGames;

    public Game() {
        title = "Undefined";
        numOfGames = 0;
    }

    public Game(String title, Person fps, int numOfGames) {
        setTitle(title);
        setFps(fps);
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

    public void setFps(Person fps) {
        validateFps(fps);
        this.fps = fps;
    }

    private void validateFps(Person fps) {
        if(fps == null) {
            throw new IllegalArgumentException("Fps is required");
        }
    }

    public int getNumOfGames() {
        return numOfGames;
    }

    public void setnumOfGames(int numOfGames) {
        validatenumOfGames(numOfGames);
        this.numOfGames = numOfGames;
    }

    private void validatenumOfGames(int numOfGames) {
        if(numOfGames < 0) {
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
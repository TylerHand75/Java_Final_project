package src.Final_assignment.model;

import src.Final_assignment.model.Publisher;

public class Game implements Comparable<Game> {
    private String title;
    private String genreType;
    private String publisher;
    private int numOfGamesInSeries;

    public Game() {
        title = "Undefined";
        genreType = "undefined";
        publisher = "Undefined";
        numOfGamesInSeries = 0;
    }

    public Game(String title, String genreType, String publisher, int numOfGamesInSeries) {
        setTitle(title);
        setGenreType(genreType);
        setPublisher(publisher);
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


    public String getPublisher(){
        return publisher;
    }
    public void setPublisher(String publisher){
        validatePublisher(publisher);
        this.publisher = publisher;
    }
    private void validatePublisher(String publisher){
        if(publisher == null || publisher.equals("")) {
            throw new IllegalArgumentException("The Game type and publisher is required.");
        }
    }

    public String getGenreType() {
        return genreType;
    }

    public void setGenreType(String genreType) {
        validateGenreType(genreType);
        this.genreType = genreType;
    }

    private void validateGenreType(String genreType) {
        if(genreType == null || genreType.equals("")) {
            throw new IllegalArgumentException("Genre is required");
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
        return String.format("Title: %s  \nGame Type: %s \nPublisher: %s\nNum Of Game in series: %d", title, genreType, publisher, numOfGamesInSeries);
    }

    @Override
    public int compareTo(Game other) {
        int result = this.title.compareTo(other.title);
        if(result == 0) {
            result = this.numOfGamesInSeries - other.numOfGamesInSeries;
        }
        return 0;
    }
}
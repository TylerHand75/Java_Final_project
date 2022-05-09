package src.Final_assignment.model;

public class Videogame2 extends Game {
    public String rating;

    public Videogame2() {
        super();
        rating = new String();
    }

    public Videogame2(String title, String genreType, String publisher, int numOfGamesInSeries, String rating) {
        super(title, genreType, publisher, numOfGamesInSeries);
        setRating(rating);
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        validateRating(rating);
        this.rating = rating;
    }

    private void validateRating(String rating) {
        if (rating.equals(" E ") && rating.equals(" E10+ ") && rating.equals(" T ") && rating.equals(" M ")) {
            throw new IllegalArgumentException("Rating is required. Must be E, E10+, T or M ");
        }
    }

    @Override
    public String toString() {
        return String.format("Title: %s  \nGame Type: %s \nPublisher: %s\nNum Of Game in series: %d \nRating: %s", getTitle(), getGenreType(),getPublisher(), getNumOfGamesInSeries(),rating);
    }
}

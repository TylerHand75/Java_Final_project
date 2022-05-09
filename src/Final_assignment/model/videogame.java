package src.Final_assignment.model;

public class Videogame extends Game {
    public String rating;

    public Videogame(){
        super();
        rating = new String();
    }
    public Videogame(String title, String rating, Person person, int numOfGamesInSeries){
        super(title, person, numOfGamesInSeries);
        setRating(rating);
    }
    
    public String getRaing() {
        return rating;
    }

    public void setRating(String rating) {
        validateRating(rating);
        this.rating = rating;
    }

    private void validateRating(String rating) {
        if(rating.equals(" E ") && rating.equals(" E10+ ")&& rating.equals(" T ")&& rating.equals(" M ")) {
            throw new IllegalArgumentException("Rating is required. Must be E, E10+, T or M ");
        }
    }
    @Override
    public String toString() {
        return String.format("Title: %s%nRating: %s%nGameType and Publisher %s%n", title,person);
    }
}

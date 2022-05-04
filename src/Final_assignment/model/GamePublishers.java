package src.Final_assignment.model;

public class GamePublishers extends Game {
    private Person publisher;

    public GamePublishers() {
        super();
        publisher = new Person();
    }

    public GamePublishers(String title, Person publisher, int numOfStudios, Person Publisher) {
        super(title, publisher, numOfStudios);
        setPublisher(publisher);
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
}
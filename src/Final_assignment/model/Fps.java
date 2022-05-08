package src.Final_assignment.model;

public class Fps extends Game {
    private Person fps;

    public Fps() {
        super();
        fps = new Person();
    }

    public Fps(String title, Person fps, Person person, int numOfGames) {
        super(title, fps, person, numOfGames );
        setFps(fps);
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

}
package src.Final_assignment.model;

public class Fps extends Game {
    private String fps;

    public Fps() {
        super();
        fps = new String();
    }

    public Fps(String title, String fps, Person person, int numOfGames) {
        super(title, fps, person, numOfGames );
        setFps(fps);
    }

    public String getFps() {
        return fps.toString();
    }

    public void setFps(String fps) {
        validateFps(fps);
        this.fps = fps;
    }

    private void validateFps(String fps) {
        if(fps == null) {
            throw new IllegalArgumentException("Fps is required");
        }
    }

}
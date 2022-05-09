package src.Final_assignment.model;

public class Publisher implements Comparable<Publisher> {
    private String genreType;
    private String publisherName;

    public Publisher() {
        genreType = "Undefined";
        publisherName = "Undefined";
    }

    public Publisher(String genreType, String publisherName) {
        setGenreType(genreType);
        setPublisherName(publisherName);
        this.publisherName = publisherName;
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
            throw new IllegalArgumentException("First name is required");
        }
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        validatePublisherName(publisherName);
        this.publisherName = publisherName;
    }

    private void validatePublisherName(String publisherName) {
        if(publisherName == null || publisherName.equals("")) {
            throw new IllegalArgumentException("Last name is required");
        }
    }

    @Override
    public String toString() {
        String result = String.format("%s %s", genreType, publisherName);
        return result;
    }

    @Override
    public int compareTo(Publisher other) {
        int result = this.publisherName.compareTo(other.publisherName);
        if(result == 0) {
            result = this.genreType.compareTo(other.genreType);
        }
        return result;
    }

}
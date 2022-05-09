package src.Final_assignment.model;

public class videogame extends Game {
    public String rating;
     
    public String getEForEveryone() {
        return rating;
    }

    public void setEForEveryone(String eForEveryone) {
        validateEForEveryone(rating);
        this.rating = rating;
    }

    private void validateEForEveryone(String eForEveryone) {
        if(rating == null || rating.equals("")) {
            throw new IllegalArgumentException("E for Everyone is required");
        }
    } 


    
    public String getE10() {
        return rating;
    }

    public void setE10(String e10) {
        validateE10(rating);
        this.rating = rating;
    }

    private void validateE10(String e10) {
        if(rating == null || rating.equals("")) {
            throw new IllegalArgumentException("E for Everyone is required");
        }
    }
    public String getTForTeen() {
        return rating;
    }

    public void setTForTeen(String tForTeen) {
        validateTForTeen(rating);
        this.rating = rating;
    }

    private void validateTForTeen(String tForTeen) {
        if(rating == null || rating.equals("")) {
            throw new IllegalArgumentException("T for Teen is required");
        }
    }
    
    
    public String getMForMature() {
        return rating;
    }

    public void setMForMature(String mForMature) {
        validateMForMature(rating);
        this.rating = rating;
    }

    private void validateMForMature(String mForMature) {
        if(rating == null || rating.equals("")) {
            throw new IllegalArgumentException("E for Everyone is required");
        }
    }


}

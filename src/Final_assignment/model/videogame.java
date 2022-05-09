package src.Final_assignment.model;

public class Videogame extends Game {
    public String rating;
     
    public String getEForEveryone() {
        return eForEveryone;
    }

    public void setEForEveryone(String eForEveryone) {
        validateEForEveryone(eForEveryone);
        this.eForEveryone = eForEveryone;
    }

    private void validateEForEveryone(String eForEveryone) {
        if(eForEveryone == null || eForEveryone.equals("")) {
            throw new IllegalArgumentException("E for Everyone is required");
        }
    } 


    
    public String getE10() {
        return e10;
    }

    public void setE10(String e10) {
        validateE10(e10);
        this.e10 = e10;
    }

    private void validateE10(String e10) {
        if(e10 == null || e10.equals("")) {
            throw new IllegalArgumentException("E 10+ is required");
        }
    }
    public String getTForTeen() {
        return tForTeen;
    }

    public void setTForTeen(String tForTeen) {
        validateTForTeen(tForTeen);
        this.tForTeen = tForTeen;
    }

    private void validateTForTeen(String tForTeen) {
        if(tForTeen == null || tForTeen.equals("")) {
            throw new IllegalArgumentException("T for Teen is required");
        }
    }
    
    
    public String getMForMature() {
        return rating;
    }

    public void setMForMature(String mForMature) {
        validateMForMature(mForMature);
        this.mForMature = mForMature;
    }

    private void validateMForMature(String mForMature) {
        if(mForMature == null || mForMature.equals("")) {
            throw new IllegalArgumentException("M for Mature is required");
        }
    }


}

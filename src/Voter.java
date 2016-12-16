/**
 * Created by alber on 12/13/2016.
 */
public class Voter {
    public String firstChoice;
    public String secondChoice;
    public String thirdChoice;

    public Voter(){

    }

    public Voter(String firstChoice, String secondChoice, String thirdChoice){
        this.firstChoice = firstChoice;
        this.secondChoice = secondChoice;
        this.thirdChoice = thirdChoice;
    }

    public String getThirdChoice() {
        return thirdChoice;
    }

    public void setThirdChoice(String thirdChoice) {
        this.thirdChoice = thirdChoice;
    }

    public String getSecondChoice() {
        return secondChoice;
    }

    public void setSecondChoice(String secondChoice) {
        this.secondChoice = secondChoice;
    }

    public String getFirstChoice() {
        return firstChoice;
    }

    public void setFirstChoice(String firstChoice) {
        this.firstChoice = firstChoice;
    }
}

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by alber on 12/13/2016.
 */
public class runoffElection {

    ArrayList<Voter> arr = new ArrayList<Voter>();
    Scanner scan = new Scanner(System.in);
    String firstBallot, thirdPlaceCandidate;
    double a, b, c;

    public runoffElection() {
        a = 0;
        b = 0;
        c = 0;

        createElectorate();
        createFirstPlaceVoteTotals();

        firstBallot = isMajority();

        if(firstBallot != null)
            System.out.println("On the first ballot, the winner is '" + firstBallot + "'");
        else
            System.out.println("In the runoff election, The winner is '" + doRunoff() + "'");
    }

    public void createElectorate() {
        for (int x = 1; x == 1;) {
            System.out.println("Add new voter? Enter 1 to add new voter! Enter any other "
                    + " integer to escape");

            if (Integer.parseInt(scan.nextLine()) == 1) {
                Voter v = new Voter();

                System.out.println("The Candidates are A, B, C");

                System.out.println("Who is your first choice?");
                v.setFirstChoice(scan.nextLine());

                System.out.println("Who is your second choice?");
                v.setSecondChoice(scan.nextLine());

                System.out.println("Who is your third choice?");
                v.setThirdChoice(scan.nextLine());

                arr.add(v);
            } else
                break;
        }
    }

    public String isMajority() {

        if ((a / (arr.size())) > 0.5)
            return "A";
        else if ((b / (arr.size())) > 0.5)
            return "B";
        else if ((c / (arr.size())) > 0.5)
            return "C";
        else
            return null;
    }

    public String doRunoff(){
        setThirdPlaceCandidate();

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).getFirstChoice().equals(thirdPlaceCandidate)){
                if(arr.get(i).getSecondChoice().equals("A"))
                    a++;
                else if(arr.get(i).getSecondChoice().equals("B"))
                    b++;
                else if(arr.get(i).getSecondChoice().equals("C"))
                    c++;
            }
        }

        return isMajority();
    }

    public void setThirdPlaceCandidate(){
        if(a < b && a < c) {
            thirdPlaceCandidate = "A";
        }
        else if(b < a && b < c){
            thirdPlaceCandidate = "B";
        }
        else if(c < a && c < b){
            thirdPlaceCandidate = "C";
        }
    }

    public void createFirstPlaceVoteTotals(){
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getFirstChoice().equals("A"))
                a++;
            else if (arr.get(i).getFirstChoice().equals("B"))
                b++;
            else if (arr.get(i).getFirstChoice().equals("C"))
                c++;
        }
    }
}
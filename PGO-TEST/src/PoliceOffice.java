import java.util.ArrayList;
import java.util.List;

public class PoliceOffice {
    List<Policeman> policeOffice;

    public PoliceOffice() {
        policeOffice = new ArrayList<>();
    }

    public void addPoliceman(Policeman Policeman){
        policeOffice.add(Policeman);
    }

    public int numberOfActivePolicemen(){
        int number = 0;
        boolean check = false;
        for (int i = 0; i < policeOffice.size(); i++){
            check = policeOffice.get(i).getIsActive();
            if(check){
                number++;
            }
        }
        return number;
    }

    public int numberOfPoliceman(){
        int officersNumber = 0;
        boolean check = false;
        for (int i = 0; i < policeOffice.size(); i++){
                officersNumber++;
        }
        return officersNumber;
    }
}

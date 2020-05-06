import java.util.ArrayList;
import java.util.List;

public class Policeman {
   private static int numberOfPolicemen = 0;
   private boolean isActive = false;
   private String fName,lName,login;
   private int ID;
   private String partner;
   List<Policeman> policemen;
   List<Policeman> partners1;






    public Policeman(boolean isActive, String fName, String lName, String login, int ID) {
        this.isActive = false;
        this.fName = fName;
        this.lName = lName;
        this.login = login;
        numberOfPolicemen++;
        this.ID = ID + numberOfPolicemen;
        policemen = new ArrayList<>();
    }

    public void PoliceOffice() {
        policemen = new ArrayList<>();
    }



    public boolean getIsActive() {
        return isActive;
    }


    public void addPolicemen(Policeman Policeman){
        policemen.add(Policeman);
    }

    public void removePolicemen(Policeman Policeman){
        policemen.remove(Policeman);
    }


    public void ChangeActivity(boolean isActive){
        this.isActive = isActive;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getLogin() {
        return login;
    }

    public int getID() {
        return ID;
    }


}

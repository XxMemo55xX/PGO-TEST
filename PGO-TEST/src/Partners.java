import java.util.ArrayList;
import java.util.List;

public class Partners {
    List<Policeman> partnerss;

    public Partners() {
        partnerss = new ArrayList<>();
    }

    public void addPartner(Policeman Policeman){
        partnerss.add(Policeman);
    }

    public void removePartner(Policeman Policeman){
        partnerss.remove(Policeman);
    }
}

import java.util.ArrayList;
import java.util.List;

public class Hangar {
    private int capacity;
    private List<Vehicle> vehicles= new ArrayList<>(capacity);

    public Hangar(int capacity){
        this.capacity = capacity;
    }

    public void setCapacity(int k){
        capacity = k;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getVhiclesSize(){
        return vehicles.size();
    }

}

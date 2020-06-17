public abstract class Vehicle implements StartStop {
    double tankCapacity;
    double loadingSpace;
    boolean isEngineOn;

    public Vehicle(double tankCapacity, double loadingSpace, boolean isEngineOn) {
        this.tankCapacity = tankCapacity;
        this.loadingSpace = loadingSpace;
        this.isEngineOn = isEngineOn;
    }

    @Override
    public void start() throws EngineStatusException {
        boolean engineWorkingStatus = isEngineOn();
        if(engineWorkingStatus == true){
            throw new EngineStatusException();
        }else{
            isEngineOn = true;
        }
    }

    @Override
    public void stop() throws EngineStatusException {
        boolean engineWorkingStatus = isEngineOn();
        if(engineWorkingStatus == false){
            throw new EngineStatusException();
        }else{
            isEngineOn = false;
        }
    }

    public void loadingSpace() throws LoadingSpaceException {
        double capacity = 5;
        double loadingStatus = getLoadingSpace();
        if(loadingStatus < capacity){
            throw new LoadingSpaceException();
        }else{
            System.out.println("You have some free space left!");
        }
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public double getLoadingSpace() {
        return loadingSpace;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }
}

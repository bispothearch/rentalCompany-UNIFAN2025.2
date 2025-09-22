package internal.entities;

public class Motorcycle extends Vehicle{
    private int engineCapacity;

    public Motorcycle(int ID, String Brand, String Model, String LicencePlate, int Km) {
        super(ID, Brand, Model, LicencePlate, Km);
    }

    public Motorcycle(int ID, String Brand, String Model, String LicencePlate, int Km, int engineCapacity) {
        super(ID, Brand, Model, LicencePlate, Km);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public String getEngineCapacityWithSuffix() {
        return engineCapacity + "cc";
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}

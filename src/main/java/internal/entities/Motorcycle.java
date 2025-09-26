package internal.entities;

import internal.enums.VehicleGrade;
import internal.enums.VehicleType;

public class Motorcycle extends Vehicle {
    private int engineCapacity;
    private VehicleType vehicleType = VehicleType.MOTORCYCLE;

    public Motorcycle(int ID, String Brand, String Model, String LicencePlate, VehicleGrade vehicleGrade, int Km) {
        super(ID, Brand, Model, LicencePlate, vehicleGrade, Km);
    }

    public Motorcycle(int ID, String Brand, String Model, String LicencePlate, VehicleGrade vehicleGrade, int Km,
            int engineCapacity) {
        super(ID, Brand, Model, LicencePlate, vehicleGrade, Km);
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
package internal.entities;

import internal.enums.VehicleGrade;
import internal.enums.VehicleType;

public class Car extends Vehicle{
    private String bodyStyle;
    private double engineSize;
    private VehicleType vehicleType = VehicleType.CAR;

    public Car(int ID, String Brand, String Model, String LicencePlate, VehicleGrade vehicleGrade, int Km) {
        super(ID, Brand, Model, LicencePlate,vehicleGrade, Km);
    }

    public Car(int ID, String Brand, String Model, String LicencePlate, VehicleGrade vehicleGrade, int Km, String bodyStyle, double engineSize) {
        super(ID, Brand, Model, LicencePlate,vehicleGrade, Km);
        this.bodyStyle = bodyStyle;
        this.engineSize = engineSize;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }
}
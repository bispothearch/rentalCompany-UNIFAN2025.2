package internal.entities;

public class Car extends Vehicle{
    private String bodyStyle;
    private double engineSize;

    public Car(int ID, String Brand, String Model, String LicencePlate, int Km) {
        super(ID, Brand, Model, LicencePlate, Km);
    }

    public Car(int ID, String Brand, String Model, String LicencePlate, int Km, String bodyStyle, double engineSize) {
        super(ID, Brand, Model, LicencePlate, Km);
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

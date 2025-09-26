package internal.enums;

public enum VehicleGrade {
    //Cars
    ECONOMIC(90.0, 20.0,VehicleType.CAR),
    SEDAN(130.0,25.0,VehicleType.CAR),
    SUV(180.0,35.0,VehicleType.CAR),
    PICKUP(210.0,40.0,VehicleType.CAR),
    LUX(350.0,80.0,VehicleType.CAR),

    //Motorcycles
    OVER300CC(70.0,20.0,VehicleType.MOTORCYCLE),
    BETWEEN250N500CC(135.0,30.0,VehicleType.MOTORCYCLE)
    ;

    private final Double dailyFee;
    private final Double insurance;
    private final VehicleType vehicleType;

    VehicleGrade(Double dailyFee, Double insurance, VehicleType vehicleType) {
        this.dailyFee = dailyFee;
        this.insurance = insurance;
        this.vehicleType = vehicleType;
    }

    public Double getDailyFee() {
        return this.dailyFee;
    }
    public Double getDailyLateFee() {
        return this.dailyFee * 2.25;
    }
    public Double getInsurance() {
        return this.insurance;
    }
    public VehicleType getVehicleType() {
        return this.vehicleType;
    }
}

package internal.entities;

import internal.enums.VehicleGrade;
import internal.enums.VehicleStatus;

public abstract class Vehicle {
   private final int id;
   private final String brand;
   private final String model;
   private final String licencePlate;
   private int km;
   private VehicleStatus status;

   private final VehicleGrade vehicleGrade;

   public Vehicle(int id, String brand, String model, String licencePlate, int km, VehicleGrade vehicleGrade) {
       this.id = id;
       this.brand = brand;
       this.model = model;
       this.licencePlate = licencePlate;
       this.km = km;
       this.status = VehicleStatus.AVAILABLE;
       this.vehicleGrade = vehicleGrade;
   }

   public void switchVehicleStatus(VehicleStatus newStatus){
      this.status = newStatus;
   }

   public int getID() {
      return id;
   }

   public String getBrand() {
      return brand;
   }

   public String getModel() {
      return model;
   }

   public String getLicencePlate() {
      return licencePlate;
   }

   public int getKm() {
      return km;
   }

   public VehicleStatus getStatus() {
      return status;
   }

   public void setStatus(VehicleStatus status) {
            this.status = status;
   }

   public VehicleGrade getVehicleGrade() {
      return vehicleGrade;
   }
}

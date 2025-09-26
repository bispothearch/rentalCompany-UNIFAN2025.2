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

   public Vehicle(int ID, String Brand, String Model, String LicencePlate, int Km, VehicleGrade vehicleGrade) {
      this.id = ID;
      this.brand = Brand;
      this.model = Model;
      this.licencePlate = LicencePlate;
      this.km = Km;
      this.status = VehicleStatus.AVAILABLE;
      this.vehicleGrade = vehicleGrade;
   }

   public void SwitchVehicleStatus(VehicleStatus newStatus){
       this.Status = newStatus;
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
      status = status;
   }

   public VehicleGrade getVehicleGrade() {
      return vehicleGrade;
   }
}

package internal.entities;

import internal.enums.VehicleGrade;
import internal.enums.VehicleStatus;

public abstract class Vehicle {
   private final int ID;
   private final String Brand;
   private final String Model;
   private final String LicencePlate;
   private int Km;
   private VehicleStatus Status;

   private VehicleGrade vehicleGrade;

   public Vehicle(int ID, String Brand, String Model, String LicencePlate, int Km, VehicleGrade vehicleGrade) {
      this.ID = ID;
      this.Brand = Brand;
      this.Model = Model;
      this.LicencePlate = LicencePlate;
      this.Km = Km;
      this.Status = VehicleStatus.AVAILABLE;
      this.vehicleGrade = vehicleGrade;
   }

   public void SwitchVehicleStatus(VehicleStatus newStatus){
       this.Status = newStatus;
   }

   public int getID() {
      return ID;
   }

   public String getBrand() {
      return Brand;
   }

   public String getModel() {
      return Model;
   }

   public String getLicencePlate() {
      return LicencePlate;
   }

   public int getKm() {
      return Km;
   }

   public VehicleStatus getStatus() {
      return Status;
   }

   public void setStatus(VehicleStatus status) {
      Status = status;
   }

   public VehicleGrade getVehicleGrade() {
      return vehicleGrade;
   }

   public void setVehicleGrade(VehicleGrade vehicleGrade) {
      this.vehicleGrade = vehicleGrade;
   }
}

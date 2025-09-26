package internal.entities;

import internal.enums.VehicleGrade;
import internal.enums.VehicleStatus;

public abstract class Vehicle {
   public int ID;
   private final String Brand;
   private final String Model;
   private final String LicencePlate;
   private final VehicleGrade vehicleGrade;

   private int KM;
   private VehicleStatus Status;

   public Vehicle(int ID, String Brand, String Model, String LicencePlate, VehicleGrade vehicleGrade, int KM) {
      this.ID = ID;
      this.Brand = Brand;
      this.Model = Model;
      this.LicencePlate = LicencePlate;
      this.vehicleGrade = vehicleGrade;

      this.KM = KM;
      this.Status = VehicleStatus.AVAILABLE;
   }

   // -- imutáveis

   public int getID() {
      return this.ID;
   }

   public String getBrand() {
      return this.Brand;
   }

   public String getModel() {
      return this.Model;
   }

   public String getLicencePlate() {
      return this.LicencePlate;
   }

   public VehicleGrade getVehicleGrade() {
      return this.vehicleGrade;
   }
}

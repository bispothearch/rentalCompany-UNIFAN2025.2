package test.java.entities;

import test.java.enums.VehicleStatus;

public abstract class Vehicle {
   private final int ID;
   private String Brand;
   private String Model;
   private String LicencePlate;
   private int Km;
   private VehicleStatus Status;

   public Vehicle(int ID, String Brand, String Model, String LicencePlate, int Km) {
      this.ID = ID;
      this.Brand = Brand;
      this.Model = Model;
      this.LicencePlate = LicencePlate;
      this.Km = Km;
      this.Status = VehicleStatus.AVAILABLE;
   }

   public void SwitchVehicleStatus(VehicleStatus newStatus){
       this.Status = newStatus;
   }
}

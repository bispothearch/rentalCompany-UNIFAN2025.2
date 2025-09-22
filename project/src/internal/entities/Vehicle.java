package internal.entities;

public class Vehicle {
   public final int ID;
   public String Brand;
   public String Model;
   public String LicencePlate;
   public int Km;
   public VehicleStatus Status;

   public Vehicle(int ID, String Brand, String Model, String LicencePlate, int Km) {
      this.ID = ID;
      this.Brand = Brand;
      this.Model = Model;
      this.LicencePlate = LicencePlate;
      this.Km = Km;
      this.Status = VehicleStatus.Disponivel;
   }

   public void SwitchVehicleStatus(VehicleStatus newStatus){
       this.Status = newStatus;
   }

   public enum VehicleStatus {
      Disponivel,
      Alugado,
      Manutencao,
   }
}

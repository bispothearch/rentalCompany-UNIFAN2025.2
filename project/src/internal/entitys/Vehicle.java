package module;

public class Vehicle {
   public int ID;
   public String Model;
   public String LicencePlate;
   public int Km;
   public VehicleStatus Status;
}

enum VehicleStatus {
   Disponivel,
   Alugado,
   Manutencao,
}

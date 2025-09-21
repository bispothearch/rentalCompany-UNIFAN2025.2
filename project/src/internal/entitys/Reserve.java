package module;

public class Reservation {
   public int ID;
   public Client Client;
   public Vehicle Vehicle;
   public PayTypes PayForm;
}

enum PayTypes{
   Pix,
   Credito,
   Debito,
   Boleto
}
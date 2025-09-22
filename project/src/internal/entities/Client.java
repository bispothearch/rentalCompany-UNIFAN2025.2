package internal.entities;

public class Client {
   public final int ID;
   public String Name;
   public int Age;
   public final String CPF;
   public String CNH;
   public String Tel;
   public String Email;

   public Client(int ID, String Name, int Age, String CPF, String CNH, String Tel, String Email) {
      this.ID = ID;
      this.Name = Name;
      this.Age = Age;
      this.CPF = CPF;
      this.CNH = CNH;
      this.Tel = Tel;
      this.Email = Email;
   }
}

package internal.entities;

public class Client {
   private final int ID;
   private String Name;
   private int Age;
   private final String CPF;
   private final String CNH;
   private String Tel;
   private String Email;

   public Client(int ID, String name, int age, String CPF, String CNH, String tel, String email) {
      this.ID = ID;
      Name = name;
      Age = age;
      this.CPF = CPF;
      this.CNH = CNH;
      Tel = tel;
      Email = email;
   }

   public int getID() {
      return ID;
   }

   public String getName() {
      return Name;
   }

   public int getAge() {
      return Age;
   }

   public String getCPF() {
      return CPF;
   }

   public String getCNH() {
      return CNH;
   }

   public String getTel() {
      return Tel;
   }

   public String getEmail() {
      return Email;
   }

   public void setTel(String tel) {
      Tel = tel;
   }

   public void setEmail(String email) {
      Email = email;
   }
}

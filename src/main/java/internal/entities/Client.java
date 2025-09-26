package internal.entities;

import java.util.ArrayList;
import java.util.List;

public class Client {
   public int ID;
   private final String CPF;
   private final String CNH;

   private String Name;
   private int Age;
   private String Tel;
   private String Email;

   public Client(String name, int age, String CPF, String CNH, String tel, String email) {
      this.CPF = CPF;
      this.CNH = CNH;

      this.Name = name;
      this.Age = age;
      this.Tel = tel;
      this.Email = email;
   }

   public int getID() {
      return this.ID;
   }

   public String getCPF() {
      return this.CPF;
   }

   public String getCNH() {
      return this.CNH;
   }

   public String getName() {
      return this.Name;
   }

   public int getAge() {
      return this.Age;
   }

   public String getTel() {
      return this.Tel;
   }

   public String getEmail() {
      return this.Email;
   }

   public void setTel(String tel) {
      this.Tel = tel;
   }

   public void setEmail(String email) {
      this.Email = email;
   }
}

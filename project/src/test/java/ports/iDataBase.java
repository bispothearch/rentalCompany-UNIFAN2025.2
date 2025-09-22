package test.java.ports;

// usaremos essa interface pra criar operações concretas de banco de dados
public interface iDataBase {
   void SaveClient();
   void GetClient();
   void EditClient();
   void DeleteClient(); 
}
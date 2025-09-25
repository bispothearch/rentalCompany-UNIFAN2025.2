package internal.ports;

import internal.entities.Client;
import internal.entities.Vehicle;

import java.util.List;

// usaremos essa interface pra criar operações concretas de banco de dados
public interface IDataBase {
   void SaveClient(Client client);
   Client GetClient(int id);
   void EditClient();
   void DeleteClient();
   List<Vehicle> GetAllVehicles();
}
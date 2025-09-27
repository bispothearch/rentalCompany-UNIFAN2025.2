package internal.ports;

import internal.entities.Client;
import internal.entities.Vehicle;

import java.util.List;

// usaremos essa interface pra criar operações concretas de banco de dados
public interface IDataBase {
   void saveClient(Client client);
   Client getClient(int id);
   void editClient();
   void deleteClient();
   void saveVehicle(Vehicle vehicle);
   List<Vehicle> getAllVehicles();
}
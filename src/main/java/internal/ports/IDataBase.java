package internal.ports;

import java.util.List;

import internal.entities.Client;
import internal.entities.Reserve;
import internal.entities.Vehicle;

public interface IDataBase {
    // -- Create
    int RegisterClient(Client newClient);

    int RegisterClient(Vehicle newVehicle);

    int RegisterReserve(Reserve newReserve);

    // -- Read all
    List<Vehicle> GetListVehicle();

    List<Client> GetListClient();

    List<Reserve> GetListReserve();

    // -- Read single Object
    Client GetClientById(int id);

    Vehicle GetVehicleById(int id);

    Reserve GetReserveById(int id);

    // -- Update [pagamento]
    void UpdateReserve(Reserve reserve);
}
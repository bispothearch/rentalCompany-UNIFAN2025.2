package internal.ports;

import java.util.List;

import internal.entities.Client;
import internal.entities.Reserve;
import internal.entities.Vehicle;

public interface IDataBase {
    int SaveClient(Client newClient);

    List<Vehicle> GetListVehicle(String filter);

    void RegisterReserve(Reserve newReserve);

    void UpdateReserve(Reserve Reserve);

    Reserve GetReserveById(int id_reserve);
}
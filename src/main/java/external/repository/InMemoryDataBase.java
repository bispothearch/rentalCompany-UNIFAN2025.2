package external.repository;

import internal.entities.Client;
import external.database.RentalCompany;
import internal.entities.Reserve;
import internal.entities.Vehicle;
import internal.ports.IDataBase;

import java.util.List;

public class InMemoryDataBase implements IDataBase {
    private final RentalCompany rentalCompany;
    public int cID_client = 0;
    public int cID_vehicle = 0;
    public int cID_reserve = 0;

    public InMemoryDataBase(RentalCompany rentalCompany) {
        this.rentalCompany = rentalCompany;
    }

    // -- Create
    @Override
    public int RegisterClient(Client newClient) {
        newClient.ID = cID_client++;
        rentalCompany.clientList.add(newClient);
        return newClient.getID();
    }

    @Override
    public int RegisterClient(Vehicle newVehicle) {
        newVehicle.ID = cID_vehicle++;
        rentalCompany.vehicleList.add(newVehicle);
        return newVehicle.getID();
    }

    @Override
    public int RegisterReserve(Reserve newReserve) {
        newReserve.ID = cID_reserve++;
        rentalCompany.reserveList.add(newReserve);
        return newReserve.getID();
    }

    // -- Read All
    @Override
    public List<Vehicle> GetListVehicle() {
        return rentalCompany.vehicleList;
    }

    @Override
    public List<Client> GetListClient() {
        return rentalCompany.clientList;
    }

    @Override
    public List<Reserve> GetListReserve() {
        return rentalCompany.reserveList;
    }

    // -- Read single Object
    @Override
    public Client GetClientById(int id) {
        return rentalCompany.clientList.stream()
                .filter(client -> client.getID() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Vehicle GetVehicleById(int id) {
        return rentalCompany.vehicleList.stream()
                .filter(vehicle -> vehicle.getID() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Reserve GetReserveById(int id) {
        return rentalCompany.reserveList.stream()
                .filter(reserve -> reserve.getID() == id)
                .findFirst()
                .orElse(null);
    }


    @Override
    public void UpdateReserve(Reserve Reserve) {

    }
}

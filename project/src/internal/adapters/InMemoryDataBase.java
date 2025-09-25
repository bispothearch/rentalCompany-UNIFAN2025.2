package internal.adapters;

import internal.entities.Client;
import internal.entities.RentalCompany;
import internal.entities.Vehicle;
import internal.ports.IDataBase;

import java.util.List;

public class InMemoryDataBase implements IDataBase{
    private final RentalCompany rentalCompany;

    public InMemoryDataBase(RentalCompany rentalCompany) {
        this.rentalCompany = rentalCompany;
    }

    @Override
    public void SaveClient(Client client) {
        rentalCompany.clientList.add(client);
    }

    @Override
    public Client GetClient(int id) {
        return rentalCompany.clientList.stream().filter(client -> client.getID() == id).findFirst().orElse(null);
    }

    @Override
    public void EditClient() {

    }

    @Override
    public void DeleteClient() {

    }

    @Override
    public List<Vehicle> GetAllVehicles() {
        return rentalCompany.vehicleList;
    }
}

package internal.utils;

import internal.entities.Client;
import internal.entities.Vehicle;
import internal.enums.VehicleGrade;
import internal.enums.VehicleStatus;
import internal.ports.IDataBase;

import java.util.List;
import java.util.stream.Collectors;

// fluxo da regra de negócio
public class RentalUseCase {
    private IDataBase repo;

    public RentalUseCase(IDataBase repo) {
        this.repo = repo;
    }

    public void signUpClient(Client client){
        repo.saveClient(client);
    }

    public void signUpVehicle(Vehicle vehicle){
        repo.saveVehicle(vehicle);
    }
    public void searchClient(){

    }
    public void createReserve() {

    }

    public List<Vehicle> getAvailableVehiclesByCategory(VehicleGrade category){
        List<Vehicle> allVehicles = repo.getAllVehicles();
        return allVehicles.stream().filter(vehicle -> vehicle.getStatus() == VehicleStatus.AVAILABLE && vehicle.getVehicleGrade() == category).collect(Collectors.toList());
    }
}

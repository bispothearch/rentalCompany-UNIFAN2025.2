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

    public void SignUpClient(Client client){
        repo.SaveClient(client);
    }

    public void SignUpVehicle(){

    }
    public void SearchClient(){

    }
    public void CreateReserve() {

    }

    public List<Vehicle> getAvailableVehiclesByCategory(VehicleGrade category){
        List<Vehicle> allVehicles = repo.GetAllVehicles();
        return allVehicles.stream().filter(vehicle -> vehicle.getStatus() == VehicleStatus.AVAILABLE && vehicle.getVehicleGrade() == category).collect(Collectors.toList());
    }
}

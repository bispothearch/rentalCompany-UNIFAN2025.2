package internal.usecase;

import java.util.List;

import internal.entities.Client;
import internal.entities.Reserve;
import internal.entities.Vehicle;
import internal.enums.PaymentService;
import internal.enums.ReserveStatus;
import internal.ports.IDataBase;

public class RentalUseCase {
    private final IDataBase repo;

    public RentalUseCase(IDataBase repo) {
        this.repo = repo;
    }

    // -- Create
    public int RegisterClient(Client newClient) {
        return repo.RegisterClient(newClient);
    }

    public int RegisterVehicle(Vehicle newVehicle) {
        return this.repo.RegisterClient(newVehicle);
    }

    public int RegisterReserve(Reserve newReserve) {
        return repo.RegisterReserve(newReserve);
    }

    // -- Read all
    public List<Client> LisClient() {
        return repo.GetListClient();
    }

    public List<Vehicle> ListVehicle() {
        return repo.GetListVehicle();
    }

    public List<Reserve> ListReserve() {
        return repo.GetListReserve();
    }

    // -- Read single Object
    public Client GetClientById(int id) {
        return repo.GetClientById(id);
    }

    public Vehicle GetVehicleById(int id) {
        return repo.GetVehicleById(id);
    }

    public Reserve GetReserveById(int id) {
        return repo.GetReserveById(id);
    }


    // -- Update
    // Gerenciamente de Aluguel e Pagamento
    public boolean ManageRental(int id_reserve, PaymentService paymentService) {
        var objReserve = repo.GetReserveById(id_reserve);
        var objVehicle = repo.GetVehicleById(objReserve.getVehicleId());
        var valueFinal = paymentService.processPayment(
                objVehicle.getVehicleGrade(),
                objReserve.getEstimatedFinalDate(),
                objReserve.getActualReturnDate(),
                objReserve.getBeginDate()
        );

        objReserve.incrementValue(valueFinal);
        objReserve.switchStatus(ReserveStatus.CONFIRMED);

        repo.UpdateReserve(objReserve);
        return true;
    }
}

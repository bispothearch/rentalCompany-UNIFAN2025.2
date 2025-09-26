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

    // Cadastro de Cliente
    public int RegisterClient(Client newClient) {
        return repo.SaveClient(newClient);
    }

    // Listagem de veículos com filtro
    public List<Vehicle> ListVehicle(String filter) {
        return repo.GetListVehicle(filter);
    }

    // Criação de Reserva
    public void CreateReserve(Reserve newReserve) {
        repo.RegisterReserve(newReserve);
    }

    // Gerenciamente de Aluguel e Pagamento
    public boolean ManageRental(Reserve reserve, PaymentService paymentService) {
        if (reserve.getStatus() == ReserveStatus.FINISHED) {
            return false;
        }

        paymentService.processPayment(reserve);
        repo.UpdateReserve(reserve);
        return true;
    }

    public Reserve GetReserveById(int id_reserve) {
        return this.repo.GetReserveById(id_reserve);
    }

}

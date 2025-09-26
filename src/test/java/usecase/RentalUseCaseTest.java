package usecase;

import external.database.RentalCompany;
import internal.entities.*;
import internal.enums.PayMethod;
import internal.enums.PaymentService;
import external.repository.InMemoryDataBase;
import internal.enums.VehicleGrade;
import internal.usecase.RentalUseCase;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class RentalUseCaseTest {

    @Test
    void testEnd2End() {
        // Instanciando as camadas e conectando
        var company = new RentalCompany();
        var db = new InMemoryDataBase(company);
        var useCase = new RentalUseCase(db);

        // Fluxo
        var objClient = new Client("João", 30, "12345678900", "CNH123", "99999-9999", "joao@email.com");
        var clientId = useCase.RegisterClient(objClient);

        var objVehicle = new Vehicle("Fiat", "Strada", "LK0I9-91", VehicleGrade.PICKUP, 0);
        var vehicleId = useCase.RegisterVehicle(objVehicle);

        var newReserve = new Reserve(clientId, vehicleId, PayMethod.PIX, 1000.00, LocalDate.now(), LocalDate.now().plusDays(8));
        var reserveId = useCase.RegisterReserve(newReserve);

        var SelectedReserve = useCase.GetReserveById(reserveId);

        System.out.println("Obj: " + SelectedReserve);


        var err = useCase.ManageRental(reserveId, PaymentService.Pix);

//        assertEquals(1, company.clientList.size());
//        assertEquals("João", company.clientList.get(0).getName());
    }

}

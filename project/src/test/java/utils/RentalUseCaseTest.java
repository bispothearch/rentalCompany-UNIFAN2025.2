package test.java.utils;

import internal.entities.*;
import internal.adapters.InMemoryDataBase;
import internal.utils.RentalUseCase;
import internal.enums.VehicleGrade;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class RentalUseCaseTest {

    @Test
    void testSignUpClient() {
        RentalCompany company = new RentalCompany();
        company.clientList = new ArrayList<>();
        company.vehicleList = new ArrayList<>();
        company.reserveList = new ArrayList<>();
        InMemoryDataBase db = new InMemoryDataBase(company);
        RentalUseCase useCase = new RentalUseCase(db);

        Client client = new Client(1, "João", 30, "12345678900", "CNH123", "99999-9999", "joao@email.com");
        useCase.signUpClient(client);

        assertEquals(1, company.clientList.size());
        assertEquals("João", company.clientList.get(0).getName());
    }

}

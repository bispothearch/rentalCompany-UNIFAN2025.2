package internal.services;

import internal.entities.Reserve;
import internal.enums.ReserveStatus;

public class PixPayService implements IPaymentService {

    private ServiceReserve valueReserve;

    @Override
    public void processPayment(Reserve reserve) {
        reserve.switchStatus(ReserveStatus.CONFIRMED);
        reserve.setValue(valueReserve.calcCostReserve(reserve));
    }
}

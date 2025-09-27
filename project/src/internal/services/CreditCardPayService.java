package internal.services;

import internal.entities.Reserve;
import internal.enums.ReserveStatus;

public class CreditCardPayService implements IPaymentService {

    private ServiceReserve valueReserve;
    private static final double FEE_PERCENTAGE = 0.25;

    @Override
    public void processPayment(Reserve reserve) {
        reserve.switchStatus(ReserveStatus.CONFIRMED);
        reserve.setValue((valueReserve.calcCostReserve(reserve) * FEE_PERCENTAGE) + valueReserve.calcCostReserve(reserve));
    }
}

package internal.services;

import internal.entities.Reserve;
import internal.enums.ReserveStatus;

public class DebitPayService implements IPaymentService {

    private ServiceReserve valueReserve;
    private static final double FEE_PERCENTAGE = 0.15;

    @Override
    public void processPayment(Reserve reserve) {
    reserve.switchStatus(ReserveStatus.CONFIRMED);
    reserve.setValue((valueReserve.calcCostReserve(reserve) * FEE_PERCENTAGE) + valueReserve.calcCostReserve(reserve));
    }
}

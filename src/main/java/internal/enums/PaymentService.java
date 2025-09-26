package internal.enums;

import internal.services.ServiceReserve;
import internal.entities.Reserve;

public enum PaymentService {
   Debit(0.15),
   Credit(0.25),
   Pix(0),
   TicketPay(0.1),
   ;

   private final double FEE_PERCENTAGE;

   PaymentService(double FEE_PERCENTAGE) {
      this.FEE_PERCENTAGE = FEE_PERCENTAGE;
   }

   public void processPayment(Reserve reserve) {
      reserve.switchStatus(ReserveStatus.CONFIRMED);
      reserve.setValue(
            (ServiceReserve.calcCostReserve(reserve) * this.FEE_PERCENTAGE) + ServiceReserve.calcCostReserve(reserve));
   }
}

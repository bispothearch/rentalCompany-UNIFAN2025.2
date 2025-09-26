package internal.enums;

import internal.services.ServiceReserve;
import internal.entities.Reserve;

import java.time.LocalDate;

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

   public double processPayment(VehicleGrade grade, LocalDate EstimatedFinalDate, LocalDate ActualReturnDate, LocalDate BeginDate) {
      var CostFinal = ServiceReserve.calcCostReserve_X(grade,EstimatedFinalDate, ActualReturnDate, BeginDate);
      return (CostFinal * this.FEE_PERCENTAGE) + CostFinal;
   }
}

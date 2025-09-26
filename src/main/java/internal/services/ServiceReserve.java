package internal.services;

import internal.entities.Reserve;
import internal.enums.VehicleGrade;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ServiceReserve {
//    public static double calcCostReserve(Reserve reserve, ) {
//        VehicleGrade grade = reserve.getVehicle().getVehicleGrade();
//        int lateDays = (int) ChronoUnit.DAYS.between(reserve.getEstimatedFinalDate(), reserve.getActualReturnDate());
//        int rentDays = (int) ChronoUnit.DAYS.between(reserve.getBeginDate(), reserve.getEstimatedFinalDate());
//        double value = (rentDays * grade.getDailyFee()) + (rentDays * grade.getInsurance());
//        if (lateDays > 0) {
//            return value + (lateDays * grade.getDailyLateFee());
//        }
//        return value;
//    }
    public static double calcCostReserve_X(VehicleGrade grade, LocalDate EstimatedFinalDate, LocalDate ActualReturnDate, LocalDate BeginDate) {
        int lateDays = (int) ChronoUnit.DAYS.between(EstimatedFinalDate, ActualReturnDate);
        int rentDays = (int) ChronoUnit.DAYS.between(BeginDate, EstimatedFinalDate);

        double value = (rentDays * grade.getDailyFee()) + (rentDays * grade.getInsurance());

        if (lateDays > 0) {
            return value + (lateDays * grade.getDailyLateFee());
        }
        return value;
    }
}

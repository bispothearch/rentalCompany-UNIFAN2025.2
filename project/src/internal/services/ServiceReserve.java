package internal.services;

import internal.entities.Reserve;
import internal.enums.VehicleGrade;

import java.time.temporal.ChronoUnit;


public class ServiceReserve {

    public double CalcCostReserve(Reserve reserve){
        VehicleGrade grade = reserve.getVehicle().getVehicleGrade();
        int lateDays = (int) ChronoUnit.DAYS.between(reserve.getEstimatedFinalDate(),reserve.getActualReturnDate());
        int rentDays = (int) ChronoUnit.DAYS.between(reserve.getBeginDate(),reserve.getEstimatedFinalDate());
        double value = (rentDays * grade.getDailyFee()) + (rentDays * grade.getInsurance());
        if (lateDays > 0){
            return value + (lateDays * grade.getDailyLateFee());
        }
        return value;
    }

}

package internal.entities;

import internal.enums.PayMethod;
import internal.enums.ReserveStatus;

import java.time.LocalDate;

public class Reserve {
    public int ID;
    private final PayMethod PayMethod;
    private final LocalDate BeginDate;

    private Double Value = 0.0;
    private LocalDate EstimatedFinalDate;
    private LocalDate ActualReturnDate;
    private ReserveStatus Status;
    private int fk_client;
    private int fk_vehicle;

    public Reserve(int client, int vehicle, PayMethod PayMethod, Double entryValue, LocalDate beginDate,
                   LocalDate estimatedFinalDate) {
        this.PayMethod = PayMethod;
        this.BeginDate = beginDate;

        this.fk_client = client;
        this.fk_vehicle = vehicle;
        this.Value += entryValue;
        this.EstimatedFinalDate = estimatedFinalDate;
        this.Status = ReserveStatus.PENDING;
    }

    // --

    public int getClientId() {
        return fk_client;
    }

    public int getVehicleId() {
        return this.fk_vehicle;
    }

    // --

    public int getID() {
        return ID;
    }

    public PayMethod getPayMethod() {
        return PayMethod;
    }

    public LocalDate getBeginDate() {
        return BeginDate;
    }


    public Double getValue() {
        return Value;
    }

    public void incrementValue(double newValue  ) {
        Value += newValue;
    }

    public LocalDate getEstimatedFinalDate() {
        return EstimatedFinalDate;
    }

    public void setEstimatedFinalDate(LocalDate estimatedFinalDate) {
        EstimatedFinalDate = estimatedFinalDate;
    }

    public LocalDate getActualReturnDate() {
        return ActualReturnDate;
    }

    public void setActualReturnDate(LocalDate actualReturnDate) {
        ActualReturnDate = actualReturnDate;
    }

    public ReserveStatus getStatus() {
        return Status;
    }

    public void setStatus(ReserveStatus status) {
        Status = status;
    }

    public void switchStatus(ReserveStatus newStatus) {
        this.Status = newStatus;
    }
}
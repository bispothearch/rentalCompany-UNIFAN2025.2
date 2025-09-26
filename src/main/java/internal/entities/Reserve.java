package internal.entities;

import internal.enums.PayMethod;
import internal.enums.ReserveStatus;

import java.time.LocalDate;

public class Reserve {
    public int ID;
    private final PayMethod PayMethod;
    private final LocalDate BeginDate;

    private Double Value;
    private LocalDate EstimatedFinalDate;
    private LocalDate ActualReturnDate;
    private ReserveStatus Status;
    private Client Client;
    private Vehicle Vehicle;

    public Reserve(int ID, Client client, PayMethod PayMethod, Vehicle vehicle, Double value, LocalDate beginDate,
            LocalDate estimatedFinalDate) {
        this.ID = ID;
        this.PayMethod = PayMethod;
        this.BeginDate = beginDate;

        this.Client = client;
        this.Vehicle = vehicle;
        this.Value = value;
        this.EstimatedFinalDate = estimatedFinalDate;
        this.Status = ReserveStatus.PENDING;
    }

    public int getID() {
        return ID;
    }

    public PayMethod getPayMethod() {
        return PayMethod;
    }

    public LocalDate getBeginDate() {
        return BeginDate;
    }

    // --

    public Client getClient() {
        return Client;
    }

    public void setClient(Client client) {
        Client = client;
    }

    public Vehicle getVehicle() {
        return Vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        Vehicle = vehicle;
    }

    public Double getValue() {
        return Value;
    }

    public void setValue(Double value) {
        Value = value;
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
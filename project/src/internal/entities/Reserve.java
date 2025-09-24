package  internal.entities;

import internal.enums.PayMethod;
import internal.enums.ReserveStatus;
import internal.services.iPaymentService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserve {
    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final int ID;
    private Double Value;
    private final PayMethod PayMethod;
    private final LocalDate BeginDate;
    private LocalDate EstimatedFinalDate;
    private LocalDate ActualReturnDate;
    private ReserveStatus Status;

    private Client Client;
    private Vehicle Vehicle;

    public Reserve(int ID, Client client, PayMethod PayMethod,Vehicle vehicle, Double value, LocalDate beginDate, LocalDate estimatedFinalDate) {
        this.ID = ID;
        this.Client = client;
        this.PayMethod = PayMethod;
        this.Vehicle = vehicle;
        this.Value = value;
        this.BeginDate = beginDate;
        this.EstimatedFinalDate = estimatedFinalDate;
        this.Status = ReserveStatus.PENDING;
    }

    private iPaymentService reservePayMethod;

    public int getID() {
        return ID;
    }

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

    public PayMethod getPayMethod() {
        return PayMethod;
    }

    public LocalDate getBeginDate() {
        return BeginDate;
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

    public void switchStatus(ReserveStatus newStatus){
        this.Status = newStatus;
    }

}
package  internal.entities;

import internal.enums.ReserveStatus;

import java.time.LocalDate;

public class Reserve {
    private final int ID;
    private Client Client;
    private Vehicle Vehicle;
    private Double Value;
    private final PayMethod PayMethod = null;
    private final LocalDate BeginDate;
    private LocalDate FinalDate;
    private ReserveStatus Status;

    public Reserve(int ID, Client client, Vehicle vehicle, Double value, LocalDate beginDate, LocalDate finalDate) {
        this.ID = ID;
        this.Client = client;
        this.Vehicle = vehicle;
        this.Value = value;
        this.BeginDate = beginDate;
        this.FinalDate = finalDate;
        this.Status = ReserveStatus.PENDING;
    }

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

    public LocalDate getFinalDate() {
        return FinalDate;
    }

    public void setFinalDate(LocalDate finalDate) {
        FinalDate = finalDate;
    }

    public ReserveStatus getStatus() {
        return Status;
    }

    public void setStatus(ReserveStatus status) {
        Status = status;
    }

    public double CalcTotalValue() {
        return 2.000;
        // retorno temporário
    }

    public void SwitchStatus(ReserveStatus newStatus){
        this.Status = newStatus;
    }

}
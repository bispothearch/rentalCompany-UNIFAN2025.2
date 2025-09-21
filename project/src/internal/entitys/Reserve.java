package  internal.entitys;

import java.time.LocalDate;

public class Reserve {
    public int ID;
    public Client Client;
    public Vehicle Vehicle;
    public float Value;
    public PayMethod PayMethod;
    public LocalDate BeginDate;
    public LocalDate FinalDate;
    public ReserveStatus Status;

    public Reserve(int ID, Client client, Vehicle vehicle, float value, PayMethod payMethod, LocalDate beginDate, LocalDate finalDate) {
        this.ID = ID;
        this.Client = client;
        this.Vehicle = vehicle;
        this.Value = value;
        this.PayMethod = payMethod;
        this.BeginDate = beginDate;
        this.FinalDate = finalDate;
        this.Status = ReserveStatus.Pendente;
    }

    public enum PayMethod {
        Pix,
        Credito,
        Debito,
        Boleto
    }

    public enum ReserveStatus{
        Pendente,
        Confirm,
        Cancel,
        Finish
    }

    public double CalcTotalValue() {
        return 2.000;
        // retorno temporário
    }

    public void SwitchStatus(ReserveStatus newStatus){
        this.Status = newStatus;
    }

}
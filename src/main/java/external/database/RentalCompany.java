package external.database;

import internal.entities.Client;
import internal.entities.Reserve;
import internal.entities.Vehicle;

import java.util.ArrayList;
import java.util.List;

// Simula conexão com database real
public class RentalCompany {
    public List<Client> clientList = new ArrayList<Client>();
    public List<Vehicle> vehicleList = new ArrayList<Vehicle>();
    public List<Reserve> reserveList = new ArrayList<Reserve>();
}
package internal.services;

import internal.entities.Reserve;

public interface PaymentService {

    void processPayment(Reserve reserve);

}

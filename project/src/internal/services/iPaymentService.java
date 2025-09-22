package internal.services;

import internal.entities.Reserve;

public interface iPaymentService {

    void processPayment(Reserve reserve);

}

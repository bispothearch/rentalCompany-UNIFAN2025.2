package internal.services;

import internal.entities.Reserve;

public interface IPaymentService {

    void processPayment(Reserve reserve);
}

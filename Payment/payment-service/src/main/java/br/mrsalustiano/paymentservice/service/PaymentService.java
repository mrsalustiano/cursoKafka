package br.mrsalustiano.paymentservice.service;

import br.mrsalustiano.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);


}

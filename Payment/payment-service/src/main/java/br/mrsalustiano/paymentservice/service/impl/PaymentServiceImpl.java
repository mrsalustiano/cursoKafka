package br.mrsalustiano.paymentservice.service.impl;

import br.mrsalustiano.paymentservice.model.Payment;
import br.mrsalustiano.paymentservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class PaymentServiceImpl implements PaymentService {


    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENT SERVICE IMPL ::: Recebido {}", payment);

    }
}

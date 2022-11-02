package br.mrsalustiano.paymentservice.resource.impl;

import br.mrsalustiano.paymentservice.model.Payment;
import br.mrsalustiano.paymentservice.resource.PaymentResource;
import br.mrsalustiano.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
@RequiredArgsConstructor
class PaymentResourcesImpl implements PaymentResource {

    private final PaymentService service;

    @Override
    public ResponseEntity<Payment> payment(Payment payment) {
        service.sendPayment(payment);
        return ResponseEntity.ok().body(payment);
    }
}

package br.mrsalustiano.jsonconsumer.listener;

import br.mrsalustiano.jsonconsumer.model.Payment;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import static java.lang.Thread.sleep;

@Log4j2
@Component
public class JsonListener {

    @SneakyThrows
    @KafkaListener(topics = "payment-topic", groupId = "create-group", containerFactory = "jsonContainerFactory")
    public void antiFraud(@Payload Payment payment) {
        log.info("Payload Recebido : {}", payment.toString());
        sleep(2000);
        log.info("Validando Cartoes");
        sleep(2000);

        log.info("Compra Aprovada");
        sleep(3000);

    }

    @SneakyThrows
    @KafkaListener(topics = "payment-topic", groupId = "pdf-group", containerFactory = "jsonContainerFactory")
    public void pdfGenerator(@Payload Payment payment) {

        log.info("Gerando PDF produto : {}", payment.getIdProduct() );
        sleep(3000);

    }

    @SneakyThrows
    @KafkaListener(topics = "payment-topic", groupId = "email-group", containerFactory = "jsonContainerFactory")
    public void emailSend(@Payload Payment payment) {

        log.info("Enviando Email de Confirmação para userID : {}", payment.getIdUser());
        sleep(3000);
        log.info("Finalizado Processamento.....");

    }


}

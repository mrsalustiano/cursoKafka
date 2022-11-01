package br.mrsalustiano.strproducer.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class StringProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info("Send Message : {}" , message);
        kafkaTemplate.send("str-topic", message);
//                .addCallback(
//                sucess -> {
//                     if (sucess != null) {
//                         log.info("Send Message Sucesso {} ", message);
//                         log.info("Partition {} - Offset {}", sucess.getRecordMetadata().partition(),
//                                 sucess.getRecordMetadata().offset());
//
//                     }
//                },
//                error -> log.error("Erro Send Message")
//
//        );
    }

}

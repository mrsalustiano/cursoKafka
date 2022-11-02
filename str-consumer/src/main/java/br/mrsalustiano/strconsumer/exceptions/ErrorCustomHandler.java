package br.mrsalustiano.strconsumer.exceptions;

import lombok.extern.log4j.Log4j2;
import org.apache.kafka.clients.consumer.Consumer;
import org.springframework.kafka.listener.KafkaListenerErrorHandler;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class ErrorCustomHandler implements KafkaListenerErrorHandler {
    @Override
    public Object handleError(Message<?> message, ListenerExecutionFailedException e) {
        log.info("Exception Handler - Captura de Erro");
        log.info("Payload : {}" , message.getPayload());
        log.info("Headers : {} " ,message.getHeaders());
        log.info("offSet  : {} ", message.getHeaders().get("kafka_offset"));
        log.info("Message Exception  : {} ", e.getMessage());

        return null;
    }

//    @Override
//    public Object handleError(Message<?> message, ListenerExecutionFailedException exception, Consumer<?, ?> consumer) {
//        return KafkaListenerErrorHandler.super.handleError(message, exception, consumer);
//    }
}

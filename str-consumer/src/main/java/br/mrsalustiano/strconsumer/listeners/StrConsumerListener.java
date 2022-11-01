package br.mrsalustiano.strconsumer.listeners;

import br.mrsalustiano.strconsumer.custom.StrConsumerCustomListener;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class StrConsumerListener {

    @StrConsumerCustomListener( groupId = "group-1")
    public void create(String message) {
       log.info("Create  ::: Receive Message {}", message);
    }

    @StrConsumerCustomListener( groupId = "group-1")
    public void log(String message) {
        log.info("LOG ::: Receive Message {}", message);
    }


    @KafkaListener( groupId = "group-2" , topics = "str-topic" , containerFactory = "validMessageContainerFactory" )
    public void history(String message) {
        log.info("HISTORY ::: Receive Message {}", message);
    }



}

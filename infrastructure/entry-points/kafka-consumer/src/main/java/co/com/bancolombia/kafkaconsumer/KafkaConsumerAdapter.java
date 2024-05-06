package co.com.bancolombia.kafkaconsumer;

import co.com.bancolombia.model.log.Log;
import co.com.bancolombia.model.log.gateways.LogRepository;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@AllArgsConstructor
@Component
public class KafkaConsumerAdapter {

    private final LogRepository logRepository;


    @KafkaListener(topics = "${spring.kafka.consumer.topic}", containerFactory = "kafkaListenerContainerFactory")
    public void consumeMessage(Log log) {
        try {
            System.out.println(log.toString());
            logRepository.saveLog(log);
        } catch (Exception e) {
            System.out.printf(e.getMessage());
            throw new Error(e.getMessage());
        }
    }


}

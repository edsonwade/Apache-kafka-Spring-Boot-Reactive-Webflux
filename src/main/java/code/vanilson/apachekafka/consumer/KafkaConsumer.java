package code.vanilson.apachekafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    /**
     * Kafka listener method to consume messages from the specified topic.
     *
     * @param msg The message consumed from Kafka
     */
    @KafkaListener(topics = "#{ '${my.topic}' }",groupId = "myGroup")
    public void consumeMessage(String msg) {
        log.info(String.format("Consuming the message from my-topic %s", msg));
    }

}

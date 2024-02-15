package code.vanilson.apachekafka.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    // Injecting the topic name from application properties
    @Value("${my.topic}")
    public String myTopic;

    // Constructor injection for KafkaTemplate
    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    // Method to send a message to KafkaJsonProducer
    public void sendMessage(String msg) {
        // Logging the message being sent
        log.info(String.format("sending message to my-topic:: %s", msg));
        // Using KafkaTemplate to send the message to the specified topic
        kafkaTemplate.send(myTopic, msg);
    }
}

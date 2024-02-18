package code.with.vanilson;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProducerWikimedia {
    // Constructor injection for KafkaTemplate
    private final KafkaTemplate<String, String> kafkaTemplate;

    public ProducerWikimedia(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

//    // Injecting the topic name from application properties
//    @Value("${wikimedia.stream}")
//    public String wikimediaStream;

    // Method to send a message to KafkaJsonProducer
    public void sendMessage(String msg) {
        // Using KafkaTemplate to send the message to the specified topic
        kafkaTemplate.send("wikimedia-stream", msg);
    }
}

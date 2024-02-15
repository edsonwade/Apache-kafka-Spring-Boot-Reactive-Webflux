package code.vanilson.apachekafka.producer;

import code.vanilson.apachekafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaJsonProducer {

    private final KafkaTemplate<String, Student> kafkaTemplate;
    @Value("${add.new-topic}")
    String myTopicMessage;

    public KafkaJsonProducer(KafkaTemplate<String, Student> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    /**
     * Sends a Student object as a JSON message to the specified Kafka topic.
     *
     * @param student The Student object to be sent as a message
     */
    public void sendMessage(Student student) {
        // Build the Kafka message with the Student payload
        Message<Student> message = MessageBuilder
                .withPayload(student)
                .setHeader(KafkaHeaders.TOPIC, myTopicMessage)
                .build();

        // Send the message using the KafkaTemplate
        kafkaTemplate.send(message);

        // Log successful message sending
        log.info(String.format("Message sent successfully: %s", message));
    }

}

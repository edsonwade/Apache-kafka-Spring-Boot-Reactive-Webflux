package code.vanilson.apachekafka.consumer;

import code.vanilson.apachekafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaJsonConsumer {

    /**
     * KafkaListener method to deserialize and consume JSON messages from the specified topic.
     * This method consumes JSON messages and deserializes them into Student objects.
     *
     * @param student The Student object deserialized from the JSON message
     */
    @KafkaListener(topics = "#{ '${add.new-topic}' }", groupId = "myGroup")
    public void consumeJsonMessage(Student student) {
        log.info(String.format("Consuming the message from vanilson %s", student));
    }
}

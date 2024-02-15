package code.vanilson.apachekafka.controller;

import code.vanilson.apachekafka.payload.Student;
import code.vanilson.apachekafka.producer.KafkaJsonProducer;
import code.vanilson.apachekafka.producer.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/messages")
public class KafkaController {

    private final KafkaProducer kafkaProducer;
    private final KafkaJsonProducer kafkaJsonProducer;

    public KafkaController(KafkaProducer kafkaProducer, KafkaJsonProducer kafkaJsonProducer) {
        this.kafkaProducer = kafkaProducer;
        this.kafkaJsonProducer = kafkaJsonProducer;
    }

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok().body("Message queued successfully");

    }

    @PostMapping(value = "/students-messages")
    public ResponseEntity<String> sendMessage(@RequestBody Student student) {
        kafkaJsonProducer.sendMessage(student);
        return ResponseEntity.ok().body("Message queued successfully as Json");

    }
}

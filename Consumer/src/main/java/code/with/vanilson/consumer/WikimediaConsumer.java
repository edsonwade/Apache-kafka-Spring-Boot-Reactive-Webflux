package code.with.vanilson.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class WikimediaConsumer {

    private final ConsumerRepository consumerRepository;

    public WikimediaConsumer(ConsumerRepository consumerRepository) {
        this.consumerRepository = consumerRepository;
    }

    /**
     * KafkaJsonProducer listener method to consume messages from the specified topic.
     *
     * @param msg The message consumed from KafkaJsonProducer
     */
    @KafkaListener(topics = "wikimedia-stream", groupId = "myGroup")
    public void consumeMessage(String msg) {
        Consumer consumer = new Consumer();
        consumer.setMessage(msg);
        log.info(String.format("Consuming the message from wikimedia stream %s", msg));
        consumerRepository.save(consumer);

    }

    public List<String> findAllConsumerTopics() {
        return consumerRepository.getAllConsumerMessages();

    }
}

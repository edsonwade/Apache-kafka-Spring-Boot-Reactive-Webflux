package code.with.vanilson.consumer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/message")
public class ConsumerController {

    private final WikimediaConsumer wikimediaConsumer;

    public ConsumerController(WikimediaConsumer wikimediaConsumer) {
        this.wikimediaConsumer = wikimediaConsumer;
    }

    @GetMapping
    public ResponseEntity<String> getAllMessage() {
        StringBuilder response = new StringBuilder();
        wikimediaConsumer.findAllConsumerTopics()
                .forEach(message -> response.append(message).append("\n"));
        return ResponseEntity.ok().body(response.toString());
    }
}

package code.with.vanilson.res;

import code.with.vanilson.stream.WikimediaStreamConsumer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/wikimedia")
public class ProducerWikimediaController {

    private final WikimediaStreamConsumer wikimediaStreamConsumer;

    public ProducerWikimediaController(WikimediaStreamConsumer wikimediaStreamConsumer) {
        this.wikimediaStreamConsumer = wikimediaStreamConsumer;
    }

    @GetMapping
    public void startPublishing() {
        wikimediaStreamConsumer.consumerStreamAndPublish();
    }
}

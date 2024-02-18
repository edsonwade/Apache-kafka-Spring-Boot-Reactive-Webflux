package code.with.vanilson.stream;

import code.with.vanilson.ProducerWikimedia;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@Slf4j
public class WikimediaStreamConsumer {

    private final WebClient webClient;
    private final ProducerWikimedia producerWikimedia;

    public WikimediaStreamConsumer(WebClient.Builder builder,
                                   ProducerWikimedia producerWikimedia) {
        this.webClient = builder
                .baseUrl("https://stream.wikimedia.org/v2")
                .build();
        this.producerWikimedia = producerWikimedia;
    }

    public void consumerStreamAndPublish() {
        webClient.get()
                .uri("/stream/recentchange")
                .retrieve()
                .bodyToFlux(String.class)
                .subscribe(producerWikimedia::sendMessage);
    }
}

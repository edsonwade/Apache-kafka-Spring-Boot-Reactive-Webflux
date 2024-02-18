package code.with.vanilson.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class WikimediaTopicConfig {

    /**
     * Creates a new KafkaJsonProducer topic named "my-topic".
     * And return NewTopic object representing the configured KafkaJsonProducer topic.
     */
    @Value("${wikimedia.stream}")
    public String wikimediaTopic;

    @Bean
    public NewTopic wikimediaTopicStream() {
        return TopicBuilder
                .name(wikimediaTopic)
                .build();
    }
}

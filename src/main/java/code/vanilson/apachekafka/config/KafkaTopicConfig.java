package code.vanilson.apachekafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    /**
     * Creates a new KafkaJsonProducer topic named "my-topic".
     * And return NewTopic object representing the configured KafkaJsonProducer topic.
     */
    @Value("${my.topic}")
    public String myTopic;
    @Bean
    public NewTopic buildTopicMessage() {
        return TopicBuilder
                .name(myTopic)
                .build();
    }
}

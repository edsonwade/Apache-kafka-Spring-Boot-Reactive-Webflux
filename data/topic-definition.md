# Introduction to Kafka Topics

Kafka topics are fundamental to Kafka's data organization and messaging system. Here's a breakdown of what topics are and how you can work with them:

1. **What is a topic?**
    - A topic in Kafka is a category or feed name to which records (messages) are published by producers.
    - Topics are partitioned, meaning they can be divided into multiple partitions to allow for parallel processing and scalability.

2. **Creating a topic:**
    - In Kafka, topics are typically created either through configuration or programmatically.
    - Configuration: Topics can be pre-configured in Kafka's server properties file (`server.properties`).
    - Programmatically: Topics can also be created dynamically in code using Kafka's AdminClient API or a higher-level library like Spring Kafka.

3. **Configuring topics:**
    - Topics can have various configurations, such as the number of partitions, replication factor, retention policy, cleanup policy, etc.
    - These configurations determine how Kafka handles data storage, retention, and replication for the topic.

4. **Producing to a topic:**
    - Producers publish records/messages to Kafka topics.
    - Each record consists of a key, a value, and an optional timestamp.
    - Producers can specify the target topic when sending records.

5. **Consuming from a topic:**
    - Consumers subscribe to Kafka topics to consume records/messages.
    - Consumers can read messages from one or more partitions of a topic.
    - Consumer groups allow multiple consumers to work together to process records from a topic, providing fault tolerance and load balancing.

6. **Scaling topics:**
    - Kafka allows you to scale topics horizontally by adding more partitions.
    - Increasing the number of partitions allows for greater parallelism and throughput when producing and consuming messages.

7. **Monitoring and management:**
    - Kafka provides tools for monitoring topic activity, such as Kafka Manager, Confluent Control Center, and built-in metrics.
    - Topics can be managed and monitored using these tools to ensure optimal performance and reliability.

Starting with topics gives you a solid foundation for understanding how data flows through Kafka and how different components interact. As you become more familiar with topics, you can explore more advanced features and concepts in Kafka, such as consumer groups, partitions, replication, and fault tolerance.

1. **Example**:
````
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    // Injecting the topic name from application properties
    @Value("${my.topic}")
    public String myTopic;

    // Constructor injection for KafkaTemplate
    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    // Method to send a message to Kafka
    public void sendMessage(String msg) {
        // Logging the message being sent
        log.info(String.format("Sending message to my-topic: %s", msg));
        
        // Using KafkaTemplate to send the message to the specified topic
        kafkaTemplate.send(myTopic, msg);
    }
}
````
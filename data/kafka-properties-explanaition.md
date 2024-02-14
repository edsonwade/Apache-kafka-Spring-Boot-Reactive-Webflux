# Kafka Consumer and Producer Setup with Spring Kafka in Spring Boot

This repository demonstrates how to configure Kafka consumers and producers using Spring Kafka in a Spring Boot application.

## Configuration Explanation

### Kafka Consumer Configuration

- `bootstrap-servers`: Specifies the Kafka broker addresses to connect to. In this case, it's `localhost:9092`.
- `group-id`: Specifies the consumer group ID. Consumer groups enable parallel consumption of messages by multiple consumers.
- `auto-offset-reset`: Specifies the auto-reset behavior for the consumer group when no initial offset is defined or if the current offset is invalid. Setting it to `earliest` means that the consumer will start reading from the earliest available message in the partition.
- `key-deserializer` and `value-deserializer`: Specify the deserializers for the keys and values of Kafka messages. Here, both are set to `StringDeserializer` as you're dealing with strings.

### Kafka Producer Configuration

- `bootstrap-servers`: Specifies the Kafka broker addresses to connect to, same as in the consumer configuration.
- `key-serializer` and `value-serializer`: Specify the serializers for the keys and values of Kafka messages. Here, both are set to `StringSerializer` as you're dealing with strings.

### Spring Boot Server Configuration

- `port`: Specifies the port on which the Spring Boot server will run. Here, it's configured to run on port `8081`.

## Running the Application

To run the application, you need to have Apache Kafka installed and running locally on port 9092.

1. Clone this repository.
2. Make sure Kafka is running on your local machine.
3. Open the project in IntelliJ IDEA.
4. Run the Spring Boot application.
5. The application should start, and you can verify the consumer and producer behavior by checking the console output or by sending test messages to Kafka topics.

## Using Docker Compose for Kafka Interaction

To interact with Kafka topics and messages using Docker Compose, you can use the Kafka command-line tools provided by Kafka. Here's how you can use them:

### 1. 📥 Consumer

To consume messages from a Kafka topic, run the following command in a terminal window:

```bash
docker-compose exec kafka kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic my-topic --from-beginning
```

This command connects to the Kafka broker running in the Docker container and starts consuming messages from the specified topic (my-topic).
It reads messages from the beginning (--from-beginning).

### 2. 📤 Producer
To produce messages to a Kafka topic, run the following command in another terminal window:

```
docker-compose exec kafka kafka-console-producer.sh --bootstrap-server localhost:9092 --topic my-topic
```
This command connects to the Kafka broker running in the Docker container and opens an interactive shell where you can type messages. 
Each line you type will be treated as a separate message and will be sent to the specified topic (my-topic).

### 3. 📋 Topic Management
To manage Kafka topics, you can use the kafka-topics command. For example, to list all topics:

````
docker-compose exec kafka kafka-topics.sh --list --bootstrap-server localhost:9092
````

### Basic Docker-compose for kafka config.

````
version: '3'

services:
  zookeeper:
    image: wurstmeister/zookeeper:latest
    ports:
      - "2181:2181"

  kafka:
    image: wurstmeister/kafka:latest
    ports:
      - "9092:9092"
    environment:
      KAFKA_ADVERTISED_LISTENERS: PLAINTEXT://localhost:9092
      KAFKA_LISTENER_SECURITY_PROTOCOL_MAP: PLAINTEXT:PLAINTEXT
      KAFKA_INTER_BROKER_LISTENER_NAME: PLAINTEXT
      KAFKA_ZOOKEEPER_CONNECT: zookeeper:2181
    depends_on:
      - zookeeper

````

This command lists all topics available on the Kafka broker running in the Docker container.

By using Docker Compose along with Kafka's command-line tools, you can easily manage Kafka topics, produce and consume messages, all within your local development environment.
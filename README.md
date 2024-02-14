# Apache Kafka with Spring Boot Reactive Webflux 🚀

### Description ℹ️
This repository demonstrates the integration of Apache Kafka with Spring Boot Reactive Webflux, showcasing asynchronous, non-blocking communication between microservices through Kafka messaging.

### Topics 📋
1. **Introduction** 🌐
2. **Setup** 🔧
3. **Implementation** 💻
4. **Usage** 🛠️

### Introduction 🌐
Apache Kafka is a distributed streaming platform that is widely used for building real-time data pipelines and streaming applications. Spring Boot Reactive Webflux provides a reactive programming model for building asynchronous, non-blocking applications. Integrating Kafka with Spring Boot Reactive Webflux allows developers to build scalable, resilient, and highly responsive systems.

### Setup 🔧
To run this project locally, follow these steps:
1. Install Apache Kafka and ensure it's running.
2. Clone this repository.
3. Open the project in your favorite IDE.
4. Configure Kafka properties in `application.properties`.
5. Build and run the application.

### Implementation 💻
This project demonstrates how to:
- Produce messages to Kafka topics using Spring Boot Reactive Webflux.
- Consume messages from Kafka topics asynchronously.
- Handle Kafka message processing in a reactive manner using Webflux.

### Usage 🛠️
1. **Producing Messages**: Send HTTP requests to produce messages to Kafka topics.
2. **Consuming Messages**: Set up consumers to listen to Kafka topics and process messages reactively.
3. **Error Handling**: Implement error handling strategies for Kafka message processing failures.

### Kafka Components 🛠️
- **Producer**: Component responsible for publishing messages to Kafka topics.
- **Consumer**: Component responsible for subscribing to Kafka topics and processing messages.
- **Topic**: Logical channel or category to which messages are published by producers and subscribed to by consumers.
- **Broker**: A Kafka server that stores and manages the topics.
- **Zookeeper**: Manages and coordinates Kafka brokers.

### Kafka Cluster Example 🌐

+---------+
|         |
| Producer|        +-------------+
|         |------->|   Broker 1  |
+---------+        +-------------+
                   |   Broker 2  |    +---------+
                   +-------------+    |         |
                   |   Broker 3  |----| Consumer|
                   +-------------+    |         |
                       |   Zookeeper|  +---------+
                       +-------------+
                          |   Topic1   |
                          +-------------+
                          |   Topic2   |
                          +-------------+


### How Kafka Works 🛠️

🚀 **Publish-Subscribe Model**: Kafka follows a publish-subscribe model where producers publish messages to topics, and consumers subscribe to these topics to receive messages.
   
📋 **Topics**: Topics are logical channels or categories to which messages are published by producers. Each message published to Kafka is associated with a topic.

🔧 **Brokers**: Kafka brokers are servers that store and manage topics. They are responsible for receiving, storing, and serving messages to consumers. A Kafka cluster typically consists of multiple brokers for scalability and fault tolerance.

🌐 **Zookeeper**: Zookeeper is a centralized service for maintaining configuration information, providing distributed synchronization, and facilitating leader election within the Kafka cluster. It manages broker coordination and maintains metadata about topics, partitions, and consumer offsets.

💻 **Producers**: Producers are components responsible for publishing messages to Kafka topics. They send messages to Kafka brokers, which then distribute them to the appropriate partitions within the topic.

🛠️ **Consumers**: Consumers are components that subscribe to Kafka topics and consume messages published to those topics. They pull messages from Kafka brokers and process them according to their application logic.

Kafka ensures fault tolerance, scalability, and high throughput by distributing topics across multiple brokers and allowing consumers to consume messages in parallel from different partitions.
                        

### Contributors 👥
- [Vanilson Muhongo](https://github.com/edsonwade)

### License 📝
This project is licensed under the [MIT License](LICENSE).

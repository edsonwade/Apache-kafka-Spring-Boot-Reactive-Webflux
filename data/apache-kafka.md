# IntelliJ IDEA and Apache Kafka Configuration

Thank you for clarifying the location where you found the Debian distribution is missing. It seems that you've identified that the Debian distribution is not listed under "Manage Targets" in the IntelliJ IDEA "Edit Configurations" dialog.

## Configure WSL Distribution Paths in IntelliJ IDEA:

To resolve this issue and ensure that the Debian distribution is listed as a target in IntelliJ IDEA for managing configurations, follow these steps:

1. Open IntelliJ IDEA and navigate to "File" > "Settings" (or "IntelliJ IDEA" > "Preferences" on macOS).
2. In the Settings/Preferences dialog, go to "Build, Execution, Deployment" > "WSL".
3. Ensure that both the Ubuntu and Debian distributions are correctly configured and listed in the "Manage Targets" section.

### Add Debian Distribution if Missing:

If the Debian distribution is not listed under "Manage Targets", you can add it manually by clicking the "+" button and selecting the Debian distribution from the list of available distributions.

### Verify Configuration:

After adding the Debian distribution, verify that it appears in the list under "Manage Targets".

### Update/Edit Configurations:

Once the Debian distribution is listed as a target, you should be able to select it when creating or editing run/debug configurations, such as for building and running your project.

By ensuring that the Debian distribution is correctly configured and listed as a target in IntelliJ IDEA's WSL settings, you should be able to access it when managing configurations for your projects.

## Kafka Command Line Instructions

Below are the instructions for running Apache Kafka on different operating systems:

### For Windows:

```bash
    bin\windows\zookeeper-server-start.bat config\zookeeper.properties
    bin\windows\kafka-server-start.bat config\server.properties
```

For Debian/Ubuntu (Unix-like):

```bash
    bin/zookeeper-server-start.sh config/zookeeper.properties
    bin/kafka-server-start.sh config/server.properties
```

For macOS (Unix-like):
```bash
bin/zookeeper-server-start.sh config/zookeeper.properties
bin/kafka-server-start.sh config/server.properties
```

Creating Topics
You can create Kafka topics using the following command:
```bash
bin/kafka-topics.sh --create --topic my-topic --bootstrap-server localhost:
```

## Creating Producers and Consumers

After starting Kafka, you can create producers to publish messages to topics and consumers to consume those messages. Below are the commands to create producers and consumers:

### For Producing Messages:

```bash
bin/kafka-console-producer.sh --topic my-topic --bootstrap-server localhost:9092

```

For Consuming Messages:
```bash
bin/kafka-console-consumer.sh --topic my-topic --from-beginning --bootstrap-server localhost:9092

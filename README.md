# spring-boot-kafka

Download Kafka from https://www.apache.org/dyn/closer.cgi?path=/kafka/2.4.1/kafka_2.12-2.4.1.tgz
and unzip it.

* Start Zookeeper Server
>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

* Start Kafka Server
>.\bin\windows\kafka-server-start.bat .\config\server.properties

* Create a topic with a name K_TOPIC
>.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic K_TOPIC

* Create a producer for topic K_TOPIC
>.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic K_TOPIC

>Hello Kafka

* Create a consumer for a topic K_TOPIC
>.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic K_TOPIC --from-beginning

>Hello Kafka

* Delete a topic
>.\bin\windows\kafka-topics.bat --zookeeper localhost:2181 --delete --topic K_TOPIC

>Topic K_TOPIC is marked for deletion.

>Note: This will have no impact if delete.topic.enable is not set to true.

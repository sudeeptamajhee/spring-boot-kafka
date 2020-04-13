# spring-boot-kafka


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
Hello Kafka


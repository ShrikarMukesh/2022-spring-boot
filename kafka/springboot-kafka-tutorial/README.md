start-zookeeper
zookeeper-server-start.bat ../../config/zookeeper.properties

start-kafka
kafka-server-start.bat ../../config/server.properties

create topic
kafka-topics.bat --create --topic Topic1 --bootstrap-server localhost:9092

list-topics
kafka-topics.bat --bootstrap-server=localhost:9092 --list

describe topic
kafka-topics.bat --describe --topic Topic1 --bootstrap-server localhost:9092

producer cmd
kafka-console-producer.sh --topic Topic1 --bootstrap-server localhost:9092

consumer cmd
kafka-console-consumer.bat --topic Topic1 --from-beginning --bootstrap-server localhost:9092

https://stream.wikimedia.org/v2/stream/recentchange

https://esjewett.github.io/wm-eventsource-demo/
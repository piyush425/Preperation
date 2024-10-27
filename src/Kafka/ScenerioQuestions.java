//supose user hit multiple times the same message in topic so what happen consumer will received same message multiple time right

/**
 * If the same message is sent multiple times to a Kafka topic, the consumer will receive each of these instances separately.
 *
 * Each Message Gets a Unique Position: Kafka assigns a unique offset to every message in the topic, even if the content is the same.
 * So, each instance of the message is stored and treated as a new message.
 *
 * In short: Kafka treats each identical message as a unique event, so the consumer will receive and process each one independently.
 *
 * how to handle
 *
 *  Kafka doesn’t remove duplicates. If deduplication is needed,
 *  it must be handled by the producer (to avoid sending duplicates) or by the consumer (to skip duplicates based on a unique message ID).
 *
 *  1. Add Deduplication on the Producer Side
 * Ensure the producer sends a message only once by:
 * Checking a unique identifier before sending.
 * Using idempotent producer settings in Kafka (e.g., enable.idempotence in Kafka 0.11 and later), which prevents duplicate messages in case of retrying after failures.
 *
 * 2. Add Deduplication Logic on the Consumer Side
 *
 * public class MyConsumer {
 *
 *     private final Set<String> processedMessageIds = ConcurrentHashMap.newKeySet();
 *
 *     @KafkaListener(topics = "user-events", groupId = "journal-service")
 *     public void listen(UserEvent userEvent) {
 *         if (processedMessageIds.contains(userEvent.getId())) {
 *             // Skip duplicate
 *             return;
 *         }
 *
 *         // Process the message
 *         processEvent(userEvent);
 *
 *         // Mark as processed
 *         processedMessageIds.add(userEvent.getId());
 *     }
 * }
 * When you set enable.idempotence=true on the producer,
 * Kafka achieves idempotent message delivery, meaning multiple sends of the same message (due to retries) result in only one copy being stored.
 */



//when we sent the message in topic
//
//what kafka accept
//plain text
//jsonstring
//object

/**
 * Kafka is flexible with data formats because it works with byte arrays, so you can send plain text,
 * JSON strings, serialized objects, and binary data. However,
 * you cannot send unserialized objects or non-UTF-8 text without first converting them to bytes.
 * Serialization is essential for any data format to be compatible with Kafka.
 *
 * With Spring Kafka's KafkaTemplate.send, Spring handles serialization based on your configuration,
 * ensuring the message is properly serialized before sending it to Kafka.
 * This makes it easy to work with different data formats without manually handling byte conversion
 *
 * e.g (Application.properties)
 * spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
 * spring.kafka.producer.value-serializer=org.springframework.kafka.support.serializer.JsonSerializer
 */


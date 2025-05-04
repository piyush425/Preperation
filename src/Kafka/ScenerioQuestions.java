//supose user hit multiple times the same message in topic so what happen
// consumer will received same message multiple time right

//Two partitions → One consumer → ✅ Possible

//One partition → Two consumers → ❌ Not possible (in same consumer group)
// --> but if there is a use case where you want multiple consumer  same partion (same message you want)
//then consumer group should be diffrent (i.e consumer group id should be diffrent with same topic)

/**
 * Does each consumer have the same partition key when using different consumer groups?
 * ✅ Yes, they can read from the same partition (same key)
 * Because:
 *
 * The partition key decides which partition a message goes to.
 *
 * If multiple consumer groups are subscribed to the same topic, then:
 *
 * They all can read from the same partitions (including same key).
 *
 * But independently — each group maintains its own offset.
 */

//----------------------------------------

/**
 * How Kafka Producer Decides Partition:
 * ✅ 1. If Key is Provided (producer.send(topic, key, value)):
 * Kafka uses the key’s hashcode to determine the partition:
 *
 * partition = hash(key) % number_of_partitions
 * This ensures all messages with the same key go to the same partition (good for ordering).
 *
 * ✅ 2. If Partition is Explicitly Provided (producer.send(topic, partition, key, value)):
 * Kafka will directly send the message to the specified partition, ignoring the key.
 *
 * You control where it goes.
 *
 * ✅ 3. If No Key & No Partition Given:
 * Kafka uses round-robin by default (or a custom partitioner if defined).
 *
 * This balances load across all partitions.
 */

/**
 * ✅ Why and When to Explicitly Specify Partition in Kafka Producer?
 * Use it when:
 * Custom Routing Logic: Direct specific messages to certain partitions (e.g., priority messages to partition 0).
 *
 * Guaranteed Ordering: Ensure related messages are in the same partition to maintain processing order.
 * E.g., all transactions for user X → partition 3
 *
 * Bypass Hashing: Skip Kafka’s default key-based partitioning and manually control partitioning.
 *
 * Performance Tuning: Manually balance load across partitions based on message types or business logic.
 * example-
 * Maybe you know your workloads well:
 *
 * Partition 0 → write-heavy users
 *
 * Partition 1 → read-heavy users
 *
 * Partition 2 → background sync
 *
 * You manually route messages to balance load in a business-aware way.
 *
 * When not to use it:
 * If you don’t need strict control, let Kafka handle partitioning automatically (via key or round-robin).
 */


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


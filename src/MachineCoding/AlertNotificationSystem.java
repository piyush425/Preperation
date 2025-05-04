package MachineCoding;

import java.util.*;

public class AlertNotificationSystem {

    public static void main(String[] args) throws InterruptedException {
        // Configuration for each log type
        Map<String, Config> configMap = new HashMap<>();
        configMap.put("Critical", new Config(10, 100, 100));
        configMap.put("Warning", new Config(5, 60, 60));
        configMap.put("Info", new Config(20, 120, 30));
        configMap.put("Blocker", new Config(3, 50, 100));

        // Subscribed users for each log type
        Map<String, List<String>> userSubscriptions = new HashMap<>();
        userSubscriptions.put("Critical", Arrays.asList("User1", "User2"));
        userSubscriptions.put("Warning", Arrays.asList("User3"));
        userSubscriptions.put("Info", Arrays.asList("User1", "User4"));
        userSubscriptions.put("Blocker", Arrays.asList("User5"));

        // Initialize the LogProcessor
        LogProcessor logProcessor = new LogProcessor(configMap, userSubscriptions);

        // Simulate incoming logs
        long currentTime = System.currentTimeMillis() / 1000; // Current time in seconds
        Random random = new Random();

        String[] logTypes = {"Critical", "Warning", "Info", "Blocker"};

        System.out.println("Processing log events...\n");

        for (int i = 0; i < 50; i++) {
            String logType = logTypes[random.nextInt(logTypes.length)];
            long timestamp = currentTime + i;

            logProcessor.processLog(logType, timestamp);

            Thread.sleep(200); // Simulate delay for the next log
        }
    }
}

class Config {
    int frequency; // Number of events
    int duration;  // Duration in seconds
    int waitTime;  // Wait time in seconds

    public Config(int frequency, int duration, int waitTime) {
        this.frequency = frequency;
        this.duration = duration;
        this.waitTime = waitTime;
    }
}

class LogProcessor {
    private final Map<String, Config> configMap; // Configuration rules
    private final Map<String, List<String>> userSubscriptions; // User subscriptions
    private final Map<String, Deque<Long>> eventWindows; // Sliding windows for each type
    private final Map<String, Long> waitEndTimes; // Tracks the wait period end time for each type

    public LogProcessor(Map<String, Config> configMap, Map<String, List<String>> userSubscriptions) {
        this.configMap = configMap;
        this.userSubscriptions = userSubscriptions;
        this.eventWindows = new HashMap<>();
        this.waitEndTimes = new HashMap<>();
    }

    public void processLog(String type, long timestamp) {
        // Initialize sliding window for the type if not already present
        eventWindows.putIfAbsent(type, new LinkedList<>());
        // Get the configuration for this log type
        Config config = configMap.get(type);
        if (config == null) {
            System.out.println("No configuration found for log type: " + type);
            return;
        }
        // Check if the type is currently in a wait state
        long currentWaitEnd = waitEndTimes.getOrDefault(type, 0L);
        if (timestamp < currentWaitEnd) {
            System.out.println("Log type " + type + " is in wait state. Ignoring event at timestamp " + timestamp);
            return;
        }
        // Add the event to the sliding window
        Deque<Long> window = eventWindows.get(type);
        window.addLast(timestamp);
        // Remove outdated events from the window
        while (!window.isEmpty() && window.peekFirst() < timestamp - config.duration) {
            window.pollFirst();
        }
        // Check if the alert condition is met
        if (window.size() >= config.frequency) {
            // Trigger notification
            notifyUsers(type, timestamp);
            // Set the wait period
            waitEndTimes.put(type, timestamp + config.waitTime);

            // Clear the sliding window to start counting again after the wait period
            window.clear();
        }
    }

    private void notifyUsers(String type, long timestamp) {
        List<String> subscribers = userSubscriptions.get(type);
        if (subscribers == null || subscribers.isEmpty()) {
            System.out.println("No subscribers for log type: " + type);
            return;
        }
        System.out.println("ALERT: " + type + " occurred " + configMap.get(type).frequency +
                " times within " + configMap.get(type).duration + " seconds at timestamp " + timestamp);
        System.out.println("Notifying users: " + String.join(", ", subscribers) + "\n");
    }
}


//Microserbices
/**
 * Microservices is an architectural style where an application is built as a collection of small,
 * independent services that communicate via APIs. Each service focuses on a specific business capability,
 * runs independently, and can be developed, deployed, and scaled separately.
 */



// ------------------------------what is benefit of spring boot---------------------------------------------





/**
 * it reduces development time and effort by handling configurations and dependencies for you.
 *
 *
 * it simplifies the configuration and setup process, allowing developers to force more on writing code for their application
 * e.g->Auto-Configuration (dependecies)
 * Starter Dependencies:
 * Microservices Ready
 * Embedded Servers: No need for external servers (Tomcat, Jetty) – just run the app.
 *
 */


//spring vs spring boot

/**
 * Configuration: Spring requires a lot of manual configuration, while Spring Boot comes with auto-configuration and default settings.
 * Project Setup: Spring Boot projects can be set up and launched quickly with minimal setup, while Spring projects involve more complexity.
 * Embedded Server: Spring Boot has embedded servers by default, while Spring requires external server configuration and deployment.
 * Focus: Spring is a comprehensive framework with detailed customization options, while Spring Boot is focused on rapid development with less configuration.
 */


// ----------------------------CAP theorem

/**
 * The CAP Theorem states that a distributed system can only achieve at most two out of the following three properties simultaneously:
 *
 * 1. CP (Consistency + Partition Tolerance):
 * Scenario: We have a primary server and multiple replica servers. When a data update happens on the primary server,
 * it must be propagated to all replicas before the system considers the data consistent.
 * What Happens: During the update, if a request comes to read the data before the replication is complete,
 * the system will deny the request, making the service temporarily unavailable to ensure consistency.
 *
 * 2. AP (Availability + Partition Tolerance):
 * Scenario: We have one primary server and multiple replica servers. When a data update happens on the primary server, it does not wait to synchronize with all replicas.
 * What Happens: If another request comes to read the data before replication is complete, the system serves the data from any available server, even if it’s not the latest.
 */

//---------------------------------------------Hasset vs Treeset

/**
 *
 * Use HashSet when you want fast performance and don’t care about the order. O(1)
 * Use TreeSet when you need elements in a sorted order. O(logn)
 *
 * /Create a TreeSet with a custom comparator for descending order
 *  reeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
 *
 */

//LinkedList

/**
 * When to Use LinkedList:
 * When you need frequent insertions and deletions at the beginning, middle, or end of the list.
 * When random access (index-based access) is not required frequently.
 * When you need to implement a queue or a deque.
 */

// Memorisation, Normalisation, Denormalisation

/**
 * 1. Memorization:
 * Context: Programming.
 * Purpose: Caches results of function calls to avoid redundant computations.
 *
 * 2. Normalization:
 * Context: Databases.
 * Purpose: Reduces redundancy by dividing tables and creating relationships.
 * Example: Splitting a customer table into separate Customer and Address tables.
 * 3. Denormalization:
 * Context: Databases.
 * Purpose: Combines tables to improve read performance at the cost of redundancy.
 */

// Having and Where clause in SQL

/**
 * WHERE: Filters individual rows before grouping.
 * HAVING: Filters grouped rows after GROUP BY.
 */

/**T
 * he GROUP BY clause is used to group rows that have the same values in specified columns into summary rows. It's commonly used with aggregate functions like COUNT(), SUM(), AVG(), MIN(), and MAX() to summarize data.**/

 //To handle separate transactions concurrently without interference:

/**
 *To handle SQL databases separately, I would implement a dedicated Data Access Layer (DAL) or use the Repository Pattern to encapsulate all database-related logic.
 * This ensures that SQL queries, CRUD operations, and connection management are isolated in one place.
 * I would then use a Service Layer to manage business logic and invoke the DAL or repository as needed,
 * without mixing business rules and data access code. Additionally, by using ORM frameworks like Hibernate,
 * I can simplify database interactions using objects rather than raw SQL. This separation of concerns enhances maintainability, testability, and flexibility of the application
 */

//Checked vs Unchecked

/**
 * 1. Checked Exceptions
 * Definition: Checked exceptions are exceptions that are checked at compile-time by the compiler.
 *
 * Examples: IOException, SQLException, ClassNotFoundException.
 *
 * 2. Unchecked Exceptions
 * Definition: Unchecked exceptions are exceptions that are not checked at compile-time. These include exceptions that can occur due to programming errors.
 *
 * Examples: NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException.
 */

//how why where   String Immutable

/**
 *  --->How is a String Immutable?
 * When a String object is created, its value is stored in an internal private final char array (private final char value[]), which cannot be modified once assigned.
 * The String class is also marked as final, meaning it cannot be subclassed or overridden, which further enforces immutability.
 *
 * ----->Why Does Immutability Matter
 *
 * 1. Security: Prevents modification in sensitive operations.
 * String filePath = "/user/documents/secret.txt";
 * // If String were mutable, someone could modify `filePath` to: "/user/public.txt"
 *
 * 2.String Pooling: Java uses a special memory area called the String Pool to store string literals.
 * If a string with the same content already exists in the pool, the reference is reused instead of creating a new object.
 *
 * 3.Developers can pass strings freely between methods and classes without worrying about the original string being altered unexpectedly.
 *
 * 4.Immutability also helps when String is used as a key in data structures such as HashMap or HashSet.
 *
// * Map<String, String> userMap = new HashMap<>();
// * userMap.put("user123", "John Doe");
// *
// * String key = "user123";
// * key = "user456";  // Reassignment to a new string
// *
// * // The original key "user123" in the map remains unchanged
// * System.out.println(userMap.get("user123"));  // Outputs: John Doe
 *
 * -->Where
 *
 * in string pool heap memory
 */

//Hashtable vs Hashmap

/**
 * Use Hashtable when you need a thread-safe map and cannot use external synchronization.
 * Use HashMap in most scenarios as it is faster and allows null keys and values.
 */

//pathvariabe vs requestvariable

/**
 * if you want to extract a value from the URI path, use @PathVariable. For example, to get a user by ID using the path /users/123:
 *
 * If you want to extract a value from the query string, use @RequestParam. For example, to get a user by ID using a query parameter like /users?id=123:
 *
 *
 *  * Path variables are part of the URL itself. They are used to extract values from the URL path and map them to method parameters in the controller.-->/users/{userId}
 *  * Request parameters are passed as part of the query string in the URL (i.e., after the ? symbol)->/users?id=123.
 *
 */

// AOP

/**
 * AOP allows you to add extra behavior (like logging) to parts of your code (methods or classes) without changing the actual code.
 * It separates the common tasks (called aspects) from your main logic.
 *
 * For example, if you need to log the start and end of every method, instead of writing System.out.println() in every method,
 * you can create an "aspect" that automatically logs for you.
 */













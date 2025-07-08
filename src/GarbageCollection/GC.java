
//What is Garbage Collection in Java, and why is it necessary?
//Explain how memory management works in Java.

/**
 *  Garbage Collection (GC) is Java's automatic process to remove unused objects from memory,
 *  freeing space and preventing memory leaks.
 *  It helps keep applications running efficiently without manual memory management.
 *
 *  Java uses automatic memory management with GC to allocate and free memory.
 */

//What types of memory areas are managed by the JVM?

/**
 *  JVM manages Heap (where objects are stored)
 *  Stack (for method calls and local variables)
 *  Method Area (class metadata)
 *  Native Method Stack
 */

//Describe the different Garbage Collection algorithms available in Java

/**
 * Mark-Sweep:1
 * How it works: Marks all live (reachable) objects, then sweeps away any unused objects.
 * Pros and Cons: Simple and effective but can leave gaps in memory (fragmentation), which slows down future allocations.
 *
 * Mark-Sweep-Compact:
 * How it works: First marks and sweeps like Mark-Sweep, then compacts memory by moving live objects to one end of the memory space.
 * Pros and Cons: Reduces fragmentation and organizes memory better but takes a bit more time due to the compaction step.
 *
 * Copying:
 *
 *
 *
 */

//How does the Generational Garbage Collection model work in Java?

/**
 * Java splits memory into Young Generation (new objects), Old Generation (long-lived objects), and Permanent Generation/Metaspace (class metadata).
 * Most GC work happens in the Young Generation, as new objects are more likely to be short-lived, making GC faster and reducing pauses.
 */

//What is the difference between Minor GC and Major GC?

/**12c
 * Minor GC
 * Targets the Young Generation: Minor GC focuses only on the Young Generation, where most objects are short-lived.
 * Process:
 * Checks for reachable objects: Identifies which objects are still needed (alive) and discards the rest.
 * Moves surviving objects: Any objects that survive a few rounds in the Young Generation get moved to the Old Generation (they’re now assumed to be longer-lived).
 * Result: Fast cleanup, freeing up space in the Young Generation. It usually happens often but doesn’t take much time, causing only a brief pause.
 *
 * Major GC (Full GC)
 * Targets the entire heap: Major GC cleans up both Young and Old Generations.
 * Process:
 * Marks all live objects: First, it identifies all objects still in use in both Young and Old Generations.
 * Removes unreferenced objects: It deletes (sweeps away) any objects that are not referenced anymore.
 * Optional compaction: Depending on the collector, it may compact memory to reduce fragmentation in the Old Generation.
 * Result: Major GC is thorough and less frequent but causes longer pauses because it processes the entire heap, which impacts performance.
 *
 */

//compaction

/**
 * Compaction means rearranging memory to place all live (in-use) objects together, clearing out gaps left by deleted ones. This prevents fragmentation—scattered empty spaces—so memory can be used more efficiently.
 *
 * Why It’s Important:
 * Without compaction, gaps build up, and it becomes harder to find big enough spaces for new objects.
 */

//version Of GC

/**
 * Serial GC: It is single-threaded and processes one GC at a time, first handling Minor GC, then Major GC.
 * Parallel GC: Runs Minor and Major GCs in parallel using multiple threads, which reduces pause times.
 * CMS GC: Works concurrently, allowing the application to run while GC works in the background, though it doesn’t fully eliminate pauses and doesn’t perform compaction.
 * G1 GC: Solves CMS’s lack of compaction by dividing the heap into regions and compacting them as needed.
 *
 * ZGC (Z Garbage Collector) m
 * Purpose: Designed for ultra-low latency (pause times under 10ms) regardless of heap size, making it ideal for high-performance applications.
 * How it works: Uses advanced techniques like colored pointers and loads most of its work concurrently, which minimizes interruptions.
 * Difference: Unlike CMS or G1, ZGC manages very large heaps with almost no pause time, making it stand out in performance for massive applications.
 *
 * Shenandoah GC
 * Purpose: Also targets ultra-low latency for large heaps, similar to ZGC.
 * How it works: Runs all compaction and collection tasks concurrently with application threads, even the compaction step, which other GCs pause for.
 * Difference: Like ZGC, Shenandoah performs tasks in the background and supports large heaps with minimal pauses,
 * but it’s specifically optimized for low-latency workloads in large applications.
 */

//What are Eden Space, Survivor Space, and Tenured Space?

/**
 * Eden Space: Part of the Young Generation. New objects are created here.
 * Survivor Spaces: Also part of the Young Generation, there are usually two survivor spaces (S0 and S1). When objects survive a few Minor GCs, they are moved here.
 * Tenured (or Old) Space: This is the Old Generation where long-lived objects are stored after surviving multiple GCs in the Young Generation.
 */

// Types of Reference

/**
 * Strong Reference
 *
 * What it is: The standard reference type, used by default.
 * Garbage Collection: Objects with strong references are never collected by GC as long as they’re reachable.
 * Example: String name = new String("John");
 * Soft Reference
 *`
 *
 * What it is: Holds an object that should only be collected if memory is low.
 * Garbage Collection: GC clears these only when the JVM is low on memory, helping avoid memory issues.
 * Use Case: Caches.
 * Example: SoftReference<String> ref = new SoftReference<>(new String("John"));
 * Weak Reference
 *
 * What it is: Holds an object that can be collected at the next GC cycle.
 * Garbage Collection: Weak references don’t prevent GC, so objects are collected even if weakly referenced.
 * Use Case: Maps like WeakHashMap, where you don’t want keys to prevent GC.
 * Example: WeakReference<String> ref = new WeakReference<>(new String("John"));
 * Phantom Reference
 *
 * What it is: Used to track when an object is about to be collected.
 * Garbage Collection: GC clears these but adds them to a queue for cleanup actions just before the object is collected.
 * Use Case: Resource management and cleanup.
 * Example: PhantomReference<String> ref = new PhantomReference<>(new String("John"), refQueue);
 */

//7. What causes an OutOfMemoryError?

/**
 * This error happens when the JVM runs out of heap space and cannot allocate memory for new objects. Common causes: memory leaks or large, unexpected loads.
 */

//How would you tune GC?

/**Tune GC with JVM flags like -Xms, -Xmx for heap size and choose a suitable collector (-XX:+UseG1GC, -XX:+UseConcMarkSweepGC)
 * based on your app’s needs (e.g., low-latency vs. high throughput).
 *
 * bootRun {
 *     jvmArgs = ['-Xms512m', '-Xmx2g']
 * }
 * -Xms512m: Sets the initial heap size to 512 MB.
 * -Xmx2g: Sets the maximum heap size to 2 GB.
 */

//How would you detect a memory leak?

/**
 *Use tools like VisualVM or heap dumps. Look for growing memory usage or objects that remain in memory longer than expected
 */






// CAS

/**
 * Compare-And-Swap (CAS) is a technique used in multithreading to safely update a value without using locks.
 *
 * Here’s how CAS (Compare-And-Swap) makes this process safe:
 *
 * Thread A checks the counter and sees it’s 10. It plans to decrease it to 9.
 *
 * Thread B also checks the counter at the same time and also sees 10. It plans to decrease it to 9 as well.
 *
 * Thread A uses CAS to "claim" the counter by asking: “Is the counter still 10?” Since the counter is indeed 10, CAS lets Thread A safely update the counter to 9 in a single step.
 *
 * Now, Thread B tries to use CAS to update the counter, but CAS notices the counter is no longer 10—it’s 9 (because Thread A already updated it). So, Thread B’s CAS operation fails.
 *
 * Thread B must try again. It rechecks the counter, sees it’s now 9, and adjusts its plan to decrease it to 8 instead.
 *
 * CAS now lets Thread B complete its operation because the counter matches Thread B’s expected value (9), and Thread B updates the counter to 8.
 *
 * Summary:
 * CAS ensures that only one thread can change the counter at a time by checking if the value is still what the thread expected.
 * Thread A successfully decreased the counter, and Thread B had to retry until it saw the new value and could safely decrease it.
 */


/**
 * CAS checks if the value is still the same as expected before updating it.
 * If another thread has already changed the value, CAS will not proceed with the update.
 * Instead, it will retry with the new, updated value to ensure that it always has the most recent information before making any changes.
 */
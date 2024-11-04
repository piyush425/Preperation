/**
 * Two-Phase Commit (2PC)
 * Objective: To ensure all-or-nothing in distributed transactions, providing strong consistency.
 *
 * Phases:
 *
 * Phase 1 - Prepare Phase:
 * The coordinator sends a "Prepare" message to all participants, asking if they’re ready to commit the transaction.
 * Each participant responds with either "Yes" (if ready to commit) or "No" (if unable to commit).
 * Phase 2 - Commit/Rollback Phase:
 * If all participants respond "Yes": The coordinator sends a "Commit" message, and each participant commits the transaction.
 * If any participant responds "No" or fails to respond: The coordinator sends a "Rollback" message, and each participant aborts the transaction.
 * Advantages:
 *
 * Strong Consistency: All participants are in sync at the end of the process.
 * Disadvantages:
 *
 * Blocking Protocol: If the coordinator crashes after sending "Prepare" and before "Commit/Rollback," participants might wait indefinitely.
 * Single Point of Failure: If the coordinator fails, the whole system can be stalled.
 *
 *
 *
 * Three-Phase Commit (3PC)
 * Objective: A non-blocking version of 2PC, designed to reduce the risk of indefinite waiting by adding an extra phase.
 *
 * Phases:
 *
 * Phase 1 - Can Commit? Phase:
 *
 * The coordinator asks each participant if they "Can Commit?" (similar to a readiness check).
 * Each participant responds with "Yes" (if ready to prepare) or "No" (if unable to prepare).
 * Phase 2 - Pre-Commit Phase:
 *
 * If all participants respond "Yes" in Phase 1, the coordinator sends a "Pre-Commit" message.
 * Each participant prepares the transaction but doesn’t commit yet. Instead, it sends an acknowledgment back to the coordinator.
 * If any participant responded "No" or failed to respond in the "Can Commit?" phase, the coordinator sends a "Rollback" message, aborting the transaction.
 * Phase 3 - Commit/Rollback Phase:
 *
 * If all participants sent a Pre-Commit acknowledgment: The coordinator sends a final "Commit" message.
 * If any participant fails to respond in the Pre-Commit phase: The coordinator sends a "Rollback" message to ensure participants abort the transaction.
 * Advantages:
 *
 * Non-Blocking: The Pre-Commit phase allows participants to time out and release resources if the coordinator fails.
 * Reduced Single Point of Failure: Timeout mechanisms and the Pre-Commit phase reduce the likelihood of indefinite waiting.
 * Disadvantages:
 *
 * Complexity: 3PC requires additional coordination and communication steps, which increases complexity and overhead.
 * Network Latency: The extra phase and timeout handling add to the transaction time, making it slower than 2PC in latency-sensitive situations.
 */

// saga vs 2pc
/**
 * 2PC is better suited for tightly controlled, high-consistency environments, typically within a single database or closely coordinated services where strict, immediate consistency is a must.
 * Saga is ideal for distributed, long-running processes where eventual consistency is acceptable, and resilience and flexibility are more important than strict, real-time consistency.
 * In conclusion: Saga provides flexibility and resilience with eventual consistency, while 2PC offers immediate, strict consistency but is less suited to distributed systems. Each has strengths that fit specific scenarios, rather than one being a universal solution.
 *
 * Saga Pattern:
 *
 * Each step saves its changes right away and moves to the next step.
 * No locking on the database, so it’s faster and works well in big systems.
 * If something fails, it goes back and undoes previous steps to keep things consistent in the end.
 *
 * Two-Phase Commit (2PC):
 *
 * Keeps a lock on data until all parts are ready to save, making sure everything happens together.
 * Slower and can get stuck if something fails, as it waits for everyone to agree before finishing.
 * Ensures immediate, strict consistency but isn’t ideal for big, spread-out systems.
 *
 */
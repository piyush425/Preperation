package SystemDesign.KeyPoints;

public class Idempotency {
}
/**
 * 🚀 What is Idempotency?
 * "Even if a user se
 * 🛑 But this is not enough in parallel/distributed systems
 *
 * 🧠 Problem in Distributed Setup
 * You have multiple app instances
 *
 * Requests hit different servers at same time
 *
 * All check DB/Redis → key not found → all process!
 *
 * ➡️ ⚠️ Duplicate entries again!
 *
 * 🔐 Final Solution — Redis with Locking (Seryansh-style)
 * Use Redis SETNX (SET if Not Exists) to prevent race conditions:
 *
 * ✅ Steps:
 * Client sends a Idempotency-Key
 *
 * Server tries:
 *
 * text
 * Copy
 * Edit
 * SET idempotency_key "processing" NX EX 300
 * If SET succeeds: You're the first → process request
 *
 * If SET fails: Someone else is processing → wait/return cached result
 *
 * 🧰 Tools Used:
 * Tool	Purpose
 * Redis	Central cache & lock store
 * SETNX	Atomic locking
 * TTL/EX	Key expiry to avoid stale data
 * App DB	Store final result if needed
 * 🏗️ Distributed Setup Looks Like:
 * text
 * Copy
 * Edit
 * User
 *   |
 * Load Balancer
 *   |          \
 * App 1       App 2
 *    \         /
 *      [ Redis ]
 *         |
 *       (Lock & Result Store)
 * ⚙️ Production Best Practices
 * ✅ Use Redis Cluster or Redis Sentinel to avoid SPOF
 *
 * ✅ Set key TTL (5–10 mins)
 *
 * ✅ Return cached result for retries or duplicate requests
 *
 * ✅ Optionally store results in DB too (for recovery)
 *
 * 🔥 Interview One-Liner
 * “To handle idempotency in distributed systems, we use an Idempotency-Key and a centralized Redis cache with SETNX for atomic locking. This ensures only one request is processed even under retries or parallel hits across multiple instances.”
 */

/**
 * The Strangler Pattern is used to incrementally replace a monolithic system with a new microservices-based system by gradually
 * moving specific functionalities to independent microservices while keeping the remaining functionalities in the old system until all are migrated.
 *
 * Start Small:
 * Pick a small function from the monolith (e.g., Account Management).
 *
 * Create Microservice:
 * Build a separate Account Management Microservice.
 *
 * Divert Small Traffic:
 * Route 10% of account-related traffic to the new microservice.
 *
 * Increase Load Gradually:
 * Slowly increase to 30%, 50%, and finally 100% as the microservice handles more load successfully.
 *
 * Repeat for Other Features:
 * Repeat the process for other functionalities (e.g., Transactions, Reports) until the monolith is empty.
 *
 * Key Idea: Move small parts one-by-one and test each at increasing loads until the old system is fully replaced.
 */


/**--------------------------------------------------------------------------- SAGA ---------------------------------------------------------------------------------------------

/**In a microservice architecture, each service often has its own database. The challenge is ensuring that all services stay in sync when changes occur across multiple databases.
 * The SAGA pattern is used to maintain data consistency in distributed systems (e.g., microservices) without using a traditional database transaction
 */

/** Two Approaches -- Choreography and Orchestration**/

//Scenario: Food Ordering System
//        Suppose we have a food delivery system with three microservices:
//
//        Order Service: Handles order creation (DB: Orders).
//        Payment Service: Manages payments (DB: Payments).
//        Delivery Service: Schedules delivery (DB: Deliveries).
//        Each service has its own database, so when an order is placed, we need to ensure all databases are consistent.

/** 1. Choreography SAGA
 *
 * Definition:
 * Each service triggers the next one through events — no central controller.
 *
 * How it works:
 *
 * Order Service creates an order → sends OrderCreated event.
 * Payment Service processes payment → sends PaymentCompleted event.
 * Delivery Service schedules delivery → sends DeliveryScheduled event.
 * If a failure occurs:
 * Each service publishes a failure event (e.g., PaymentFailed), and previous services undo their changes.
 *
 * Pros: Easy to set up, services are independent.
 *
 * Cons: Hard to track issues, no central control.
 *
 * Quick Tip: Think of it as a chain reaction — each service triggers the next based on events
 */

//When a failure happens, the service that detects the issue publishes a Failure Event, which all relevant services are subscribed to.
// This is how previous services become aware of the failure.


/** 2.Orchestration SAGA
 *
 * Definition: A central orchestrator service manages the entire transaction flow and decides what to do at each step.
 * How it works:
 * The Orchestrator receives a command to CreateOrder.
 * It tells the Order Service to create an order and waits for a response.
 * If successful, it tells the Payment Service to process the payment.
 * If the payment succeeds, it tells the Delivery Service to schedule delivery.
 * If the Payment Service reports a failure, the Orchestrator sends compensating commands to undo the order (e.g., cancel order and refund payment).
 *
 * Flow:
 *
 * Orchestrator -> Order Service -> Order is created.
 * Orchestrator -> Payment Service -> Payment is completed.
 * Orchestrator -> Delivery Service -> Delivery is scheduled.
 * Pros: Easy to manage, clear control over the flow.
 *
 * Cons: Centralized control creates a single point of failure.
 */



package SpringBoot;


/**
 * Singleton:
 *
 * A single instance of the bean is created and shared across the entire Spring container.
 * Once created, the same instance is returned every time.
 * Eager by default, but can be made lazy using @Lazy.
 * Prototype:
 *
 * A new instance of the bean is created every time it is requested.
 * Always lazy-initialized (not created at startup).
 * Request (Web Scope):
 *
 * A new bean instance is created for each HTTP request.
 * Once the request is completed, the bean is discarded.
 * Session (Web Scope):
 *
 * A new bean instance is created for each user session.
 * The bean persists throughout the session until the session expires or the user logs out.
 *
 *
 */


/**
 * proxyMode = ScopedProxyMode.TARGET_CLASS
 *
 * You're absolutely right! When injecting a request-scoped bean into a singleton-scoped bean,
 * it will fail because the singleton bean is created at application startup,
 * while request-scoped beans are created per HTTP request.
 * Since no request exists at the time of singleton creation, the application fails.
 *
 * Solution: Using proxyMode = ScopedProxyMode.TARGET_CLASS
 * To solve this issue, we use Spring’s proxy mechanism, which delays the actual instantiation of the request-scoped bean
 * until an HTTP request is available.
 *
 * How It Works?
 * Instead of injecting the actual request-scoped bean, Spring injects a proxy object (a wrapper).
 * This proxy does not create the request-scoped bean immediately.
 * When a method is called on the proxy, it retrieves the actual request-scoped bean dynamically based on the current request.
 */
public class Scope {
}

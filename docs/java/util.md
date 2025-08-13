Rare Java + Spring Boot + Microservices Questions, with Clear understanding Answers.

1. What moves a thread from Runnable to Running? What does Thread.yield() do?
   Ans: When a thread is in the Runnable state, it means it’s ready to run but waiting for the CPU.
   The CPU scheduler (part of the Operating System) decides when it should move to Running. The JVM doesn’t control when exactly it runs.
   Thread.yield() tells the thread scheduler, “I’m willing to let other threads run first.” But it’s just a suggestion, the thread might continue running if no other thread is ready.
   Example:
   Suppose you have multiple background tasks running. You can call yield() to let another thread finish first, especially in multitasking environments.

2. Why did Java 8 introduce default and static methods in interfaces?
   Ans: Before Java 8, interfaces could only have method declarations — no method bodies.
   Java 8 introduced default and static methods to allow interfaces to evolve without breaking old code.
   This helped:
   Add new features (like forEach() in Iterable) without changing every implementation.
   Provide common reusable logic in interfaces.
   Use Case Example:
   If you have an interface Vehicle, you can add a default void start() method — existing classes like Car or Bike don’t need to change to get this behavior.

3. SynchronizedMap vs. ConcurrentHashMap — Which is better in multithreaded apps?
   Ans: SynchronizedMap locks the entire map during any operation. It is simple but slow in multi-threaded apps.
   ConcurrentHashMap divides the map into segments and locks only the part being used. This makes it much faster in concurrent environments.
   Use Case Example:
   If multiple threads update and read from a shared cache or map, use ConcurrentHashMap for better performance and safety.

4. What is the Decomposition Pattern in Microservices?
   Ans: It is a method of breaking down a large monolithic application into smaller, independent microservices.
   Each service handles a specific business function, such as Orders, Payments, or Notifications.
   Common strategies:
   Decomposition by Business Capability
   Decomposition by Subdomain (from Domain-Driven Design
   Use Case Example:
   In an e-commerce app, splitting the system into services like ProductService, CartService, PaymentService helps develop, deploy, and scale them independently.

5. How do you monitor logs in Spring Boot applications?
   Ans: Spring Boot provides built-in support using Spring Boot Actuator to expose metrics and health endpoints.
   For centralized logging and monitoring:
   Use tools like the ELK stack (Elasticsearch, Logstash, Kibana).
   Or Prometheus and Grafana for metrics and alerting.
   Use Case Example:
   In production, instead of checking logs on each server, logs are sent to Elasticsearch and visualized in Kibana. This helps in tracking errors, request flows, and app performance from one place.
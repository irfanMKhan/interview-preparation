# Accenture Interview

1. [Introduce yourself](#1)
2. [Tell me about your past project experience.](#2)
3. [What are the steps/important part of monolith to microservice migration?](#3)
4. [How did you use spring cloud libraries?](#4)
5. [Have you used circuit breaker pattern, how and which library you used?](#5)
6. [How did you manage data consistency in microservice architecture where multiple microservice accesses single database?](#6)
7. [Difference between spring mvc and spring boot](#7)
8. [Which annotation did you use on main class in spring boot?](#8)
9. [Request params vs path variable](#9)
10. [What type of data structure we need if there’s no duplicate data and maintains insertion order](#10)
11. [HashMap vs Concurrent HashMap](#11)
12. [How did you implement security in spring boot application, tell me about some class names that you have used to implement security.](#12)
13. [What are the drawbacks of Hibernate?](#13)
14. [How to improve the performance of an Angular application](#14)
15. [Write code to sort a list of employees object in descending order based on age](#15)

## Answers

### 1.
#### Introduce yourself?
[goto behavioral-questions](../behavioral/behavioral-questions.md#1)

### 2.
#### Tell me about your past project experience.
[goto behavioral-questions](../behavioral/behavioral-questions.md#2)

### 3.
#### What are the steps/important part of monolith to microservice migration?
- Understand existing architecture, identify modules, service boundaries, database usage and dependencies.
- `Decomposition` of modules, following the `Strangler` pattern to migrate incrementally.
- Route traffic to new and old microservices through `API Gateway` which is a single entry point that routes client requests.
- follow the `Database per Service` pattern to manage its own database, ensuring loose coupling.
- Will also need the `Circuit breaker` pattern to prevents cascading failures by blocking calls to failed or slow services temporarily.
- Use the `Side car` pattern to monitor logs during each step and keep a rollback strategy.

#### Chaining question (extra):
#### related example?
- I worked on a large HRMS application. 
- It had modules for employee onboarding, attendance, payroll, and leave—all built in a Spring MVC monolith with a single Oracle DB and deployed as a WAR file.
\
&nbsp;
- Problems:
  - Every deployment required full application downtime. 
  - Teams couldn’t scale independently. any small change risked regression testing in unrelated modules. 
  - One schema meant complex joins, tight coupling, and slow performance.
\
&nbsp;
- Adopted the Strangler Pattern to incrementally migrate.
- I chose Attendance Management as the first candidate because:
  - It had limited dependencies.
- We applied Domain-Driven Design and Broke the application into bounded contexts: Employee, Attendance, Payroll, Leave.
- Setup API Gateway & Routing
  - introduced Spring Cloud Gateway to handle:
    - Routing requests to either monolith or microservices.
    - Authentication and rate limiting.
    - This allowed us to intercept attendance related requests and redirect them to the new microservice, while the rest of the traffic still went to the monolith.
- Create the Attendance Microservice 
  - Built with Spring Boot + Spring Cloud.
  - Owned its own Postgres database (Database per Service pattern).
  - Integrated with Kafka to publish attendance events used by other services.
  - Used `Resilience4j` for circuit breakers and fallback handling on Kafka consumers to ensure the service wouldn't fail on downstream issues.

### 4.
#### How did you use spring cloud libraries?




# Study Plan

How to answer a question:
Give a concise but concrete definition covering all aspects/usages of the concept based on your understanding. Answer according to your level of experience and provide examples from your work experience.
e.g: What is polymorphism?

Ans: Polymorphism is the exercise of different behaviors based on different circumstances in a certain situation.
Types:
- Static
- Dynamic

And provide examples

### OOP
- Class & Object
- Relationship between class 
  - Types 
    - Dependency 
    - Association 
    - Aggregation 
    - Composition 
    - Generalization 
  - OOP Principals 
    - Inheritance (Diamond problem) 
    - Polymorphism 
    - Encapsulation
    - Abstraction 
### JDK, JRE, JVM, Java Compiler
- Class loaders and its types 
- JVM Runtime/Memory areas 
  - Method area/Class (Method) area 
  - Heap 
    - Types of Heap 
      - Meta Space? 
  - Stack
  - Program counter 
  - Native method stack 
- JIT Compiler 
- Garbage Collection 
  - Types of Garbage Collectors 
    - Serial, Parallel, Concurrent Mark-Sweep, G1, Z, Shenandoah, Epsilon
### Java
- Which version have you used? 
  - What are its features? 
  - Features of different versions (Major releases) of Java. 
- General:
  - Is java purely object oriented?
  - Wrapper class?
  - Transient keyword
  - Why is java platform independent?
  - How to make a class immutable?
  - What are the benefits of immutable class?
  - What is instanceof operator?
  - What is autoboxing and unboxing?
  - What is the diff btw final, finally and finalize?
- Class, Object, Interface, Abstract class, Enum
  - Constructors, this, this(), super, super()
  - Static block
  - Access modifiers/specifiers
    - Private, public, protected, package/default
    - Final, static
      - Diff btw static non static method?
    - Static and default methods in interface (can we implement them?)
- Collections
  - What is ConcurrentHashMap and how does it work internally?
  - TreeSet vs HashSet
- String Pool
  - intern
- equals & hashCode, equals and hashcode contract
  - Why a.hashCode() == b.hashCode() does not imply that a.equals(b)
  - Diff btw equals and ==
- Shallow Copy, Deep Copy
- Exception handling
  - try-catch-finally
  - try-with-resources
  - throws & throw
  - Custom Exceptions
  - Questions:
    - Diff btw check and unchecked exceptions
    - Diff btw error an exception
    - Parent throws IOException, child throws FileNotFound Exception. Will the code compile? Yes/No, reasoning on why? 
- Lambda Expressions
  - Parameters & free variables
  - Functional interfaces
    - Predicate, Function, BiFunction, Consumer, Comparable, Comparator, Runnable and so on. 
    - Explain functional interfaces in java? Why do we need it? Its relationship with Lambdas? 
- Comparator & Comparable
- Optionals
- Functional programming
  - Pure function? First class functions?
  - Streams
    - Stream creation
    - Intermediate and terminal operations
    - Infinite streams
- Concurrency
  - Concurrency Hazards such race condition, deadlock etc.
    - Thread safety
      - Thread Safety
        - Stateless Implementations/Pure functions
        - Immutable Implementations/Classes
        - Thread-Local Fields
        - Synchronized Collections e.g ConcurrentHashMap etc
        - Concurrent Collections & Collections methods such as synchronizedCollection, synchronizedList etc 
        - Atomic Objects/Variables
        - Synchronized Methods
        - Synchronized Statements/Blocks
        - Volatile
        - Locks like ReentrantLock
        - @Async
    - Volatile & Atomic Variables
    - Questions:
      - How to avoid deadlock?
        - Avoid Unnecessary Locks, Avoid Nested Locks, Lock ordering, use Thread.join(), Lock Time-out: try -> wait before retrying 
- Generics
  - Generic class & methods
  - Bounded Generics and wildcards
  - Benefits of generics?

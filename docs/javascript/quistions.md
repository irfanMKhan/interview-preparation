# JavaScript Interview Questions/Topics

## Questions
1. [What is Hoisting in JavaScript? ](#1)
2. [What is event loop, micro task, and queue? ](#2)

## Answers

### 1.
#### What is Hoisting in JavaScript?
- Hoisting is JavaScript's default behavior of moving declarations to the top of their scope (either global or function scope) during the compilation phase — before code is executed.
- Only declarations are hoisted, not initializations.
- var, function, let, const, and class declarations are all hoisted, but not in the same way.

<pre>
//var hoisting:
console.log(a); // undefined
var a = 10; 
</pre>

<pre>
//let and const hoisting:
console.log(b); // ❌ ReferenceError
let b = 20;
</pre>

<pre>
//function hoisting:
greet(); // ✅ Works
function greet() {
console.log("Hello!");
}
</pre>

### 2.
#### What is event loop, micro task, Call Stack and queue?
- The event loop is part of the browser's runtime environment that continuously checks the message queue for new events and executes them one by one. It allows programs to perform asynchronous tasks, such as handling user input, making network requests, or reading/writing to files, without blocking the execution of other code.
- Micro tasks are tasks that have higher priority and are executed immediately after the current execution stack is empty, before any macro task.
  - Promise.then()
  - Promise.catch()
  - Promise.finally()
  - MutationObserver
  - queueMicrotask()
- Macro tasks are usually scheduled by browser APIs or Node.js, such as:
  - setTimeout(fn)
  - setInterval(fn)
  - setImmediate(fn) (Node.js)
  - requestAnimationFrame(fn) (browser)
  - I/O tasks
- This is where function calls are placed for execution. JavaScript executes the functions in LIFO (Last In, First Out) order.

#### Chaining question:
#### How does event loop work?
- Execute all code on the call stack.
- When the call stack is empty
  - Process all microtasks from the microtask queue until it's empty.
- Then, take the next macro task from the macro task queue and push it to the stack.
- Repeat from step 1.

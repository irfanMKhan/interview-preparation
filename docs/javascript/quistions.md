# JavaScript Interview Questions/Topics

## Questions
1. [What is Hoisting in JavaScript? ](#1)

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
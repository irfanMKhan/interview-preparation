JavaScript

What is event loop, micro task, and queue?

The event loop is part of the browser's runtime environment that continuously checks the message queue for new events and executes them one by one. It allows programs to perform asynchronous tasks, such as handling user input, making network requests, or reading/writing to files, without blocking the execution of other code.

What's the difference between == and ===?

"==" is equality operator, and "===" is strict equality operator. "==" is used for comparing two variables, but it ignores the datatype of the variable whereas "===" is used for comparing two variables, but this operator also checks the datatype and compares two values.

What's the output: 1 == "1"?

It will return true, this is because the == operator performs type coercion, and in this case, the string "1" is coerced into the number 1 before the comparison. After coercion, both sides have the same value, and the comparison evaluates to true.

What's the output: 1 == true?

The output is true, because, JavaScript performs type coercion, and the boolean value true is coerced into the number 1 before the comparison. After coercion, both sides have the same value, and the comparison evaluates to true.

console.log(1 == true) // true, the boolean value true is implicitly converted to the number 1 during the comparison
console.log(11 == true) // false, the boolean value true is implicitly converted to the number 1. when comparing 11 == true, the numeric value 11 is not equal to 1, so the expression evaluates to false


What's destructuring? Write a sample code.

Destructuring is a feature in JavaScript that allows you to concisely extract values from arrays or properties from objects and assign them to variables. It provides a shorter syntax for extracting values.

const numbers = [1, 2, 3, 4, 5];
const [first, second, , fourth] = numbers;

const person = {
name: 'John Doe',
age: 30,
job: 'Developer'
};
const { name, age, job } = person;


Write JS to transform [1, 2, 3] to [2, 4, 6], use map, for loop, while loop.

const transformedArrayMap = originalArray.map(num => num * 2);

for (let i = 0; i < originalArray.length; i++) {
transformedArrayFor.push(originalArray[i] * 2);
}

while (i < originalArray.length) {
transformedArrayWhile.push(originalArray[i] * 2);
i++;
}


Write JS to get the sum of the array [1, 2, 3, 4], use map, reduce.

const doubledArray = array.map(num => sum += num);
const sum = doubledArray.reduce((accumulator, currentValue) => accumulator + currentValue, 0);


What's the difference between undefined and null?

“undefined” is typically the default value of variables that have been declared but not initialized. “null” is a primitive value in JavaScript, and it is often explicitly assigned to variables or properties to indicate the absence of a meaningful value.

undefined is a type itself (undefined) while null is an object.

What is spread operator? How do you use the spread operator?

The spread operator (...) is a feature in JavaScript that is used for several purposes, including copying arrays, concatenating arrays, and passing function arguments. The spread operator provides a concise and expressive syntax for these operations. It eliminates the need for loops or concatenation methods.

const originalArray = [1, 2, 3];
const copiedArray = [...originalArray];

const array1 = [1, 2, 3];
const array2 = [4, 5, 6];
const concatenatedArray = [...array1, ...array2];

const obj1 = { a: 1, b: 2 };
const obj2 = { b: 3, c: 4 };
const mergedObject = { ...obj1, ...obj2 };


Write JS to reverse a string of words of a string, "Welcome Kafi" to "emocleW ifaK".

function reverseWordString(str) {
return str.split(" ").map(word =>
word.split("").reverse().join("")
).join(" ");
}


What's async and await? Write an example code.

The word “async” before a function means this function always returns a promise. The keyword await makes JavaScript wait until that promise settles and returns its result.

async function f() {
let promise = new Promise((resolve, reject) => {
setTimeout(() => resolve("done!"), 1000)
});
let result = await promise; // wait until the promise resolves
alert(result); // "done!"
}
f();


What is promise? I want to know some advantages and of error handling.

A Promise is an object that represents the eventual completion or failure of an asynchronous operation. A Promise is an object that will produce a single value some time in the future. If the promise is successful, it will produce a resolved value, but if something goes wrong then it will produce a reason why the promise failed.

const myPromise = new Promise((resolve, reject) => {
setTimeout(() => {
const success = true;
if (success) {
resolve("Operation successful");
} else {
reject("Operation failed");
}
}, 2000);
});

myPromise
.then((result) => {
console.log(result); // Output: Operation successful
})
.catch((error) => {
console.error(error); // Output: Operation failed
});


What are the differences between let, var, and const?

var declarations are globally scoped or function scoped while let and const are block scoped.
var variables can be updated and re-declared within its scope
let variables can be updated but not re-declared
const variables can neither be updated nor re-declared.
They are all hoisted to the top of their scope. But while var variables are initialized with undefined, let and const variables are not initialized.
While var and let can be declared without being initialized, const must be initialized during declaration.

What is the rest operator? Give an example.

The rest operator in JavaScript is represented by three dots (...). It allows to represent an indefinite number of arguments as an array. The rest parameter is used in function parameters to collect all the remaining arguments into a single array.

function sum(...numbers) {
return numbers.reduce((total, num) => total + num, 0);
}
console.log(sum(1, 2, 3, 4, 5)); // Output: 15
console.log(sum(10, 20, 30));    // Output: 60


What and how- deep copy and shallow copy.

Shallow copy means that only the first level of the object is copied. Deeper levels are referenced. Changes made to the nested objects will be reflected in both the original and the copied objects.

const originalArray = [1, 2, { a: 3 }];
const shallowCopyArray = originalArray.slice();

shallowCopyArray[2].a = 99;
console.log(originalArray[2].a); // Output: 99 (both arrays are affected)


A deep copy creates a completely independent copy of the original object, including all nested objects, recursively. Changes made to the nested objects in the deep copy do not affect the original object, and vice versa.

const originalObject = { x: 1, y: 2, z: { a: 3 } };
const deepCopyObject = JSON.parse(JSON.stringify(originalObject));
deepCopyObject.z.a = 99;
console.log(originalObject.z.a); // Output: 3 (original object is not affected)


What is the difference between promises and observables?

Promises handle a single asynchronous value or error. Once a promise is resolved or rejected, it can't be used to represent another value. Observables handle multiple asynchronous values over time. They can represent a stream of values.
Promises are eager, meaning that as soon as a promise is created, the asynchronous operation is started. Observables are lazy, meaning that the asynchronous operation doesn't start until you subscribe to the observable.
Promises can not be canceled. Once a promise is initiated, it will execute to completion. Observables support cancellation, allowing you to unsubscribe and stop the execution.

From code: which logs first- console, promise, setTimeout, and why?

console.log('Start of the script');
const myPromise = new Promise((resolve, reject) => {
console.log('Inside the Promise - Before setTimeout');
setTimeout(() => {
console.log('Inside the Promise - After setTimeout');
const success = true;
if (success) {
resolve('Promise resolved successfully');
} else {
reject('Promise rejected');
}
}, 2000);
});

myPromise
.then(result => {
console.log('Promise resolved:', result);
})
.catch(error => {
console.error('Promise rejected:', error);
});

console.log('Before setTimeout outside the Promise');
setTimeout(() => {
console.log('Inside setTimeout callback');
}, 1000);

console.log('End of the script');

// output
"Start of the script"
"Inside the Promise - Before setTimeout"
"Before setTimeout outside the Promise"
"End of the script"
"Inside setTimeout callback"
"Inside the Promise - After setTimeout"
"Promise resolved:", "Promise resolved successfully"


Event Loop & Task Queues: JavaScript, despite being single-threaded, leverages the Event Loop to handle asynchronous events. It continuously checks the call stack and, once it's empty, pushes the first task from the task queues (Macro and Micro) onto it.
Macro tasks are tasks like setTimeout, setInterval, I/O operations, and UI rendering. Additionally, each new script run is also considered a macro task.
Micro tasks include process.nextTick, Promises, MutationObserver, and others. These tasks are processed after the current task finishes and before the Event Loop is allowed to continue.
Promises are considered Micro tasks, while setTimeout events are categorized as Macro tasks. Consequently, the Event Loop prioritizes completing all Micro tasks (Promises) in the queue before moving on to the next Macro task (like setTimeout), even if the delay specified in setTimeout is zero. This is the reason Promises are executed before setTimeout.

What are the JavaScript data types?

Primitive Data Types:
String: Represents textual data, e.g., "hello".
Number: Represents numeric values, e.g., 42 or 3.14.
Boolean: Represents either true or false.
Undefined: Represents a variable that has been declared but has not been assigned a value.
Null: Represents the intentional absence of any object value.
Symbol: Introduced in ECMAScript 6 (ES6), symbols are unique and immutable data types, often used as identifiers for object properties.
BigInt: Represents numeric values that are too large to be represented by the number primitive.
Object: Objects are complex data types that allow you to store collections of key-value pairs. Objects can be created with the {} syntax.
Function: Functions are a special type of object used for creating reusable blocks of code.
Array: Arrays are objects that hold multiple values in an ordered list.
Primitive Wrapper Objects:
String Object: Represents a string as an object. For example, new String("hello").
Number Object: Represents a number as an object. For example, new Number(42).
Boolean Object: Represents a boolean as an object. For example, new Boolean(true).

What is symbol? When did you use symbol?

	…

Primitive data types vs non-primitive data types.

Primitive data types: Immutable, stored by value, include strings, numbers, booleans, undefined, null, and symbols.
Non-primitive data types: Mutable, stored by reference, include objects, arrays, functions, dates, and custom objects.

Tell me about async programming.

Async programming is a programming paradigm that allows tasks to be executed independently, asynchronously, without blocking the main program flow, typically using mechanisms like Promises, async/await, or callbacks, enabling efficient handling of concurrent operations and improved responsiveness in applications.

What is a higher-order function? Give some examples.

A higher-order function is a concept in functional programming where functions can take other functions as parameters or return them as results. In other words, a higher-order function treats functions as first-class citizens. This allows for more abstract and modular code, promoting flexibility and reusability. Some HOF are map, reduce, filter.

Do you remember OOP principles? What are some features of OOP?

Class: A blueprint or template for creating objects. It defines a data structure and behavior.
Object: An instance of a class. Objects have state (attributes) and behavior (methods).
Encapsulation: Encapsulation refers to the bundling of data and methods that operate on that data within a single unit, i.e., a class. It hides the internal details of how an object works.
Inheritance: Inheritance is a mechanism that allows a new class (subclass or derived class) to inherit properties and behaviors of an existing class (base class or superclass). It promotes code reuse.
Polymorphism: Polymorphism allows objects of different classes to be treated as objects of a common base class. It enables a single interface to represent different types of objects or a single function to operate on different types of objects.
Abstraction: Abstraction involves simplifying complex systems by modeling classes based on the essential properties and behaviors they share. It focuses on what an object does rather than how it achieves its functionality.

State some design patterns.

Singleton Pattern: Ensures that a class has only one instance and provides a global point of access to it. Commonly used for logging, driver objects, caching, thread pools, or database connections.
Factory Method Pattern: Defines an interface for creating an object but leaves the choice of its type to the subclasses, creating instances of classes derived from an interface.
Prototype Pattern: Creates new objects by copying an existing object, known as the prototype. This pattern is useful when the cost of creating an object is more expensive than copying an existing one.
Adapter Pattern: Allows the interface of an existing class to be used as another interface. It is often used to make existing classes work with others without modifying their source code.
Decorator Pattern: Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
Observer Pattern: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
Strategy Pattern: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. It lets the client vary the algorithm independently from the clients that use it.
Command Pattern: Encapsulates a request as an object, thereby allowing for parameterization of clients with different requests, queuing of requests, and logging of the parameters.
Chain of Responsibility Pattern: Passes a request along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
State Pattern: Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

Problem-solving using JavaScript- check if the string is palindrome, if a string is following parentheses order.

var isPalindrome = function(s) {
let str = s.toLowerCase().replace(/[^a-z0-9]/g, "");
if (str === Array.from(str).reverse().join("")) {
return true;
}
return false;
};


var isValid = function(s) {
let opening = ["(", "{", "["];
let parentheses = [];
for (let i = 0; i < s.length; i++) {
if (opening.includes(s[i])) {
parentheses.push(s[i]);
} else {
if (s[i] === ")" && parentheses[parentheses.length - 1] !== "(") {
return false;
} else if (s[i] === "}" && parentheses[parentheses.length - 1] !== "{") {
return false;
} else if (s[i] === "]" && parentheses[parentheses.length - 1] !== "[") {
return false;
} else {
parentheses.pop();
}
}
}
return parentheses.length === 0;
};



HTML

What are some HTML5 semantic elements?

<header>: Represents the header of a section or a page and can contain headings, logos, navigation links, etc.
<nav>: Represents a navigation menu, typically containing links to other pages or sections within the same page.
<main>: Represents the main content of the document, excluding headers, footers, and sidebars.
<article>: Represents an independent piece of content that can be distributed and reused independently, such as a news article or blog post.
<section>: Represents a thematic grouping of content within a document. It's often used to group related content together.
<aside>: Represents content that is tangentially related to the content around it, such as a sidebar or pull quote.
<footer>: Represents the footer of a section or a page and typically contains metadata, copyright information, or links to related documents.
<figure> and <figcaption>: <figure> is used to encapsulate any content that is referenced from the main content, and <figcaption> is used to provide a caption for the content within <figure>. Commonly used for images, charts, etc.

What are the advantages of using header, footer, and aside elements?

<header>: It provides structural clarity by defining the introductory or related content at the beginning of a webpage, aiding accessibility and semantic understanding.
<footer>: The <footer> element enhances document organization by offering a designated place for supplementary content such as metadata or copyright information, improving accessibility and semantics.
<aside>: <aside> separates tangentially related content, like sidebars or pull quotes, from the main content, aiding semantic clarity, accessibility, and supporting responsive design.



CSS

What is mixin in styles? Can you give an example?

In Sass (Syntactically Awesome Stylesheets), mixins are a powerful feature that allows you to define reusable sets of styles and then include them in different selectors. Here's an example of how mixins work in SCSS (Sassy CSS), a syntax extension of Sass:

// Define a mixin
@mixin box-shadow($x, $y, $blur, $color) {
box-shadow: $x $y $blur $color;
}

// Use the mixin within style rules
.card {
@include box-shadow(2px, 2px, 10px, #888);
background-color: #fff;
padding: 20px;
}


How do we render divs inline using native CSS? (5-6 ways)

Set display: inline-block to the child elements
Set position: absolute to the child elements
Set float: left to the child elements
Set display: flex; flex-direction: row; to the parent element
Use display: grid; on the parent element
Use display: inline-table; to the parent element

How do we reduce the loading time of the stylesheets, images, and other assets? (4-5 ways)

Use CDNs
Minify stylesheets
Lazy load assets
Compress images or use lower resolution
Reduce network requests
Remove unused styles and scripts
Setting “rel” attribute to “preconnect”, like  <link rel="preconnect"> will fetch stylesheets earlier and reduce the latency

What are the differences between grid and flexbox?

Flexbox: Primarily designed for one-dimensional layouts, either as a row or a column. Works along a single axis, either a row or a column.
Grid: Designed for two-dimensional layouts, allowing you to create rows and columns simultaneously. Works along both the row and column axes simultaneously.

What do you understand by preprocessor? Did you use scss?

A preprocessor is a scripting language that extends the capabilities of CSS and allows developers to write CSS in a more dynamic and maintainable way.

Preprocessors are compiled into regular CSS, which the browser can interpret. One popular CSS preprocessor is Sass, and SCSS is one of its syntax options.


Angular

What is mergeMap? Write a code that will handle multiple API calls at a time.

mergeMap flattens multiple observables into a single observable, allowing values from all inner observables to be merged into the output observable concurrently. mergeMap creates an Observable immediately for any source item, all previous Observables are kept alive. flatMap is an alias for mergeMap.

concatMap is similar to mergeMap, but it processes each inner observable sequentially. It waits for the previous inner observable to complete before subscribing to the next one.

switchMap cancels the previous inner observable when a new value is emitted from the source observable.

getDataFromMultipleEndpoints(): Observable<any> {
const endpoint1$ = this.http.get('https://api.example.com/endpoint1');
const endpoint2$ = this.http.get('https://api.example.com/endpoint2');
const endpoint3$ = this.http.get('https://api.example.com/endpoint3');

return forkJoin([endpoint1$, endpoint2$, endpoint3$]).pipe(
mergeMap(results => {
const [result1, result2, result3] = results;
// Process the results as needed
const processedData = this.processData(result1, result2, result3);
// Return the processed data as an observable
return Observable.of(processedData);
})
);
}


How can you call multiple network requests in the same time?

We can use mergeMap to handle multiple API calls concurrently in Angular with RxJS.

Did you use state management? What is NgRx?
Give me an idea on NgRx.

[Demo Project]

What does reducers, actions, effects do?
What is micro-frontend?
What is monorepo? What does Nx do?
What is shell? What's the purpose and how to create?
What is Module Federation? How Module Federation works?
What is pipe? What is impure pipe?

Pipes are simple functions to use in template expressions to accept an input value and return a transformed value.

A pipe is a way to transform data before displaying it in the view. Pipes are used in templates to format, filter, and manipulate data in a declarative manner. Angular provides several built-in pipes for common tasks, and you can also create custom pipes.

How do you create custom pipe? Which pipes did you use for what?

We can create custom pipe implementing PipeTransform class and by using transform function.

import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
name: 'nameTransform'
})
export class NameTransformPipe implements PipeTransform {
transform(value: unknown, ...args: unknown[]): unknown {
if (typeof value === "string") {
return value.split(" ").map(n => n.charAt(0).toUpperCase() + n.slice(1, n.length));
} else {
return ""
}
}
}


What is observable? How does observable work? Write a code.
Write code for a network request. Update your code with mergeMap.
What is dependency injection?

Dependency Injection is an application design pattern that allows objects to declare their dependencies, and have those dependencies provided to them without having to create or manage them themselves.

What is HttpClient?

HttpClient is a service in Angular that provides a simplified client HTTP API for making HTTP requests. It is part of the @angular/common/http module and is used to interact with APIs and fetch data from a server.

Have you heard of debounce? What is that?

Debounce is an operator in RxJS that delays the emission of items from an Observable for a specified duration after the last emitted item. It is often used to handle scenarios where events are triggered rapidly, but you are only interested in the result after a certain period of inactivity.

This is particularly useful in scenarios like handling user input, where you might want to perform an action only after the user has stopped typing for a certain period.

import { fromEvent } from 'rxjs';
import { debounceTime, map } from 'rxjs/operators';

// Create an observable from a DOM input element
const input = document.getElementById('myInput');
const inputObservable = fromEvent(input, 'input');

// Use debounceTime to wait for 300 milliseconds of inactivity
inputObservable
.pipe(
debounceTime(300),
map((event: any) => event.target.value)
)
.subscribe((value) => {
console.log(`Input value after debounce: ${value}`);
// Perform the desired action, e.g., make an API call
});





What happens when you enable sourceMap? Where do you do this?

Enabling sourceMap in Angular is a configuration option that generates source map files during the build process. Source maps are helpful for debugging code. You write your code in TypeScript, and the compiler turns that source code into JavaScript. When your app is running in a browser like Firefox, the browser is running the JavaScript. Even though the browser is running that JavaScript, if you open the debugger in Firefox, the debugger will display the TypeScript source code and will let you set break points in it. The debugger is able to do that because of source maps, which map the TypeScript source code to the JavaScript runtime code. That is what source maps do: they map the source code to the runtime code to enable source code debugging at runtime.

To enable sourceMap during development, you don't need to make any changes in the angular.json file because it's typically enabled by default for development builds.

What happens after "ng serve" command is executed?
How does browser renders Angular application?
Write a test case to detect if a button is clicked.
What will you do if the application does not run properly on production environment, take into action the app is fine in dev env.

Check the browser console.
Review server logs.
Verify if production environment is configured properly.
Check network requests.
Check source maps.
Caching issue.

What is webpack? How Angular application works without webpack?

Webpack is a popular open-source JavaScript module bundler. It takes the various assets, such as JavaScript files, CSS stylesheets, and images, and transforms them into a format that is optimized for the web. Webpack is widely used in modern web development workflows to streamline the process of managing and serving front-end assets.

What is the difference between dependencies and devDependcies in package.json file?

The dependencies section is used to specify the packages that are required for the application to run in a production or runtime environment. These packages are essential for the application to work correctly, and they will be installed when someone installs your package or when you deploy your application.

The devDependencies section is used to specify packages that are only needed during development and testing. These packages might include testing frameworks, build tools, linters, or any other tools that assist with the development process but are not required for the application to function in a production environment.

How do you upgrade Angular version?

See official Angular Update Guide
Update Angular CLI
Update Angular packages
Update RxJS and TypeScript
Review and resolve update issues
Update other dependencies
Update custom code
Run test

How can we delay network requests? How to call API in every 5 seconds?

Option 1: Using setTimeout and setInterval functions
Option 2: Using RxJS interval and switch map

import { interval } from 'rxjs';
import { switchMap } from 'rxjs/operators';

const apiCall = () => {
console.log('Making API call...');
};

const apiCallInterval$ = interval(5000);
const subscription = apiCallInterval$.pipe(
switchMap(() => apiCall())
).subscribe();


In which cases do you use Reactive forms and template-driven forms?

Reactive Forms:
More suitable for complex forms with dynamic behavior, extensive validation, and situations where form data needs to be manipulated programmatically.
When you need to dynamically add or remove form controls based on user interactions or other conditions.

Template-Driven Forms:
Quicker to set up and are a good choice for simple forms where rapid development is a priority.
If you prefer handling form logic in the template and having less code in your component class, Template-Driven Forms allow you to define form behavior directly in the HTML template.
For forms that are relatively straightforward and don't require a lot of custom logic.

Why do you think you are comfortable working with Angular?
How do we handle erros in async, promise and observable?

Async/ Await: Try-Catch

async function myAsyncFunction() {
try {
const result = await someAsyncOperation();
console.log(result);
} catch (error) {
console.error('An error occurred:', error);
}
}


Promises: .then() and .catch()

function myPromiseFunction() {
someAsyncOperation()
.then((result) => {
console.log(result);
})
.catch((error) => {
console.error('An error occurred:', error);
});
}


Observables: .subscribe()

import { Observable } from 'rxjs';

function myObservableFunction() {
const subscription = myObservable.subscribe(
(result) => {
console.log(result);
},
(error) => {
console.error('An error occurred:', error);
}
);
}


Tell me about the Angular lifecycle hooks.
Constructor:
The constructor is called when an instance of the component is created.
The constructor is primarily used for initializing class members, services, and other dependencies.
It's a good place to set up initial values and perform one-time setup tasks.
ngOnChanges:
Called whenever there is a change in input properties.
Receives a SimpleChanges object containing the previous and current values of the changed properties.
ngOnInit:
Called once, after the component is initialized.
Useful for initialization logic or fetching data.
ngDoCheck:
Called during every change detection run.
Allows you to perform custom change detection.
ngAfterContentInit:
Called after content (projected content) has been initialized.
Useful for initialization logic that relies on content initialization.
ngAfterContentChecked:
Called after every check of the content (projected content).
Useful for performing additional checks after content has been checked.
ngAfterViewInit:
Called after the component's view (and child views) has been initialized.
Useful for initialization logic that relies on the view.
ngAfterViewChecked:
Called after every check of the component's view (and child views).
Useful for performing additional checks after the view has been checked.
ngOnDestroy:
Called just before the component is destroyed.
Useful for cleanup logic (e.g., unsubscribing from observables).

What's the difference between constructor and ngOnInit?

The constructor is called when the component is created before the component's inputs have been initialized. It is used to set up the component's initial state and to inject dependencies.

The ngOnInit is called after the component's inputs have been initialized and after the component's children have been created. It is used to do any final initialization and to start the component's functionality.

What is interceptor? How can we implement this?

An interceptor is a middleware-like service that can be used to intercept and manipulate HTTP requests or responses globally before they are sent or after they are received.

An interceptor is a class that implements the “HttpInterceptor” interface and uses “intercept” method where we handle the interception logic.

@Injectable({
providedIn: 'root',
})
export class HeaderInterceptorService implements HttpInterceptor {
intercept(
request: HttpRequest<any>,
next: HttpHandler
): Observable<HttpEvent<any>> {
const modifiedRequest = request.clone({
setHeaders: {
'Your-Custom-Header': 'Header-Value',
},
});
return next.handle(modifiedRequest);
}
}


What are guards? What are the usages of guards?

Angular route guards are set of functions and classes that control and manage routing and navigation within your Angular application.

CanActivate
Determines whether a route can be activated.
Useful for checking authentication status, permissions, or other conditions before allowing navigation to a route.
CanActivateChild
Similar to CanActivate but specifically used for child routes.
Checks whether child routes can be activated.
CanDeactivate
Determines whether a route can be deactivated.
Useful for confirming with the user before leaving a route, such as in form navigation scenarios.
CanLoad
Checks whether the feature module associated with a lazy-loaded route can be loaded.
Useful for preventing the loading of feature modules based on certain conditions, like authentication.
Resolve
Pre-fetches necessary data before a route is activated.
Useful for ensuring that required data is available before the route is rendered.

What's <ng-content> and <ng-container>?
What's the output <ul><li *ngFor="let item of items" *ngIf="item.active"></li></ul>?

This code will result in a compilation error. Should be-
<ul>
  <ng-container *ngFor="let item of items">
    <li *ngIf="item.active">{{ item.title }}</li>
  </ng-container>
</ul>


What are directives? Show me an example.

Directives are classes that can add new behavior to the elements in the template or modify existing behavior.

Component Directives: <app-component>
Attribute Directives: [ngStyle], [ngClass]
Structural Directives: *ngIf, *ngFor, [ngSwitch]

How directives are different from pipes?

Directives are used to create and manipulate the structure of the DOM while pipes are used to transform data for display in the template. Pipes take input data, process it, and return a transformed output.

What are Promise and Observables? Why do we use them?
Concept: Loose coupling, Singleton, Dependency Injection, TypeScript, strong typing.
How do you ensure security in Angular application.
How do you prevent external attacks in an application.
How did you save development time?
What is Module Federation and how do you incorporate Module Federation in Nx?
Why would you implement microfrontend? What are the benefits?
Concepts and implementation: Authentication, authorization, token, reusable components, code splitting.
Lazy loading in the context of Angular.

Lazy loading refers to a technique where you defer the loading of some parts of your application until they are actually needed. This helps to improve the initial loading time of your application, as only the essential resources are loaded upfront, and additional modules or components are fetched asynchronously when required. Lazy loading is particularly useful for large applications where loading everything at once would result in a slower initial page load.

Feature Modules: In an Angular application, different sections or features can be organized into feature modules. These modules encapsulate related components, services, and other resources.
Routing: Lazy loading is often implemented using Angular's routing mechanism. You define routes for each feature module, specifying a loadChildren property to indicate the module to load lazily.
LoadChildren Property: The loadChildren property in the route configuration is used to specify the module to be loaded lazily. This property takes a string that represents the path to the module file, followed by a hash (#) and the name of the module class.

What is DI and why would we use it? In which ways?
What are @ViewChild,  @ViewChildren, and @ViewContent?

The @ViewChild decorator is used to access a reference to a child component, directive, or native element from the component's view.

<div #myDiv>Some content</div>


@ViewChild('myDiv') myDivElement: ElementRef;


@ViewChild is used to get a reference to the div element with the template variable #myDiv.
The @ContentChild decorator in Angular is used to query and access a reference to a projected child component, directive, or element from the component's content. It is often used when dealing with content projection in Angular components.

<div>
  <h2>Parent Component</h2>
  <app-content-child-example>
    <!-- Projecting content into the child component -->
    <p #projectedContent>This is projected content!</p>
  </app-content-child-example>
</div>


// content-child-example.component.ts
import { Component, ContentChild, ElementRef } from '@angular/core';

@Component({
selector: 'app-content-child-example',
template: '<ng-content></ng-content>',
})
export class ContentChildExampleComponent {
@ContentChild('projectedContent') projectedContent: ElementRef;

ngAfterContentInit() {
// Access and manipulate the native element of the projected content
const nativeElement = this.projectedContent.nativeElement;
nativeElement.style.color = 'blue';
console.log('Projected Content:', nativeElement.textContent);
}
}


What is the difference between interface and type?

Interface: An interface describes the shape of an object, specifying what properties it should have, along with their types.

Type: The type keyword is used to define custom types, which can represent a variety of data structures. These custom types can be simple, like primitive types, or more complex structures, such as union types, intersection types, mapped types, and aliases.

What is TypeScript and why would we use TypeScript over JavaScript?
Why don't we use a constructor for an assignment?
Did you have time to see the new Angular release? What are the new features of Angular 17?
Inheritance, encapsulation, abstraction, polymorphism in the context of Angular.
Design patterns used in Angular architecture.

Singleton Pattern: Services are often implemented as singletons, ensuring that there is only one instance of a service throughout the application.
Observer Pattern: Observables are implementations of the Observer pattern. Components can subscribe to and react to changes or events in other parts of the application.
Decorator Pattern: The Decorator pattern is used to add new functionality to an object without altering its structure. @Component, @Directive, and @Injectable are decorators that enhance the behavior of classes.
Strategy Pattern: In Angular, the use of different strategies for handling forms (Template-Driven Forms vs. Reactive Forms) or different strategies for handling HTTP requests is an implementation of Strategy Pattern.
Proxy Pattern: Interceptors can act as proxies for HTTP requests, allowing you to intercept, modify, or handle requests and responses.
Template Method Pattern: The Template Method pattern defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure. In Angular, this is reflected in the use of lifecycle hooks in components.
Factory Pattern: Consider a scenario where you have multiple implementations of a service, and you want to dynamically choose which implementation to use based on certain conditions.
Adapter:  Translates the existing interface of a class into an interface that the client requires. When we create an interface for a particular object this interface is an example of DTO.

Write an Angular component using dependency injection, singleton, proxy pattern, and factory.

An Angular component that uses injected service for network requests, logged-in state, and has an interceptor to add request headers.

What is signals? Why do we use it?
What are generics in TypeScript? Write an example of generics in Angular.

Generics in TypeScript allow you to define types, functions, or classes that can work with different data types without specifying the type explicitly. You can use placeholders (often represented by the letter T) that get replaced with the actual types when the code is used.

export class GenericService<T> {
private items: T[] = [];

addItem(item: T): void {
this.items.push(item);
}

getItems(): T[] {
return this.items;
}
}


export class AppComponent {
items: number[];


constructor(private genericService: GenericService<number>) {
this.items = genericService.getItems();
}

addItem(): void {
this.genericService.addItem(Math.random());
this.items = this.genericService.getItems();
}
}


Performance optimization in Angular.
What are AOT and JIT? Which one is better and why?
Why would you use reactive extensions? Talk about some operators.
Why do we use testing? What kind of testing did you do?
Angular Ivy, Angular Elements, Standalone Components, JS Expressions, Angular Expressions, Server Side Rendering.
Differences and how to unit test, integration test, end-to-end (e2e) test.
Why would you use the Angular framework while developing an application?

What are the pros of using NgRx?

Pros:
There is no need for tightly coupled components which makes the addition of new features easy.
Simpler components since modification logic has been delegated to reducers and effects.
Immutability of state at component level which eliminates loads of bugs.
Works with the Angular OnPush change detection strategy.
Easy debugging using @ngrx/store-dev-tools.
Availability of the current Angular router state via @ngrx/router-store.
Actions, reducers, and effects can be split across multiple files and modules.
Support for lazy loading through the StoreModule.forFeature() and EffectsModule.forFeature() module imports which helps to improve app performance as each module loads only the parts of the store it requires.
@ngrx/entity which helps to simplify reducer logic and state selection for records.
NgRx flux architecture can be combined with component-based architecture allowing for the creation of container components and presentational components.
Cons:
Initially more boilerplate code i.e. you need to create actions, reducers, and effects. However, @ngrx/schematics provides a command-line solution for generating effects, actions, reducers, and entities on the fly to hasten this process.
Finding appropriate names for actions and effects may be difficult.
Steep learning curve especially for new Angular developers.
NgRx is not a Google project and support for future angular versions cannot be guaranteed.
Good knowledge of reactive extensions javascript (RxJS) is required.


DevOps

What are the procedures for CI/ CD? Why do we use CI/ CD?


Behavioral

Tell me about yourself, which one is the last book did you read and what's that about?
What tech stack did you work? Which one do you prefer to work with?
Tell me about a challenging project you have worked on.
What kind of environment you seek in your wokrplace.
What opporunity are you looking forward working on this team?
Tell me about your team mates.
Tell me about yourself, your experience, tech stack and past companies.
Tell me about your latest project, how did you manage it, what was the size of the application.
Tell me about your team, cross-teams communication.
Tell me about your expertise in cross-platform application development, React JS, React Native, Polymer JS, Java, Java Spring Boot.
How long did you work separately with Angular, React JS and React Native?
Do you have any experience or knowledge on backend development? What did you do?
In a scale of 1 to 10, rate your expertise on Frontend and Java Spring Boot.
Visa questions, about relocation, master's degree, distance education.
Behavioral- what to do when different developer wants to go with different architecture?
Most challenging task/ project?
How do you learn new technology?







Interview with Bank of America

Coding Round

Create 4 components
ComponentBase
Create a Name property
Implement OnDestroy and log to the console the Name property value
ComponentA
Inherit from ComponentBase
Set the Name property to ‘ComponentA’
In ComponentA’s HTML, display ‘Hi from ComponentA’ with green color font
ComponentB
Inherit from ComponentBase
Set the Name property to ‘ComponentB’
In ComponentB’s HTML, display ‘Hi from ComponentB’ with blue color font
ComponentNotFound
In ComponentNotFound’s HTML, display “This page is not available”
Implement Routing
In AppComponent, add routing links to ComponentA, ComponentB and another with a bad link to ensure the ComponentNotFound component is displayed
Implement Users service
Endpoint: https://jsonplaceholder.typicode.com/users
Create a function to return an Observable of any
In ComponentB, use the User's service to display an unordered list of the name property of the results returned

Questions

Add custom header to all outgoing requests
Write a test case for the API call against a given object array
What are the Angular lifecycle hooks
Create an child component with an input and demostrate the onChanges lifecycle hook
What's the difference between @ViewChild and @ViewChildren
Create a form with two input fields, make one disabled from the component
Render this HTML string ("<p>Hello there</p>") fetched from an external source to the template
Make a property optional in one of the interfaces you have created
Render two buttons, toggle 2nd button's disability status based on the 1st button's action
On an given object array, apply HOFs like filter, sort, reduce

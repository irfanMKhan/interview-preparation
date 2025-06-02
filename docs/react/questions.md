# React Interview Questions/Topics

## Questions
1. [What issue faced and how you solved that one in your project](#1)
2. [Difference between let const var?](#2)
3. [Redux Use?](#3)
4. [TypeScript functionality and behavior?](#4)
5. [Oauth and authorization](#5)
- Difference between local storage and storage and cookies.
- CSS media queries and its responsiveness
- what is flex and its dorm hierarchy?
- rotation between a child and parent component
- explain triple equal
- what is the step-by-step process of debugging an issue?
- what are even handlers
- explain the box concept model in CSS
- dom manipulation question
- Server-side
- Product issue how you will fix bugs

## Answers

### 1.
#### What issue faced and how you solved that one in your project?
- In one of my projects, I was working on a dashboard that involved multiple data-driven components updating frequently.
  - I faced performance issues due to excessive DOM re-renders.
  - the UI lagged, and interactions like filtering or updating inputs were slow
  
- I began to debug by using React DevTools and Chrome Performance & Network Tab.
  - I discovered that many components were re-rendering unnecessarily, even when their props or state hadn’t changed. 
  - It was mostly due to unoptimized parent-to-child prop passing and inline function definitions that changed on every render.
  
- To fix this
  - I used React.memo to prevent functional components from re-rendering unless their props changed.
  - I wrapped frequently used callbacks in useCallback to avoid reference changes on each render.
  - I also did a state restructuring: moved local state closer to the components that actually needed it to reduce cascading re-renders.
  
- I used React DevTools to identify unnecessary state changes and refactored components 
- using React.memo and useCallback to avoid unnecessary renders. This reduced re-renders by over 40%, 
- improving responsiveness significantly.

#### Chaining question:
#### How did you debug the application?
- React DevTools
  - I started by inspecting the component tree using React DevTools in the browser.
  - While interacting with the app, I enabled the "Highlight updates when components render" option.
  - This showed many components flashing (re-rendering) even when there were no visible data changes — including components unrelated to the part of the UI I interacted with.
  - I examined the props and state of those components and noticed that some were re-rendering simply due to new function references or unrelated state updates higher in the tree.
- Chrome Performance Tab
  - Next, I recorded a session using the Performance tab in Chrome DevTools.
  - The flame chart revealed long scripting and rendering tasks, especially after simple user actions.
  - I used the Call Tree and Bottom-Up view to identify expensive functions and excessive re-renders.
  - This confirmed that a large portion of the rendering time was spent on components that shouldn't have been involved.
- Chrome Network Tab
  - I also checked the Network tab to ensure that unnecessary API calls weren’t triggering the re-renders.
  - Fixing those helped reduce unnecessary data fetches, which indirectly improved the UI performance.

### 2.
#### Difference between let const var?
- var: function scoped. redeclare, reassign is allowed.
<pre>
function example() {
  var a = 10;
  if (true) {
    var a = 20; // Same variable! can be Redeclared.
    console.log(a); // 20
  }
  console.log(a); // 20
}
</pre>

- let: blocked scope. reassign is allowed, but redeclaration is not allowed in the same scope.
<pre>
let x = 5;
x = 10; // OK
let x = 20; // ❌ SyntaxError (in the same scope)
</pre>

- const: blocked scope. redeclaration is not allowed.
<pre>
const y = 10;
y = 20; // ❌ TypeError

const obj = { name: "John" };
obj.name = "Doe"; // ✅ Allowed
</pre>
- Best practice is
  - for immutability use `const` as default
  - if reassignment is needed use `let`
  - avoid `var`

### 3.
#### Redux Uses?
- Redux is a state management library. It uses a single source of truth (store), and state is read-only, modified only via actions and reducers.
- 
#### Chaining question:
#### What is the Redux data flow?
- Component dispatches an action,
- Action reaches the reducer,
- Reducer returns a new state,
- Store updates and notifies subscribed components.

#### How is Redux different from React Context API?
- Context is good for small-scale state sharing.
- Redux is better for complex, structured, and scalable state management with tools like middleware.

#### How do you connect a React component to Redux?
- import { useSelector, useDispatch } from 'react-redux';

#### Difference between redux and redux-toolkit?
- Redux-toolkit uses `createSlice` to auto-generate actions and reducers. But in redux you write them separately.
- In Redux, we need to manually configure store but in redux-toolkit we have `configureStore`

### 4.
#### TypeScript functionality and behavior?
- TypeScript is a superset of JavaScript that adds static typing. 
- It helps developers catch errors during development (at compile time).
  - TypeScript catches type-related bugs before you even run the code.
  - This makes your code much more predictable and reduces runtime errors.
  - No need to guess what the function expects or returns — it's all visible.
  - With TypeScript, many bugs are caught at compile time rather than runtime. This saves debugging time in production.
- improve IDE support (like IntelliSense), and build more robust, maintainable code.
```
TypeScript is written for development-time benefits, not for changing the runtime. 
JavaScript is the language browsers understand.
TypeScript just ensures that by the time you get to that JavaScript, it's clean, reliable, and correct.
```

### 5.
#### Oauth and authorization
- Oauth is a protocol and authorization is a security process.
- OAuth is a protocol that allows users to grant limited access to their resources without sharing credentials. 
- It's commonly used for third-party logins and API access. Authorization, 
- on the other hand, determines what actions or data a user is allowed to access within an application. 
- OAuth handles authentication, while authorization enforces access control.
- 

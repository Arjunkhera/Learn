// Function Decorator
// Introducing wrappers around functions for enhanced logic

function compute() {
    console.log('We are doing something really big here');
    for(let i = 0; i < 100_000_000; i++);
}

function wrapper(originalFunction) {
    let cache = new Map();

    return function(x) {
        console.log('Wrapper Function called');
        // If already seen, return
        if(cache.has(x)) {
            return cache.get(x);
        }

        // Store the output
        let output = originalFunction(x);
        cache.set(x, output);
        return output;
    }
}

// Understanding wrapping for method functions
function firstComputeFunction(size) {
    console.log(`${firstComputeFunction.name} is working on process name:[${this.name == "" ? "undefined" : this.name}] of size ${size}`);
    for(let i = 0; i < 100_000_000; i++);    
}

// Create Process constructor
function MakeProcess(name, computeFunction) {
    this.name = name;
    this.solve = computeFunction;
}

let firstProcess = new MakeProcess('FirstProcess', firstComputeFunction);
// works because this context is present
firstProcess.solve(100);

// Decorator wrapping without context
firstProcess.solve = wrapper(firstComputeFunction);
// missing context so process name is absent
firstProcess.solve(100);

// Function call example
function MakeUser(name) {
    this.name = name;
}
let userArjun = new MakeUser('Arjun');

function sayHi() {
    console.log(`Hello ${this.name}, have a nice day`);
}

userArjun.sayHi = sayHi.bind(userArjun);
userArjun.sayHi();


// Using wrapper with call and passing context
function wrapperWithContext(originalFunction) {
    let cache = new Map();

    return function(x) {
        console.log('Wrapper Function with Context is called');
        // If already seen, return
        if(cache.has(x)) {
            return cache.get(x);
        }

        // Store the output
        let output = originalFunction.call(this, x);
        cache.set(x, output);
        return output;
    }
}

// Decorator wrapping with context
firstProcess.solve = wrapperWithContext(firstComputeFunction);
// no more missing context so process name is printed
firstProcess.solve(100);


// Method borrowing
function hash() {
    return [].join.call(arguments);
}

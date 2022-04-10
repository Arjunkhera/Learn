
// Name Property : to get function name 
function sampleFunction() {
    console.log(`Name of this function is ${sampleFunction.name}`);
}
sampleFunction();

// Obtaining from function expressions
let sampleFunctionExpression = function() {
    console.log('Called sample function expression');    
}
console.log(`Name of this function expression is ${sampleFunctionExpression.name}`);

// Length property : to obtain number of passed arguments
function f1(a) {}
function f2(a, b) {}
function many(a, b, ...more) {}

console.log(`Single Argument ${f1.length}`);
console.log(`Two Arguments ${f2.length}`);
console.log(`Spread Operator, but we count only two ${many.length}`);

// Using Closures
function closureCounterFunction() {
    let count = 0;

    return function() {
        console.log(`Closure Counter value is ${++count}`);
    }
}

let closureCounter = closureCounterFunction();
closureCounter();
closureCounter();
closureCounter();

// Using Function Properties
function functionObjectFunction() {
    function objectFunction() {
        console.log(`Function Object counter value is ${++objectFunction.count}`);
    }

    objectFunction.count = 0;
    return objectFunction;
}

let objectCounter = functionObjectFunction();
objectCounter();
objectCounter();
objectCounter();

function enhancedCounter() {
    function counter() {
        console.log(`Value of counter is now ${++counter.count}`);
    }

    counter.count = 0;
    counter.setValue = (newValue) => counter.count = newValue;
    counter.decrease = () => counter.count--;
    return counter;
}

let counterNew = enhancedCounter();
counterNew();
counterNew();
counterNew();
counterNew.setValue(10);
counterNew();
counterNew.decrease();
counterNew.decrease();
counterNew();

function sum(val) {
    let total = val;

    let fn = function sum(input) {
        total += input;
        console.log(`Adding ${input} gives ${total}`);
        return sum;
    }

    fn[Symbol.toPrimitive] = () => {
        return total;
    };

    return fn;
}

sum(0)(1)(2)(3)(4)(5) == 15

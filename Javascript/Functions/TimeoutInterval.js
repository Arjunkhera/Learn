
function noArgument() {
    console.log(`Function ${noArgument.name} ran`);
}

function argumentsFunction() {
    let args = '';
    for(let val of arguments) {
        args += val + ',';
    }
    console.log(`Function ${argumentsFunction.name} with arguments ${args}`);
}

noArgument();
argumentsFunction();
argumentsFunction(1);
argumentsFunction(1,2);

// Set timeout
setTimeout(argumentsFunction, 1500, 1, 2, 3, 4);

// Clear Timeout

let setTimeoutId = setTimeout(argumentsFunction, 5000, 1, 2, 3, 4);
clearTimeout(setTimeoutId);


// Set interval
let count = 0;
let timerId = setInterval(() => console.log(`tick tick ${count++}`), 1000);

// after 5 seconds stop
setTimeout(() => { clearInterval(timerId); console.log('stop tick tick'); }, 5000);

// Achieving repeated calls through setTimeout using recursion
// This gives more flexibility, 
// since you can define logic to decide for repeated calls
let stackCallCount = 0;
let timerIdRecursive = setTimeout(function tick() {
    console.log(`Stack Call Number ${stackCallCount++}`);
    if(stackCallCount < 5) {
        timerIdRecursive = setTimeout(tick, 2000); // (*)
    } else {
        console.log(`Stack Call END`);
    }
  }, 2000);
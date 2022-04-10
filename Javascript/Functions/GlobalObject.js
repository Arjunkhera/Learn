
// Global object can be referenced by window in browsers
window.console.log("Accessing console log function through global object handle window");
// Or we can use globalThis which is the new standard
globalThis.console.log("Accessing console log function through global object handle globalThis");


// Variables declare with var are added in Global Object
{
    var varIsGlobal = 5;
    let letIsBlockScope = 10;
    console.log(`Var: ${varIsGlobal} Let:${letIsBlockScope}`);
}

console.log(`Global scope Var: ${window.varIsGlobal}`);
// console.log(letIsBlockScope); is undefined

/*
let func = function print() {
    var varVariable = 5;
    console.log(`Inside function ${varVariable}`);
}

func();
console.log(`Outside function ${varVariable}`);
*/
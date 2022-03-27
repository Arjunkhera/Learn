
// Fibonacci Iterative 
function getFibonacciIterative(n) {
    let series = [0, 1];
    let a = 0, b = 1, c;
    for(let i = 3; i <= n; i++) {
        c = a + b;
        a = b;
        b = c;
        series.push(c);
    }

    return series;
}

let iterativeArray = getFibonacciIterative(10);

// Fibonacci Recursive
function getFibonacciRecursive(n) {
    let series = [0, 1];
    return series.concat(recursive(0, 1, 3, n));
}

function recursive(a, b, currentIndex, n) {
    
    let series = [];

    let c = a + b;
    a = b;
    b = c;
    series.push(c);

    if(currentIndex < n) {
        return series.concat(recursive(a, b, currentIndex + 1, n));
    }
    
    return series;
}

let recursiveArray = getFibonacciRecursive(10);

if(JSON.stringify(iterativeArray) === JSON.stringify(recursiveArray)) {
    console.log("Same array");
} else {
    console.log("Different array");
}
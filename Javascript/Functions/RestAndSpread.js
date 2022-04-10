// Rest Params Operator
// Converts list of elements into an array
function greetings(firstName, lastName, ...languages) {
    for(let greetingType of languages) {
        console.log(`${greetingType} ${firstName} ${lastName}`)
    }
}

greetings("arjun", "khera", "hello", "namaste", "hola");

// Using arguments to access function arguments
// Arguments is array like and iterable but not an array
function sampleFunction() {
    // using method borrowing to convert arguments into a string
    let args = [].join.call(arguments, ',')
    console.log(`Recieved arguments ${args}`);
}

sampleFunction();
sampleFunction(1);
sampleFunction(1,2);
sampleFunction(1,2,3);

// Spread Operator
// Converts an array into a list of elements
let firstArray = [12,34,92];
let secondArray = [7,77,43];
console.log(Math.max(...firstArray, ...secondArray));

let mergedArray = [...firstArray, ...secondArray];
console.log(mergedArray);

// We can use spread operator to make copies of an object
function MakeUser(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = {
        'city': 'NA',
        'country': 'NA',
    };
}

let userArjun = new MakeUser('arjun', 'khera');
console.log(userArjun);

let copyArjun = {...userArjun};
console.log(copyArjun);

console.log(`Equal ? ${userArjun == copyArjun}`);
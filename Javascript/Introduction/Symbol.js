
// Strings variable
let firstStringVariable = "First";
console.log(firstStringVariable);

// Creating a new symbol
let firstSymbol = Symbol("First");
console.log(firstSymbol);

// Constructor
function CreateUser(firstName, lastName, age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
}

// Name has no effect. Symbols always creates new
let symbolFirst = Symbol("symbol");
let symbolSecond = Symbol("first");

// Will print different symbols
if(symbolFirst == symbolSecond) {
    console.log("These are same symbols");
} else {
    console.log("These are different symbols");
}

let userArjun = new CreateUser("Arjun", "Khera", 25);
console.table(userArjun);

// Create a Global Symbol
// This is registered in the global symbol registry
userArjun[Symbol.for("arjunId")] = 1;
console.table(userArjun);

// Now we can access this symbol again
console.log(`Accessing symbol in object ${userArjun[Symbol.for("arjunId")]}`);
console.log(typeof Symbol.for("arjunId"));

// We can also go reverse, that is get name from symbol
let symbolVariable = Symbol.for("arjunId");
console.log(`The name for this symbol is ${Symbol.keyFor(symbolVariable)}`);

// Symbols are not visible in for each loop
for(key in userArjun) {
    console.log(`Kye is ${key} and value is ${userArjun[key]}`);
}





// Rest Params Operator
function greetings(firstName, lastName, ...languages) {
    for(let greetingType of languages) {
        console.log(`${greetingType} ${firstName} ${lastName}`)
    }
}

greetings("arjun", "khera", "hello", "namaste", "hola");

// Spread Operator
let firstArray = [12,34,92];
let secondArray = [7,77,43];
console.log(Math.max(...firstArray, ...secondArray));

let mergedArray = [...firstArray, ...secondArray];
console.log(mergedArray);

// We can use this to make copies of an object

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
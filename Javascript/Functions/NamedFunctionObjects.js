let unnamed = function(input) {
    console.log(`Unnamed Greetings ${input}`);
}

unnamed('Arjun');

// We can name function expressions
let named = function greeting(input) {
    if(input == undefined) {
        greeting(`guest`);
    } else {
        console.log(`Named Greetings ${input}`);
    } 
}

named('Arjun');
named(undefined);


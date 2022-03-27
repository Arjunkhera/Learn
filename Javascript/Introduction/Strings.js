// Use any of the three
const doubleQuotes = "Double Quotes";
console.log(doubleQuotes);

const singleQuotes = 'Single Quotes';
console.log(singleQuotes);

const backticks = `These can be
multiline and also do
evaluation ${1 + 2}
`;
console.log(backticks);

// Using special characters
const multiLineString = "This is\na multiline\nstring";
console.log(multiLineString);

// We can use unicode directly in strings
const emoji = "\u{1F60D}";
console.log(`Here is an emoji: ${emoji}`);

const firstName = "arjun";
const lastName = "khera";

// Concatenation
console.log(firstName + ' ' + lastName);

// Append
let container = "Son";
container += "Goku";
console.log(container);

// Length is a property and not a method
console.log('abc'.length);

// We can use indexing on strings
console.log('abc'[1]);

// get last character of string
console.log(firstName.charAt(firstName.length - 1));

// we can also use char at
console.log('abc'.charAt(1));

// Some common methods
console.log(firstName.toUpperCase());
console.log(firstName.toLowerCase());

let val;

// indexOf, provides the index of the first occurence of a given character
console.log(firstName.indexOf('r'));
// -1 if not found
console.log(firstName.indexOf('x'));
// we can also provide starting position
console.log(firstName.indexOf('x', 3));
// traverse the string from back for the first occurence of a given character
console.log(firstName.lastIndexOf('a'));

// includes()
console.log("just random string here".includes('random'));
console.log("just random string here".includes('is'));

// startswith
console.log("this starts".startsWith('this'));
// endswith
console.log("this ends".endsWith('ends'));

// substring : provide start and end points
console.log(firstName.substring(0, 4));

// slice : return substrings or subarrays
console.log(`Slice start to end: ${firstName.slice(0, 4)}`);
// goes till end if we don't give a starting point
console.log(`Till end: ${firstName.slice(-2)}`);

val = 'Hello there, my name is Arjun';
// split
val = val.split(' ');

// replace : single instance
console.log("This is so awesome removeMe".replace("removeMe","I love it!"));
// replaceAll : all instances
console.log("This is 1 and now 2 again 1".replaceAll("1", "3"));

// Going from character to code point
console.log('z'.codePointAt());
// and coming back
console.log(String.fromCodePoint('z'.codePointAt()));

// String comparison
console.log("bigger".localeCompare("Smaller"));
console.log("Smaller".localeCompare("bigger"));
console.log("same".localeCompare("same"));

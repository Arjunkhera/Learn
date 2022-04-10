// Two ways to declare arrays
// Method 1 : frequently used and preferred
const methodFirst = [1,2,3];
console.log(`Method First ${methodFirst}`);
// Method 2 : results in defining 4 undefined elements
const methodSecond = new Array(4);
console.log(`Method Second ${methodSecond}`);

// Arrays are like objects, don't use them like that
// Results in losing optimization
const arraysAreObjects = [1,2,3];
console.log(`Array type is Object ${typeof arraysAreObjects}`);
arraysAreObjects.someProperty = "someValue";
console.log(`Don't do this ${arraysAreObjects.someProperty}`);

// Because arrays are objects, we can store anything
const storeAnything = [1,"2", true, function(){console.log('hello')}];
console.log(`Store everything ${storeAnything}`);

// Adding/Removing elements
const originalArray = [2,3,4,5];
console.log(`Original Array ${originalArray}`);

// From the end : Preferred
originalArray.push(6);
console.log(`Push 6: ${originalArray}`);
originalArray.pop(6);
console.log(`Pop 6: ${originalArray}`);

// From the start : avoid this!!
originalArray.unshift(1);
console.log(`Unshit 1: ${originalArray}`);
originalArray.shift(1);
console.log(`Shift 1: ${originalArray}`);

// Looping over array

// Original indexing method
console.log(`Looping using indexing`);
for(let i = 0; i < originalArray.length; i++) {
    console.log(`Index: ${i} Value: ${originalArray[i]}`);
}

// for of : directly gives values and no index
console.log(`Looping using for of`);
for(let value of originalArray) {
    console.log(`Value: ${value}`);
}

// for in : don't use this, primarily for objects and is slower
// also this results in printing keys you don't want to see 
console.log(`Looping using for in`);
for(let key in originalArray) {
    console.log(`Key:${key} Value: ${originalArray[key]}`);
}

// You can modify length property directly
const modifyLength = [1,2,3,4];

// Increasing length adds undefined elements
modifyLength.length = 10;
console.log(`You will see undefined elements: ${modifyLength}`);

// Decreasing length truncates the size
modifyLength.length = 2;
console.log(`Remove the elements: ${modifyLength}`);


const numbers = [43,56,33,23,44,36,5];
const numbers2 = new Array(22,45,33,76,54);
const vehicles = ['car','bus','train'];
let val;

// slice, splice and split

// slice returns new array without modifying the original
numbers.slice(1,3);

// splice, modifies the existing array

// removes 1 element, at index 1
numbers.splice(1,1);
// we can also add elements using splice

// split is used for turning strings into arrays, does not modify the original string
let url = "https://www.freecodecamp.org/news/lets-clear-up-the-confusion-around-the-slice-splice-split-methods-in-javascript-8ba3266c29ae/";
url.split("/");

// the following will simply convert the string into array with every character as an element
// url.split("");


numbers.reverse();

// concatenate arrays
val = numbers.concat(numbers2);

// sorting arrays
val = vehicles.sort();
// sorts by first digit, not the whole number
val = numbers.sort();

// to sort by integer value
val = numbers.sort(function(x, y){
    return x - y;
});

// reverse the sorting order
val = numbers.sort(function(x, y){
    return y - x;
})

// Find
function under50(num) {
    return num < 50;
}

val = numbers.find(under50);




function sum(val) {
    let total = val;

    let fn = function sum(input) {
        total += input;
        console.log(total);
        return sum;
    }

    fn[Symbol.toPrimitive] = () => {
        return total;
    };

    return fn;
}


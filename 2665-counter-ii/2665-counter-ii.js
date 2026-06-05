/**
 * @param {number} init
 * @return {{increment: Function, decrement: Function, reset: Function}}
 */
var createCounter = function(init) {
    let current = init;

    return {
        increment: function() {
            return ++current;
        },

        decrement: function() {
            return --current;
        },

        reset: function() {
            current = init;
            return current;
        }
    };
};

/**
 * Example:
 */
const counter = createCounter(5);

console.log(counter.increment()); // 6
console.log(counter.reset());     // 5
console.log(counter.decrement()); // 4
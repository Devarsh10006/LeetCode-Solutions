function helloWorld() {
    console.log("Hello world");
}

/**
 * @return {Function}
 */
var createHelloWorld = function() {
    return function() {
        return "Hello World";
    };
};


 
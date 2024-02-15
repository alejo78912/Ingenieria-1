
function is_prime(number) {
    if (number < 2) {
        console.log("It's not prime number")
    } else {
        for (var i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                console.log("It's not prime number")
            }
        }
        console.log("It's a prime number")
    }
}

console.log(is_prime(1)); 


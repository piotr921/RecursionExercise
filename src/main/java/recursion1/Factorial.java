package recursion1;

class Factorial {

    int factorial(int n) {
        if (n < 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

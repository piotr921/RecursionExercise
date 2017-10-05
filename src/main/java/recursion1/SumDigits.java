package recursion1;

class SumDigits {

    int sumDigits(int n) {
        if (n % 10 == 0 && n < 10) {
            return 0;
        } else {
            return n % 10 + sumDigits(n / 10);
        }
    }
}

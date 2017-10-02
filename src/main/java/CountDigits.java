class CountDigits {

    int count7(int n) {
        if (n % 10 == 0 && n < 10) {
            return 0;
        } else if (n % 10 == 7) {
            return 1 + count7(n / 10);
        } else {
            return count7(n / 10);
        }
    }

    int count8(int n) {
        if (n % 10 == 0 && n < 10) {
            return 0;
        } else if (n % 100 == 88) {
            return 2 + count8(n / 10);
        } else if (n % 10 == 8) {
            return 1 + count8(n / 10);
        } else {
            return count8(n / 10);
        }
    }
}

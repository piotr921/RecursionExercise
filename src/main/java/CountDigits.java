class CountDigits {

    int count7(int n) {
        if (n % 10 == 0 && n < 10){
            return 0;
        } else if (n % 10 == 7){
            return 1 + count7(n / 10);
        } else {
            return count7(n / 10);
        }
    }
}

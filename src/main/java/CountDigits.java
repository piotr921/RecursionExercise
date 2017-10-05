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

    int countX(String str) {
        if (str.isEmpty()) {
            return 0;
        } else if (str.charAt(0) == 'x') {
            return 1 + countX(str.substring(1));
        } else {
            return countX(str.substring(1));
        }
    }

    int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        } else if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(2));
        } else {
            return countHi(str.substring(1));
        }
    }

    int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        } else if (str.charAt(0) == 'x' && str.charAt(1) == 'h' && str.charAt(2) == 'i') {
            return countHi2(str.substring(3));
        } else if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi2(str.substring(2));
        } else {
            return countHi2(str.substring(1));
        }
    }

    int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        } else if (str.substring(0, sub.length()).equals(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        } else {
            return strCount(str.substring(1), sub);
        }
    }
}

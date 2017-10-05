class SubStrings {

    int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        } else if (str.substring(0, sub.length()).equals(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        } else {
            return strCount(str.substring(1), sub);
        }
    }

    boolean strCopies(String str, String sub, int n) {
        if (str.length() < sub.length()) {
            return n <= 0;
        } else if (str.substring(0, sub.length()).equals(sub)) {
            return strCopies(str.substring(1), sub, n - 1);
        } else {
            return strCopies(str.substring(1), sub, n);
        }
    }

    int strDist(String str, String sub) {
        if (str.length() == sub.length())
    }
}

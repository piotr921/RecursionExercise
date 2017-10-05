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
        if (str.length() < sub.length()) {
            return 0;
        } else if (str.length() == sub.length()) {
            return str.equals(sub) ? sub.length() : 0;
        } else if (str.substring(0, sub.length()).equals(sub) && str.substring(str.length() - sub.length(), str.length()).equals(sub)){
            return str.length();
        } else if (str.substring(0, sub.length()).equals(sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
        } else if (str.substring(str.length() - sub.length(), str.length()).equals(sub)) {
            return strDist(str.substring(1), sub);
        } else {
            return strDist(str.substring(1, str.length() - 1), sub);
        }
    }
}

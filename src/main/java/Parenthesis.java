class Parenthesis {

    String parenBit(String str) {
        if (str.length() < 2) {
            return "";
        } else if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return str;
        } else if (str.charAt(0) == '(') {
            return parenBit(str.substring(0, str.length() - 1));
        } else if (str.charAt(str.length() - 1) == ')') {
            return parenBit(str.substring(1, str.length()));
        } else {
            return parenBit(str.substring(1, str.length() - 1));
        }
    }
}

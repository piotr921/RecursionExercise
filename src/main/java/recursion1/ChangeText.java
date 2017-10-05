package recursion1;

class ChangeText {

    String changeXY(String str) {
        if (str.isEmpty()) {
            return "";
        } else if (str.charAt(0) == 'x') {
            return "y" + changeXY(str.substring(1));
        } else {
            return str.charAt(0) + changeXY(str.substring(1));
        }
    }

    String changePi(String str) {
        if (str.length() < 2) {
            return str;
        } else if (str.substring(0, 2).equals("pi")) {
            return "3.14" + changePi(str.substring(2));
        } else {
            return str.charAt(0) + changePi(str.substring(1));
        }
    }

    String noX(String str) {
        if (!str.contains("x")) {
            return str;
        } else if (str.charAt(0) == 'x') {
            return noX(str.substring(1));
        } else {
            return str.charAt(0) + noX(str.substring(1));
        }
    }

    String allStar(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return str.charAt(0) + "*" + allStar(str.substring(1));
        }
    }

    String pairStar(String str) {
        if (str.length() < 2) {
            return str;
        } else if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        } else {
            return str.charAt(0) + pairStar(str.substring(1));
        }
    }

    String endX(String str) {
        if (str.length() <= 1) {
            return str;
        } else if (str.charAt(0) == 'x') {
            return endX(str.substring(1)) + 'x';
        } else {
            return str.charAt(0) + endX(str.substring(1));
        }
    }

    String stringClean(String str) {
        if (str.length() <= 1) {
            return str;
        } else if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        } else {
            return str.charAt(0) + stringClean(str.substring(1));
        }
    }
}

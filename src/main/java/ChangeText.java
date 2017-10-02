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
}

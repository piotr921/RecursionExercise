class ChangeXY {

    String changeXY(String str) {
        if (str.isEmpty()) {
            return "";
        } else if (str.charAt(0) == 'x') {
            return "y" + changeXY(str.substring(1));
        } else {
            return str.charAt(0) + changeXY(str.substring(1));
        }
    }
}

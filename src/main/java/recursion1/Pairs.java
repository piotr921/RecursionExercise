package recursion1;

class Pairs {

    int countPairs(String str) {
        if (str.length() <= 2) {
            return 0;
        } else if (str.charAt(0) == str.charAt(2)) {
            return 1 + countPairs(str.substring(1));
        } else {
            return countPairs(str.substring(1));
        }
    }

    int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        } else if (str.substring(0, 3).equals("abc")) {
            return 1 + countAbc(str.substring(2));
        } else if (str.substring(0, 3).equals("aba")) {
            return 1 + countAbc(str.substring(2));
        } else {
            return countAbc(str.substring(1));
        }
    }

    int count11(String str) {
        if (str.length() < 2) {
            return 0;
        } else if (str.substring(0, 2).equals("11")) {
            return 1 + count11(str.substring(2));
        } else {
            return count11(str.substring(1));
        }
    }
}

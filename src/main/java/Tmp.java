public class Tmp {

    public static void main(String[] args) {
        String str = "catcowcat";
        String sub = "cat";
//        System.out.println(text.substring(0, 2));
//        System.out.println(text.charAt(2));
//        System.out.println(text.substring(3));
//        System.out.println(text.charAt(text.length() - 1));
        System.out.println(str.substring(str.length() - sub.length(), str.length()));
        System.out.println(str.substring(0, sub.length()));
    }
}

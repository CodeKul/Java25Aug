package java8;

public class CapitalFirstLetter {
    public static void main(String[] args) {
        MyInterface6 m = CapitalFirstLetter::firstLetterCaps;
        System.out.println(m.capital("maharashtra"));
    }
    private static String firstLetterCaps(String str){
        return str.replaceFirst(str.substring(0,1),new String(String.valueOf(str.charAt(0))).toUpperCase());
    }
}

interface MyInterface6{

    String capital(String str);
}
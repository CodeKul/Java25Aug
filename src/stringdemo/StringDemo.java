package stringdemo;

public class StringDemo {
    public static void main(String[] args) {

        String str = "Pune";
        String str2 = "Kolhapur";
        String str1 = new String("Mumbai");

        String s = str.concat(str2);
        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s.lastIndexOf("P"));
        System.out.println(s.indexOf("P"));
        System.out.println(s.indexOf("P",3));
        System.out.println(str2.substring(5,8));
        System.out.println(str2.charAt(7));
        System.out.println(str2.contains("e"));
        System.out.println(str2.contentEquals("Kolhpur"));
        System.out.println(str2.intern());

        String str4 =new String("Kolhapur");
        System.out.println(str2.equals(str4)); //it checks content of string
        System.out.println(str2==str4);// it checks refernece of string

    }
}

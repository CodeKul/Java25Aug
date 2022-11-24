package stringdemo;

public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Pune");
        StringBuffer stringBuffer1 = new StringBuffer("Pune");
        stringBuffer.append(stringBuffer1);
        System.out.println(stringBuffer.capacity());
        stringBuffer.trimToSize();
        System.out.println(stringBuffer.capacity());
//        System.out.println(stringBuffer.charAt(1));
//        System.out.println(stringBuffer.delete(1,3));
//        System.out.println(stringBuffer.deleteCharAt(3));
//        stringBuffer.setCharAt(1,'I');
//        stringBuffer.insert(1,'P');
        stringBuffer.replace(0,4,"Mumbai");
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}

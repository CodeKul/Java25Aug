package exceptionhandling;

public class ThrowKeyword {
    public static void main(String[] args) throws Exception,ArithmeticException,NullPointerException {

        int age=17;

        if(age>18){
            System.out.println("You can vote");
        }else {
            try {
                throw new Exception("You can not vote");

            }catch (Exception e){
                System.out.println(e);
            }
        }

        System.out.println("Hii");
    }
}

/**
 *                throw                               Throws
 *
 * 1. to throw the exception explicitly          1. to declare exception
 *
 * 2. throw is used in method                    2. throws is used with method signature
 *
 * 3. throw is followed by instance              3. throws is followed by classes
 *
 * 4. you can throw only single exception        4. you can declare multiple exception
 */
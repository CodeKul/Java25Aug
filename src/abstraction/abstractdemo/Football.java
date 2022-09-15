package abstraction.abstractdemo;

public class Football extends Sports{

    @Override
    public void play() {
        System.out.println("Playing football");
    }

    public static void main(String[] args) {
        Football obj = new Football();
        obj.play();
        obj.exercise();
    }
}

class Cricket extends Football{

    @Override
    public void play() {

    }

    public void show(){
        System.out.println("in show");
    }
}

/**
 *       abstract class                                          interface
 *
 * 1. we declare abstract class using abstract keyword          we use interface
 *
 * 2. we abstract + non abstract method in abstract class       only abstract
 *
 * 3. private,protected,default,public variable                 public abstract by default
 *
 * 4.we can extends another class to abstract class             we can extends another interface
 *
 * 5.partial abstraction                                        100% abstraction
 */
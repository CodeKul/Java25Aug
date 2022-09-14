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
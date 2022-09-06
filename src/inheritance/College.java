package inheritance;

/**
 *
 * inheritance -> acquiring all properties from parent class to child class
 * advantage => code re-usability
 */
public class College { //parent class,super class , base class

    int id;
    String name;
    String address;

    public void show(){

    }

}

class Student extends College{ //child class , sub class, derived class

    public void show(){

    }
}

class Teachers extends Student{

    public static void main(String[] args) {
        College college = new College();
        college.id = 1;
        college.address = "Pune";
        college.name = "ABC";

        Student student = new Student();
        student.id = 1;
        student.name = "Akash";
        student.address = "Pune";

        Teachers teachers  = new Teachers();
        teachers.id = 1;
        teachers.name ="Shiv";
        teachers.address = "Nashik";
    }
}


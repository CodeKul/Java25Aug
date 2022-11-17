package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo implements Comparable<EmployeeDemo> {

    int id;
    String name;
    String address;

    public EmployeeDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();

/*
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(888);
        list.add(4534);
        list.add(12);
        list.add(453);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
*/


        EmployeeDemo obj1 = new EmployeeDemo(98,"prakash","Pune");
        EmployeeDemo obj2 = new EmployeeDemo(45,"rali","Mumbai");
        EmployeeDemo obj3 = new EmployeeDemo(342,"hri","Pune");

        List<EmployeeDemo> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Collections.sort(list);

        list.forEach(s->{
            System.out.println(s.id+" "+ s.name+" "+s.address);
        });
    }

    @Override
    public int compareTo(EmployeeDemo o) {
        return this.name.compareTo(o.name);
    }

/*
    @Override
    public int compareTo(EmployeeDemo o) {
        if(this.id==o.id){
            return 0;
        }else if(this.id>o.id){
            return 1;
        }else {
            return -1;
        }
    }
*/

/*    @Override
    public int compareTo(EmployeeDemo o) {
       return compare(this.id, o.id);
    }

    public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }*/
}

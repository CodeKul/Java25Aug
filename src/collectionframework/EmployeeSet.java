package collectionframework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EmployeeSet {

    int id;
    String name;
    String address;

    public EmployeeSet(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeSet that = (EmployeeSet) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    public static void main(String[] args) {
        EmployeeSet obj1 = new EmployeeSet(1,"Ravi","Pune");
        EmployeeSet obj2 = new EmployeeSet(1,"Ravi","Pune");
        EmployeeSet obj3 = new EmployeeSet(2,"Mahesh","Nashik");

        Set<EmployeeSet> set = new HashSet<>();
        set.add(obj1);
        set.add(obj2);
        set.add(obj3);

        set.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.address);
        });
    }
}

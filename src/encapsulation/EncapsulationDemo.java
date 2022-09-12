package encapsulation;

public class EncapsulationDemo {

    private int id;

    private String name;

    private String address;

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }
    public int getId(){
        return id;
    }

    public static void main(String[] args) {

        EncapsulationDemo obj = new EncapsulationDemo();
        /*obj.id = 1;
        obj.name = "Ravi";
        obj.address = "Pune";
        System.out.println("id=> "+ obj.id+ " name=>"+ obj.name+" address=>"+obj.address);*/

        obj.setId(1);
        obj.setName("Ravi");
        obj.setAddress("Pune");
        System.out.println("id=>"+obj.getId()+" name=>"+obj.name+" address=>"+ obj.address);
    }
}

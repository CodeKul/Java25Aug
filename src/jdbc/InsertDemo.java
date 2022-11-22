package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");//registering driver

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java25aug",
                "root3", "password"); //connection established

        Statement statement = connection.createStatement();

//        String insert = "insert into employee(id,name,address) values(2,'Rahul','Mumbai')";

//        String update = "update employee set name = 'Ramesh' where id =2";

        String delete = "delete from employee where id =2";
        int count = statement.executeUpdate(delete);

        System.out.println(count + " row deleted");
    }
}

//ddl => create alter drop
//dml => insert update delete
//dql => select
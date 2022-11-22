package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");//registering driver

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java25aug",
                "root3", "password"); //connection established

        Scanner scanner = new Scanner(System.in);
        int id;
        String name;
        String address;

        System.out.println("enter values id name and address");
        id = scanner.nextInt();
        name = scanner.next();
        address = scanner.next();

        String insert = "update employee set name = ?, address = ? where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(insert);

        preparedStatement.setString(1,name);
        preparedStatement.setString(2,address);
        preparedStatement.setInt(3,id);

        int count = preparedStatement.executeUpdate();
        System.out.println(count+ " row updated");
    }
}

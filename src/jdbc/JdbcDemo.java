package jdbc;

import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//registering driver

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java25aug",
                    "root3", "password"); //connection established

            Statement statement = connection.createStatement();

            String select = "select * from employee";

            ResultSet resultSet = statement.executeQuery(select);

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+
                        resultSet.getString(3));
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

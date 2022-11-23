package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchStatementDemo {

    public static void main(String[] args)throws ClassNotFoundException, SQLException {

        String insert = "insert into employee(id,name,address) values(?,?,?)";
        PreparedStatement preparedStatement = ConnectionConfig.getConn().prepareStatement(insert);

        for(int i=10;i<20;i++){
            preparedStatement.setString(2,"name "+i);
            preparedStatement.setString(3,"address "+i);
            preparedStatement.setInt(1,i);
            preparedStatement.addBatch();
        }

        int[] count = preparedStatement.executeBatch();
        System.out.println(count.length);
    }
}

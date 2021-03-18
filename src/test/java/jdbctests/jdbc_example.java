package jdbctests;

import org.testng.annotations.Test;

import java.sql.*;

public class jdbc_example {
    String dbUrl="jdbc:oracle:thin:@3.87.59.228:1521:xe";
    String dbUsername="hr";
    String dbPassword="hr";
    @Test
    public void test1() throws SQLException {
        //create connection
        Connection connection= DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
        //creating statement object
        Statement statement=connection.createStatement();
        //run query and get the result in resultSet object
        ResultSet resultSet=statement.executeQuery("Select * from regions");

        //close all connections
        resultSet.close();
        statement.close();
        connection.close();

    }

}

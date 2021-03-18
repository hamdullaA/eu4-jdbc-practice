package jdbctests;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String dbUrl="jdbc:oracle:thin:@3.87.59.228:1521:xe";
        String dbUsername="hr";
        String dbPassword="hr";
        //create connection
        Connection connection= DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
        //creating statement object
        Statement statement=connection.createStatement();
        //run query and get the result in resultSet object
        ResultSet resultSet=statement.executeQuery("Select * from regions");
        //move pointer to first row
        resultSet.next();
        System.out.println(resultSet.getString("region_name"));

        //close all connections
        resultSet.close();
        statement.close();
        connection.close();


    }
}

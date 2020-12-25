package JDBC.Utilities;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Parent {

    public Connection connection;
    public Statement statement;

    @BeforeTest
    public void beforeTest() throws SQLException {

        String url="jdbc:mysql:// test.medis.mersys.io:33306/sakila";

        String username="technostudy";
        String password="zhTPis0l9#$&";

        connection= DriverManager.getConnection(url,username,password);


        statement=connection.createStatement();


    }

    @AfterTest
    public  void afterTest() throws SQLException {
        connection.close();
    }

}

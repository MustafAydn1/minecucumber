package JDBC.Day1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.*;

public class _02_BeforeAfterTest {

    private  Connection connection;
    private  Statement statement;

    @BeforeTest
    public void beforeTest() throws SQLException {

        String url="jdbc:mysql:// test.medis.mersys.io:33306/sakila";
/*
Veri tabanına ulaşılabılmek için JDBC ye :
db nın tipi:: mysql
db nin yolu::test.medis.mersys.io
db nın bulundugu bilgisayarın içindeki mysql db nın port numarası:: 33306
ve
db nin adı(sakila) verildi
 */
        String username="technostudy";
        String password="zhTPis0l9#$&";

        connection= DriverManager.getConnection(url,username,password);  // try catch ister. yukarı imza atsın.
// Benim bilgisayarımla Database arasındaki bağlantı sağlandı?

//Şimdi sorguları calıştıracagım yer lazım bana:: Statement

        statement=connection.createStatement(); //sorgularımı calıştırabılmek için bi yol oluştur.


    }

    @AfterTest
    public  void afterTest() throws SQLException {
        connection.close();
    }


    @Test
    private void test1() throws SQLException {

      ResultSet rs= statement.executeQuery("select * from language");

      rs.next();
      String name=rs.getString("name");
        System.out.println(name);

        rs.next();
        name=rs.getString("name");
        System.out.println(name);

        rs.next();
        name=rs.getString(2);
        System.out.println(name);


        rs.previous();                        // en son yazdıgından bir geri yaptı. kayıtlar arasında inip cıkıyorsun
        name=rs.getString("name");
        System.out.println(name);

    }




}

package JDBC.Day1;

import JDBC.Utilities.JDBC_Parent;
import org.testng.annotations.Test;

import java.sql.*;

public class _03_AbsoluteRelative extends JDBC_Parent {

   @Test
   public  void test1() throws SQLException {


    ResultSet rs=statement.executeQuery("select * from film");

    rs.absolute(10);                                // verilen satıra git.
    String title=rs.getString("title");
       System.out.println(title);

    rs.absolute(15);                               // 15. satıra git
    title=rs.getString("title");
       System.out.println(title);


    rs.relative(5); // en son buldugu yerden 5 ileri gider.Yani 20. satıra  gider.
    title=rs.getString("title");
       System.out.println(title);

       rs.relative(-5); // en son buldugu yerden 5 geri gider.Yani 15. satıra  gider.
       title=rs.getString("title");
       System.out.println(title);




       int count=0;
       while(count<100){
           rs.next();                                                            // 16 dan başlar,rs 15 de kalmıştı.
           System.out.println(rs.getInt(1)+"| "+rs.getString(2)+"| "+rs.getString(3));
           count++;
       }



        rs.first();  // ilk satırdaki ni verir.
       title=rs.getString("title");
       System.out.println(title);




   }
}

package JDBC.Day2;

import JDBC.Utilities.JDBC_Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _03_GetAllRowColumn extends JDBC_Parent {

    @Test
    public void test1() throws SQLException {

        ResultSet rs= statement.executeQuery("select * from language");

       ResultSetMetaData rsmd= rs.getMetaData(); // bu fonksiyon ile sorgu listesine ilişkin temel şeylere ulaşıyoruz

       int columnCount=rsmd.getColumnCount(); // bu satırda kaç column var.
 // . bas ve incele neler neler var burada.

        System.out.println(columnCount);

        while (rs.next()){ // satırların sonuna kadar while ile git
            for (int i = 1; i <=columnCount ; i++) {  // her satırda her column a ugrayarak,sonuna kadar for ile git

                String str=rs.getString(i);
               // int length=rs.getString(i).length();

               System.out.printf( "%-10s" ,str+"|"); // neden yapamıyorsun !!!!


// System.out.print(rs.getString(i) +" | ");

            }
            System.out.println();


        }



    }



    @Test
    public void filmTable() throws SQLException {

        ResultSet rs=statement.executeQuery("select * from film");
        ResultSetMetaData rsmd= rs.getMetaData();

        int columnCount=rsmd.getColumnCount();
        System.out.println(columnCount);

        while (rs.next()){
            for (int i = 1; i <=columnCount ; i++) {
                String str=rs.getString(i);
               // int a=rs.getString(i).length();

                System.out.printf("\t%-1s " ,str+" | "); // daha duzenli nasıl yaparsın dusun.bul.ODEV!!!!
            }
            System.out.println();

        }







    }

}

package JDBC.Day2;

import JDBC.Utilities.JDBC_Parent;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_SqlExamples extends JDBC_Parent {


    @Test
    public void relativeExamples() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from city");

        rs.relative(5);                         //5. satırı yazdırır
        String cityName=rs.getString(2);
        System.out.println(cityName);


        rs.relative(6);                        //11. satırı yazdırır.
        cityName=rs.getString(2);
        System.out.println(cityName);

    }

    @Test
    public void lastFirstKeyword() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from city");
        rs.last();
        String cityName=rs.getString("city");
        Integer countryId=rs.getInt("country_id");
// Wrapper mi int mi yazacam. metodun uzerine gel.Açıklama da yazar.burada int de olur.
        System.out.println(cityName+ "--" +countryId);



    }
    @Test
    public void sehirler() throws SQLException {

        ResultSet rs=statement.executeQuery("select * from address");
        rs.absolute(10);
        String districtName  =rs.getString("district");
        System.out.println(districtName);

        rs.absolute(22);
        districtName=rs.getString("district");
        System.out.println(districtName);

        rs.last();
        districtName=rs.getString("district");
        System.out.println(districtName);

    }

    // hocanın cözumu de daha guzel. * yerine sececeğin column u yazma.
    // rs.absolute ile satıra gelip,ilkini secme başka da yok zaten.
         @Test
         public  void  sehirler1() throws SQLException {

        ResultSet rs=statement.executeQuery("select district from address");

       // rs.absolute(10);
      //  String  districtName=rs.getString(1);
             System.out.println(rs.absolute(10));// bu olmaz. boolean sonuc verir.
// bu olmaz. boolean sonuc verir. uzerine gel. returnu gör.

        rs.absolute(22);
       String  districtName=rs.getString("1");
             System.out.println(districtName);

        rs.last();
        districtName=rs.getString(1);
             System.out.println(districtName);

         }

//company içinde countries deki ilk 10 ülkeyi yazdır. içerisinde E harfi bulunanları büyük yazdır.
         @Test
    public  void goodExample1() throws SQLException {
        ResultSet rs=statement.executeQuery("select COUNTRY_NAME from company.countries ");

      //  ResultSetMetaData rsmd=rs.getMetaData();
      //  int columnCount=rsmd.getColumnCount();

       // rs.last();
       // int rowCount=rs.getRow();

        for (int i = 1; i <=10 ; i++) {
                 rs.absolute(i);
                 String countryName=rs.getString("COUNTRY_NAME");

                 if(countryName.contains("e")||countryName.contains("E"))
                     System.out.println(countryName.toUpperCase());
                 else System.out.println(countryName);

             }

         }

//company içinde countries deki sonu a ile biten ulkeleri yazdır ve bunların doğrulugunu assert et.

    @Test
    public  void a_ileBitenUlkeler() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from company.countries where COUNTRY_NAME like '%a' ");

      while (rs.next()) {
          String names = rs.getString("COUNTRY_NAME");
          System.out.println(names);

          Assert.assertEquals(names.substring(names.length() - 1), "a");

      }

    }

}
/*

 */
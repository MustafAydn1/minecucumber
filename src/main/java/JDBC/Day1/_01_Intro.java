package JDBC.Day1;

import org.testng.annotations.Test; // Test in uzerinde tıkla. Library ekledi.otomatık pom.xml e.

import java.sql.*;

public class _01_Intro {


    @Test
    public void test1() throws SQLException {

        String url="jdbc:mysql://test.medis.mersys.io:33306/sakila";
/*
Veri tabanına ulaşılabılmek için JDBC ye :
db nın tipi:: mysql
db nin yolu::test.medis.mersys.io
db nın bulundugu bilgisayarın içindeki mysql db nın port numarası:: 33306
ve
db nin adı(sakila) verildi
Yani 3 adet String bilgi alacagım.
 */
        String username="technostudy";
        String password="zhTPis0l9#$&";

        Connection connection= DriverManager.getConnection(url,username,password);  // try catch ister. yukarı imza atsın
// Benim bilgisayarımla Database arasındaki bağlantı sağlandı?

//Şimdi sorguları calıştıracagım yer lazım bana:: Statement

        Statement  statement=connection.createStatement(); //sorgularımı calıştırabılmek için bi yol oluştur.


        ResultSet rs=statement.executeQuery("select * from actor");
// çalıştırıldı sonuçlar  rs değişkenine set edildi.
// Ancak performans için bütün sonuçlar bir anda rs ye aktarılmıyor.Biz komut verdikçe satır satır gelecek.

        rs.next();
//göstergeyi sonraki adıma getir, orada bütün satır varsa rs ye at.

        String firstName=rs.getString("first_name"); // column indexi yada column adı...


        System.out.print(firstName);   // ln sonraki satırı aşagıya indirir. buraya yazmazsan soyad yanında olusur.

        String  lastName=rs.getString(3);

        System.out.println(" "+lastName);  // ln buraya yazmazsan 2. isim, 1. ismin yanında olur.


        rs.next();
        firstName=rs.getString(2); // sql index 1 den başlar
        lastName=rs.getString(3);

        System.out.println(firstName+" "+lastName);


        connection.close();

// kapıyı kapatmalısın. acık bırakırsan performansı cok olumsuz etkiler.
// garbıccollector diye programlarda var




    }




}

/*
port: kapı-giriş. mysql in çalışacagı kapı:port-- bilgisayarın içindeki çalışan programın numarası bu.gate de denir
Driver:: programları kullanan,programlarla bizim aramızdaki anlaşmayı sağlayan kutuphaneye driver denilebilir.


 */




/*
      String URL = "jdbc:mysql://test.medis.mersys.io:33306/sakila";
       // Veritabanına ulaşabilmek için JDBC ye : db nini tipi (mysql), db nin yolu (test.medis.mersys.io)
       // db nin bulunduğu bilgisayarın içindeki mysql db nin port numarası (33306) ve db nin adı verildi.
       String username = "technostudy";
       String password = "zhTPis0l9#$&";
 */
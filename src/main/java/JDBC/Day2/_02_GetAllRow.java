package JDBC.Day2;

import JDBC.Utilities.JDBC_Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_GetAllRow extends JDBC_Parent {


    @Test
    public void withWhile() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from customer");



        while(rs.next()) {
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");

           // System.out.println(firstName + " " + lastName);
            System.out.printf("%-4d %-15s %-15s \n",  rs.getRow(), firstName, lastName); // bunu neden yapamadım.
        }


      //  for (int i=1; rs.next() ; i++)



        rs.last();
        System.out.println(rs.getRow()); // bununla satır sayısını alırsın.


    }

       @Test
        public void test2() throws SQLException {
           ResultSet rs=statement.executeQuery("select * from customer");

    int count = 1;
    while (count<=100) {
        rs.next();
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");

       // System.out.println(count+"."+firstName + " " + lastName);
        System.out.printf("%-4d %-15s %-15s\n",count,firstName,lastName);
        count++;
    }



}
    // Task : yukarıdaki örneği for döngüsü yapınız.
    @Test  // bu testi yapamadım.sabah bak.çöz. başka  çözumleri de incele...
    public void forile() throws SQLException {

    ResultSet rs=statement.executeQuery("select * from customer");
  //  ResultSet rs1=statement.executeQuery("select last_name from customer"); // iki tane TANIMLAYAMAZSIN.

    rs.last();
    int count=rs.getRow();
        System.out.println("Toplam Kayıt Sayısı: "+count);

    rs.first();

    for (int i = 1; i<count; i++) {
       // rs.absolute(i); // bunu yazınca next i silersin.

        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        int customer_id = rs.getInt("customer_id");

        System.out.printf("%-4d %-15s %-15s\n",customer_id,firstName,lastName);

        rs.next();
        // rs.next(); koymadan olmaz. ama bunu silip üste::rs.absolute(i); yazarsan next i yazmana gerek kalmaz
    }


}





}


/*
 for (int i = 1; i <= lastrow; i++) {

            rs.absolute(i);
            String firstname=rs.getString("first_name");
            String lastname=rs.getString("last_name");
            System.out.printf("%-15s %-15s %-4d\n", firstname, lastname, rs.getRow());
        }
 */

/*
   // Task : yukarıdaki örneği for döngüsü yapınız.
    @Test
    public void task1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from customer ");
        rs.last();
        int rowCount = rs.getRow();

        rs.first();
        for (int i = 1; i <= rowCount; i++) {
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");

            //System.out.println(firstName + " -- " + lastName + " -- "+ rs.getRow());
            System.out.printf("%-15s %-15s %-4d\n", firstName, lastName, rs.getRow());

            rs.next();
        }


//        for (int i = 1; i <= rowCount; i++) {
//            rs.absolute(i);
//            String firstName = rs.getString("first_name");
//            String lastName = rs.getString("last_name");
//
//            //System.out.println(firstName + " -- " + lastName + " -- "+ rs.getRow());
//            System.out.printf("%-15s %-15s %-4d\n", firstName, lastName, rs.getRow());
//        }


//        for (int i = rowCount; i > 0; i--) { // sondan başa doğru
//            String firstName = rs.getString("first_name");
//            String lastName = rs.getString("last_name");
//
//            //System.out.println(firstName + " -- " + lastName + " -- "+ rs.getRow());
//            System.out.printf("%-15s %-15s %-4d\n", firstName, lastName, rs.getRow());
//
//            rs.next();
//        }
 */


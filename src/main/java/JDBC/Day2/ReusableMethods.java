package JDBC.Day2;

import JDBC.Utilities.JDBC_Parent;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//verilen bir sorguya ait bütün bilgileri bir liste atarak geri döndüren metodu yazınız.
public class ReusableMethods extends JDBC_Parent {

    public static void main(String[] args) throws SQLException {

        getAllColumn("jdbc:mysql:// test.medis.mersys.io:33306/sakila",
                "technostudy","zhTPis0l9#$&","select * from language");

    }

    public static void getAllColumn(String URL,String username,String password,String query)  {

        List<List<String>> satirlar = new ArrayList<>();

        try{
            Connection connection = DriverManager.getConnection(URL, username, password);

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(query);

            ResultSetMetaData rsmd = rs.getMetaData();

            int columnCount = rsmd.getColumnCount();

            List<String> columnList = new ArrayList<>();


            while (rs.next()) {
                for (int i = 1; i < columnCount; i++) {

                    columnList.add(rs.getString(i));

                }
                satirlar.add(columnList);
            }
        }
        catch(SQLException throwables) {
        throwables.printStackTrace();

        }

            System.out.println(satirlar);

        }


    }







/*
    public static List<List<String>> getAllColumn(String query) throws SQLException {

        List<List<String>> satirlar=new ArrayList<>();

        ResultSet rs= statement.executeQuery(query);

        ResultSetMetaData rsmd= rs.getMetaData();

        int columnCount=rsmd.getColumnCount();

        List<String> rowList=new ArrayList<>();

        rs.last();
        int satirSayisi=rs.getRow();
        rs.first();

        while (rs.next()){
            for (int i = 0; i <satirSayisi ; i++) {


            for (int j = 1; j <=columnCount ; j++) {
             rowList.add(rs.getString(j));

            }
                rs.next();
            }
            satirlar.add(rowList);

        }


return satirlar;

    }
 */
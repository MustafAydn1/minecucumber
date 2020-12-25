package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class RandomName_Password {
    public static void main(String[] args) throws IOException {

        String RndmNames="src\\main\\resources\\RndmNames.xlsx";

        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("NameAndPasswords");

        Row row1=sheet.createRow(0);
        Cell cell1=row1.createCell(0);
        cell1.setCellValue("USERNAME");
        cell1.getRow().createCell(1).setCellValue("PASSWORD"); // Aynı satırda ikinci cell için.
        sheet.getRow(0).createCell(2).setCellValue("E-MAİL");// farkı anla.sheetten veya cell den alırsan



        int rowCount=1;
        for (int i = 0; i <100 ; i++) {

         Row row= sheet.createRow(rowCount++);
            int cellCount=0;

            for (int j = 0; j <3 ; j++) {

         Cell cell;

        Random s1=new Random();
        Random s2=new Random();
        Random s3=new Random();
        Random s4=new Random();
        Random s5=new Random();
        Random s6=new Random();
        Random s7=new Random();
        Random s8=new Random();


           int bir = s1.nextInt(91 - 65) + 65;
           char A = (char) bir;
           String sA = String.valueOf(A);

           int uc = s2.nextInt(123 - 97) + 97;
           char a = (char) uc;
           String sa = String.valueOf(a);


           int alti = s6.nextInt(123 - 97) + 97;
           char b = (char) alti;
           String sb = String.valueOf(b);

           int yedi = s7.nextInt(123 - 97) + 97;
           char c = (char) yedi;
           String sc = String.valueOf(c);

           int sekiz = s8.nextInt(123 - 97) + 97;
           char d = (char) sekiz;
           String sd = String.valueOf(d);


           int r1 = s4.nextInt(1000 - 100) + 100; // 100 dahil, ama 1000 dahil degıl.
           String sr1 = String.valueOf(r1);



           int r2 = s5.nextInt(1000 - 100) + 100;
           String sr2 = String.valueOf(r2);


           int bes = s3.nextInt(47 - 33) + 33;
           char C = (char) bes;
           String sC = String.valueOf(C);

           if(j==0){
               String text = sA + sa + sb + sc + sd ;

               row.createCell(cellCount++).setCellValue(text);
           }


               if(j==1) {
                   String text1 = sA + sa + sb + sc + sd + sr2 + sC + sr1;

                   row.createCell(cellCount++).setCellValue(text1);
               }


                if(j==2){
                    String text = sA + sa + sb + sc + sd ;

                    row.createCell(cellCount++).setCellValue(text+"@gmail.com");
                }



            }


        }

        FileOutputStream fileOutputStream=new FileOutputStream(RndmNames);
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();


    }
}

/*
    Random s1=new Random();
        Random s2=new Random();
        Random s3=new Random();
        Random s4=new Random();
        Random s5=new Random();


        int bir=s1.nextInt(91-65)+65;
       char A=(char)bir;
        System.out.println(A);

        int iki=s4.nextInt(1000-100)+100; // 100 dahil ama 1000 dahl degıl.
        System.out.println(iki);

        int uc=s2.nextInt(123-97)+97;
        char a=(char)uc;
        System.out.println(a);

        int dort=s5.nextInt(1000-100)+100;
        System.out.println(dort);

        int bes=s3.nextInt(47-33)+33;
        char C=(char)bes;
        System.out.println(C);

 */
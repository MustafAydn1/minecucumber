package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class _08_NewExcellWrite {
    public static void main(String[] args) throws IOException {


        String path="src\\main\\resources\\NewExcel5.xlsx"; //Exceli, Nereye,ne adıyla oluşturacagımı yazdım.

        //Yeni worbook oluştur -->>Sheet oluştur --->> row oluştur --->> cell oluştur  sırayla oluştur.

        XSSFWorkbook workbook = new XSSFWorkbook(); //sıfırdan Excel oluşturma classı... BU SEFER new WorkBOOK DA KULLANILDI.

        XSSFSheet sheet=workbook.createSheet("Amel Sayfası"); //workbook hafızasında Sheet oluştur.

        Row row =sheet.createRow(0); // satır oluştur.
        Cell cell=row.createCell(4);     // hucre oluştur.

        cell.setCellValue("Merhaba Ahiret; Ben bugün için yaratıldım!");// hucreye hafızada yazıyı yaz


      //  XSSFWorkbook workbook1=new XSSFWorkbook(path); Buna gerek tabikide yok.Zaten var.
        XSSFSheet sheet1=workbook.createSheet("Hesap Sayfası");
        Row row1=sheet1.createRow(2);
        Cell cell1=row1.createCell(4);
        cell1.getRow().createCell(8).setCellValue("Bismillah");
        cell1.setCellValue("Hoşgeldin;Ikra' kitabek...");



        //Dosyayı olusturduk
        FileOutputStream outputStream=new FileOutputStream(path);//tum sayfalar için bi tane OutputStream yeterli
        workbook.write(outputStream); //içine hafızadaki bilgileri yazdık.
        workbook.close(); // hafızayı boşalttık
        outputStream.close(); // dosyayı kapattık.


//Birden cok Sheet oluştur/ farklı yazıyı aynı yere yazdır. bunları dene.
//





    }
}
/* İKİ TANE Sheet acmak için:

XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Calisma Sayfasi");

        Row row=sheet.createRow(0);
        Cell cell=row.createCell(0);
        cell.setCellValue("Merhaba Hocam");
        XSSFSheet sheet2=workbook.createSheet("Calisma Sayfasi2");
        Row row2=sheet2.createRow(0);
        Cell cell2=row2.createCell(0);
        cell2.setCellValue("Merhaba Hocam2");

        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
 */
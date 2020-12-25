package ApachePOI;

import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_WriteInTheExcell {
    public static void main(String[] args) throws IOException {

        //dosya okuma işlemleri
        String path="src\\main\\resources\\BosExcell.xlsx";
        FileInputStream inputStream= new FileInputStream(path); //Bu Excell den intelij e gelme yoludur.
        Workbook workbook=WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheet("Sheet1");

        //Hafıza da yazma işlemleri belirlendi.Ama yazmadık.ilmi vucudu var.Harici Vucudu yok.
        Row row=sheet.createRow(0); // Satır oluşturdum.Ama içinde hiç hucre yok.

        Cell cell=row.createCell(3); //Satırın içine bir hucre oluşturdum.

        cell.setCellValue("Merhaba Ahiret...!");


// buraya ne yazsan konum aynı ise öncekinin ustune yazar gecer.
//AMA EXCELL AÇIKSA BU İŞLEMLERİ YAPMAZ. KAPALI OLMALI.

        inputStream.close();
// okuma işlemi kapatıldı. kapatmasanda çalışırdı ama dogru olan kapatmak.Aynı anda yazıp okuyamıyor.

        //Excel e yazma sadece bu aşama da olmaktadır.usttekiler intelijde olup-biter.
        FileOutputStream outputSteram= new FileOutputStream(path); // Bu Intelij den Excell e gitme yoludur.
        workbook.write(outputSteram); // yazma yeri
        outputSteram.close();
















    }
}


/*
   String path="src\\main\\resources\\NewExcel.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);
        Workbook workbook=WorkbookFactory.create(fileInputStream);

        Sheet sheet=workbook.getSheet("deneme");

        Row row=sheet.createRow(0);
        Cell cell=row.createCell(0);

        cell.setCellValue("Kul Ol");


        fileInputStream.close();

        FileOutputStream fileOutStream= new FileOutputStream(path);
        workbook.write(fileOutStream);
        workbook.close();
        fileInputStream.close();


 */
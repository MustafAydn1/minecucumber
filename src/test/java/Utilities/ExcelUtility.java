package Utilities;

import cucumber.api.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ExcelUtility {

    public static List<List<String>> getListData(String path, String sheetName, int columnCount)
    {
        List<List<String>> donecekList=new ArrayList<>();

        Workbook workbook=null;
        try {
            FileInputStream inputStream=new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }



        Sheet sheet=workbook.getSheet(sheetName);
        int rowCount=sheet.getPhysicalNumberOfRows();

        for(int i=0;i<rowCount;i++)
        {
            List<String> rowList=new ArrayList<>();
            Row row=sheet.getRow(i);

            int cellCount= row.getPhysicalNumberOfCells();
            if (columnCount > cellCount) columnCount=cellCount; //  cok mantıklı

            for(int j=0;j<columnCount;j++)
            {
                rowList.add(row.getCell(j).toString());
            }

            donecekList.add(rowList);
        }

        return donecekList;
    }

// BU KISMI HAFTASONU DUZENLE.KENDİNCE YAP.

// BU METOD TESTLERİN SONUÇLARINI EXCELLDE RAPORLAMAYA YARIYOR.
//HEMDE HER YAPTIGINDA ALT ALTA DİZİYOR.SANKİ EN KALICI RAPORLAMA ŞEKLİ.
//RESİMLER-EXTENT TAŞINABİLİR.SİLİNEBİLİR.AMA BU SABİT DURUYOR.KAPLADIGI ALANDA AZ.
//BUNA DAHA İSTEDİGİN KADAR EK BİLGİDE YAZABİLİRSİN.

    // ExcelUtility.exceleYaz(scenario, strDate, Driver.threadBrowserName.get());
    public static void exceleYaz(Scenario scenario, String time, String browser)
    {
        String path="src/main/resources/ScenarioResults.xlsx";
        String sheetName="Sonuclar";

        File f = new File(path);
        //  f.exists()  // dosya var sa

        if (!f.exists()) { // dosya yok ise oluştur
            XSSFWorkbook workbook = new XSSFWorkbook(); // hazfızada workbook oluştur.
            XSSFSheet sheet = workbook.createSheet(sheetName); // hazıfazda sheet oluştur.

            Row row=sheet.createRow(0); // satır oluştur

            Cell cell=row.createCell(0); // hucre oluştur
            cell.setCellValue(scenario.getId());

            cell=row.createCell(1); // hucre oluştur
            cell.setCellValue(scenario.getStatus());

            cell=row.createCell(2); // hucre oluştur
            cell.setCellValue(time);

            cell=row.createCell(3); // hucre oluştur
            cell.setCellValue(browser);

            // dosyayı oluşturduk.
            FileOutputStream outputStream= null;
            try {
                outputStream = new FileOutputStream(path);
                workbook.write(outputStream); // içine hafızadaki bilgileri yazdık.
                workbook.close(); // hafızayı boşalttık
                outputStream.close(); // dosyayı kapattık.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else
        {
            FileInputStream inputStream=null;
            Workbook workbook=null;
            Sheet sheet=null;
            try {
                inputStream=new FileInputStream(path);
                workbook=WorkbookFactory.create(inputStream);
                sheet=workbook.getSheet(sheetName);
            } catch (IOException e) {
                e.printStackTrace();
            }

            int numberOfRows = sheet.getPhysicalNumberOfRows();
            Row row=sheet.createRow(numberOfRows); // satır oluştur

            Cell cell=row.createCell(0); // hucre oluştur
            cell.setCellValue(scenario.getId());

            cell=row.createCell(1); // hucre oluştur
            cell.setCellValue(scenario.getStatus());

            cell=row.createCell(2); // hucre oluştur
            cell.setCellValue(time);

            cell=row.createCell(3); // hucre oluştur
            cell.setCellValue(browser);

            // dosyayı oluşturduk.
            FileOutputStream outputStream= null;
            try {
                inputStream.close();
                outputStream = new FileOutputStream(path);
                workbook.write(outputStream); // içine hafızadaki bilgileri yazdık.
                workbook.close(); // hafızayı boşalttık
                outputStream.close(); // dosyayı kapattık.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }





    }









    public static void main(String[] args) {
        List<List<String>> gelenList= getListData("src/main/resources/ApacheExcel1.xlsx","testCitizen",2);
        System.out.println(gelenList);

        gelenList= getListData("src/main/resources/ApacheExcel1.xlsx","testCitizen",4);
        System.out.println(gelenList);

        gelenList= getListData("src/main/resources/ApacheExcel1.xlsx","testCitizen",10);
        System.out.println("colNo10: "+gelenList);
    }
}




/*
    public static void exceleYaz(Scenario scenario,String time,String browser)
    {
        String  path="src\\main\\resources\\TestSonuclariExcelde.xlsx";

        File file=new File(path);

        FileOutputStream outputStream= null;
        FileInputStream inputStream=null;
        Workbook workbook=null;
        Sheet sheet=null;



        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("testSonucları");

        int NumberOfRows=sheet.getPhysicalNumberOfRows();




       int cC=0;

            Row row=sheet.createRow(NumberOfRows++);
            Cell cell=row.createCell(cC++);
            cell.setCellValue(scenario.getId());// Senaryonun adı
            cell.getRow().createCell(cC++).setCellValue(scenario.getStatus());// Senaryonun sonucu
            cell.getRow().createCell(cC++).setCellValue(time);
            cell.getRow().createCell(cC++).setCellValue(browser);

        try {
        FileOutputStream fileOutputStream=new FileOutputStream(path);
            workbook.write(fileOutputStream);
            workbook.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }










    }



 */
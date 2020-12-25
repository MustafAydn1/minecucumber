package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _09_Task1 {

    public static void main(String[] args) throws IOException {

        String path="src\\main\\resources\\NewExcel26.xlsx";
//Neden XSSFWorkbook a path yazmadan bu işlemleri doğru yapabılıyor.
//Çunku  FileOutputStream e kadar olan kısım bir hafıza olarak kaydediyor.path en altta lazım oluyor.



        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet=workbook.createSheet("Çarpım Tablosu");

        int rowCount=1;

        for (int i = 1; i <11; i++) {
            Row row = sheet.createRow(rowCount++);
            int cC=0;
            for (int j = 1; j < 11; j++) {
               // Row row = sheet.createRow(rowCount++)// her işlem(döngü) için bir satır inşaa etmesi için.

                Cell cell;
                row.createCell(cC++).setCellValue(j);
                row.createCell(cC++).setCellValue("*");
                row.createCell(cC++).setCellValue(i);
                row.createCell(cC++).setCellValue(" =");
                row.createCell(cC++).setCellValue(i * j);

                cC=cC+1;

                }


            }

        //Dosyayı olusturduk
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream); //içine hafızadaki bilgileri yazdık.
        workbook.close(); // hafızayı boşalttık
        outputStream.close();





    }
}

/* getRow u ögren....

public static void main(String[] args) throws IOException {

        String path="src/main/resources/CarpimTablosu.xlsx";

        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Carpim");


        int rowCount=0;
        for(int i=1;i<=1;i++){
            for(int j=1;j<=10;j++){

                Row row=sheet.createRow(rowCount++); // her işlem için bir satır açar mı?

                Cell cell=row.createCell(0); cell.setCellValue(i);
                cell=row.createCell(1); cell.setCellValue("x");
                cell=row.createCell(2); cell.setCellValue(j);
                cell=row.createCell(3); cell.setCellValue(" =");
                cell=row.createCell(4); cell.setCellValue((i*j));
            }
        }

        int col = 6;
        Cell cell=null;
        Row row = null;
        for(int i=2;i<=10;i++){
            int rowCount2=0;
            for(int j=1;j<=10;j++){

                row=sheet.getRow(rowCount2++); // her işlem için bir satır açar mı?

                cell=row.createCell(0 + col); cell.setCellValue(i);
                cell=row.createCell(1 + col); cell.setCellValue("x");
                cell=row.createCell(2 + col); cell.setCellValue(j);
                cell=row.createCell(3 + col); cell.setCellValue(" =");
                cell=row.createCell(4 + col); cell.setCellValue((i*j));
            }
            col+=6;
        }

        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

    }
}
 */

/*
 System.out.println("**********************************");
        for(int i=1;i<=10;i++) {
            for(int j=1; j<=10;j++) {
                System.out.println(i+ " X "+j+" = "+i*j);
            }
            System.out.println("*************************************");
        }
 */
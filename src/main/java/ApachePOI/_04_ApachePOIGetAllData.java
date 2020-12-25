package ApachePOI;

import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _04_ApachePOIGetAllData {

    public static void main(String[] args) throws IOException {

        String path="src\\main\\resources\\ApacheExcel1.xlsx";

        //dosyayı yani Excell i okumaya actım.
        FileInputStream inputStream=new FileInputStream(path);// bu code excell ile intelij bağını kurdu.

        //Bunun uzerine Work Book u alıyorum.
        Workbook workbook= WorkbookFactory.create(inputStream);//hafızadaki kitabı alıp işleme açıyor.Hatayı yukarı aldım.

        //İstediğim isimdeki çalışma sayfasını(Sheet) alıyorum.Burada ismi ile yada indexi ile alıyorum.
        Sheet sheet=workbook.getSheet("Sheet1");

        // Workbook daki toplam Satır sayısını veriyor.Sadece sayıyı verir.for u kurmak içindir.
        int rowCount= sheet.getPhysicalNumberOfRows(); //fiziki olarak içinde yazı olan satıra kadar olan sayı

        System.out.println("Satır sayısı: "+rowCount);

        for (int i = 0; i <rowCount ; i++) { // satır sayısı kadar dönecek

         //   int cellCount=sheet.getRow(i).getPhysicalNumberOfCells(); // cell için, 1. yöntem

            Row row= sheet.getRow(i); // i. satır alındı.

           int cellCount=row.getPhysicalNumberOfCells(); // bu satırdaki toplam hucre sayısı alındı.

            for (int j = 0; j <cellCount ; j++) //i. satırdaki hucre sayısı kadar dönecek
            {
                Cell cell=row.getCell(j);     //bu satırdaki sıradaki hucreyi aldım.
               // System.out.print(cell+ " ");

              //  System.out.printf("%10s",cell); // saga dayalı 10 haneli String yazdırdı.
              //  System.out.printf("%15s",cell); // saga dayalı 15 haneli String yazdırdı.BÖYLECE satırlar ayrıştılar.
                System.out.printf("%-15s",cell);  // Sola dayalı 15 haneli String yazdırdı
// prıntlerin hepsını ayrı ayrı aç farklarını farket.Ögren
            }

            System.out.println();

        }





    }
}
// printf konusun açalış. tum  detaylarını ögren. bunu tablo halinde printf ile yazdır.
package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class _05_getASpecificData {
    public static void main(String[] args) throws IOException {

        System.out.print("Aranacak Kelime= ");
        Scanner oku = new Scanner(System.in);
        String arananKelime = oku.nextLine();

        String donenKelime= bul(arananKelime);
        System.out.println(donenKelime);


    }

   public static String bul(String aranacakKelime) {

    String donecekKelime="";

        String path = "src\\main\\resources\\LoginData.xlsx";

        Workbook workBook=null;// burada tanımlamazsam try-cath in içinde kalacaktı.devam edemezdi

        try {
            FileInputStream fileInputStream = new FileInputStream(path); // bunun altında artık new yok .
//WorkBook--> Sheet --> Row --> Cell birbirinden uretilerek inilecek.

             workBook = WorkbookFactory.create(fileInputStream);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }



       Sheet sheet = workBook.getSheet("Login");

        int rowCount = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowCount; i++) {

           // Row row = sheet.getRow(i);

            if(sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(aranacakKelime))//typeCasting için toString kullan
            {

            int cellcount = sheet.getRow(i).getPhysicalNumberOfCells();

            for (int j = 0; j < cellcount; j++) {
                donecekKelime+=sheet.getRow(i).getCell(j).toString()+" ";
                //Satırın tamamını yazdırır.+= sız en sonuncuyu yazdırır.
            }
            break;

            }
        }

            return donecekKelime;
    }
}
//Aranan kelmeyı tekrar vermeyecek bır kod yaz. ODEVİN
// donecekKelime+=sheet.getRow(i).getCell(j).toString()+" ";  buradaki griligi gider ve farklı çözumu gör.

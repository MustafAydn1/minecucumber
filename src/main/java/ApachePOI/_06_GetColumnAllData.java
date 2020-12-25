package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _06_GetColumnAllData {


    public static void main(String[] args) {

        System.out.print("Aranacak ColNo= ");
        Scanner oku = new Scanner(System.in);
        int colNo = oku.nextInt();

        List<String> donenList=getColumn(colNo);
        System.out.println(donenList);




    }

   public static List<String> getColumn(int columnNo) {

        ArrayList<String > listCol=new ArrayList<>();


        String path = "src\\main\\resources\\LoginData.xlsx";

        Workbook workBook = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            workBook = WorkbookFactory.create(fileInputStream);
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        Sheet sheet = workBook.getSheet("Login");

        int rowCount=sheet.getPhysicalNumberOfRows();

        for (int i = 0; i <rowCount ; i++) {

            Row row=sheet.getRow(i);
            int cellCount=row.getPhysicalNumberOfCells(); // 1 den başalayarak sayar.
//DİKKAT::cellCount Sadece  fiziksel olarak dolu olanları var sayar.
//ColumnNo için dolu boş önemı yoktur.Konum bildirir.

            System.out.println(cellCount); // daha net görmek için if in içine koy.

            if(cellCount>columnNo) {//hucrenın içi fiziki olarak dolu ise yazdır demiş olduk.
//cellCount 1 den başlar. columnNo 0 dan başlar. bu bilgi net Artık.
// Eşitlik durumunda neden olmaz.Çünkü bir önceki sutuna göre hareket ediyor.dolu sanıyor.hata veriyor.
//kücük dersem de::ColumnNo-> 1 ve 2 de boş list. 3 de hata verir.

                Cell cell = row.getCell(columnNo);// bunun indexi 0 dan başlar.
                listCol.add(cell.toString());

            }

           // System.out.println(cell.toString());// bu boşluklarda hata verir.







            //int cellCount=sheet.getRow(i).getPhysicalNumberOfCells();

           // for (int j = 0; j <cellCount ; j++) {
            // column.add(sheet.getRow(i).getCell(columnNo).toString());


        }

      return listCol;

    }

}
/*

yolcu otobusunde muavin dolu koltuklara servis yapar,
boş koltuklara servis yapmaz ... gibi dusunulebilir.
// arada boşluk bırakarak sonraki cell leri yazdırmayı ogren.

 */
package ApachePOI;

import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {

        String path="src\\main\\resources\\ApacheExcel1.xlsx"; // hangi Excell i okuyacagım.

        //dosyayı yani Excell i okumaya actım.
        FileInputStream dosyaOkumaYolu=new FileInputStream(path);// bu code excell ile intelij bağını kurdu.

        //Bunun uzerine Work Book u alıyorum.
        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaYolu);//hafızadaki kitabı alıp işleme açıyor.Hatayı yukarı aldım.

        //İstediğim isimdeki çalışma sayfasını(Sheet) alıyorum.Burada ismi ile yada indexi ile alıyorum.
        Sheet calismaSayfasi=calismaKitabi.getSheet("Sheet1");  // Name ile
      //  Sheet calismaSayfasiAyni=calismaKitabi.getSheetAt(0);  // index ile

        // İstenen satırı alıyorum.
        Row satir=calismaSayfasi.getRow(1);

        Row satir1=calismaSayfasi.getRow(2);


        //istenen satırdaki istenen hucre alınıyor.
        Cell hucre=satir.getCell(0);
        Cell hucre2=satir.getCell(1);
        Cell hucre3=satir.getCell(2);

        Cell hucre4=satir1.getCell(1);
        Cell hucre5=satir1.getCell(2);// bu kısım boş o yuzden null verdi.AMA...


        System.out.println(hucre);
        System.out.println(hucre2);
        System.out.println(hucre3);
        System.out.println(hucre4);
        System.out.println(hucre5);// cell degeri için null veriyor
        System.out.println(hucre5.toString()); // içindeki String ifadeyi isteyince NullPointerException veriyor.





    }
}



//File yazdıgında verilen uyarıda genelde try-catch yapılır.Ama burada biz kod kalabalığı olmasın diye
//throws ile yukarıya Exception koydurduk.
//resources:: kaynaklar

/*
import org.apache.poi.ss.usermodel.*  ile adım adım bir suru gelecek import tek e dusuruldu.

Bu sayfadaki importlar apachePOI den yapılacak.

e2e:: endtoend :: baştan sona demek
 */
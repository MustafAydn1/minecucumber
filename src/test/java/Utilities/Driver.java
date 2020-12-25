package Utilities;

import gherkin.lexer.Th;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * Interview Sorusu
 * Singleton-singıltın- driver nedir?
 * Bütün projede aynı ve tek bir driverın kullanılmasıdır.
 */

// Siz Bütün dersler için sınav kağıtları hazırlayan bir yöneticisiniz.
// 1.Öğrenci geldi, sizden fizik dersi yazılı sorularını istedi. verdiniz.
// 2.Öğrenci geldi, sizden kimya dersi yazılı sorularını istedi. verdiniz.
// 3.Öğrenci geldi sizden yine Fizik yazılı soruları istedi, siz yeni soru hazırlamazsınız.
//    aynı fizik sorularından vermelisiniz.
// 4.Öğrenci geldi sizden kimya yazlı soruları istedi.Yeni soru hazılamazsını yine daha önce
//    hazırladığınız Kimya sorularını verirsiniz.
// Böylece ilk talep için daha önce yok ise yeni oluşturusunuz, ancak aynı talep tekrar gelirse
// daha önce oluşturulmuşu vermeniz gerekir.
// burda öğrencileri CLASS a yani Senaryolara benzetebiliriz. Sınav kağıtları ise DRİVER dır.

// Her farklı browser için farklı bir static değişken havuzu oluşturduk.
public class Driver {


  //  private static WebDriver driverChrome;
  //  private static WebDriver driverFireFox;

    //   public  static String browserType="Chrome";
    //   public  static String browserType1="Firefox";

//yukarıdaki her ikisinide birlikte yapmak için Local bir list hazırladık.
//ThreadLocal ile driver var mı yok mu?kendisi içinde karar veriyor.
//Normal list olsaydı,var-yok u biz kontrol edecektik.Gerek kalmadı.
//driver ı ve driver ismini get() ile cagıracagız.Cunku list oldular.


      private static ThreadLocal<WebDriver> threadDriver= new ThreadLocal<>();

      public static ThreadLocal<String> threadBrowserName=new ThreadLocal<>();


    public static WebDriver getDriver()
    {
// BU if ile,hiçbir driver istenmediği durumda otomatik chrome atanmış oldu.
// bu kısım paralel calışma olmadıgında aktıfleşir.
        if (threadBrowserName.get() == null)
        {
            threadBrowserName.set("chrome");
        }


        if(threadDriver.get()==null)

            switch (threadBrowserName.get())
            {

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    threadDriver.set(new FirefoxDriver());
                break;


                default:
                    WebDriverManager.chromedriver().setup();
                    threadDriver.set(new ChromeDriver());
                    break;

            }
//default ile::firefox dışında tanımlamadıktan sonra ne gelirse gelsin,chrome calışacak.





            // System.SetProperty'nin karşılığı olarak projeyi chromedriver'la
            // çalışacak şekilde buraya set etmiş olduk
 //           WebDriverManager.chromedriver().setup(); // System.SetProperty nin karşılığı
 //           driver=new ChromeDriver();

            // firefox için de aşağıdaki şekilde
      //   WebDriverManager.firefoxdriver().setup();
      //     driver=new FirefoxDriver();

        return threadDriver.get();
    }


    public static void quitDriver()
    {
        if (threadDriver.get() != null)
        {
            threadDriver.get().quit(); // ilgili driverdan quit edildi.
            WebDriver driver=threadDriver.get(); // threadLocal deki ilgili driverının referansı alındı.
            driver=null;  // ilgili driver a null değeri atanarak boşaltıldı.
            threadDriver.set(driver); //ilgili driver set edilerek ThreadLocal in içindeki saklanan null hale getirildi.

        }
    }
}
//direk driver=null dense idi,paralel calışanın ikiside null e cıkardı.
//paralel calışmada firefox kapansın. chrome devam etsi dersem bunu nasıl yaparım.
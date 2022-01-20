package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {

    //1. Bir class oluşturun : AmazonSearchTest
    //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    //    a.google web sayfasına gidin. https://www. amazon.com/
    //    b. Search(ara) “city bike”
    //    c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
    //    d. “Shopping” e tıklayın.
    //    e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //    a.google web sayfasına gidin. https://www. amazon.com/
        driver.get("https://www.amazon.com");
        //    b. Search(ara) “city bike”
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);
        // aramaKutusu.submit() istersek bu sekilde yapabiliriz

        //    c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement sonucYazisiElementi=driver.findElement(By.className("sg-col-inner"));
        System.out.println(sonucYazisiElementi.getText());

        /*    e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        WebElement ilkUrunResmi= driver.findElement(By.className("s-image"));
        ilkUrunResmi.click();

         */

        // sadece click yapmak gibi basit bir islem yapacagimiz web elementler icin
        // variable olusturmadan direkt locate edip istedigimiz islemi yapabiliriz
        driver.findElement(By.className("s-image")).click();

        driver.close();

    }
}

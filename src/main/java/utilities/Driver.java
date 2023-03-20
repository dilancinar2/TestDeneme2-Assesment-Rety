package utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver driver;



   public static WebDriver getDriver(){
        if (driver==null){//çalışan driver yoksa
            System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Selenium\\ChromeDriver\\chromedriver.exe");

            driver = new ChromeDriver();
        }

       return driver;//driver dondur
    }

   public static void closeDriver() {

       if (driver != null) {//hala driver çalışıyorsa
           driver.quit();//driverı kapat
           driver = null;//driverı sıfıra eşitleki tekrar run işleminde sistem get drivera gelip driverı sıfır görsün ve devam etsin

       }
   }
}

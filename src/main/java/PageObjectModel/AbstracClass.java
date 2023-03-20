package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;
public abstract class AbstracClass  {

//tıklama,bekleme,data gönderme, random eleman gönderme,seçtirme  default kod yığınlarının yazıldığı yer
//seçtirme, dropdown işlemleri, verify etme işlemleri bu class içerisine yazılır.
//birşeyi clik yapacaksak abstract class ı extend edip bütün işlemleri yapabiliyoruz.

    private WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,5);

    public void clickFunction(WebElement clickElement){ //tıklayacağımız element

        wait.until(ExpectedConditions.elementToBeClickable(clickElement));//element tıklanabilecek duruma gelene
        //kadar beklesin

        clickElement.click(); //tıklasın
    }

    public void sendKeysFunction(WebElement sendKeysElement,String value){//nereye göndereceğiz, ne göndereceğiz

        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));//element görünene kadar beklesin

       sendKeysElement.sendKeys(value);//sendkeys elementine değeri gönderiyoruz


    }

    public void selectElementFromDropdown(WebElement dropdown,String element){//drobdownın kendisi, text ile sececeğimiz element


        Select slc = new Select(dropdown);//hangi dropdownı kullanacaksak

        slc.selectByVisibleText(element);//Dropdownın içinde seçeçeğimiz değer

    }

    //public void Assertion(WebElement gercekdeg, String beklenendeg){//sistemin verdiği ve benim beklediğim 2 değer lazım
     //   wait.until(ExpectedConditions.visibilityOf(gercekdeg));//sistemin verdiği değer dönene kadar bekle
      //  Assert.assertEquals(gercekdeg,beklenendeg);//sistemin verdiği değer texte çevir beklenendeger ile karşılaştır
        //System.out.println("My Message :  " + gercekdeg.getText());

   // }
    public void Assertion(WebElement actual,WebElement expected){
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual,expected);
        System.out.println("Verify İşlemi Başarılı: " + actual);

    }

public void Assertionint(WebElement actual, String expected){

    wait.until(ExpectedConditions.visibilityOf(actual));
    Assert.assertEquals(actual.getText(),expected);
    System.out.println("Verify İşlemi Başarılı: " + actual);


}

}

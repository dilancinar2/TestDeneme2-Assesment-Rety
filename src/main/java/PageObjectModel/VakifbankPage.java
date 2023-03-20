package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;




public class VakifbankPage extends AbstracClass{

 WebDriver driver;
    public VakifbankPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);//  FindBy - FindAll tagların anahtar kelimesi budur
        //bunu yazmdaığımzda çalışmıyor

    }
    @FindBy(xpath = "//*[@id='ctl00_ctl06_ctl00_rptMenu_ctl00_hypLink']/span['Bireysel']")
    private WebElement BireyselButton;

    public void clickBireyselButton(){

        clickFunction(BireyselButton);
    }

    @FindBy(xpath = "//*[@id='ctl00_ctl06_ctl00_rptMenu_ctl03_hypLink']/span['Bireysel Krediler']")
    private WebElement BireyselKredilerButton;

    public void clickBireyselKredilerButton(){
        clickFunction(BireyselKredilerButton);
    }
    @FindBy(css = "a[href='/hesaplama-araclari.aspx?pageID=784']")
    private WebElement HesaplamaAraclarılink;

    public void assertHesaplamaAraclarılink(){

        Assertion(HesaplamaAraclarılink,HesaplamaAraclarılink);//ikisinide aynı değişkenden atamayı daha uygun buldum
        //Birini text olarak tanımlayıp AbstracClass da tür dönüşümü yapmaktansa bu yol daha kısa göründü.


    }


    @FindBy(css = "a[href='/hesaplama-araclari.aspx?pageID=784']")
    private WebElement HesaplamaAracları;
    public void clikHesaplamaAracları(){
        driver.findElement(By.xpath("//*[@href='/hesaplama-araclari.aspx?pageID=784']")).click();
    }


    @FindBy(xpath = "//*[@class='col-sm-12 col-xs-12 hesap-box']/div/h2[text()='Kredi Hesaplama Aracı']")
    private WebElement KrediHesaplamaAracıAlanı;
    public void assertKrediHesaplamaAracıAlanı(){

        Assertion(KrediHesaplamaAracıAlanı,KrediHesaplamaAracıAlanı); //ikisinide aynı değişkenden atamayı daha uygun buldum
        //Birini text olarak tanımlayıp AbstracClass da tür dönüşümü yapmaktansa bu yol daha kısa göründü.


    }
    @FindBy(xpath = "//*[@href='/kredi-hesaplama-araci.aspx?pageID=1333' and text()='Hesapla']")
    private WebElement KrediHesaplaButton;

    public void clickKrediHesaplaButton(){
        clickFunction(KrediHesaplaButton);
    }

    @FindBy(xpath = "//*[@name='ctl00$ctl10$ctl00$ddlKredi']")
    private WebElement KrediDropdown;

    @FindBy(xpath = "//*[@class='select2-selection__rendered' and @title='TAKSİTLİ EK HESAP']")
    private WebElement TaksitliEkHesap;

    public void selectKrediDropdown(){selectElementFromDropdown(KrediDropdown,"TAKSİTLİ EK HESAP");}


    public void Kaydirma  () {


        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement b = driver.findElement(By.xpath("(//*[@class='ui-slider-range ui-corner-all ui-widget-header ui-slider-range-min'])[1]"));
        js.executeScript("arguments[0].setAttribute('style', 'width: 100%;')", b);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        WebElement a = driver.findElement(By.xpath("(//*[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
        js2.executeScript("arguments[0].setAttribute('style', 'left: 100%;')", a);


    }
    public void Kaydirma2(){

        WebElement slider = driver.findElement(By.xpath("(//*[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(slider).dragAndDropBy(slider, 100, 0).build().perform();

    }

    @FindBy(xpath = "//*[@class='min minKrediTutar' and text()='200']")
    private WebElement VadeTutar;

    public void AssertionVadeTutarı(){


        Assertionint(VadeTutar,"200");

    }

    @FindBy(xpath = "//*[@id='ctl00_ctl10_ctl00_btnHesapla']")
    private WebElement HesaplaButton;

    public void clickHesaplaButton(){
        clickFunction(HesaplaButton);
    }


   @FindBy(xpath = "(//*[@class='borderRight'])[5]")
   private WebElement ToplamödenecekTutar;

    public void AssertionToplamödenecekTutar(){


        Assertionint(ToplamödenecekTutar,"211,61 TL");

    }


}

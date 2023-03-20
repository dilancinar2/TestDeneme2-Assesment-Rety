package StepDefinition;


import PageObjectModel.VakifbankPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utilities.Driver;

import java.util.concurrent.TimeUnit;


public class screen_steps {

    private  WebDriver driver;
    VakifbankPage VakifbankPage=new VakifbankPage();



    @BeforeSuite(groups = "screenstepsgroup")
    @Given("^Vakifbank Sitesine Git$")
    public void vakifbank_Sitesine_Git() throws Throwable {

    driver= Driver.getDriver();
    driver.manage().window().maximize();
    driver.get("https://www.vakifbank.com.tr/");
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    driver.findElement(By.xpath("//*[@class='fixed-cookie-content-action']/a")).click();

    }
    @BeforeTest(groups = "screenstepsgroup")
    @Given("Bireysel Tabına tıklanır")
    public void bireysel_tabina_tiklanir() {
        VakifbankPage.clickBireyselButton();


    }

    @Test(groups = "screenstepsgroup")
    @When("Bireysel Krediler sekmesine tıklanır")
    public void bireysel_krediler_sekmesine_tiklanir() {
        VakifbankPage.clickBireyselKredilerButton();
    }


    @Test(groups = "screenstepsgroup")
    @Then("Hesaplama Araçları linkini verfiy et")
    public void hesaplamaAraclariLinkiniVerfiyEt() {
        VakifbankPage.assertHesaplamaAraclarılink();

    }

    @Test(groups ="screenstepsgroup")
    @When("Hesaplama Araçları linkine tıklanır")
    public void hesaplama_araclari_linkine_tiklanir() {
        VakifbankPage.clikHesaplamaAracları();
    }



    @Test(groups ="screenstepsgroup")
    @Then("Kredi Hesaplama Aracı Alanını verfiy et")
    public void kredi_hesaplama_araci_alanini_verfiy_et() {
        VakifbankPage.assertKrediHesaplamaAracıAlanı();
    }
    @Test(groups ="screenstepsgroup")
    @And("Kredi Hesaplama Butonuna tıklanır")
    public void kredi_hesaplama_butonuna_tiklanir() {
        VakifbankPage.clickKrediHesaplaButton();
    }

    @Test(groups ="screenstepsgroup")
    @And("TAKSİT EK HESAP değerine tıklanır")
    public void taksi̇tEkHESAPDegerineTiklanir() {
        VakifbankPage.selectKrediDropdown();

    }
    @Test(groups ="screenstepsgroup")
    @And("Vade değeri slide ile girilir")
    public void vade_degeri_slide_ile_girilir() {
        VakifbankPage.Kaydirma();
        VakifbankPage.Kaydirma2();
    }

    @Test(groups ="screenstepsgroup")
    @Then("Ödenecek Tutar verify islemi gerceklestirilir")
    public void xverifyislemiGerceklestirilir() {
        VakifbankPage.AssertionToplamödenecekTutar();
    }


    @Test(groups ="screenstepsgroup")
    @And("Hesapla Butonuna tıklanır")
    public void xtoplamDegerBulunur() {
        VakifbankPage.clickHesaplaButton();
    }

    @Test(groups ="screenstepsgroup")
    @And("Vade Tutar değerini Verify et")
    public void vadeTutarDegeriniVerifyEt() {
        VakifbankPage.AssertionVadeTutarı();
    }

    @Test(groups ="screenstepsgroup")
    @And("Tarayıcıyı kapat")
    public void xvztarayiciyiKapat() {
        driver.close();

    }

}
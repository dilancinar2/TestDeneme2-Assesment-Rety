
Feature: VakifbankTest Deneme

  Scenario: Ekrandaki bazı islemler

    Given Vakifbank Sitesine Git
    And  Bireysel Tabına tıklanır
    When Bireysel Krediler sekmesine tıklanır
    Then Hesaplama Araçları linkini verfiy et
    When Hesaplama Araçları linkine tıklanır
    Then Kredi Hesaplama Aracı Alanını verfiy et
    And Kredi Hesaplama Butonuna tıklanır
    And TAKSİT EK HESAP değerine tıklanır
    And Vade değeri slide ile girilir
    And Vade Tutar değerini Verify et
    Then Hesapla Butonuna tıklanır
    Then Ödenecek Tutar verify islemi gerceklestirilir
    And Tarayıcıyı kapat


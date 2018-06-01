package Tests;

import Pages.CityPage;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by tester on 14.08.2017.
 */
public class CityTest extends CityPage {
    private SoftAssert softAssert = new SoftAssert();

    private static final String BaseUrl = "https://mycredit.ua/ru/";


    /**
     * Блоки городов Общие
     */
    private static final String cityBlock1 = ".//*[@class='row city-slider'][1]";
    private static final String cityBlock2 = ".//*[@class='row city-slider'][2]";
    private static final String cityBlock3 = ".//*[@class='city-slider row']";
    private static final String cityBlock4 = ".//*[@class='city-slider']";


    /**
     * Киев
     */
    private static final String blockKievInfo = ".//*[@class='col-md-10']";
    private static final String zagalovokKiev = ".//*[@class='col-md-10']//*[text()='Кредит в Киеве']";
    private static final String howTakeCreditKiev = ".//*[@class='col-md-5']//*[text()='Как взять кредит в Киеве через Интернет?']";

    /**
     * Харьков
     */
    private static final String blockKharkovInfo = ".//*[@class='col-md-10']";
    private static final String zagalovokKharkov = ".//*[@class='col-md-10']//*[text()='Кредит в Харькове']";
    private static final String howTakeCreditKharkov = ".//*[@class='col-md-5']//*[text()='Как взять кредит в Харькове через интернет?']";

    /**
     * Днепр
     */
    private static final String blockDneprInfo = ".//*[@class='col-md-10']";
    private static final String zagalovokDnepr = ".//*[@class='col-md-10']//*[text()='Кредит в Днепропетровске']";
    private static final String howTakeCreditDnepr = ".//*[@class='issue text-center']//*[text()='Как взять кредит в Днепропетровске']";

    /**
     * Львов
     */
    private static final String blockLvovInfo = ".//*[@class='col-md-10']";
    private static final String zagalovokLvov = ".//*[@class='col-md-10']//*[text()='Кредит во Львове']";
    private static final String howTakeCreditLvov = ".//*[@class='issue text-center']//*[text()='Как взять кредит в Львове']";

    /**
     * Одесса
     */
    private static final String blockOdessaInfo = ".//*[@class='col-md-10']";
    private static final String zagalovokOdessa = ".//*[@class='col-md-10']//*[text()='Кредит в Одессе']";
    private static final String howTakeCreditOdessa = ".//*[@class='issue text-center']//*[text()='Как взять кредит в Одессе']";

    /**
     * Полтава
     */
    private static final String blockPoltavaInfo = ".//*[@class='col-md-10']";
    private static final String zagalovokPoltava = ".//*[@class='col-md-10']//*[text()='Кредит в Полтаве']";
    private static final String howTakeCreditPoltava = ".//*[@class='issue text-center']//*[text()='Как взять кредит в Полтаве']";

    /**
     * Кропивницкий
     */
    private static final String blockKropivnickijInfo = ".//*[@class='col-md-10']";
    private static final String zagalovokKropivnickij = ".//*[@class='col-md-10']//*[text()='Кредит в Кропивницком']";
    private static final String howTakeCreditKropivnickij = ".//*[@class='issue text-center']//*[text()='Как взять кредит в Кропивницком']";

    /**
     * Ивано-Франковск
     */
    private static final String blockIvanoFrankovsk = ".//*[@class='col-md-10']";
    private static final String zagalovokIvanoFrankovsk = ".//*[@class='col-md-10']//*[text()='Кредит в Ивано-Франковске']";
    private static final String howTakeCreditIvanoFrankovsk = ".//*[@class='issue text-center']//*[text()='Как взять кредит в Ивано-Франковске']";

    /**
     * Тернополь
     */
    private static final String blockTernopolInfo = ".//*[@class='col-md-10']";
    private static final String zagalovokTernopol = ".//*[@class='col-md-10']//*[text()='Кредит в Тернополе']";
    private static final String howTakeCreditTernopol = ".//*[@class='issue text-center']//*[text()='Как взять кредит в Тернополе']";

    /**
     * Ужгород
     */
    private static final String blockUshgorodInfo = ".//*[@class='col-md-10']";
    private static final String zagalovokUshgorod = ".//*[@class='col-md-10']//*[text()='Кредит в Ужгороде']";
    private static final String howTakeCreditUshgorod = ".//*[@class='issue text-center']//*[text()='Как взять кредит в Ужгороде']";

    /**
     * Херсон
     */
    private static final String blockKhersonInfo = ".//*[@class='col-md-10']";
    private static final String zagalovokKherson = ".//*[@class='col-md-10']//*[text()='Кредит в Херсоне']";
    private static final String howTakeCreditKherson = ".//*[@class='issue text-center']//*[text()='Как взять кредит в Херсоне']";

    /**
     * Хмельницком
     */
    private static final String blockKhmelnickomInfo = ".//*[@class='col-md-10']";
    private static final String zagalovokKhmelnickomI = ".//*[@class='col-md-10']//*[text()='Кредит в Хмельницком']";
    private static final String howTakeCreditKhmelnickomI = ".//*[@class='issue text-center']//*[text()='Как взять кредит в Хмельницком']";

    /**
     * Хмельницком
     */
    private static final String blockChernovciInfo = ".//*[@class='col-md-10']";
    private static final String zagalovokChernovci = ".//*[@class='col-md-10']//*[text()='Кредит в Черновцах']";
    private static final String howTakeCreditChernovci = ".//*[@class='issue text-center']//*[text()='Как взять кредит в Черновцах']";

    /**
     * Суммы
     */
    private static final String blockSummyInfo = ".//*[@class='col-md-10']";
    private static final String zagalovokSummy = ".//*[@class='col-md-10']//*[text()='Кредиты в Сумах']";
    private static final String howTakeCreditSummy = ".//*[@class='col-md-5']//*[text()='Как взять кредит в Сумах через интернет?']";

    /**
     * Конотоп
     */
    private static final String zagalovokKonotop = ".//*[@class='col-md-10']//*[text()='Кредиты в Конотопе']";
    private static final String blockKonotop5 = ".//*[@class='col-md-10']//*[text()='Способы погашения полученного кредита']";

    /**
     * Ровно
     */
    private static final String zagalovokRovno = ".//*[@class='col-md-10']//*[text()='Кредиты в Ровно']";
    private static final String blockRovno5 = ".//*[@class='col-md-10']//*[text()='Способы погашения, полученного кредита:']";

    /**
     * Запорожье
     */
    private static final String zagalovokZaporozhe = ".//*[@class='col-md-10']//*[text()='Кредиты в Запорожье']";

    /**
     * Чернигов
     */
    private static final String zagalovokChernigov = ".//*[@class='col-md-10']//*[text()='Кредиты в Чернигове']";
    private static final String blockChernigov5 = ".//*[@class='col-md-10']//*[text()='Способы погашения, полученного кредита']";

    /**
     * Павлоград
     */
    private static final String zagalovokPavlograd = ".//*[@class='col-md-10']//*[text()='Кредиты в Павлограде']";
    private static final String blockPavlograd5 = ".//*[@class='col-md-10']//*[text()='Способы погашения, полученного кредита:']";

    /**
     * Житомир
     */
    private static final String zagalovokZhitomer = ".//*[@class='col-md-10']//*[text()='Кредиты в Житомире']";
    private static final String blockZhitomer5 = ".//*[@class='col-md-10']//*[text()='Способы ']";

    /**
     * Черкассы
     */
    private static final String zagalovokCherkassy = ".//*[@class='col-md-10']//*[text()='Кредиты в Черкассах']";
    private static final String blockCherkassy5 = ".//*[@class='col-md-10']//*[text()='Способы погашения, полученного кредита']";

    /**
     * Николаеве
     */
    private static final String zagalovokNikolaev = ".//*[@class='col-md-10']//*[text()='Кредиты в Николаеве']";
    private static final String blockNikolaev5 = ".//*[@class='col-md-10']//*[text()='Способы погашения полученного кредита']";

    /**
     * Винница
     */
    private static final String zagalovokVinnica = ".//*[@class='col-md-10']//*[text()='Кредиты в Виннице']";
    private static final String blockVinnica5 = ".//*[@class='col-md-10']//*[text()='Способы погашения полученного кредита']";

    /**
     * Умань
     */
    private static final String zagalovokUman = ".//*[@class='col-md-10']//*[text()='Кредиты в Умане']";
    private static final String blockUman5 = ".//*[@class='col-md-10']//*[text()='Способы погашения, полученного кредита']";

    /**
     * Кривой Рог
     */
    private static final String zagalovokKrivojRog = ".//*[@class='col-md-10']//*[text()='Кредиты в Кривом Роге']";
    private static final String blockKrivojRog5 = ".//*[@class='col-md-10']//*[text()='Способы погашения, полученного кредита:']";

    /**
     * Белая Церковь
     */
    private static final String zagalovokBelayaCherkov = ".//*[@class='col-md-10']//*[text()='Кредиты в Белой Церкви']";
    private static final String blockBelayaCherkov5 = ".//*[@class='col-md-10']//*[text()='Способы погашения, полученного кредита']";

    private static final Logger LOGGER1 = Logger.getLogger(Tests.CityTest.class.getSimpleName());

    @Test
    public void KievGo() throws InterruptedException {
        open();
        moveCityBlocks();
        kievClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(0), "Переход на " + mapCities(0) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(blockKievInfo), true, "Блок информации о кредите в Киеве отсуствует");
        softAssert.assertEquals(isElementXpathPresent(zagalovokKiev), true, "Заголовок Кредиты в Киеве отсуствует");
        softAssert.assertEquals(isElementXpathPresent(howTakeCreditKiev), true, "Заголовок Как взять кредит в Киеве через интернет отсуствует");

        softAssert.assertAll();

        LOGGER1.info("KievGo" + " завершился Успешно");
    }

    @Test
    public void KharkovGo() throws InterruptedException {
        open();
        moveCityBlocks();
        kharkovClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(1), "Переход на " + mapCities(1) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(blockKharkovInfo), true, "Блок информации о кредите в Харькове отсуствует");
        softAssert.assertEquals(isElementXpathPresent(zagalovokKharkov), true, "Заголовок Кредит в Харькове отсуствует");
        softAssert.assertEquals(isElementXpathPresent(howTakeCreditKharkov), true, "Заголовок Как взять кредит в Харькове через интернет отсуствует");

        softAssert.assertAll();

        LOGGER1.info("KharkovGo" + " завершился Успешно");
    }

    @Test
    public void DneprGo() throws InterruptedException {
        open();
        moveCityBlocks();
        dneprClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(2), "Переход на " + mapCities(2) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(blockDneprInfo), true, "Блок информации о кредите в Днепре отсуствует");
        softAssert.assertEquals(isElementXpathPresent(zagalovokDnepr), true, "Заголовок Кредит в Днепре отсуствует");
        softAssert.assertEquals(isElementXpathPresent(howTakeCreditDnepr), true, "Заголовок Как взять кредит в Днепре через интернет отсуствует");

        softAssert.assertAll();

        LOGGER1.info("DneprGo" + " завершился Успешно");
    }

    @Test
    public void LvovGo() throws InterruptedException {
        open();
        moveCityBlocks();
        lvovClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(3), "Переход на " + mapCities(3) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(blockLvovInfo), true, "Блок информации о кредите в Львове отсуствует");
        softAssert.assertEquals(isElementXpathPresent(zagalovokLvov), true, "Заголовок Кредит в Львове отсуствует");
        softAssert.assertEquals(isElementXpathPresent(howTakeCreditLvov), true, "Заголовок Как взять кредит в Львове через интернет отсуствует");

        softAssert.assertAll();

        LOGGER1.info("LvovGo" + " завершился Успешно");
    }

    @Test
    public void OdessaGo() throws InterruptedException {
        open();
        moveCityBlocks();
        odessaClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(4), "Переход на " + mapCities(4) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(blockOdessaInfo), true, "Блок информации о кредите в Одессе отсуствует");
        softAssert.assertEquals(isElementXpathPresent(zagalovokOdessa), true, "Заголовок Кредит в Одессе отсуствует");
        softAssert.assertEquals(isElementXpathPresent(howTakeCreditOdessa), true, "Заголовок Как взять кредит в Одессе через интернет отсуствует");

        softAssert.assertAll();

        LOGGER1.info("OdessaGo" + " завершился Успешно");
    }

    @Test
    public void PoltavaGo() throws InterruptedException {
        open();
        moveCityBlocks();
        poltavaClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(5), "Переход на " + mapCities(5) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(blockPoltavaInfo), true, "Блок информации о кредите в Полтаве отсуствует");
        softAssert.assertEquals(isElementXpathPresent(zagalovokPoltava), true, "Заголовок Кредит в Полтаве отсуствует");
        softAssert.assertEquals(isElementXpathPresent(howTakeCreditPoltava), true, "Заголовок Как взять кредит в Полтаве через интернет отсуствует");

        softAssert.assertAll();

        LOGGER1.info("PoltavaGo" + " завершился Успешно");
    }

    @Test
    public void KropivnickijGo() throws InterruptedException {
        open();
        moveCityBlocks();
        kropivnickijClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(6), "Переход на " + mapCities(6) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(blockKropivnickijInfo), true, "Блок информации о кредите в Кропивницком отсуствует");
        softAssert.assertEquals(isElementXpathPresent(zagalovokKropivnickij), true, "Заголовок Кредит в Кропивницком отсуствует");
        softAssert.assertEquals(isElementXpathPresent(howTakeCreditKropivnickij), true, "Заголовок Как взять кредит в Кропивницком через интернет отсуствует");

        softAssert.assertAll();

        LOGGER1.info("KropivnickijGo" + " завершился Успешно");
    }


    @Test
    public void CherkassyGo() throws InterruptedException {
        open();
        moveCityBlocks();
        cherkassyClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(7), "Переход на " + mapCities(7) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(zagalovokCherkassy), true, "Заголовок Кредиты в Черкассах не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock1), true, "Как взять кредит в Черкассах через интернет? не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock2), true, "Блок У нас вы можете взять кредит за 15 минут: не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock3), true, "Блок Предлагаем получить деньги в кредит в Черкассах на любые цели: // не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock4), true, "Блок Предлагаем выгодно взять кредит от Mycredit // не найден");
        softAssert.assertEquals(isElementXpathPresent(blockCherkassy5), true, "Блок Способы погашения полученного кредита не найден");

        softAssert.assertAll();

        LOGGER1.info("CherkassyGo" + " завершился Успешно");
    }

    @Test
    public void ChernigovGo() throws InterruptedException {
        open();
        moveCityBlocks();
        chernigovClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(8), "Переход на " + mapCities(8) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(zagalovokChernigov), true, "Заголовок Кредиты в Чернигове не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock1), true, "Как взять кредит в Чернигове через интернет? не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock2), true, "Блок У нас вы можете взять кредит за 15 минут: не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock3), true, "Блок Предлагаем получить кредит в Чернигове  на любые цели // не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock4), true, "Предлагаем выгодно взять кредит от Mycredit // не найден");
        softAssert.assertEquals(isElementXpathPresent(blockChernigov5), true, "Блок Способы погашения полученного кредита не найден");

        softAssert.assertAll();

        LOGGER1.info("ChernigovGo" + " завершился Успешно");
    }

    @Test
    public void VinnicaGo() throws InterruptedException {
        open();
        moveCityBlocks();
        vinnicaClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(9), "Переход на " + mapCities(9) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(zagalovokVinnica), true, "Заголовок Кредиты в Виннице не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock1), true, "Как взять кредит в Виннице через интернет? не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock2), true, "Блок У нас вы можете взять кредит за 15 минут: не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock3), true, "Блок Предлагаем получить деньги в кредит в Виннице на любые цели: // не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock4), true, "Блок Предлагаем выгодно взять кредит от Mycredit // не найден");
        softAssert.assertEquals(isElementXpathPresent(blockVinnica5), true, "Блок Способы погашения полученного кредита не найден");

        softAssert.assertAll();

        LOGGER1.info("VinnicaGo" + " завершился Успешно");
    }


    @Test
    public void BelayaCherkovGo() throws InterruptedException {
        open();
        moveCityBlocks();
        belayaCerkovClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(10), "Переход на " + mapCities(10) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(zagalovokBelayaCherkov), true, "Заголовок Кредиты в Белой Церкви не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock1), true, "Как взять кредит в Белой Церкви через интернет? не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock2), true, "Блок У нас вы можете взять кредит за 15 минут: не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock3), true, "Блок Предлагаем получить деньги в кредит в Белой Церкви на любые цели: // не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock4), true, "Блок Предлагаем выгодно взять кредит от Mycredit // не найден");
        softAssert.assertEquals(isElementXpathPresent(blockBelayaCherkov5), true, "Блок Способы погашения полученного кредита не найден");

        softAssert.assertAll();

        LOGGER1.info("BelayaCherkovGo" + " завершился Успешно");
    }

    @Test
    public void ZhitomirGo() throws InterruptedException {
        open();
        moveCityBlocks();
        zhitomirClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(11), "Переход на " + mapCities(11) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(zagalovokZhitomer), true, "Заголовок Кредиты в Житомире не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock1), true, "Как взять кредит в Житомере через интернет? не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock2), true, "Блок У нас вы можете взять кредит за 15 минут: не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock3), true, "Блок Предлагаем получить деньги в кредит в Житомере на любые цели: // не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock4), true, "Блок Предлагаем выгодно взять кредит от Mycredit // не найден");
        softAssert.assertEquals(isElementXpathPresent(blockZhitomer5), true, "Блок Способы погашения полученного кредита не найден");

        softAssert.assertAll();

        LOGGER1.info("ZhitomirGo" + " завершился Успешно");
    }

    @Test
    public void ZaporozheGo() throws InterruptedException {
        open();
        moveCityBlocks();
        zaporozheClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(12), "Переход на " + mapCities(12) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(zagalovokZaporozhe), true, "Заголовок Кредиты в Запорожье не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock1), true, "Как взять кредит в Запорожье через интернет? не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock2), true, "Блок У нас вы можете взять кредит за 15 минут: не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock3), true, "Блок Предлагаем получить кредит в Запорожье на любые цели // не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock4), true, "Предлагаем выгодно взять займ от MyCredit // не найден");

        softAssert.assertAll();

        LOGGER1.info("ZaporozheGo" + " завершился Успешно");
    }

    @Test
    public void IvanoFrankovskGo() throws InterruptedException {
        open();
        moveCityBlocks();
        ivanoFrankovskClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(13), "Переход на " + mapCities(13) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(blockIvanoFrankovsk), true, "Блок информации о кредите в Ивано-Франковск отсуствует");
        softAssert.assertEquals(isElementXpathPresent(zagalovokIvanoFrankovsk), true, "Заголовок Кредит в Ивано-Франковск отсуствует");
        softAssert.assertEquals(isElementXpathPresent(howTakeCreditIvanoFrankovsk), true, "Заголовок Как взять кредит в Ивано-Франковск через интернет отсуствует");

        softAssert.assertAll();

        LOGGER1.info("IvanoFrankovskGo" + " завершился Успешно");
    }

    @Test
    public void KonotopGo() throws InterruptedException {
        open();
        moveCityBlocks();
        konotopClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(14), "Переход на " + mapCities(14) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(zagalovokKonotop), true, "Заголовок Кредиты в Конотопе не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock1), true, "Блок Как взять кредит в Конотопе через интернет? не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock2), true, "Блок У нас вы можете взять кредит за 15 минут не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock3), true, "Предлагаем получить деньги в кредит в Конотопе на любые цели");
        softAssert.assertEquals(isElementXpathPresent(cityBlock4), true, "Блок Предлагаем выгодно взять кредит от Mycredit не найден");
        softAssert.assertEquals(isElementXpathPresent(blockKonotop5), true, "Блок Способы погашения полученного не кредита");

        softAssert.assertAll();

        LOGGER1.info("KonotopGo" + " завершился Успешно");
    }

    @Test
    public void KrivojRogGo() throws InterruptedException {
        open();
        moveCityBlocks();
        krivojRogClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(15), "Переход на " + mapCities(15) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(zagalovokKrivojRog), true, "Заголовок Кредиты в Кривом Роге не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock1), true, "Как взять кредит в Кривом Роге через интернет? не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock2), true, "Блок У нас вы можете взять кредит за 15 минут: не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock3), true, "Блок Предлагаем получить деньги в кредит в Кривом Роге на любые цели: // не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock4), true, "Блок Предлагаем выгодно взять кредит от Mycredit // не найден");
        softAssert.assertEquals(isElementXpathPresent(blockKrivojRog5), true, "Блок Способы погашения полученного кредита не найден");

        softAssert.assertAll();

        LOGGER1.info("KrivojRogGo" + " завершился Успешно");
    }

    @Test
    public void NikolaevGo() throws InterruptedException {
        open();
        moveCityBlocks();
        nikolaevClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(16), "Переход на " + mapCities(16) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(zagalovokNikolaev), true, "Заголовок Кредиты в Николаеве не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock1), true, "Как взять кредит в Николаеве через интернет? не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock2), true, "Блок У нас вы можете взять кредит за 15 минут: не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock3), true, "Блок Предлагаем получить деньги в кредит в Николаеве на любые цели: // не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock4), true, "Блок Предлагаем выгодно взять кредит от Mycredit // не найден");
        softAssert.assertEquals(isElementXpathPresent(blockNikolaev5), true, "Блок Способы погашения полученного кредита не найден");

        softAssert.assertAll();

        LOGGER1.info("NikolaevGo" + " завершился Успешно");
    }

    @Test
    public void PavlogradGo() throws InterruptedException {
        open();
        moveCityBlocks();
        pavlogradCLick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(17), "Переход на " + mapCities(17) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(zagalovokPavlograd), true, "Заголовок Кредиты в Павлограде не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock1), true, "Как взять кредит в Павлограде через интернет? не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock2), true, "Блок У нас вы можете взять кредит за 15 минут: не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock3), true, "Предлагаем получить деньги в кредит в Павлограде на любые цели: // не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock4), true, "Предлагаем выгодно взять кредит от Mycredit // не найден");
        softAssert.assertEquals(isElementXpathPresent(blockPavlograd5), true, "Блок Способы погашения, полученного кредита: не найден");

        softAssert.assertAll();

        LOGGER1.info("PavlogradGo" + " завершился Успешно");
    }

    @Test
    public void RovnoGo() throws InterruptedException {
        open();
        moveCityBlocks();
        rovnoClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(18), "Переход на " + mapCities(18) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(zagalovokRovno), true, "Заголовок Кредиты в Ровно не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock1), true, "Блок Как взять кредит в Ровно через интернет? не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock2), true, "Блок У нас вы можете взять кредит за 15 минут: не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock3), true, "Блок Предлагаем получить деньги в кредит в Ровно на любые цели // не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock4), true, "Предлагаем выгодно взять кредит от Mycredit // не найден");
        softAssert.assertEquals(isElementXpathPresent(blockRovno5), true, "Блок Способы погашения полученного кредита не найден");

        softAssert.assertAll();

        LOGGER1.info("RovnoGo" + " завершился Успешно");
    }

    @Test
    public void SummyGo() throws InterruptedException {
        open();
        moveCityBlocks();
        summyClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(19), "Переход на " + mapCities(19) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(blockSummyInfo), true, "Блок информации о кредите в Суммах отсуствует");
        softAssert.assertEquals(isElementXpathPresent(zagalovokSummy), true, "Заголовок Кредиты в Суммах отсуствует");
        softAssert.assertEquals(isElementXpathPresent(howTakeCreditSummy), true, "Заголовок Как взять кредит в Суммах через интернет отсуствует");

        softAssert.assertAll();

        LOGGER1.info("SummyGo" + " завершился Успешно");
    }

    @Test
    public void TernopolGo() throws InterruptedException {
        open();
        moveCityBlocks();
        ternopolClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(20), "Переход на " + mapCities(20) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(blockTernopolInfo), true, "Блок информации о кредите в Тернополе отсуствует");
        softAssert.assertEquals(isElementXpathPresent(zagalovokTernopol), true, "Заголовок Кредит в Тернополе отсуствует");
        softAssert.assertEquals(isElementXpathPresent(howTakeCreditTernopol), true, "Заголовок Как взять кредит в Тернополе через интернет отсуствует");

        softAssert.assertAll();

        LOGGER1.info("TernopolGo" + " завершился Успешно");
    }

    @Test
    public void UshgorodGo() throws InterruptedException {
        open();
        moveCityBlocks();
        ushgorodClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(21), "Переход на " + mapCities(21) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(blockUshgorodInfo), true, "Блок информации о кредите в Ужгороде отсуствует");
        softAssert.assertEquals(isElementXpathPresent(zagalovokUshgorod), true, "Заголовок Кредит в Ужгороде отсуствует");
        softAssert.assertEquals(isElementXpathPresent(howTakeCreditUshgorod), true, "Заголовок Как взять кредит в Ужгороде через интернет отсуствует");

        softAssert.assertAll();

        LOGGER1.info("UshgorodGo" + " завершился Успешно");
    }

    @Test
    public void UmanGo() throws InterruptedException {
        open();
        moveCityBlocks();
        umanClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(22), "Переход на " + mapCities(22) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(zagalovokUman), true, "Заголовок Кредиты в Умане не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock1), true, "Как взять кредит в Умане через интернет? не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock2), true, "Блок У нас вы можете взять кредит за 15 минут: не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock3), true, "Блок Предлагаем получить деньги в кредит в Умане на любые цели: // не найден");
        softAssert.assertEquals(isElementXpathPresent(cityBlock4), true, "Блок Предлагаем выгодно взять кредит от Mycredit // не найден");
        softAssert.assertEquals(isElementXpathPresent(blockUman5), true, "Блок Способы погашения полученного кредита не найден");

        softAssert.assertAll();

        LOGGER1.info("UmanGo" + " завершился Успешно");
    }

    @Test
    public void KhersonGo() throws InterruptedException {
        open();
        moveCityBlocks();
        khersonClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(23), "Переход на " + mapCities(23) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(blockKhersonInfo), true, "Блок информации о кредите в Херсоне отсуствует");
        softAssert.assertEquals(isElementXpathPresent(zagalovokKherson), true, "Заголовок Кредит в Херсоне отсуствует");
        softAssert.assertEquals(isElementXpathPresent(howTakeCreditKherson), true, "Заголовок Как взять кредит в Херсоне через интернет отсуствует");

        softAssert.assertAll();

        LOGGER1.info("KhersonGo" + " завершился Успешно");
    }

    @Test
    public void KhmelnickijGo() throws InterruptedException {
        open();
        moveCityBlocks();
        khmelnickijClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(24), "Переход на " + mapCities(24) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(blockKhmelnickomInfo), true, "Блок информации о кредите в Хмельницком отсуствует");
        softAssert.assertEquals(isElementXpathPresent(zagalovokKhmelnickomI), true, "Заголовок Кредит в Хмельницком отсуствует");
        softAssert.assertEquals(isElementXpathPresent(howTakeCreditKhmelnickomI), true, "Заголовок Как взять кредит в Хмельницком через интернет отсуствует");

        softAssert.assertAll();

        LOGGER1.info("KhmelnickijGo" + " завершился Успешно");
    }

    @Test
    public void ChernovciGo() throws InterruptedException {
        open();
        moveCityBlocks();
        chernovciClick();

        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + mapCities(25), "Переход на " + mapCities(25) + " не состоялся");
        softAssert.assertEquals(isElementXpathPresent(blockChernovciInfo), true, "Блок информации о кредите в Церновцах отсуствует");
        softAssert.assertEquals(isElementXpathPresent(zagalovokChernovci), true, "Заголовок Кредит в Церновцах отсуствует");
        softAssert.assertEquals(isElementXpathPresent(howTakeCreditChernovci), true, "Заголовок Как взять кредит в Церновцах через интернет отсуствует");

        softAssert.assertAll();

        LOGGER1.info("ChernovciGo" + " завершился Успешно");
    }





    private void deleteHeader() {
        ((JavascriptExecutor) driver).executeScript("var elem = document.getElementById('myAffix');" + "elem.remove();");
    }

    /**
     * Проверка внутренних страниц
     */
    @Test(enabled = false)
    public List<WebElement> ElementOnPageWithTagA() throws InterruptedException, IOException {
        open();
        moveCityBlocks();
        summyClick();
        deleteHeader();
        List<WebElement> links = driver.findElement(By.xpath(".//*[@class='col-md-10']")).findElements(By.tagName("a"));

        List<WebElement> linksMap = new ArrayList<WebElement>();

        for (WebElement link : links) {
            linksMap.add(link);
        }
        return linksMap;
    }

    @Test(enabled = false)
    public void TestLink() throws IOException, InterruptedException {
        try {
            for (int i = 0; i <= ElementOnPageWithTagA().size(); i++) {
            waiterPreloader();
                ElementOnPageWithTagA().get(i).click();
                URL url = new URL(driver.getCurrentUrl());
                HttpsURLConnection http = (HttpsURLConnection) url.openConnection();
                int statusCode = http.getResponseCode();

                if (statusCode == 200) {
                    System.out.println("Страница " + driver.getCurrentUrl() + " вернулся статус код " + statusCode);
                } else {
                    System.out.println("Страница не норм " + " " + statusCode);
                }
            }
        } catch (IndexOutOfBoundsException e) {
        }
    }

}

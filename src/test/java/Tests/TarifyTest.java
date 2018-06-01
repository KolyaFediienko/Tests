package Tests;

import Pages.TarifyPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TarifyTest extends TarifyPage{
    private SoftAssert softAssert = new SoftAssert();
    private static final String BaseURL = "https://mycredit.ua/ru/";

    private static final String TextZagolovok = ".//*[@class='col-md-10']//*[text()='Тарифы']";
    private static final String Xlebniekroshki = ".//*[@class='B_crumbBox']";
    private static final String TextAfterTarify = ".//*[@class='programms-footnote']";
    private static final String Tarify1 = ".//div[1][@class='programms-item']";
    private static final String Tarify2 = ".//div[2][@class='programms-item']";
    private static final String Tarify3 = ".//div[3][@class='programms-item']";
    private static final String Tarify4 = ".//div[4][@class='programms-item']";
    private static final String Tarify5 = ".//div[5][@class='programms-item']";
    private static final String Tarify6 = ".//div[6][@class='programms-item']";

    /**
     * Первый Тариф
     */
    private static final String FirstTarifZagolovok = ".//div[1][@class='programms-item']//*[@class='programms-heading']";
    private static final String FirstTarifSumma = ".//div[1][@class='programms-item']//*[@class='col-xs-5 text-right']";
    private static final String FirstTarifText = ".//div[1][@class='programms-item']//*[@class='programms-info']";
    private static final String FirstTarifIMG = ".//div[1][@class='programms-item']//img";
    private static final String FirstTarifButton = ".//div[1][@class='programms-item']//*[@class='btn btn-personal']";

    /**
     * Второй Тариф
     */
    private static final String SecondTarifZagolovok = ".//div[2][@class='programms-item']//*[@class='programms-heading']";
    private static final String SecondTarifSumma = ".//div[2][@class='programms-item']//*[@class='col-xs-5 text-right']";
    private static final String SecondTarifText = ".//div[2][@class='programms-item']//*[@class='programms-info']";
    private static final String SecondTarifIMG = ".//div[2][@class='programms-item']//img";
    private static final String SecondTarifButton = ".//div[2][@class='programms-item']//*[@class='btn btn-personal']";

    /**
     * Третий Тариф
     */
    private static final String ThirdTarifZagolovok = ".//div[3][@class='programms-item']//*[@class='programms-heading']";
    private static final String ThirdTarifSumma = ".//div[3][@class='programms-item']//*[@class='col-xs-5 text-right']";
    private static final String ThirdTarifText = ".//div[3][@class='programms-item']//*[@class='programms-info']";
    private static final String ThirdTarifIMG = ".//div[3][@class='programms-item']//img";
    private static final String ThirdTarifButton = ".//div[3][@class='programms-item']//*[@class='btn btn-personal']";

    /**
     * Четвертый Тариф
     */
    private static final String FourthTarifZagolovok = ".//div[4][@class='programms-item']//*[@class='programms-heading']";
    private static final String FourthTarifSumma = ".//div[4][@class='programms-item']//*[@class='col-xs-5 text-right']";
    private static final String FourthTarifText = ".//div[4][@class='programms-item']//*[@class='programms-info']";
    private static final String FourthTarifIMG = ".//div[4][@class='programms-item']//img";
    private static final String FourthTarifButton = ".//div[4][@class='programms-item']//*[@class='btn btn-personal']";

    /**
     * Пятый Тариф
     */
    private static final String FifthTarifZagolovok = ".//div[5][@class='programms-item']//*[@class='programms-heading']";
    private static final String FifthTarifSumma = ".//div[5][@class='programms-item']//*[@class='col-xs-5 text-right']";
    private static final String FifthTarifText = ".//div[5][@class='programms-item']//*[@class='programms-info']";
    private static final String FifthTarifIMG = ".//div[5][@class='programms-item']//img";
    private static final String FifthTarifButton = ".//div[5][@class='programms-item']//*[@class='btn btn-personal']";

    /**
     * Шестой Тариф
     */
    private static final String SixthTarifZagolovok = ".//div[6][@class='programms-item']//*[@class='programms-heading']";
    private static final String SixthTarifSumma = ".//div[6][@class='programms-item']//*[@class='col-xs-5 text-right']";
    private static final String SixthTarifText = ".//div[6][@class='programms-item']//*[@class='programms-info']";
    private static final String SixthTarifIMG = ".//div[6][@class='programms-item']//img";
    private static final String SixthTarifButton = ".//div[6][@class='programms-item']//*[@class='btn btn-personal']";

    /**
     * Страница Регистрации
     */
    private static final String RegistrationBlok = ".//*[@class='col-md-6']";
    private static final String RegistrationBlokVideo = ".//*[@class='col-md-4']";


    @Test
    public void TarifyMainTest()
    {
        openTarifyPage();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL +"great-rates/");
        softAssert.assertEquals(Gettext(TextZagolovok),"Тарифы");
        softAssert.assertEquals(Gettext(Xlebniekroshki),"Главная\n" +
                "  Тарифы");
        softAssert.assertEquals(Gettext(TextAfterTarify),"* Указанные тарифы действуют только при условии подачи первого кредита в MyCredit");
        softAssert.assertEquals(isElementXpathPresent(Tarify1), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Tarify2), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Tarify3), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Tarify4), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Tarify5), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Tarify6), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void FirstTarifTest()
    {
        openTarifyPage();
        softAssert.assertEquals(Gettext(FirstTarifZagolovok),"КРЕДИТ\n" +
                "Кредит выходного дня");
        softAssert.assertEquals(Gettext(FirstTarifSumma),"500 грн");
        softAssert.assertEquals(Gettext(FirstTarifText),"Собираешься на отдых с друзьями или ждешь гостей на выходных? Этот тип займа поможет хорошо провести время!");
        softAssert.assertEquals(isElementXpathPresent(FirstTarifIMG), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(FirstTarifButton), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void SecondTarifTest()
    {
        openTarifyPage();
        softAssert.assertEquals(Gettext(SecondTarifZagolovok),"КРЕДИТ\n" +
                "Деньги под рукой");
        softAssert.assertEquals(Gettext(SecondTarifSumma),"1000 грн");
        softAssert.assertEquals(Gettext(SecondTarifText),"Внезапные неприятности застали врасплох? С этим типом краткосрочных кредитов деньги всегда у вас под рукой!");
        softAssert.assertEquals(isElementXpathPresent(SecondTarifIMG), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(SecondTarifButton), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void ThirdTarifTest()
    {
        openTarifyPage();
        softAssert.assertEquals(Gettext(ThirdTarifZagolovok),"КРЕДИТ\n" +
                "Студенческий кредит");
        softAssert.assertEquals(Gettext(ThirdTarifSumma),"1000 грн");
        softAssert.assertEquals(Gettext(ThirdTarifText),"Не хватает денег на обучение или развлечения с друзьями? Мы предоставляем кредиты всем студентам!");
        softAssert.assertEquals(isElementXpathPresent(ThirdTarifIMG), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(ThirdTarifButton), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void FourthTarifTest()
    {
        openTarifyPage();
        softAssert.assertEquals(Gettext(FourthTarifZagolovok),"КРЕДИТ\n" +
                "Деньги до зарплаты");
        softAssert.assertEquals(Gettext(FourthTarifSumma),"1500 грн");
        softAssert.assertEquals(Gettext(FourthTarifText),"До зарплаты еще целая неделя, а деньги уже на исходе? Этот тип займа подстрахует вас и спасет от непредвиденных растрат!");
        softAssert.assertEquals(isElementXpathPresent(FourthTarifIMG), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(FourthTarifButton), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void FifthTarifTest()
    {
        openTarifyPage();
        softAssert.assertEquals(Gettext(FifthTarifZagolovok),"КРЕДИТ\n" +
                "День рождение");
        softAssert.assertEquals(Gettext(FifthTarifSumma),"1600 грн");
        softAssert.assertEquals(Gettext(FifthTarifText),"Близится важная дата? Сервис МyCredit поможет сделать расходы менее ощутимыми для вашего кошелька!");
        softAssert.assertEquals(isElementXpathPresent(FifthTarifIMG), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(FifthTarifButton), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void SixthTarifTest()
    {
        openTarifyPage();
        softAssert.assertEquals(Gettext(SixthTarifZagolovok),"КРЕДИТ\n" +
                "На здоровье");
        softAssert.assertEquals(Gettext(SixthTarifSumma),"2000 грн");
        softAssert.assertEquals(Gettext(SixthTarifText),"Проблемы со здоровьем застали врасплох? Этот тип кредита поможет справится с внезапными медицинскими расходами!");
        softAssert.assertEquals(isElementXpathPresent(SixthTarifIMG), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(SixthTarifButton), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void FirstTarifButtonTest()
    {
        openTarifyPage();
        clickFirstButton();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL +"registration/");
        softAssert.assertEquals(isElementXpathPresent(RegistrationBlok), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(RegistrationBlokVideo), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void SecondTarifButtonTest()
    {
        openTarifyPage();
        clickSecondButton();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL +"registration/");
        softAssert.assertEquals(isElementXpathPresent(RegistrationBlok), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(RegistrationBlokVideo), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void ThirdTarifButtonTest()
    {
        openTarifyPage();
        clickThirdButton();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL +"registration/");
        softAssert.assertEquals(isElementXpathPresent(RegistrationBlok), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(RegistrationBlokVideo), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void FourthTarifButtonTest()
    {
        openTarifyPage();
        clickFourthButton();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL +"registration/");
        softAssert.assertEquals(isElementXpathPresent(RegistrationBlok), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(RegistrationBlokVideo), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void FifthTarifButtonTest()
    {
        openTarifyPage();
        clickFifthButton();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "registration/");
        softAssert.assertEquals(isElementXpathPresent(RegistrationBlok), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(RegistrationBlokVideo), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test
    public void SixthTarifButtonTest()
    {
        openTarifyPage();
        clickSixthButton();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseURL + "registration/");
        softAssert.assertEquals(isElementXpathPresent(RegistrationBlok), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(RegistrationBlokVideo), true, "Элемент найден");
        softAssert.assertAll();
    }

}

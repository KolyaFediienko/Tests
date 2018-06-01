package Tests;

import Pages.MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class MainPageTest extends MainPage {
    private SoftAssert softAssert = new SoftAssert();

    private static final String BaseUrl = "https://mycredit.ua/ru/";
    private static final String NewpictureIMG = ".//*[@class='credit-zero-left']//img[1]";
    private static final String ZeroPersent = ".//*[@class='calculator-labe-zero']";
    private static final String ButtonAbout = ".//*[@class='btn btn-share']\n";
    private static final String HowMakeCreditVidjet = ".//*[@class='how-widget']";
    private static final String CalculatorBanks = ".//*[@class='calculator-images']";
    private static final String WhyitakecreditNewClients = ".//*[@class='advantages-header']//*[text()='Новым клиентам']";
    private static final String WhyitakecreditClients = ".//*[@class='advantages-header']//*[text()='Постоянным клиентам']";
    private static final String WhyitakecreditBezProcentov = ".//*[@class='advantages-item--cogwheel']//*[text()='беспроцентный кредит']";
    private static final String WhyitakecreditINN = ".//*[@class='advantages-text']//*[text()='номер паспорта и ИНН']";
    private static final String WhyitakecreditNewSkidka = ".//*[@class='advantages-text']//*[text()='скидкой до 20%']";
    private static final String WhyitakecreditAvtomaticheskoe = ".//*[@class='advantages-text']//*[text()='автоматическое подтверждение заявки']";
    private static final String WhyitakecreditHeader = ".//*[@class='container-big text-center']//*[text()='Почему я возьму кредит в MyСredit?']\n";
    private static final String AboutshareLoveclient = "/html/body/div[1]/div[4]/div/div[2]/div/div[2]/div/div[1]/img";
    private static final String AboutshareTakeCredit = ".//*[@class='numbers-play text-center same-height-left same-height-right']";
    private static final String AboutshareVibratSummu = ".//*[@class='modal-content']";
    private static final String VigodnyeCreditytext = ".//*[@class='heading-h1 heading-h1--inverse text-center']";
    private static final String VigodnyeCredityPreviousButton = ".//*[@class='owl-controls']/div[1]/div[1]";
    private static final String VigodnyeCredityNextButton = ".//*[@class='owl-controls']/div[1]/div[2]";
    private static final String VigodnyeCredityContent = ".//*[@class='owl-stage-outer']";
    private static final String HowHeaderText = ".//*[@class='heading-h1 text-center']";
    private static final String How1 = ".//*[@class='issue-list']/li[1]//*[@class='issue-img']";
    private static final String How2 = ".//*[@class='issue-list']/li[2]//*[@class='issue-img']";
    private static final String How3 = ".//*[@class='issue-list']/li[3]//*[@class='issue-img']";
    private static final String How4 = ".//*[@class='issue-list']/li[4]//*[@class='issue-img']";
    private static final String Howbutton = ".//*[@class='issue-play--holder']//*[text()='Смотреть видео']";
    private static final String HowMakeCreditButtonSteps = ".//*[@class='issue-step--holder issue-visible']//*[text()='Показать шаги']";
    private static final String Securityimg = ".//*[@class='security-left animated fadeInLeft go']";
    private static final String SecurityimgNearText1 = ".//*[@class='security-list']/li[1]";
    private static final String SecurityimgNearText2 = ".//*[@class='security-list']/li[2]";
    private static final String SecurityimgNearText3 = ".//*[@class='security-list']/li[3]";
    private static final String NamDoverautblockOtzyvu = ".//*[@class='row']";
    private static final String NamDoverautblockVideoOtzyvu = ".//*[@class='people-list']";
    private static final String NamDoverautblockVideoOtzyvuText = ".//*[@class='heading-video text-center hidden-xs']";
    private static final String RegionBlockXpath = ".//*[@class='city-holder']";
    private static final String RepayLoanCabinetText = ".//*[@class='banks-info']//*[text()='В личном кабинете MyCredit']";
    private static final String RepayLoanTerminalsText = ".//*[@class='banks-info']//*[text()='Через платежные терминалы']";
    private static final String PrivatBankImg = ".//*[@class='banks-list container-img']//li[1]";
    private static final String UkrSibBankImg = ".//*[@class='banks-list container-img']//li[2]";
    private static final String UnicreditBankImg = ".//*[@class='banks-list container-img']//li[3]";
    private static final String AlphaBankImg = ".//*[@class='banks-list container-img']//li[4]";
    private static final String FooterPhone = ".//*[@class='footer-phone']";
    private static final String FooterContent = ".//*[@class='container-fluid']";
    private static final String FooterLogo = ".//*[@class='footer-logo']";
    private static final String TMe = ".//*[@class='social']//li[1]";
    private static final String VK = ".//*[@class='social']//li[2]";
    private static final String FB = ".//*[@class='social']//li[3]";
    private static final String Insta = ".//*[@class='social']//li[4]";
    private static final String YouTube = ".//*[@class='social']//li[5]";
    private static final String Google = ".//*[@class='social']//li[6]";

    private final static String LogoArtjoker = ".//*[@class='logo']";


    @Test(priority = 1)
    public void openTest(){
        open();
        String Sharestext = driver.findElement(By.xpath(".//*[@class='col-md-10 text-center col-sm-7 col-sm-offset-3 col-xs-10 col-md-offset-0']//*[text()='\n" +
                "\t\t\t\t\t\t\t\t Сладкий ноябрь ']")).getText();
        softAssert.assertEquals(Sharestext, "СЛАДКИЙ НОЯБРЬ\n" +
                "ПОЛУЧИ ПЕРВЫЙ КРЕДИТ ПОД 0% *");
        softAssert.assertEquals(isElementXpathPresent(ZeroPersent),true,"Элемент кнопка видео не найдена");
        softAssert.assertEquals(isElementXpathPresent(NewpictureIMG), true, "Картинка Неанглы не найдена");
        softAssert.assertEquals(isElementXpathPresent(ButtonAbout), true, "Кнопка подробнее не найдена");
        softAssert.assertEquals(isElementXpathPresent(HowMakeCreditVidjet), true, "Кнопка подробнее не найдена");
        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void CalculatorMainPageTest(){
        open();
        dragCalculator();
        String Mainthreethouthand = driver.findElement(By.xpath("//*[@id=\"span_amount_large_main\"]")).getText();
        softAssert.assertEquals(Mainthreethouthand, "3000");
        String Main35days = driver.findElement(By.xpath("//*[@id=\"span_amount_day_large_main\"]")).getText();
        softAssert.assertEquals(Main35days, "25");
        softAssert.assertEquals(isElementXpathPresent(CalculatorBanks), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void WhyitakecreditTest()
    {
        open();
        movetoWhyitakecredit();
        softAssert.assertEquals(isElementXpathPresent(WhyitakecreditBezProcentov), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(WhyitakecreditINN), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(WhyitakecreditNewSkidka), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(WhyitakecreditAvtomaticheskoe), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(WhyitakecreditHeader), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(WhyitakecreditNewClients), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(WhyitakecreditClients), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 4)
    public void WhyiTakecreditLoveClientTest(){
        open();
        movetoWhyitakecredit();
        clickLoveClient();
        String AboutShare8text = driver.findElement(By.xpath(".//*[@class='content']//*[text()='Готовы к новому сюрпризу от MyCredit? Сегодня мы объявляем о запуске бонусной программы лояльности “Любимый клиент” для постоянных клиентов MyCredit.']")).getText();
        softAssert.assertEquals(AboutShare8text, "Готовы к новому сюрпризу от MyCredit? Сегодня мы объявляем о запуске бонусной программы лояльности “Любимый клиент” для постоянных клиентов MyCredit.");
        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + "news/programma-loyalnosti-lyubimyj-klient/");
        softAssert.assertEquals(isElementXpathPresent(AboutshareLoveclient), true, "Элемент найден");
        softAssert.assertAll();
    }


    @Test(priority = 5)
    public void WhyiTakecreditTakeMoneyTest(){
        open();
        movetoWhyitakecredit();
        clickTakeMoney();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + "registration/");
        softAssert.assertEquals(isElementXpathPresent(AboutshareTakeCredit), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 6)
    public void WhyiTakecreditVibratSummuTest(){
        open();
        movetoWhyitakecredit();
        clickVibratSummu();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl);
        softAssert.assertEquals(isElementXpathPresent(AboutshareVibratSummu), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 7)
    public void TarifyTest(){
        open();
        movetoTarify();
        softAssert.assertEquals(isElementXpathPresent(VigodnyeCreditytext), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(VigodnyeCredityPreviousButton), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(VigodnyeCredityNextButton), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(VigodnyeCredityContent), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 8)
    public void TarifyPodatZayavkyTest(){
        open();
        movetoTarify();
        clickPodatZayavky();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + "registration/");
        softAssert.assertEquals(isElementXpathPresent(AboutshareTakeCredit), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 9)
    public void HowmakecreditTest()
    {
        open();
        movetoHowMakeCredit();
        softAssert.assertEquals(isElementXpathPresent(HowHeaderText), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(How1), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(How2), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(How3), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(How4), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Howbutton), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 10)
    public void HowmakecreditvideoTest()
    {
        open();
        movetoHowMakeCredit();
        clickVideoHowRoMakeCredit();
        softAssert.assertEquals(isElementXpathPresent(HowMakeCreditButtonSteps), true, "Элемент найден");
        softAssert.assertAll();
        clickHowMakeCreditSteps();
        softAssert.assertEquals(isElementXpathPresent(How1), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(How2), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(How3), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(How4), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Howbutton), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 11)
    public void SecurityTest()
    {
        open();
        movetoSecurity();
        String AboutShare8text = driver.findElement(By.xpath(".//*[@class='col-md-6']//*[text()='Ответственность и гарантия безопасности']")).getText();
        softAssert.assertEquals(AboutShare8text, "Ответственность и гарантия безопасности");
        softAssert.assertEquals(isElementXpathPresent(Securityimg), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(SecurityimgNearText1), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(SecurityimgNearText2), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(SecurityimgNearText3), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 12)
    public void SecurityText1Test()
    {
        open();
        movetoSecurity();
        clickSecutityText1();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + "how-it-work/");
        softAssert.assertAll();
    }

    @Test(priority = 13)
    public void SecurityText2Test()
    {
        open();
        movetoSecurity();
        clickSecutityText2();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + "politika-konfidencialnosti/");
        softAssert.assertAll();
    }

    @Test(priority = 14)
    public void SecurityText3Test()
    {
        open();
        movetoSecurity();
        clickSecutityText3();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + "documents-license/");
        softAssert.assertAll();
    }

    @Test(priority = 15)
    public void NamDoverautTest()
    {
        open();
        movetoNamDoveraut();
        String Doveraut = driver.findElement(By.xpath(".//*[@class='container-big']//*[text()='Нам доверяют сотни людей']")).getText();
        softAssert.assertEquals(Doveraut, "Нам доверяют сотни людей");
        softAssert.assertEquals(isElementXpathPresent(NamDoverautblockOtzyvu), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(NamDoverautblockVideoOtzyvu), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(NamDoverautblockVideoOtzyvuText), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 16)
    public void NamDoverautMakeCreditTest()
    {
        open();
        movetoNamDoveraut();
        clickNamDoverautMakeCredit();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + "registration/");
        softAssert.assertEquals(isElementXpathPresent(AboutshareTakeCredit), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 17)
    public void Regions()
    {
        open();
        movetoRegions();
        String RegionHeader = driver.findElement(By.xpath(".//*[@class='container-fluid']//*[text()='Вы можете взять кредит в других регионах']")).getText();
        softAssert.assertEquals(RegionHeader, "Вы можете взять кредит в других регионах");
        String RegionText = driver.findElement(By.xpath(".//*[@class='col-md-10']//*[contains(text(),'Важно')]")).getText();
        softAssert.assertEquals(RegionText, "Важно отметить, что сервис ″Майкредит″ не работает исключительно в Харькове и области. Взять деньги в займы онлайн на банковскую карту не выходя из дома вы можете и в других регионах, пользуясь понятным сервисом. Онлайн займ денег на карту проводится в таких городах");
        softAssert.assertAll();
    }

    @Test(priority = 18)
    public void RegionsyBlock()
    {

        ArrayList<String> cityPageList = new ArrayList<String>();
        cityPageList.add("kiev/");
        cityPageList.add("harkov/");
        cityPageList.add("dnepr/");
        cityPageList.add("lvov/");
        cityPageList.add("odessa/");
        cityPageList.add("poltava/");
        cityPageList.add("kropivnickij/");
        cityPageList.add("cherkassy/");
        cityPageList.add("chernigov/");
        cityPageList.add("vinnica/");
        cityPageList.add("belaya-cerkov/");
        cityPageList.add("zhitomir/");
        cityPageList.add("zaporozhe/");
        cityPageList.add("ivano-frankovsk/");
        cityPageList.add("konotop/");
        cityPageList.add("krivoj-rog/");
        cityPageList.add("nikolaev/");
        cityPageList.add("pavlograd/");
        cityPageList.add("rovno/");
        cityPageList.add("summy/");
        cityPageList.add("ternopol/");
        cityPageList.add("uzhgorod/");
        cityPageList.add("uman/");
        cityPageList.add("herson/");
        cityPageList.add("hmelnickij/");
        cityPageList.add("chernovcy/");

        ArrayList<String> cityAboutList = new ArrayList<String>();
        cityAboutList.add("Кредит в Киеве");
        cityAboutList.add("Кредит в Харькове");
        cityAboutList.add("Кредит в Днепропетровске");
        cityAboutList.add("Кредит во Львове");
        cityAboutList.add("Кредит в Одессе");
        cityAboutList.add("Кредит в Полтаве");
        cityAboutList.add("Кредит в Кропивницком");
        cityAboutList.add("Кредиты в Черкассах");
        cityAboutList.add("Кредиты в Чернигове");
        cityAboutList.add("Кредиты в Виннице");
        cityAboutList.add("Кредиты в Белой Церкви");
        cityAboutList.add("Кредиты в Житомире");
        cityAboutList.add("Кредиты в Запорожье");
        cityAboutList.add("Кредит в Ивано-Франковске");
        cityAboutList.add("Кредиты в Конотопе");
        cityAboutList.add("Кредиты в Кривом Роге");
        cityAboutList.add("Кредиты в Николаеве");
        cityAboutList.add("Кредиты в Павлограде");
        cityAboutList.add("Кредиты в Ровно");
        cityAboutList.add("Кредиты в Сумах");
        cityAboutList.add("Кредит в Тернополе");
        cityAboutList.add("Кредит в Ужгороде");
        cityAboutList.add("Кредиты в Умане");
        cityAboutList.add("Кредит в Херсоне");
        cityAboutList.add("Кредит в Хмельницком");
        cityAboutList.add("Кредит в Черновцах");

        for (int i = 0; i < cityPageList.size() ;i++){
            open();
            movetoRegions();
            driver.findElement(By.xpath(RegionBlockXpath + mapCities(i))).click();
            softAssert.assertEquals(driver.getCurrentUrl(),
                    BaseUrl + cityPageList.get(i),"Переход на " + BaseUrl + cityPageList.get(i) + " не удался");

            String RegionHeader = driver.findElement(By.xpath(".//*[@class='col-md-10']//*[contains(text(),'Кредит')]")).getText();
            softAssert.assertEquals(RegionHeader, cityAboutList.get(i));
            softAssert.assertAll();
        }
    }

    @Test(priority = 19)
    public void HowRepayLoanTest()
    {
        open();
        movetoRepayLoan();
        String HowRepayLoan = driver.findElement(By.xpath(".//*[@class='container-fluid']//*[text()='Как погасить кредит']")).getText();
        softAssert.assertEquals(HowRepayLoan, "Как погасить кредит");
        softAssert.assertEquals(isElementXpathPresent(PrivatBankImg), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(UkrSibBankImg), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(UnicreditBankImg), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(AlphaBankImg), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(RepayLoanCabinetText), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(RepayLoanTerminalsText), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 20)
    public void CreditOnlaynTest()
    {
        open();
        movetoCreditOnline();
        dragCreditOnlayn();
        String CreditOnlayn = driver.findElement(By.xpath(".//*[@class='custom-ul']//*[text()='Если вы берете моментальные кредиты онлайн на банковскую карту в Украине, погасить долги можно через ']")).getText();
        softAssert.assertEquals(CreditOnlayn, "Если вы берете моментальные кредиты онлайн на банковскую карту в Украине, погасить долги можно через терминалы Приват Банка или в терминале Easy Pay.");
        String CreditOnlaynHeader = driver.findElement(By.xpath(".//*[@class='content']//*[text()='Кредит онлайн на карту']")).getText();
        softAssert.assertEquals(CreditOnlaynHeader, "Кредит онлайн на карту");
        softAssert.assertAll();
    }

    @Test(priority = 21)
    public void TextTest()
    {
        open();
        movetoText();
        String SrokiPogasheniyaText = driver.findElement(By.xpath(".//*[@class='col-md-5 main-contacts--left']//*[contains(text(),'Максимальная')]")).getText();
        softAssert.assertEquals(SrokiPogasheniyaText, "Максимальная годовая процентная ставка, включающая ссудный процент, а также все остальные комиссии и расходы за год составляет 547,5%");
        String ContactInformation = driver.findElement(By.xpath(".//*[@class='col-md-5 main-contacts-item']//*[contains(text(),'Свидетельство')]")).getText();
        softAssert.assertEquals(ContactInformation, "Свидетельство о регистрации финансового учреждения серия IK №146, регистрационный номер №16103223, выданное Национальной комиссией по государственному регулированию в сфере рынков финансовых услуг 20.10.2015 года.");
        String Stavka = driver.findElement(By.xpath(".//*[@class='col-md-10 main-contacts-item']//*[contains(text(),'При оформлении')]")).getText();
        softAssert.assertEquals(Stavka, "При оформлении первого кредита - 1000 грн на 14 дней, сумма к оплате составит 1138 грн. При этом максимальная годовая процентная ставка APR – 547,5 %. Мы прекращаем начисление процентов спустя 90 дней после просрочки по кредиту. Поэтому Вам в любом случае не придется возвращать в разы больше, чем Вы заняли.");
        softAssert.assertAll();
    }

    @Test(priority = 22)
    public void Header()
    {
        open();
        clickAbout();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl +"about/");
        clickTarify();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + "great-rates/");
        clickFaq();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + "faq/");
        clickNews();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + "news/");
        clickBlog();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + "blog/");
        clickStudents();
        softAssert.assertEquals(driver.getCurrentUrl(), BaseUrl + "uslugi-kreditovaniya/kredit-dlya-studentov-v-ukraine/");
        softAssert.assertAll();
    }

    @Test(priority = 23)
    public void Footer()
    {
        open();
        movetoFooter();
        softAssert.assertEquals(isElementXpathPresent(FooterPhone), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(FooterContent), true, "Элемент найден");
        softAssert.assertAll();
    }

    @Test(priority = 24)
    public void FooterONas() {
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@id='js-footer-menu-three']//li[1]//*")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "documents-license/");
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@id='js-footer-menu-three']//li[2]//*")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "kreditnyj-dogovor1/");
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@id='js-footer-menu-three']//li[3]//*")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "finansovaya-otchetnost/");
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@id='js-footer-menu-three']//li[4]//*")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "politika-konfidencialnosti/");
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@id='js-footer-menu-three']//li[5]//*")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "partners/");
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@id='js-footer-menu-three']//li[6]//*")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "otzyvy/");
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@id='js-footer-menu-three']//li[7]//*")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "contacts/");
        softAssert.assertAll();
    }

    @Test(priority = 25)
    public void FooterVoprosi()
    {
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@class='row footer-row']//div[2]//li[1]//*")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "faq/oformlenie-zayavki/kak-podat-zayavku-na-oformlenie-kredita/");
        softAssert.assertAll();
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@class='row footer-row']//div[2]//li[2]//*")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "faq/#questions_75");
        softAssert.assertAll();
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@class='row footer-row']//div[2]//li[3]//*")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "faq/#question_82");
        softAssert.assertAll();
    }

    @Test(priority = 26)
    public void FooterVernytDengi()
    {
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@class='row footer-row']//div[3]//li[1]//*")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "how-to-extend/v-internete/");
        softAssert.assertAll();
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@class='row footer-row']//div[3]//li[2]//*")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "how-to-extend/in-terminal/");
        softAssert.assertAll();
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@class='row footer-row']//div[3]//li[3]//*")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "how-to-extend/in-bank/");
        softAssert.assertAll();
    }

    @Test(priority = 27)
    public void FooterUslugiKreditovania()
    {
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@class='footer-menu--wr footer-menu-service collapse']//*[text()='Деньги до зарплаты онлайн за 20 минут']")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "uslugi-kreditovaniya/dengi-do-zp/");
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@class='footer-menu--wr footer-menu-service collapse']//*[text()='Кредит от 18 лет без справок и поручителей ']")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "uslugi-kreditovaniya/kredit-bez-poruchitelej/");
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@class='footer-menu--wr footer-menu-service collapse']//*[text()='Кредиты без залога в Киеве, Харькове и всей Украине']")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "uslugi-kreditovaniya/kredit-bez-zaloga/");
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@class='footer-menu--wr footer-menu-service collapse']//*[text()='Потребительский кредит онлайн в Украине']")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "uslugi-kreditovaniya/potrebitelskij-kredit/");
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@class='footer-menu--wr footer-menu-service collapse']//*[text()='Кредит для пенсионеров в Украине']")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "uslugi-kreditovaniya/kredit-pensioneram/");
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@class='footer-menu--wr footer-menu-service collapse']//*[text()='Микрокредит и микрозайм онлайн на карту']")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "uslugi-kreditovaniya/mikrokredit-i-mikrozajm/");
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@class='footer-menu--wr footer-menu-service collapse']//*[text()='Кредит онлайн с плохой кредитной историей в Украине']")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "uslugi-kreditovaniya/kredit-onlajn-s-plohoj-kreditnoj-istoriej-v-ukraine/");
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@class='footer-menu--wr footer-menu-service collapse']//*[text()='Взять кредит онлайн без справки о доходах в Украине']")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "uslugi-kreditovaniya/vzyat-kredit-onlajn-bez-spravki-o-dohodah-v-ukraine/");
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@class='footer-menu--wr footer-menu-service collapse']//*[text()='Деньги в долг на карту']")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "uslugi-kreditovaniya/dengi-v-dolg/");
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@class='footer-menu--wr footer-menu-service collapse']//*[text()='Краткосрочный кредит на 1 месяц']")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "uslugi-kreditovaniya/kratkosrochnyj-kredit-na-1-mesyac/");
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@class='footer-menu--wr footer-menu-service collapse']//*[text()='Беспроцентный кредит под 0% без переплат']")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "uslugi-kreditovaniya/besprocentnyj-kredit-pod-0-bez-pereplat/");
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@class='footer-menu--wr footer-menu-service collapse']//*[text()='Кредит 365 дней в году']")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "uslugi-kreditovaniya/kredit-365-dnej-v-godu/");
        open();
        movetoFooter();
        driver.findElement(By.xpath(".//*[@class='footer-menu--wr footer-menu-service collapse']//*[text()='Кредитный калькулятор онлайн в Украине']")).click();
        softAssert.assertEquals(driver.getCurrentUrl(),BaseUrl + "uslugi-kreditovaniya/kreditnyj-kalkulyator-onlajn-v-ukraine/");
        softAssert.assertAll();
    }

    @Test(priority = 28)
    public void BottomLine(){
        open();
        movetoBottomLine();
        String SrokiPogasheniyaText = driver.findElement(By.xpath(".//*[@class='footer-text']")).getText();
        softAssert.assertEquals(SrokiPogasheniyaText, "Первый в Украине сервис кредитования через интернет.\n" +
                "Мы предоставляем быстрые и удобные кредиты для всех граждан Украины.\n" +
                "© 2015 - 2017 MyCredit - Кредит онлайн на банковскую карту за 20 минут\n" +
                "\n" +
                "Разработка и поддержка сайта — Artjoker");
        softAssert.assertEquals(isElementXpathPresent(FooterLogo), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(TMe), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(VK), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(FB), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Insta), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(YouTube), true, "Элемент найден");
        softAssert.assertEquals(isElementXpathPresent(Google), true, "Элемент найден");
        clickArtjoker();
        ArrayList tabs0 = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String)tabs0.get(1));
        waiterElement(LogoArtjoker);
        softAssert.assertEquals(driver.getCurrentUrl(), "https://artjoker.ua/ru/");
        softAssert.assertAll();
    }

    @Test(priority = 29)
    public void TME() {
        open();
        movetoBottomLine();
        clickTME();
        ArrayList tabs1 = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String)tabs1.get(2));
        waiterElement(".//*[@class='tgme_page_photo']");
        softAssert.assertEquals(driver.getCurrentUrl(), "https://t.me/MyCreditua");
        softAssert.assertAll();
    }

    @Test(priority = 30)
    public void FB() {
        open();
        movetoBottomLine();
        clickFB();
        ArrayList tabs2 = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String)tabs2.get(3));
        waiterElement(".//*[@class='fb_logo img sp_ex0C8BIsLat sx_7401de']");
        softAssert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/MyCreditua/");
        softAssert.assertAll();
    }

    @Test(priority = 31)
    public void INSTA()
    {
        open();
        movetoBottomLine();
        clickINSTA();
        ArrayList tabs3 = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String)tabs3.get(4));
        waiterElement(".//*[@class='_b0acm']");
        softAssert.assertEquals(driver.getCurrentUrl(), "https://www.instagram.com/my_credit/");
        softAssert.assertAll();
    }

    @Test(priority = 32)
    public void YOUTUBE() {
        open();
        movetoBottomLine();
        clickYOUTUBE();
        ArrayList tabs4 = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String)tabs4.get(5));
        waiterElement(".//*[@class='style-scope ytd-app']");
        softAssert.assertEquals(driver.getCurrentUrl(), "https://www.youtube.com/c/MyCreditComUa");
        softAssert.assertAll();
    }

    @Test(priority = 33)
    public void GOOGLE()
    {
        open();
        movetoBottomLine();
        clickGOOGLE();
        ArrayList tabs5 = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String)tabs5.get(6));
        waiterElement(".//*[@class='IGqcid']");
        softAssert.assertEquals(driver.getCurrentUrl(), "https://plus.google.com/+MyCreditComUa");
        softAssert.assertAll();
    }

}

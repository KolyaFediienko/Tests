package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MainPage {

    private static final String BASEURL = "https://mycredit.ua/ru/";

    protected WebDriver driver;

    //Header
    @FindBy(xpath = ".//*[@class='nav navbar-nav']//li[1]") //так и должно быть
    private WebElement AboutHeader;

    @FindBy(xpath = ".//*[@class='nav navbar-nav']//li[2]") //так и должно быть
    private WebElement TarifyHeader;

    @FindBy(xpath = ".//*[@class='nav navbar-nav']//li[3]") //так и должно быть
    private WebElement FaqHeader;

    @FindBy(xpath = ".//*[@class='nav navbar-nav']//li[4]") //так и должно быть
    private WebElement NewsHeader;

    @FindBy(xpath = ".//*[@class='nav navbar-nav']//li[5]") //так и должно быть
    private WebElement BlogHeader;

    @FindBy(xpath = ".//*[@class='nav navbar-nav']//li[6]") //так и должно быть
    private WebElement StudentsHeader;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[2]/div/div/form/div/div[1]/div/div[1]/div[3]/div/div[1]/div[4]") //так и должно быть
    private WebElement Slider;

    @FindBy(xpath = ".//*[@class='btn btn-arrow-animate']//*[text()='Получить деньги']")
    private WebElement tenthouthand;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[2]/div/div/form/div/div[1]/div/div[2]/div[2]/div/div[1]/div[4]") //так и должно быть
    private WebElement Slider1;

    @FindBy(xpath = ".//*[@class='container-big text-center']")
    private WebElement Whyitakecredit;

    @FindBy(xpath = ".//*[@class='btn btn-arrow-animate btn-arrow-animate--inverse']//*[text()='Выбрать сумму займа']")
    private WebElement TakecreditWHYbutton;

    @FindBy(xpath = ".//*[@class='advantages-tooltip']//*[text()='\"Любимый клиент\"']")
    private WebElement WhyitakecreditLoveclient;

    @FindBy(xpath = ".//*[@class='text-center advantages-btn']//*[text()='Получить деньги']")
    private WebElement WhyitakecreditTakeMoney;

    @FindBy(xpath = ".//*[@class='programms-footnote text-center']")
    private WebElement Tarify;

    @FindBy(xpath = ".//*[@class='owl-stage-outer']/div[1]/div[5]//*[text()='Подать заявку']\n")
    private WebElement TarifyPodatZayavky;

    @FindBy(xpath = ".//*[@class='issue text-center']")
    private WebElement HowMakeCredit;

    @FindBy(xpath = ".//*[@class='issue-play--holder']//*[text()='Смотреть видео']")
    private WebElement VideoHowMakeCredit;

    @FindBy(xpath = ".//*[@class='issue-step--holder issue-visible']//*[text()='Показать шаги']")
    private WebElement HowMakeCreditSteps;

    @FindBy(xpath = ".//*[@class='container-security animatedParent']//*[@class='row']")
    private WebElement Security;

    @FindBy(xpath = ".//*[@class='security-info']//*[text()='Честные условия оформления займа - без скрытых платежей и дополнительных комиссий']")
    private WebElement SecurityText1;

    @FindBy(xpath = ".//*[@class='security-info']//*[text()='Защита передачи Ваших данных и ответственность за их сохранность']")
    private WebElement SecurityText2;

    @FindBy(xpath = ".//*[@class='security-info']//*[text()='Официальная лицензия на предоставления услуг по кредитованию']")
    private WebElement SecurityText3;

    @FindBy(xpath = ".//*[@class='btn btn-call btn-video']")
    private WebElement NamDoverautblock;

    @FindBy(xpath = ".//*[@class='btn btn-call btn-video']")
    private WebElement NamDoverautMakeCredit;

    @FindBy(xpath = ".//*[@class='city-holder']")
    private WebElement Region;

    @FindBy(xpath = ".//*[@class='banks-list container-img']")
    private WebElement RepayLoan;

    @FindBy(xpath = ".//*[@class='col-md-5 main-contacts-item']//*[text()='© 2016 ЕГРПОУ 39861924, Юридический адрес: 01004, г. Киев, бул. Тараса Шевченко, дом 11, помещение 51а']")
    private WebElement CreditOnlayn;

    @FindBy(xpath = "/html/body/div[1]/section[7]/div/div/div/div/div/div/div/div[2]/div[2]/div") //Так надо
    private WebElement SliderCreditOnlayn;

    @FindBy(xpath = ".//*[@class='col-md-5 main-contacts-item']//*[text()='© 2016 ЕГРПОУ 39861924, Юридический адрес: 01004, г. Киев, бул. Тараса Шевченко, дом 11, помещение 51а']")
    private WebElement DropCreditOnlayn;

    @FindBy(xpath = ".//*[@class='col-md-10 main-contacts-item']")
    private WebElement Text;

    @FindBy(xpath = ".//*[@class='footer-top']")
    private WebElement Footer;

    @FindBy(xpath = ".//*[@class='bottom-line']")
    private WebElement Bottomline;

    @FindBy(xpath = ".//*[@class='footer-text']//*[text()='Artjoker']")
    private WebElement Artjoker;

    @FindBy(xpath = ".//*[@class='social']//li[1]")
    private WebElement Tme;

    @FindBy(xpath = ".//*[@class='social']//*[@class='social-link facebook']")
    private WebElement FB;

    @FindBy(xpath = ".//*[@class='social']//li[4]")
    private WebElement Insta;

    @FindBy(xpath = ".//*[@class='social']//li[5]")
    private WebElement Youtube;

    @FindBy(xpath = ".//*[@class='social']//li[6]")
    private WebElement Google;



    @BeforeTest
    protected WebDriver getDriver()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        PageFactory.initElements(driver,this);
        return driver;
    }

    public void open(){
        driver.get(BASEURL);
    }

    public boolean isElementXpathPresent(String s) {
        boolean b = driver.findElements(By.xpath(s)).size() > 0;
        return b;
    }

    public void dragCalculator()
    {
        Actions builder = new Actions(driver);
        Action dragAndDrop = builder.clickAndHold(Slider).moveToElement(tenthouthand).release(tenthouthand).build();
        dragAndDrop.perform();

        Actions builder1 = new Actions(driver);
        Action dragAndDrop1 = builder1.clickAndHold(Slider1).moveToElement(tenthouthand).release(tenthouthand).build();
        dragAndDrop1.perform();
    }

    public void movetoWhyitakecredit(){
        Actions movewhy = new Actions(driver);
        movewhy.moveToElement(Whyitakecredit).perform();
    }

    public void clickLoveClient()
    {
        WhyitakecreditLoveclient.click();
    }

    public void clickTakeMoney()
    {
        WhyitakecreditTakeMoney.click();
    }
    public void clickVibratSummu()
    {
        TakecreditWHYbutton.click();
    }

    public void movetoTarify(){
        Actions movewhy = new Actions(driver);
        movewhy.moveToElement(Tarify).perform();
    }

    public void clickPodatZayavky()
    {
        TarifyPodatZayavky.click();
    }

    public void movetoHowMakeCredit()
    {
        Actions movewhy = new Actions(driver);
        movewhy.moveToElement(HowMakeCredit).perform();
    }

    public void clickVideoHowRoMakeCredit()
    {
        VideoHowMakeCredit.click();
    }

    public void clickHowMakeCreditSteps()
    {
        HowMakeCreditSteps.click();
    }

    public void movetoSecurity()
    {
        Actions moveSecurity = new Actions(driver);
        moveSecurity.moveToElement(Security).perform();
    }

    public void clickSecutityText1()
    {
        SecurityText1.click();
    }

    public void clickSecutityText2()
    {
        SecurityText2.click();
    }

    public void clickSecutityText3()
    {
        SecurityText3.click();
    }

    public void movetoNamDoveraut()
    {
        Actions NamDoveraut = new Actions(driver);
        NamDoveraut.moveToElement(NamDoverautblock).perform();
    }

    public void clickNamDoverautMakeCredit()
    {
        NamDoverautMakeCredit.click();
    }

    public void movetoRegions()
    {
        Actions NamDoveraut = new Actions(driver);
        NamDoveraut.moveToElement(Region).perform();
    }

    public String mapCities(int i){
        ArrayList<String> cityPageMap = new ArrayList<String>();
        cityPageMap.add("//*[text()='Киев']");
        cityPageMap.add("//*[text()='Харьков']");
        cityPageMap.add("//*[text()='Днепр']");
        cityPageMap.add("//*[text()='Львов']");
        cityPageMap.add("//*[text()='Одесса']");
        cityPageMap.add("//*[text()='Полтава']");
        cityPageMap.add("//*[text()='Кропивницкий']");
        cityPageMap.add("//*[text()='Черкассы']");
        cityPageMap.add("//*[text()='Чернигов']");
        cityPageMap.add("//*[text()='Винница']");
        cityPageMap.add("//*[text()='Белая Церковь']");
        cityPageMap.add("//*[text()='Житомир']");
        cityPageMap.add("//*[text()='Запорожье']");
        cityPageMap.add("//*[text()='Ивано-Франковск']");
        cityPageMap.add("//*[text()='Конотоп']");
        cityPageMap.add("//*[text()='Кривой Рог']");
        cityPageMap.add("//*[text()='Николаев']");
        cityPageMap.add("//*[text()='Павлоград']");
        cityPageMap.add("//*[text()='Ровно']");
        cityPageMap.add("//*[text()='Суммы']");
        cityPageMap.add("//*[text()='Тернополь']");
        cityPageMap.add("//*[text()='Ужгород']");
        cityPageMap.add("//*[text()='Умань']");
        cityPageMap.add("//*[text()='Херсон']");
        cityPageMap.add("//*[text()='Хмельницкий']");
        cityPageMap.add("//*[text()='Черновцы']");

        return cityPageMap.get(i);
    }

    public String SocialItemsList(int i)
    {
    ArrayList<String> SocialItems = new ArrayList<String>();
        SocialItems.add("//li[1]");
        SocialItems.add("//li[2]");
        SocialItems.add("//li[3]");
        SocialItems.add("//li[4]");
        SocialItems.add("//li[5]");
        SocialItems.add("//li[6]");
        return SocialItems.get(i);
    }

    public void movetoRepayLoan()
    {
        Actions NamDoveraut = new Actions(driver);
        NamDoveraut.moveToElement(RepayLoan).perform();
    }

    public void movetoCreditOnline()
    {
        Actions NamDoveraut = new Actions(driver);
        NamDoveraut.moveToElement(CreditOnlayn).perform();
    }

    public void dragCreditOnlayn()
    {

        Actions builder = new Actions(driver);
        Action dragAndDrop = builder.clickAndHold(SliderCreditOnlayn).moveToElement(DropCreditOnlayn).release(DropCreditOnlayn).build();
        dragAndDrop.perform();

    }

    public void movetoText()
    {
        Text.click();
    }

    public void clickAbout(){
        AboutHeader.click();
    }

    public void clickTarify(){
        TarifyHeader.click();
    }

    public void clickFaq(){
        FaqHeader.click();
    }

    public void clickNews(){
        NewsHeader.click();
    }

    public void clickBlog(){
        BlogHeader.click();
    }

    public void clickStudents(){
        StudentsHeader.click();
    }

    public void movetoFooter()
    {
        Actions NamDoveraut = new Actions(driver);
        NamDoveraut.moveToElement(Footer).perform();
    }

    public void movetoBottomLine()
    {
        Actions NamDoveraut = new Actions(driver);
        NamDoveraut.moveToElement(Bottomline).perform();
    }

    public void clickArtjoker()
    {
        Artjoker.click();
    }

    public void clickTME()
    {
        Tme.click();
    }

    public void clickFB()
    {
        FB.click();
    }

    public void clickINSTA()
    {
        Insta.click();
    }

    public void clickYOUTUBE()
    {
        Youtube.click();
    }

    public void clickGOOGLE()
    {
        Google.click();
    }



    public void deleteHeader()
    {
        ((JavascriptExecutor) driver).executeScript("var elem = document.getElementById('myAffix');" + "elem.remove();");
    }

    public void waiterElement(String Xpath){
        WebDriverWait waitForOne = new WebDriverWait(driver, 10);
        waitForOne.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
    }

    @AfterTest
    protected void tearDown() {
            driver.quit();
    }
}

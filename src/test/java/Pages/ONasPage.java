package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class ONasPage {
    protected WebDriver driver;

    private final static String BaseURL = "https://mycredit.ua/ru/";

    @FindBy(xpath = ".//*[@class='nav navbar-nav']//li[1]")
    private WebElement ONasPage;

    @FindBy(xpath = ".//*[@class='about-play']")
    private WebElement ButtonPlayVideo;

    @FindBy(xpath = ".//*[@class='about-info--footer']//*[contains(text(),'Оформление всего за 20 минут!')]")
    private WebElement ServisMycreditEto;

    @FindBy(xpath = ".//*[@class='about-info--footer']//*[text()='Оформить кредит']")
    private WebElement OformitCreditButton;

    @FindBy(xpath = ".//*[@class='about-people']")
    private WebElement MycreditvLizah;

    @FindBy(xpath = ".//*[@class='about-important text-center']")
    private WebElement ChtoDlyaNasVashno;

    @FindBy(xpath = ".//*[@class='about-different text-center']")
    private WebElement Otlichiya;

    @FindBy(xpath = ".//*[@class='second-nav']//*[text()='Правовая информация']")
    private WebElement PravovayaInfo;

    @FindBy(xpath = ".//*[@class='nav nav-tabs']//*[text()='Правила']")
    private WebElement PravovayaInfoPravila;

    @FindBy(xpath = ".//*[@class='nav nav-tabs']//*[text()='Свидетельство']")
    private WebElement PravovayaInfoSvidetelstvo;

    @FindBy(xpath = ".//*[@class='second-nav']//*[text()='Договор займа']")
    private WebElement DogovorZayma;

    @FindBy(xpath = ".//*[@class='second-nav']//*[text()='Финансовая отчетность']")
    private WebElement FinansovayaOtchetnost;

    @FindBy(xpath = ".//*[@class='nav nav-tabs']//*[text()='Финансовая отчетность 2016']")
    private WebElement FinansovayaOtchetnost2016;

    @FindBy(xpath = ".//*[@class='second-nav']//*[text()='Политика конфиденциальности']")
    private WebElement PolitikaKonf;

    @FindBy(xpath = ".//*[@class='second-nav']//*[text()='Отзывы']")
    private WebElement Otzyvy;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='2']")
    private WebElement OtzyvyPageTwo;

    @FindBy(xpath = ".//*[@class='second-nav']//*[text()='Контакты']")
    private WebElement Kontaktu;

    @FindBy(xpath = ".//*[@class='calculator-images']")
    private WebElement Calculator;


    @BeforeTest
    protected WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
        return driver;
    }

    public void deleteHeader()
    {
        ((JavascriptExecutor) driver).executeScript("var elem = document.getElementById('myAffix');" + "elem.remove();");
    }

    public boolean isElementXpathPresent(String s)
    {
        boolean b = driver.findElements(By.xpath(s)).size() > 0;
        return b;
    }

    public String Gettext(String s)
    {
        String Text = driver.findElement(By.xpath(s)).getText();
        return Text;
    }

    public void openONasHeader()
    {
        driver.get(BaseURL);
        ONasPage.click();
    }

    public void clickButtonPlay()
    {
        ButtonPlayVideo.click();
    }

    public void movetoServisMycreditEto()
    {
        Actions OformitCredit = new Actions(driver);
        OformitCredit.moveToElement(ServisMycreditEto).perform();
    }

    public void movetoMycreditVLizah()
    {
        Actions VLizah = new Actions(driver);
        VLizah.moveToElement(MycreditvLizah).perform();
    }

    protected void movetoChtoDlyaNasVashno()
    {
        Actions ChtoDlyaNas = new Actions(driver);
        ChtoDlyaNas.moveToElement(ChtoDlyaNasVashno).perform();
    }

    protected void movetoOtlichiya()
    {
        Actions Otlichiy = new Actions(driver);
        Otlichiy.moveToElement(Otlichiya).perform();
    }

    public void clickOformitCredit()
    {
        OformitCreditButton.click();
    }

    public void clickPravovayaInfo()
    {
        PravovayaInfo.click();
    }

    public void clickPravovayaInfoPravila()
    {
        PravovayaInfoPravila.click();
    }

    public void clickPravovayaInfoSvidetelstvo()
    {
        PravovayaInfoSvidetelstvo.click();
    }

    public void clickDogovorZayma()
    {
        DogovorZayma.click();
    }

    public void clickFinansovayaOtchetnost()
    {
        FinansovayaOtchetnost.click();
    }

    public void clickFinansovayaOtchetnost2016()
    {
        FinansovayaOtchetnost2016.click();
    }

    public  void clickPolitikaKonf()
    {
        PolitikaKonf.click();
    }

    public  void clickOtzyvy()
    {
        Otzyvy.click();
    }

    public  void clickOtzyvyPageTwo()
    {
        Actions Otlichiy = new Actions(driver);
        Otlichiy.moveToElement(OtzyvyPageTwo).click().perform();
    }

    public void clickKontaktu()
    {
        Kontaktu.click();
    }

    public void movetoCalculator()
    {
        Actions Calcu = new Actions(driver);
        Calcu.moveToElement(Calculator).click().perform();
    }


    @AfterTest
    public void Quit() throws InterruptedException {
        driver.quit();
    }

}

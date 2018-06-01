package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class StudentsPage {
    protected WebDriver driver;

    private static final String BaseURL = "https://mycredit.ua/ru/uslugi-kreditovaniya/kredit-dlya-studentov-v-ukraine/";

    @FindBy(xpath = ".//*[@class='container-fluid']//*[text()='Как погасить кредит']")
    private WebElement Futer;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/form/div/div[1]/div/div[1]/div[3]/div/div[1]/div[4]") //так и должно быть
    private WebElement Slider;

    @FindBy(xpath = ".//*[@class='btn btn-arrow-animate']//*[text()='Получить деньги']")
    private WebElement tenthouthand;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/form/div/div[1]/div/div[2]/div[2]/div/div[1]/div[4]") //так и должно быть
    private WebElement Slider1;

    @FindBy(xpath = ".//*[@class='btn btn-arrow-animate']//*[text()='Получить деньги']")
    private WebElement tenthouthand1;

    @FindBy(xpath = ".//*[@class='btn btn-trp btn-abs btn-abs--students']")
    private WebElement StudentsAbout;

    @FindBy(xpath = ".//*[@class='btn btn-arrow-animate']//*[text()='Оформить кредит']")
    private WebElement TakecreditWHYbutton;

    @FindBy(xpath = "//*[@id=\"how\"]/div/div/div/div/form/button")
    private WebElement Dalee;

    @FindBy(xpath = ".//*[@class='container-big']//*[text()='Нам доверяют сотни людей']\n")
    private WebElement howtomakecredit;

    @FindBy(xpath = ".//*[@class='btn btn-call btn-video']//*[text()='Оформить кредит']")
    private WebElement peoples;

    @FindBy(xpath = ".//*[@class='content']//*[text()='Кредит для студентов в Украине']\n")
    private WebElement howrepayaloan;

    @FindBy(xpath = ".//*[@class='col-md-5 main-contacts--left']//*[text()='Сроки погашения кредита на MyCredit']\n")
    private WebElement creditforStudentsinUkraine;

    @FindBy(xpath = "/html/body/div[1]/section[5]/div/div/div/div/div/div/div/div[2]/div[2]/div") //так и должно быть
    private WebElement drugcreditforStudentsinUkraine;

    @FindBy(xpath = ".//*[@class='col-md-10 main-contacts-item' and contains(p,'Пример рассчёта процентной ставки')]")
    private WebElement dropcreditforStudentsinUkraine;

    @FindBy(xpath = ".//*[@class='col-md-10 main-contacts-item']//*[text()='При оформлении первого кредита - 1000 грн" +
            " на 14 дней, сумма к оплате составит 1138 грн. При этом максимальная годовая процентная ставка APR – 547,5 " +
            "%. Мы прекращаем начисление процентов спустя 90 дней после просрочки по кредиту. Поэтому Вам в любом случае" +
            " не придется возвращать в разы больше, чем Вы заняли. ']\n")
    private WebElement information;



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


    public void openStudentsHeader() throws InterruptedException {
        driver.get(BaseURL);
        Thread.sleep(300);
    }

    public boolean isElementXpathPresent(String s)
    {
        boolean b = driver.findElements(By.xpath(s)).size() > 0;
        return b;
    }

    public void Drag()
    {
        Actions builder = new Actions(driver);
        Action dragAndDrop = builder.clickAndHold(Slider).moveToElement(tenthouthand).release(tenthouthand).build();
        dragAndDrop.perform();

        Actions builder1 = new Actions(driver);
        Action dragAndDrop1 = builder1.clickAndHold(Slider1).moveToElement(tenthouthand1).release(tenthouthand1).build();
        dragAndDrop1.perform();
    }

    public void clickStudentsAbout()
    {
        StudentsAbout.click();
    }

    public void Whyitakecredit() throws InterruptedException {
        Actions movewhy = new Actions(driver);
        movewhy.moveToElement(TakecreditWHYbutton).perform();
    }

    public void clickWhyitakecredit() throws InterruptedException {
        Actions clickwhy = new Actions(driver);
        clickwhy.moveToElement(TakecreditWHYbutton).click().perform();
    }

    public void clickDalee(){
        driver.findElement(By.xpath("//*[@id=\"StudentId\"]")).sendKeys("1111122222");
        Actions moveDalee = new Actions(driver);
        moveDalee.moveToElement(Dalee).click().perform();
    }

    public void Howtomakecredit(){
        Actions movehow = new Actions(driver);
        movehow.moveToElement(howtomakecredit).perform();
    }

    public void Peoples() throws InterruptedException
    {
        Actions movepeoples = new Actions(driver);
        movepeoples.moveToElement(peoples).perform();
    }

    public void clickPeoples() throws InterruptedException
    {
        Actions clickmovepeoples = new Actions(driver);
        clickmovepeoples.moveToElement(peoples).click().perform();
    }

    public void Howrepayaloan() throws InterruptedException
    {
        Actions moveHowrepayaloan = new Actions(driver);
        moveHowrepayaloan.moveToElement(howrepayaloan).perform();
    }

    public void CreditforstudentsinUkraine() throws InterruptedException
    {
        Actions creditforstudents = new Actions(driver);
        creditforstudents.moveToElement(creditforStudentsinUkraine).perform();
    }

    public void DrugtextCreditforstudentsinUkraine()
    {
        Actions builder = new Actions(driver);
        Action dragAndDrop = builder.clickAndHold(drugcreditforStudentsinUkraine).moveToElement(dropcreditforStudentsinUkraine).release(dropcreditforStudentsinUkraine).build();
        dragAndDrop.perform();
    }

    public void Information() throws InterruptedException
    {
        Actions informations = new Actions(driver);
        informations.moveToElement(information).perform();
    }

    @AfterTest
    public void Quit()
    {
        driver.quit();
    }

}


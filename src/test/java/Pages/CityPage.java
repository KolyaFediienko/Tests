package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by tester on 14.08.2017.
 */
public class CityPage {

    /**Preloader*/
    private static final String preLoaderF = ".//*[@class='preloader preloader-bonus white'][(contains(@style, 'none'))]";

    private static final String BASEURL = "https://mycredit.ua/ru/";
    //    private static final java.lang.String BASEURL = "http://1bank2.myapp.com.ua/ru/faq/";


    /**Block City*/
    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Вы можете взять кредит в других регионах']")
    private WebElement moveBlockCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Киев']")
    private WebElement kievCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Харьков']")
    private WebElement kharkovCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Днепр']")
    private WebElement dneprCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Львов']")
    private WebElement lvovCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Одесса']")
    private WebElement odessaCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Полтава']")
    private WebElement poltavaCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Кропивницкий']")
    private WebElement kropivnickijCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Черкассы']")
    private WebElement cherkassyCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Чернигов']")
    private WebElement chernigovCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Винница']")
    private WebElement vinnicaCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Белая Церковь']")
    private WebElement belayaCerkovCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Житомир']")
    private WebElement zhitomirCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Запорожье']")
    private WebElement zaporozheCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Ивано-Франковск']")
    private WebElement ivanoFrankovskCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Конотоп']")
    private WebElement konotopCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Кривой Рог']")
    private WebElement krivojRogCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Николаев']")
    private WebElement nikolaevCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Павлоград']")
    private WebElement pavlogradCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Ровно']")
    private WebElement rovnoCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Суммы']")
    private WebElement summyCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Тернополь']")
    private WebElement ternopolCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Ужгород']")
    private WebElement ushgorodCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Умань']")
    private WebElement umanCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Херсон']")
    private WebElement khersonCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Хмельницкий']")
    private WebElement khmelnickijCity;

    @FindBy(xpath = ".//*[@class='city-section section-bordered']//*[text()='Черновцы']")
    private WebElement chernovciCity;



    protected WebDriver driver;

    @Parameters("browser")
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
        waiterPreloader();
    }

    public void waiterPreloader(){
        WebDriverWait waitForOne = new WebDriverWait(driver, 10);
        waitForOne.until(ExpectedConditions.presenceOfElementLocated(By.xpath(preLoaderF)));
    }

    public void moveCityBlocks() throws InterruptedException{
        deleteHeader();
        Actions builder = new Actions(driver);
        builder.moveToElement(moveBlockCity).perform();
    }

    public void kievClick(){
        kievCity.click();
    }

    public void kharkovClick(){
        kharkovCity.click();
    }

    public void dneprClick(){
        dneprCity.click();
    }

    public void lvovClick(){
        lvovCity.click();
    }

    public void odessaClick(){
        odessaCity.click();
    }

    public void poltavaClick(){
        poltavaCity.click();
    }

    public void kropivnickijClick(){
        kropivnickijCity.click();
    }

    public void cherkassyClick(){
        cherkassyCity.click();
    }

    public void chernigovClick(){
        chernigovCity.click();
    }

    public void vinnicaClick(){
        vinnicaCity.click();
    }

    public void belayaCerkovClick(){
        belayaCerkovCity.click();
    }

    public void zhitomirClick(){
        zhitomirCity.click();
    }

    public void zaporozheClick(){
        zaporozheCity.click();
    }

    public void ivanoFrankovskClick(){
        ivanoFrankovskCity.click();
    }

    public void konotopClick(){
        konotopCity.click();
    }

    public void krivojRogClick(){
        krivojRogCity.click();
    }

    public void nikolaevClick(){
        nikolaevCity.click();
    }

    public void pavlogradCLick(){
        pavlogradCity.click();
    }

    public void rovnoClick(){
        rovnoCity.click();
    }

    public void summyClick(){
        summyCity.click();
    }

    public void ternopolClick(){
        ternopolCity.click();
    }

    public void ushgorodClick(){
        ushgorodCity.click();
    }

    public void umanClick(){
        umanCity.click();
    }

    public void khersonClick(){
        khersonCity.click();
    }

    public void khmelnickijClick(){
        khmelnickijCity.click();
    }

    public void chernovciClick(){
        chernovciCity.click();
    }


    //Коллекция городов
    public String mapCities(int i){
        ArrayList<String> cities = new ArrayList<String>();

        cities.add("kiev/");
        cities.add("harkov/");
        cities.add("dnepr/");
        cities.add("lvov/");
        cities.add("odessa/");
        cities.add("poltava/");
        cities.add("kropivnickij/");
        cities.add("cherkassy/");
        cities.add("chernigov/");;
        cities.add("vinnica/");
        cities.add("belaya-cerkov/");
        cities.add("zhitomir/");
        cities.add("zaporozhe/");
        cities.add("ivano-frankovsk/");
        cities.add("konotop/");
        cities.add("krivoj-rog/");
        cities.add("nikolaev/");
        cities.add("pavlograd/");
        cities.add("rovno/");
        cities.add("summy/");
        cities.add("ternopol/");
        cities.add("uzhgorod/");
        cities.add("uman/");
        cities.add("herson/");
        cities.add("hmelnickij/");
        cities.add("chernovcy/");

        return cities. get(i);
    }

    public boolean isElementXpathPresent(String s){
        boolean b = driver.findElements(By.xpath(s)).size() > 0;
        return b;
    }

    /**Метод удаление Header-a*/
    private void deleteHeader() {
        ((JavascriptExecutor) driver).executeScript("var elem = document.getElementById('myAffix');" + "elem.remove();");
    }
    @AfterTest
    protected void tearDown() {
        if(driver != null)
            driver.quit();
    }
}

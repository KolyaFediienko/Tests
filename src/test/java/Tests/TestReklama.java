package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TestReklama {
    protected WebDriver driver;

    private static final String BASEURL = "http://192.168.1.15/App#/origination";

    private static final String BASEURL2 = "https://mycredit.ua/ru/great-rates/";

    private static final String Nova = "/html/body/div/elmenu/div[2]/div/ng-view/split-view/div/split-toolbar/nav/form/div[2]/a";

    private static final String Prodov = "/html/body/div/elmenu/div[2]/div/ng-view/div/form/div[2]/button[1]";

 //   private static final String Prodov = "/html/body/div/elmenu/div[2]/div/ng-view/div/form/div[2]/button[1]";




    @FindBy(xpath = ".//*[@class='students-banner new-year__banner']")
    private WebElement Baner;

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

 //   public void click1() { Nova.click(); }
 //   public void click2() { Prodov.click(); }

    public void open2(){
        driver.get(BASEURL2);
    }

    public void Password() {
        driver.findElement(By.xpath("//*[@id=\"customer.phone\"]")).sendKeys("+380983331113");
    }

    private SoftAssert softAssert = new SoftAssert();

    @Test
    public void CalculatorMainPageTest(){
        int i;
        for (i = 0; i < 1000000; i = i++) {
            open();
        //    click1();
  //          click2();
            Password();


        }
    }

    @AfterTest
    public void Quit() throws InterruptedException {
        driver.quit();
    }
}

package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;


public class SharesPage {


    private final static String BaseURL = "https://mycredit.ua/ru/news/";

    @FindBy(xpath = ".//*[@class='news-list']//li[1]//*[text()='Подробнее']")//Подробнее об акции 1
    private WebElement AboutShare1;

    @FindBy(xpath = ".//*[@class='news-list']//li[2]//*[text()='Подробнее']")//Подробнее об акции 2
    private WebElement AboutShare2;

    @FindBy(xpath = ".//*[@class='news-list']//li[3]//*[text()='Подробнее']")//Подробнее об акции 3
    private WebElement AboutShare3;

    @FindBy(xpath = ".//*[@class='news-list']//li[4]//*[text()='Подробнее']")//Подробнее об акции 4
    private WebElement AboutShare4;

    @FindBy(xpath = ".//*[@class='news-list']//li[5]//*[text()='Подробнее']")//Подробнее об акции 5
    private WebElement AboutShare5;

    @FindBy(xpath = ".//*[@class='news-list']//li[6]//*[text()='Подробнее']")//Подробнее об акции 6
    private WebElement AboutShare6;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='2']")//Акции Хеадер
    private WebElement ButtotTwo;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='3']")//Акции Хеадер
    private WebElement ButtotThree;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='4']")//Акции Хеадер
    private WebElement ButtotFour;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='5']")//Акции Хеадер
    private WebElement ButtotFive;

    @FindBy(xpath = ".//*[@class='footer-menu--wr collapse']")
    private WebElement Calculator;

    protected WebDriver driver;
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

    public void deleteHeader()
    {
        ((JavascriptExecutor) driver).executeScript("var elem = document.getElementById('myAffix');" + "elem.remove();");
    }

    public void openSharesHeader()
    {
        driver.get(BaseURL);
    }

    public void clickAboutShare1()
    {
        AboutShare1.click();
    }

    public void clickAboutShare2()
    {
        AboutShare2.click();
    }

    public void clickAboutShare3()
    {
        AboutShare3.click();
    }

    public void clickAboutShare4()
    {
        AboutShare4.click();
    }

    public void clickAboutShare5()
    {
        AboutShare5.click();
    }

    public void clickAboutShare6()
    {
        AboutShare6.click();
    }

    public void clickPageTwo() throws InterruptedException {
        deleteHeader();
        Actions clickTwo = new Actions(driver);
        clickTwo.moveToElement(ButtotTwo).click().perform();
        Thread.sleep(200);
    }

    public void movetoPageTwo2()
    {
        deleteHeader();
        Actions clickTwo = new Actions(driver);
        clickTwo.moveToElement(ButtotTwo).perform();
    }

    public void clickPageThree() throws InterruptedException {
        deleteHeader();
        Actions clickTwo = new Actions(driver);
        clickTwo.moveToElement(ButtotThree).click().perform();
        Thread.sleep(200);
    }


    public void movetoPageThree2()
    {
        deleteHeader();
        Actions clickTwo = new Actions(driver);
        clickTwo.moveToElement(ButtotThree).perform();
    }

    public void clickPageFour() throws InterruptedException {
        deleteHeader();
        Actions clickTwo = new Actions(driver);
        clickTwo.moveToElement(ButtotFour).click().perform();
        Thread.sleep(200);
    }

    public void movetoPageFour2()
    {
        deleteHeader();
        Actions clickTwo = new Actions(driver);
        clickTwo.moveToElement(ButtotFour).perform();
    }


    public void clickPageFive() throws InterruptedException {
        deleteHeader();
        Actions clickTwo = new Actions(driver);
        clickTwo.moveToElement(ButtotFive).click().perform();
        Thread.sleep(200);
    }

    public void movetoPageFive2()
    {
        deleteHeader();
        Actions clickTwo = new Actions(driver);
        clickTwo.moveToElement(ButtotFive).perform();
    }


    public boolean isElementXpathPresent(String s)
    {
        boolean b = driver.findElements(By.xpath(s)).size() > 0;
        return b;
    }

    public void movetoCalculator()
    {
        deleteHeader();
        Actions move = new Actions(driver);
        move.moveToElement(Calculator).perform();
    }

    @AfterTest
    public void Quit(){
        driver.quit();
    }


}

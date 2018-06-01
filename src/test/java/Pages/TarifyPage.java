package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TarifyPage {

    protected WebDriver driver;

    private final static String BaseURL = "https://mycredit.ua/ru/";

    @FindBy(xpath = ".//*[@class='nav navbar-nav']//li[2]")
    private WebElement TarifyPage;

    @FindBy(xpath = ".//div[1][@class='programms-item']//*[@class='btn btn-personal']")
    private WebElement FirstButton;

    @FindBy(xpath = ".//div[2][@class='programms-item']//*[@class='btn btn-personal']")
    private WebElement SecondButton;

    @FindBy(xpath = ".//div[3][@class='programms-item']//*[@class='btn btn-personal']")
    private WebElement ThirdButton;

    @FindBy(xpath = ".//div[4][@class='programms-item']//*[@class='btn btn-personal']")
    private WebElement FourthButton;

    @FindBy(xpath = ".//div[5][@class='programms-item']//*[@class='btn btn-personal']")
    private WebElement FifthButton;

    @FindBy(xpath = ".//div[6][@class='programms-item']//*[@class='btn btn-personal']")
    private WebElement SixthButton;


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

    public void openTarifyPage()
    {
        driver.get(BaseURL);
        TarifyPage.click();
    }

    public void clickFirstButton()
    {
        FirstButton.click();
    }

    public void clickSecondButton()
    {
        SecondButton.click();
    }

    public void clickThirdButton()
    {
        ThirdButton.click();
    }

    public void clickFourthButton()
    {
        FourthButton.click();
    }

    public void clickFifthButton()
    {
        FifthButton.click();
    }

    public void clickSixthButton()
    {
        SixthButton.click();
    }


    @AfterTest
    public void Quit() throws InterruptedException {
        driver.quit();
    }
}

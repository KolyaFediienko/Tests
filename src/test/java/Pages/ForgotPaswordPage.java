package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ForgotPaswordPage {
    protected WebDriver driver;

    @FindBy(xpath = "//*[@id=\"myAffix\"]/div/div/div[2]/div/div[1]/div/a")
    private WebElement MyRoom;

    @FindBy(xpath = "//*[@id=\"modal_auth\"]/div[2]/div/div[3]/a")
    private WebElement ForgotPaswordbutton;


    @FindBy(xpath = "//*[@id=\"buttonSendPhone\"]/span")
    private WebElement Send;

    @FindBy(xpath = "/html/body/nav/div/a[2]")
    private WebElement EnterEmail;

    @FindBy(xpath = "//*[@id=\"identifierNext\"]/content/span")
    private WebElement After1;

    @FindBy(xpath = "//*[@id=\"passwordNext\"]/content/span")
    private WebElement After2;

    @FindBy(xpath = "//*[@id=\":38\"]")
    private WebElement Message;

    @FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div/table/tr/td[1]/div[2]/div[2]/div/div[3]/div/div/div/div/div/div[1]/div[2]/div[7]/div/div[1]/table/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr[4]/td/a")
    private WebElement Messag1;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div/div[2]/div/form[2]/div/div[4]/button")
    private WebElement passwordnew;




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

    public void open() throws InterruptedException {
        driver.get("http://dev2.mycredit.com.ua/ru/");
        Thread.sleep(300);
    }

    public void clickMyRoom() throws InterruptedException {
            MyRoom.click();
            Thread.sleep(300);
    }

    public void ForgotPaswordbutton()
    {
        ForgotPaswordbutton.click();
    }

    public void TextEmail()
    {
        driver.findElement(By.xpath("//*[@id=\"recoveryPassword\"]")).sendKeys("kolya.fediienko2@gmail.com");
    }

    public void ClickSend()
    {
        Send.click();
    }

    public void GetEmail()
    {
        driver.get("https://mail.google.com/mail/u/0/#inbox");
    }

    public void EnterEmail() throws InterruptedException {
        EnterEmail.click();
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("kolya.fediienko2@gmail.com");
        After1.click();
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("kol9cooL");
        Thread.sleep(200);
        After2.click();
        Thread.sleep(3000);
    }

    public void Message() throws InterruptedException {
        Message.click();
        Thread.sleep(300);
        Messag1.click();
        Thread.sleep(300);
        driver.switchTo().window(driver.getWindowHandle());
    }


   //     driver.findElement(By.xpath("//*[@id=\"repeat-password\"]")).sendKeys("kol8cooL");
     //   passwordnew.click();
   // }

        @AfterTest
    public void Quit() throws InterruptedException {
        driver.quit();
    }
}

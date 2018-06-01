package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BlogPage {
    protected WebDriver driver;

    @FindBy(xpath = "//*[@id=\"js_navbar\"]/nav/ul[1]/li[5]/a")//Блог Хеадер
    private WebElement BlogHeader;

    @FindBy(xpath = ".//*[@class='news-list']//li[1]//*[text()='Подробнее']")
    private WebElement AboutBlog1;

    @FindBy(xpath = ".//*[@class='news-list']//li[2]//*[text()='Подробнее']")
    private WebElement AboutBlog2;

    @FindBy(xpath = ".//*[@class='news-list']//li[3]//*[text()='Подробнее']")
    private WebElement AboutBlog3;

    @FindBy(xpath = ".//*[@class='news-list']//li[4]//*[text()='Подробнее']")
    private WebElement AboutBlog4;

    @FindBy(xpath = ".//*[@class='news-list']//li[5]//*[text()='Подробнее']")
    private WebElement AboutBlog5;

    @FindBy(xpath = ".//*[@class='news-list']//li[6]//*[text()='Подробнее']")
    private WebElement AboutBlog6;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='2']")
    private WebElement ButtonTwo;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='3']")
    private WebElement ButtonThree;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='4']")
    private WebElement ButtonFour;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='5']")
    private WebElement ButtonFive;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='6']")
    private WebElement ButtonSix;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='7']")
    private WebElement ButtonSeven;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='8']")
    private WebElement ButtonEight;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='9']")
    private WebElement ButtonNine;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='10']")
    private WebElement ButtonTen;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='11']")
    private WebElement ButtonEleven;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='12']")
    private WebElement ButtonTwelwe;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='13']")
    private WebElement ButtonThirteen;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='14']")
    private WebElement ButtonFourteen;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='15']")
    private WebElement ButtonFifteen;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='16']")
    private WebElement ButtonSixteen;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='17']")
    private WebElement ButtonSeventeen;

    @FindBy(xpath = ".//*[@class='news-pagination']//*[text()='18']")
    private WebElement ButtonEighteen;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div/div[2]/div/div[1]/div/div[2]")
    private WebElement CalculatorBlog;

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

    public void openBlogHeader()
    {
        driver.get("http://mycredit.ua/ru/blog/");
    }

    public void clickAboutBlog13()
    {
        AboutBlog1.click();
    }

    public void clickAboutBlog1()
    {
        AboutBlog1.click();
    }

    public void clickAboutBlog2()
    {
        AboutBlog2.click();
    }

    public void clickAboutBlog3()
    {
        AboutBlog3.click();
    }

    public void clickAboutBlog4()
    {
        AboutBlog4.click();
    }

    public void clickAboutBlog5()
    {
        AboutBlog5.click();
    }
    asdasdasd

    public void clickAboutBlog6()
    {
        AboutBlog6.click();
    }

    public void clickPageTwo() throws InterruptedException {
        deleteHeader();
        Actions clickTwo = new Actions(driver);
        clickTwo.moveToElement(ButtonTwo).click().perform();
        Thread.sleep(200);
    }

    public void clickPageThree() throws InterruptedException {
        deleteHeader();
        Actions clickTwo = new Actions(driver);
        clickTwo.moveToElement(ButtonThree).click().perform();
        Thread.sleep(200);
    }

    public void clickPageFour() throws InterruptedException {
        deleteHeader();
        Actions clickFour = new Actions(driver);
        clickFour.moveToElement(ButtonFour).click().perform();
        Thread.sleep(200);
    }

    public void clickPageFive() throws InterruptedException {
        deleteHeader();
        Actions clickFive = new Actions(driver);
        clickFive.moveToElement(ButtonFive).click().perform();
        Thread.sleep(200);
    }

    public void clickPageSix() throws InterruptedException {
        deleteHeader();
        Actions clickSix = new Actions(driver);
        clickSix.moveToElement(ButtonSix).click().perform();
        Thread.sleep(200);
    }

    public void clickPageSeven() throws InterruptedException {
        deleteHeader();
        Actions clickSeven = new Actions(driver);
        clickSeven.moveToElement(ButtonSeven).click().perform();
        Thread.sleep(200);
    }

    public void clickPageEight() throws InterruptedException {
        deleteHeader();
        Actions clickEight = new Actions(driver);
        clickEight.moveToElement(ButtonEight).click().perform();
        Thread.sleep(200);
    }

    public void clickPageNine() throws InterruptedException {
        deleteHeader();
        Actions clickNine = new Actions(driver);
        clickNine.moveToElement(ButtonNine).click().perform();
        Thread.sleep(200);
    }

    public void clickPageTen() throws InterruptedException {
        deleteHeader();
        Actions clickTen = new Actions(driver);
        clickTen.moveToElement(ButtonTen).click().perform();
        Thread.sleep(200);
    }

    public void clickPageEleven() throws InterruptedException {
        deleteHeader();
        Actions clickEleven = new Actions(driver);
        clickEleven.moveToElement(ButtonEleven).click().perform();
        Thread.sleep(200);
    }

    public void clickPageTwelwe() throws InterruptedException {
        deleteHeader();
        Actions clickTwelwe = new Actions(driver);
        clickTwelwe.moveToElement(ButtonTwelwe).click().perform();
        Thread.sleep(200);
    }

    public void clickPageThirteen() throws InterruptedException {
        deleteHeader();
        Actions clickThirteen = new Actions(driver);
        clickThirteen.moveToElement(ButtonThirteen).click().perform();
        Thread.sleep(200);
    }

    public void clickPageFourteen() throws InterruptedException {
        deleteHeader();
        Actions clickFourteen = new Actions(driver);
        clickFourteen.moveToElement(ButtonFourteen).click().perform();
        Thread.sleep(200);
    }

    public void clickPageFifteen() throws InterruptedException {
        deleteHeader();
        Actions clickFifteen = new Actions(driver);
        clickFifteen.moveToElement(ButtonFifteen).click().perform();
        Thread.sleep(200);
    }

    public void clickPageSixteen() throws InterruptedException {
        deleteHeader();
        Actions clickSixteen = new Actions(driver);
        clickSixteen.moveToElement(ButtonSixteen).click().perform();
        Thread.sleep(200);
    }

    public void clickPageSeventeen() throws InterruptedException {
        deleteHeader();
        Actions clickSeventeen = new Actions(driver);
        clickSeventeen.moveToElement(ButtonSeventeen).click().perform();
        Thread.sleep(200);
    }

    public void clickPageEighteen() throws InterruptedException {
        deleteHeader();
        Actions clickEighteen = new Actions(driver);
        clickEighteen.moveToElement(ButtonEighteen).click().perform();
        Thread.sleep(200);
    }

    public void movetoCalculator()
    {
        deleteHeader();
        Actions move = new Actions(driver);
        move.moveToElement(CalculatorBlog).perform();
    }

    @AfterTest
    public void Quit() throws InterruptedException {
        driver.quit();
    }

}

